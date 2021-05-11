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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Object containing the definition of a metric tag configuration to be created. */
@ApiModel(
    description = "Object containing the definition of a metric tag configuration to be created.")
@JsonPropertyOrder({
  MetricTagConfigurationCreateAttributes.JSON_PROPERTY_INCLUDE_PERCENTILES,
  MetricTagConfigurationCreateAttributes.JSON_PROPERTY_METRIC_TYPE,
  MetricTagConfigurationCreateAttributes.JSON_PROPERTY_TAGS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MetricTagConfigurationCreateAttributes {
  public static final String JSON_PROPERTY_INCLUDE_PERCENTILES = "include_percentiles";
  private Boolean includePercentiles = false;

  public static final String JSON_PROPERTY_METRIC_TYPE = "metric_type";
  private MetricTagConfigurationMetricTypes metricType = MetricTagConfigurationMetricTypes.GAUGE;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = new ArrayList<>();

  public MetricTagConfigurationCreateAttributes() {}

  @JsonCreator
  public MetricTagConfigurationCreateAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_METRIC_TYPE)
          MetricTagConfigurationMetricTypes metricType,
      @JsonProperty(required = true, value = JSON_PROPERTY_TAGS) List<String> tags) {
    this.metricType = metricType;
    this.tags = tags;
  }

  public MetricTagConfigurationCreateAttributes includePercentiles(Boolean includePercentiles) {
    this.includePercentiles = includePercentiles;
    return this;
  }

  /**
   * Toggle to include/exclude percentiles for a distribution metric. Defaults to false. Can only be
   * applied to metrics that have a &#x60;metric_type&#x60; of &#x60;distribution&#x60;.
   *
   * @return includePercentiles
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      example = "true",
      value =
          "Toggle to include/exclude percentiles for a distribution metric. Defaults to false. Can"
              + " only be applied to metrics that have a `metric_type` of `distribution`.")
  @JsonProperty(JSON_PROPERTY_INCLUDE_PERCENTILES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIncludePercentiles() {
    return includePercentiles;
  }

  public void setIncludePercentiles(Boolean includePercentiles) {
    this.includePercentiles = includePercentiles;
  }

  public MetricTagConfigurationCreateAttributes metricType(
      MetricTagConfigurationMetricTypes metricType) {
    this.metricType = metricType;
    return this;
  }

  /**
   * Get metricType
   *
   * @return metricType
   */
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_METRIC_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public MetricTagConfigurationMetricTypes getMetricType() {
    return metricType;
  }

  public void setMetricType(MetricTagConfigurationMetricTypes metricType) {
    this.metricType = metricType;
  }

  public MetricTagConfigurationCreateAttributes tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public MetricTagConfigurationCreateAttributes addTagsItem(String tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * A list of tag keys that will be queryable for your metric.
   *
   * @return tags
   */
  @ApiModelProperty(
      example = "[\"app\",\"datacenter\"]",
      required = true,
      value = "A list of tag keys that will be queryable for your metric.")
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  /** Return true if this MetricTagConfigurationCreateAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetricTagConfigurationCreateAttributes metricTagConfigurationCreateAttributes =
        (MetricTagConfigurationCreateAttributes) o;
    return Objects.equals(
            this.includePercentiles, metricTagConfigurationCreateAttributes.includePercentiles)
        && Objects.equals(this.metricType, metricTagConfigurationCreateAttributes.metricType)
        && Objects.equals(this.tags, metricTagConfigurationCreateAttributes.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includePercentiles, metricType, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetricTagConfigurationCreateAttributes {\n");
    sb.append("    includePercentiles: ").append(toIndentedString(includePercentiles)).append("\n");
    sb.append("    metricType: ").append(toIndentedString(metricType)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
