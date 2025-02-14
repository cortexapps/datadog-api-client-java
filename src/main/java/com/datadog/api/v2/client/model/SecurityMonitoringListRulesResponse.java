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

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** List of rules. */
@ApiModel(description = "List of rules.")
@JsonPropertyOrder({
  SecurityMonitoringListRulesResponse.JSON_PROPERTY_DATA,
  SecurityMonitoringListRulesResponse.JSON_PROPERTY_META
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SecurityMonitoringListRulesResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA = "data";
  private List<SecurityMonitoringRuleResponse> data = null;

  public static final String JSON_PROPERTY_META = "meta";
  private ResponseMetaAttributes meta;

  public SecurityMonitoringListRulesResponse data(List<SecurityMonitoringRuleResponse> data) {
    this.data = data;
    for (SecurityMonitoringRuleResponse item : data) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SecurityMonitoringListRulesResponse addDataItem(SecurityMonitoringRuleResponse dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    this.unparsed |= dataItem.unparsed;
    return this;
  }

  /**
   * Array containing the list of rules.
   *
   * @return data
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Array containing the list of rules.")
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SecurityMonitoringRuleResponse> getData() {
    return data;
  }

  public void setData(List<SecurityMonitoringRuleResponse> data) {
    this.data = data;
  }

  public SecurityMonitoringListRulesResponse meta(ResponseMetaAttributes meta) {
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
  public ResponseMetaAttributes getMeta() {
    return meta;
  }

  public void setMeta(ResponseMetaAttributes meta) {
    this.meta = meta;
  }

  /** Return true if this SecurityMonitoringListRulesResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityMonitoringListRulesResponse securityMonitoringListRulesResponse =
        (SecurityMonitoringListRulesResponse) o;
    return Objects.equals(this.data, securityMonitoringListRulesResponse.data)
        && Objects.equals(this.meta, securityMonitoringListRulesResponse.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityMonitoringListRulesResponse {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
