/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v1.client.api;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static com.github.tomakehurst.wiremock.client.WireMock.okJson;
import static org.junit.Assert.*;

import com.datadog.api.RecordingMode;
import com.datadog.api.TestUtils;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.model.*;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.junit.After;
import org.junit.AssumptionViolatedException;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/** API tests for MonitorsApi */
public class MonitorsApiTest extends V1ApiTest {

  private static MonitorsApi api;
  private static SyntheticsApi syntheticsApi;
  private static MonitorsApi fakeAuthApi;
  private static MonitorsApi unitApi;
  private ArrayList<Long> deleteMonitors = null;

  private final MonitorType testingMonitorType = MonitorType.METRIC_ALERT;
  private final String testingMonitorQuery =
      "avg(last_5m):sum:system.net.bytes_rcvd{host:host0} > 100";
  private final String testingMonitorMessage =
      "We may need to add web hosts if this is consistently high.";
  private final List<String> testingMonitorTags = Arrays.asList("app:webserver", "frontend");
  private final Boolean testingMonitorOptionsNotifyNoData = true;
  private final Long testingMonitorOptionsNoDataTimeframe = 20L;

  private final String fixturePrefix = "v1/client/api/monitors_fixtures";
  private final String apiUri = "/api/v1/monitor";

  private SyntheticsAPITest apiTestConfig =
      new SyntheticsAPITest()
          .config(
              new SyntheticsAPITestConfig()
                  .assertions(
                      Arrays.asList(
                          new SyntheticsAssertion(
                              new SyntheticsAssertionTarget()
                                  .operator(SyntheticsAssertionOperator.IS)
                                  .property("content-type")
                                  .target("text/html")
                                  .type(SyntheticsAssertionType.HEADER)),
                          new SyntheticsAssertion(
                              new SyntheticsAssertionTarget()
                                  .operator(SyntheticsAssertionOperator.LESS_THAN)
                                  .target(2000)
                                  .type(SyntheticsAssertionType.RESPONSE_TIME))))
                  .request(
                      new SyntheticsTestRequest()
                          .headers(
                              new HashMap<String, String>() {
                                {
                                  put("testingJavaClient", "true");
                                }
                              })
                          .method(HTTPMethod.GET)
                          .timeout(10.0)
                          .url("https://datadoghq.com")))
          .locations(Arrays.asList("aws:us-east-2"))
          .message("testing Synthetics API test - this is message")
          .options(
              new SyntheticsTestOptions()
                  .acceptSelfSigned(false)
                  .allowInsecure(true)
                  .followRedirects(true)
                  .minFailureDuration(10L)
                  .minLocationFailed(1L)
                  .retry(new SyntheticsTestOptionsRetry().count(3L).interval(10.0))
                  .tickEvery(60L))
          .subtype(SyntheticsTestDetailsSubType.HTTP)
          .tags(Arrays.asList("testing:api"))
          .type(SyntheticsAPITestType.API);

  // ObjectMapper instance configure to not fail when encountering unknown properties
  private static ObjectMapper objectMapper =
      new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

  @Override
  public String getTracingEndpoint() {
    return "monitors";
  }

  @Before
  public void resetDeleteMonitors() {
    deleteMonitors = new ArrayList<Long>();
  }

  @BeforeClass
  public static void initApi() {
    api = new MonitorsApi(generalApiClient);
    syntheticsApi = new SyntheticsApi(generalApiClient);
    fakeAuthApi = new MonitorsApi(generalFakeAuthApiClient);
    unitApi = new MonitorsApi(generalApiUnitTestClient);
  }

  @After
  public void deleteMonitors() throws ApiException {
    if (deleteMonitors != null) {
      for (Long id : deleteMonitors) {
        try {
          api.getMonitor(id, new MonitorsApi.GetMonitorOptionalParameters().groupStates("all"));
        } catch (ApiException e) {
          // doesn't exist => continue
          continue;
        }
        api.deleteMonitor(id);
      }
    }
  }

