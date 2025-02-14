package com.datadog.api.v2.client.api;

import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.ApiResponse;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.Pair;
import com.datadog.api.v2.client.model.ProcessSummariesResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ProcessesApi {
  private ApiClient apiClient;

  public ProcessesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ProcessesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get the API client
   *
   * @return API client
   */
  public ApiClient getApiClient() {
    return apiClient;
  }

  /**
   * Set the API client
   *
   * @param apiClient an instance of API client
   */
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /** Manage optional parameters to listProcesses. */
  public static class ListProcessesOptionalParameters {
    private String search;
    private String tags;
    private Long from;
    private Long to;
    private Integer pageLimit;
    private String pageCursor;

    /**
     * Set search
     *
     * @param search String to search processes by. (optional)
     * @return ListProcessesOptionalParameters
     */
    public ListProcessesOptionalParameters search(String search) {
      this.search = search;
      return this;
    }

    /**
     * Set tags
     *
     * @param tags Comma-separated list of tags to filter processes by. (optional)
     * @return ListProcessesOptionalParameters
     */
    public ListProcessesOptionalParameters tags(String tags) {
      this.tags = tags;
      return this;
    }

    /**
     * Set from
     *
     * @param from Unix timestamp (number of seconds since epoch) of the start of the query window.
     *     If not provided, the start of the query window will be 15 minutes before the
     *     &#x60;to&#x60; timestamp. If neither &#x60;from&#x60; nor &#x60;to&#x60; are provided,
     *     the query window will be &#x60;[now - 15m, now]&#x60;. (optional)
     * @return ListProcessesOptionalParameters
     */
    public ListProcessesOptionalParameters from(Long from) {
      this.from = from;
      return this;
    }

    /**
     * Set to
     *
     * @param to Unix timestamp (number of seconds since epoch) of the end of the query window. If
     *     not provided, the end of the query window will be 15 minutes after the &#x60;from&#x60;
     *     timestamp. If neither &#x60;from&#x60; nor &#x60;to&#x60; are provided, the query window
     *     will be &#x60;[now - 15m, now]&#x60;. (optional)
     * @return ListProcessesOptionalParameters
     */
    public ListProcessesOptionalParameters to(Long to) {
      this.to = to;
      return this;
    }

    /**
     * Set pageLimit
     *
     * @param pageLimit Maximum number of results returned. (optional, default to 1000)
     * @return ListProcessesOptionalParameters
     */
    public ListProcessesOptionalParameters pageLimit(Integer pageLimit) {
      this.pageLimit = pageLimit;
      return this;
    }

    /**
     * Set pageCursor
     *
     * @param pageCursor String to query the next page of results. This key is provided with each
     *     valid response from the API in &#x60;meta.page.after&#x60;. (optional)
     * @return ListProcessesOptionalParameters
     */
    public ListProcessesOptionalParameters pageCursor(String pageCursor) {
      this.pageCursor = pageCursor;
      return this;
    }
  }

  /**
   * Get all processes Get all processes for your organization.
   *
   * @return ProcessSummariesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ProcessSummariesResponse listProcesses() throws ApiException {
    return listProcessesWithHttpInfo(new ListProcessesOptionalParameters()).getData();
  }

  /**
   * Get all processes Get all processes for your organization.
   *
   * @param parameters Optional parameters for the request.
   * @return ProcessSummariesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><th> Status Code </th><th> Description </th><th> Response Headers </th></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ProcessSummariesResponse listProcesses(ListProcessesOptionalParameters parameters)
      throws ApiException {
    return listProcessesWithHttpInfo(parameters).getData();
  }

  /**
   * Get all processes Get all processes for your organization.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;ProcessSummariesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ProcessSummariesResponse> listProcessesWithHttpInfo(
      ListProcessesOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    String search = parameters.search;
    String tags = parameters.tags;
    Long from = parameters.from;
    Long to = parameters.to;
    Integer pageLimit = parameters.pageLimit;
    String pageCursor = parameters.pageCursor;
    // create path and map variables
    String localVarPath = "/api/v2/processes";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "search", search));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "tags", tags));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "from", from));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "to", to));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[cursor]", pageCursor));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listProcesses");

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"};

    GenericType<ProcessSummariesResponse> localVarReturnType =
        new GenericType<ProcessSummariesResponse>() {};

    return apiClient.invokeAPI(
        "ProcessesApi.listProcesses",
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false);
  }
}
