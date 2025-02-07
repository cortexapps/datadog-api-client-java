/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.datadog.api.v1.client.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.Objects;

/** Cloud Security Posture Management usage for a given organization for a given hour. */
@ApiModel(
    description =
        "Cloud Security Posture Management usage for a given organization for a given hour.")
@JsonPropertyOrder({
  UsageCloudSecurityPostureManagementHour.JSON_PROPERTY_CONTAINER_COUNT,
  UsageCloudSecurityPostureManagementHour.JSON_PROPERTY_HOST_COUNT,
  UsageCloudSecurityPostureManagementHour.JSON_PROPERTY_HOUR
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UsageCloudSecurityPostureManagementHour {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONTAINER_COUNT = "container_count";
  private Long containerCount;

  public static final String JSON_PROPERTY_HOST_COUNT = "host_count";
  private Long hostCount;

  public static final String JSON_PROPERTY_HOUR = "hour";
  private OffsetDateTime hour;

  public UsageCloudSecurityPostureManagementHour containerCount(Long containerCount) {
    this.containerCount = containerCount;
    return this;
  }

  /**
   * The total number of Cloud Security Posture Management containers during a given hour.
   *
   * @return containerCount
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "The total number of Cloud Security Posture Management containers during a given hour.")
  @JsonProperty(JSON_PROPERTY_CONTAINER_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getContainerCount() {
    return containerCount;
  }

  public void setContainerCount(Long containerCount) {
    this.containerCount = containerCount;
  }

  public UsageCloudSecurityPostureManagementHour hostCount(Long hostCount) {
    this.hostCount = hostCount;
    return this;
  }

  /**
   * The total number of Cloud Security Posture Management hosts during a given hour.
   *
   * @return hostCount
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value = "The total number of Cloud Security Posture Management hosts during a given hour.")
  @JsonProperty(JSON_PROPERTY_HOST_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getHostCount() {
    return hostCount;
  }

  public void setHostCount(Long hostCount) {
    this.hostCount = hostCount;
  }

  public UsageCloudSecurityPostureManagementHour hour(OffsetDateTime hour) {
    this.hour = hour;
    return this;
  }

  /**
   * The hour for the usage.
   *
   * @return hour
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The hour for the usage.")
  @JsonProperty(JSON_PROPERTY_HOUR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getHour() {
    return hour;
  }

  public void setHour(OffsetDateTime hour) {
    this.hour = hour;
  }

  /** Return true if this UsageCloudSecurityPostureManagementHour object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageCloudSecurityPostureManagementHour usageCloudSecurityPostureManagementHour =
        (UsageCloudSecurityPostureManagementHour) o;
    return Objects.equals(
            this.containerCount, usageCloudSecurityPostureManagementHour.containerCount)
        && Objects.equals(this.hostCount, usageCloudSecurityPostureManagementHour.hostCount)
        && Objects.equals(this.hour, usageCloudSecurityPostureManagementHour.hour);
  }

  @Override
  public int hashCode() {
    return Objects.hash(containerCount, hostCount, hour);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageCloudSecurityPostureManagementHour {\n");
    sb.append("    containerCount: ").append(toIndentedString(containerCount)).append("\n");
    sb.append("    hostCount: ").append(toIndentedString(hostCount)).append("\n");
    sb.append("    hour: ").append(toIndentedString(hour)).append("\n");
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