  /** Create, modify and delete monitor object, also test getting it */
  @Test
  public void monitorCreateModifyDeleteTest() throws ApiException {
    String testingMonitorName = getUniqueEntityName();
    MonitorOptions options =
        new MonitorOptions()
            .notifyNoData(testingMonitorOptionsNotifyNoData)
            .noDataTimeframe(testingMonitorOptionsNoDataTimeframe);

    Monitor monitor =
        new Monitor()
            .name(testingMonitorName)
            .type(testingMonitorType)
            .query(testingMonitorQuery)
            .message(testingMonitorMessage)
            .tags(testingMonitorTags)
            .options(options);

    // test creating monitor
    Monitor obtained = api.createMonitor(monitor);
    Long monitorId = obtained.getId();
    deleteMonitors.add(monitorId);

    // test getting monitor
    obtained =
        api.getMonitor(
            monitorId, new MonitorsApi.GetMonitorOptionalParameters().groupStates("all"));
    assertEquals(testingMonitorName, obtained.getName());
    assertEquals(testingMonitorType, obtained.getType());
    assertEquals(testingMonitorQuery, obtained.getQuery());
    assertEquals(testingMonitorMessage, obtained.getMessage());
    assertEquals(testingMonitorTags, obtained.getTags());
    assertEquals(testingMonitorOptionsNotifyNoData, obtained.getOptions().getNotifyNoData());
    assertEquals(testingMonitorOptionsNoDataTimeframe, obtained.getOptions().getNoDataTimeframe());
    assertNull(obtained.getDeleted());
    assertTrue(obtained.getDeleted_JsonNullable().isPresent());

    // test updating monitor
    String updatedName = testingMonitorName + "-updated";
    MonitorUpdateRequest updateMonitor = new MonitorUpdateRequest();
    updateMonitor.setName(updatedName);
    obtained = api.updateMonitor(monitorId, updateMonitor);

    assertEquals(updatedName, obtained.getName());
    assertEquals(testingMonitorType, obtained.getType());
    assertEquals(testingMonitorQuery, obtained.getQuery());
    assertEquals(testingMonitorMessage, obtained.getMessage());
    assertEquals(testingMonitorTags, obtained.getTags());
    assertEquals(testingMonitorOptionsNotifyNoData, obtained.getOptions().getNotifyNoData());
    assertEquals(testingMonitorOptionsNoDataTimeframe, obtained.getOptions().getNoDataTimeframe());

    // test deleting monitor
    DeletedMonitor deletedMonitor = api.deleteMonitor(monitorId);
    assertEquals(monitorId, deletedMonitor.getDeletedMonitorId());
  }

  /** Get all monitors */
  @Test
  public void listMonitorsTest() throws ApiException {
    String testingMonitorName = getUniqueEntityName();
    ArrayList<String> names =
        new ArrayList<String>(
            Arrays.asList(
                getUniqueEntityName("1"), getUniqueEntityName("2"), getUniqueEntityName("3")));
    for (String name : names) {
      Monitor monitor =
          new Monitor().name(name).type(testingMonitorType).query(testingMonitorQuery);
      Monitor created = api.createMonitor(monitor);
      deleteMonitors.add(created.getId());
    }
    List<Monitor> allMonitors = api.listMonitors();
    for (String name : names) {
      boolean found = false;
      for (Monitor monitor : allMonitors) {
        if (monitor.getName().equals(name)) {
          found = true;
        }
      }
      assertTrue(String.format("Monitor %s not found", name), found);
    }
  }

  /** Validate monitor */
  @Test
  public void validateMonitorTest() throws ApiException {
    String testingMonitorName = getUniqueEntityName();
    MonitorOptions options =
        new MonitorOptions()
            .notifyNoData(testingMonitorOptionsNotifyNoData)
            .noDataTimeframe(testingMonitorOptionsNoDataTimeframe);

    Monitor monitor =
        new Monitor()
            .name(testingMonitorName)
            .type(testingMonitorType)
            .query(testingMonitorQuery)
            .message(testingMonitorMessage)
            .tags(testingMonitorTags)
            .options(options);

    // if this doesn't throw exception, everything is fine
    api.validateMonitor(monitor);

    monitor.setQuery("avg(last_5m):sum:system.net.bytes_rcvd{host:host0} ><><>< whaaaaaaa?");
    try {
      api.validateMonitor(monitor);
      // junit 4 doesn't have better support for asserting that method threw an error
      assertTrue(false);
    } catch (ApiException e) {
      // noop
    }
  }

