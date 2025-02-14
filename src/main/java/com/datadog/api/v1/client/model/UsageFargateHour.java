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

/** Number of Fargate tasks run and hourly usage. */
@ApiModel(description = "Number of Fargate tasks run and hourly usage.")
@JsonPropertyOrder({
  UsageFargateHour.JSON_PROPERTY_AVG_PROFILED_FARGATE_TASKS,
  UsageFargateHour.JSON_PROPERTY_HOUR,
  UsageFargateHour.JSON_PROPERTY_TASKS_COUNT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UsageFargateHour {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AVG_PROFILED_FARGATE_TASKS =
      "avg_profiled_fargate_tasks";
  private Long avgProfiledFargateTasks;

  public static final String JSON_PROPERTY_HOUR = "hour";
  private OffsetDateTime hour;

  public static final String JSON_PROPERTY_TASKS_COUNT = "tasks_count";
  private Long tasksCount;

  public UsageFargateHour avgProfiledFargateTasks(Long avgProfiledFargateTasks) {
    this.avgProfiledFargateTasks = avgProfiledFargateTasks;
    return this;
  }

  /**
   * The average profiled task count for Fargate Profiling.
   *
   * @return avgProfiledFargateTasks
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The average profiled task count for Fargate Profiling.")
  @JsonProperty(JSON_PROPERTY_AVG_PROFILED_FARGATE_TASKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getAvgProfiledFargateTasks() {
    return avgProfiledFargateTasks;
  }

  public void setAvgProfiledFargateTasks(Long avgProfiledFargateTasks) {
    this.avgProfiledFargateTasks = avgProfiledFargateTasks;
  }

  public UsageFargateHour hour(OffsetDateTime hour) {
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

  public UsageFargateHour tasksCount(Long tasksCount) {
    this.tasksCount = tasksCount;
    return this;
  }

  /**
   * The number of Fargate tasks run.
   *
   * @return tasksCount
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of Fargate tasks run.")
  @JsonProperty(JSON_PROPERTY_TASKS_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTasksCount() {
    return tasksCount;
  }

  public void setTasksCount(Long tasksCount) {
    this.tasksCount = tasksCount;
  }

  /** Return true if this UsageFargateHour object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageFargateHour usageFargateHour = (UsageFargateHour) o;
    return Objects.equals(this.avgProfiledFargateTasks, usageFargateHour.avgProfiledFargateTasks)
        && Objects.equals(this.hour, usageFargateHour.hour)
        && Objects.equals(this.tasksCount, usageFargateHour.tasksCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(avgProfiledFargateTasks, hour, tasksCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageFargateHour {\n");
    sb.append("    avgProfiledFargateTasks: ")
        .append(toIndentedString(avgProfiledFargateTasks))
        .append("\n");
    sb.append("    hour: ").append(toIndentedString(hour)).append("\n");
    sb.append("    tasksCount: ").append(toIndentedString(tasksCount)).append("\n");
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
