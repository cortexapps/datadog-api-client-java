/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.datadog.api.v2.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Response with a list of incident team payloads. */
@ApiModel(description = "Response with a list of incident team payloads.")
@JsonPropertyOrder({
  IncidentTeamsResponse.JSON_PROPERTY_DATA,
  IncidentTeamsResponse.JSON_PROPERTY_INCLUDED,
  IncidentTeamsResponse.JSON_PROPERTY_META
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IncidentTeamsResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA = "data";
  private List<IncidentTeamResponseData> data = new ArrayList<>();

  public static final String JSON_PROPERTY_INCLUDED = "included";
  private List<IncidentTeamIncludedItems> included = null;

  public static final String JSON_PROPERTY_META = "meta";
  private IncidentServicesResponseMeta meta;

  public IncidentTeamsResponse() {}

  @JsonCreator
  public IncidentTeamsResponse(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA)
          List<IncidentTeamResponseData> data) {
    this.data = data;
  }

  public IncidentTeamsResponse data(List<IncidentTeamResponseData> data) {
    this.data = data;
    for (IncidentTeamResponseData item : data) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public IncidentTeamsResponse addDataItem(IncidentTeamResponseData dataItem) {
    this.data.add(dataItem);
    this.unparsed |= dataItem.unparsed;
    return this;
  }

  /**
   * An array of incident teams.
   *
   * @return data
   */
  @ApiModelProperty(
      example =
          "[{\"attributes\":{\"name\":\"team"
              + " name\"},\"id\":\"00000000-0000-0000-0000-000000000000\",\"type\":\"teams\"}]",
      required = true,
      value = "An array of incident teams.")
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<IncidentTeamResponseData> getData() {
    return data;
  }

  public void setData(List<IncidentTeamResponseData> data) {
    this.data = data;
  }

  /**
   * Included related resources which the user requested.
   *
   * @return included
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Included related resources which the user requested.")
  @JsonProperty(JSON_PROPERTY_INCLUDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<IncidentTeamIncludedItems> getIncluded() {
    return included;
  }

  public IncidentTeamsResponse meta(IncidentServicesResponseMeta meta) {
    this.meta = meta;
    this.unparsed |= meta.unparsed;
    return this;
  }

  /**
   * Get meta
   *
   * @return meta
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public IncidentServicesResponseMeta getMeta() {
    return meta;
  }

  public void setMeta(IncidentServicesResponseMeta meta) {
    this.meta = meta;
  }

  /** Return true if this IncidentTeamsResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentTeamsResponse incidentTeamsResponse = (IncidentTeamsResponse) o;
    return Objects.equals(this.data, incidentTeamsResponse.data)
        && Objects.equals(this.included, incidentTeamsResponse.included)
        && Objects.equals(this.meta, incidentTeamsResponse.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, included, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentTeamsResponse {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    included: ").append(toIndentedString(included)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