  @Test
  public void monitorGetSyntheticsTest() throws ApiException {
    if (TestUtils.getRecordingMode().equals(RecordingMode.MODE_IGNORE)) {
      throw new AssumptionViolatedException("Skipping in non-recording mode");
    }

    // Create a synthetics API test to retrieve its corresponding monitor via GetMonitor
    SyntheticsAPITest synt;
    String apiTestName = getUniqueEntityName();
    apiTestConfig.setName(apiTestName);
    synt = syntheticsApi.createSyntheticsAPITest(apiTestConfig);

    // Retrieve the corresponding synthetics test monitor
    Monitor obtained = api.getMonitor(synt.getMonitorId());
    assertEquals(synt.getPublicId(), obtained.getOptions().getSyntheticsCheckId());

    // Delete synthetics test
    try {
      syntheticsApi.deleteTests(
          new SyntheticsDeleteTestsPayload().publicIds(Arrays.asList(synt.getPublicId())));
    } catch (ApiException e) {
      if (e.getCode() == 404) {
        // doesn't exist => ok
      } else {
        throw e;
      }
    }
  }

  @Test
  public void monitorsCreateErrorsTest() throws IOException {
    try {
      api.createMonitor(new Monitor().type(testingMonitorType).query("wrong query"));
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }

    try {
      fakeAuthApi.createMonitor(new Monitor().type(testingMonitorType).query(testingMonitorQuery));
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(403, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }

  @Test
  public void monitorsListErrorsTest() throws IOException {
    try {
      api.listMonitors(
          new MonitorsApi.ListMonitorsOptionalParameters().groupStates("notagroupstate"));
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }

    try {
      fakeAuthApi.listMonitors(
          new MonitorsApi.ListMonitorsOptionalParameters().groupStates("notagroupstate"));
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(403, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }

  @Test
  public void monitorUpdateErrorsTest() throws ApiException, IOException {
    String testingMonitorName = getUniqueEntityName();
    Monitor monitor =
        new Monitor()
            .name(testingMonitorName)
            .type(testingMonitorType)
            .query(testingMonitorQuery)
            .message(testingMonitorMessage)
            .tags(testingMonitorTags);

    // create monitor
    Monitor obtained = api.createMonitor(monitor);
    Long monitorId = obtained.getId();
    deleteMonitors.add(monitorId);

    MonitorUpdateRequest updateMonitor = new MonitorUpdateRequest();
    updateMonitor.setType(MonitorType.COMPOSITE);

    try {
      api.updateMonitor(monitorId, updateMonitor);
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }

    try {
      fakeAuthApi.updateMonitor(Long.valueOf(1234), new MonitorUpdateRequest());
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(403, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }

    try {
      api.updateMonitor(Long.valueOf(1234), new MonitorUpdateRequest());
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(404, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }

  @Test
  public void monitorUpdate401ErrorTest() throws IOException {
    String fixtureData = TestUtils.getFixture(fixturePrefix + "/error_401.json");
    stubFor(put(urlPathEqualTo(apiUri + "/121")).willReturn(okJson(fixtureData).withStatus(401)));
    // Cannot trigger 401 for client. Need underrestricted creds. Mock it.
    try {
      unitApi.updateMonitor(Long.valueOf(121), new MonitorUpdateRequest());
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(401, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }

  @Test
  public void monitorGetErrorsTest() throws ApiException, IOException {
    String testingMonitorName = getUniqueEntityName();
    Monitor monitor =
        new Monitor()
            .name(testingMonitorName)
            .type(testingMonitorType)
            .query(testingMonitorQuery)
            .message(testingMonitorMessage)
            .tags(testingMonitorTags);

    // create monitor
    Monitor obtained = api.createMonitor(monitor);
    Long monitorId = obtained.getId();
    deleteMonitors.add(monitorId);

    MonitorUpdateRequest updateMonitor = new MonitorUpdateRequest();
    updateMonitor.setType(MonitorType.COMPOSITE);

    try {
      api.getMonitor(
          monitorId, new MonitorsApi.GetMonitorOptionalParameters().groupStates("notagroupstate"));
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }

    try {
      fakeAuthApi.getMonitor(
          Long.valueOf(1234),
          new MonitorsApi.GetMonitorOptionalParameters().groupStates("notagroupstate"));
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(403, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }

    try {
      api.getMonitor(
          Long.valueOf(1234),
          new MonitorsApi.GetMonitorOptionalParameters().groupStates("notagroupstate"));
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(404, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }

  @Test
  public void monitorDelete400ErrorTest() throws IOException {
    String fixtureData = TestUtils.getFixture(fixturePrefix + "/error_400.json");
    stubFor(
        delete(urlPathEqualTo(apiUri + "/121")).willReturn(okJson(fixtureData).withStatus(400)));
    // Cannot trigger 400 due to client side validations, so mock it
    try {
      unitApi.deleteMonitor(Long.valueOf(121));
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }

  @Test
  public void monitorDelete401ErrorTest() throws IOException {
    String fixtureData = TestUtils.getFixture(fixturePrefix + "/error_401.json");
    stubFor(
        delete(urlPathEqualTo(apiUri + "/121")).willReturn(okJson(fixtureData).withStatus(401)));
    // Cannot trigger 401 for client. Need underrestricted creds. Mock it.
    try {
      unitApi.deleteMonitor(Long.valueOf(121));
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(401, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }

  @Test
  public void monitorCanDeleteErrorsTest() throws ApiException, IOException {
    String name = getUniqueEntityName();
    // create metrics monitor
    Monitor monitor =
        new Monitor()
            .name(name)
            .type(MonitorType.QUERY_ALERT)
            .query("avg(last_5m):sum:system.net.bytes_rcvd{host:host0} > 100");

    Monitor obtained = api.createMonitor(monitor);
    Long monitorId = obtained.getId();
    deleteMonitors.add(monitorId);

    // create composite monitor
    Monitor composite =
        new Monitor()
            .name(name + "-composite")
            .type(MonitorType.COMPOSITE)
            .query(Long.toString(monitorId));

    Monitor compositeObtained = api.createMonitor(composite);
    Long compositeMonitorId = compositeObtained.getId();
    deleteMonitors.add(compositeMonitorId);

    List<Long> monitorIdlist = new ArrayList<Long>(Arrays.asList(monitorId));
    List<Long> emptyIdlist = new ArrayList<Long>();

    try {
      api.checkCanDeleteMonitor(emptyIdlist);
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }

    try {
      fakeAuthApi.checkCanDeleteMonitor(emptyIdlist);
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(403, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }

    try {
      api.checkCanDeleteMonitor(monitorIdlist);
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(409, e.getCode());
      CheckCanDeleteMonitorResponse error =
          objectMapper.readValue(e.getResponseBody(), CheckCanDeleteMonitorResponse.class);
      assertNotNull(error.getErrors());
      // Manually delete the composite monitor as deleteMonitors() can fail
      // if trying to delete the dependent metrics monitor prior to deleting the composite monitor
      api.deleteMonitor(compositeMonitorId);
    }
  }

  @Test
  public void monitorValidateErrorsTest() throws IOException {
    try {
      api.validateMonitor(new Monitor().type(testingMonitorType).query("wrong query"));
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }

    try {
      fakeAuthApi.validateMonitor(
          new Monitor().type(testingMonitorType).query(testingMonitorQuery));
      api.validateMonitor(new Monitor().type(testingMonitorType).query(testingMonitorQuery));
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(403, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }
}
