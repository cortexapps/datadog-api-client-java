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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** Query metadata. */
@ApiModel(description = "Query metadata.")
@JsonPropertyOrder({
  SLOHistoryMetricsSeriesMetadata.JSON_PROPERTY_AGGR,
  SLOHistoryMetricsSeriesMetadata.JSON_PROPERTY_EXPRESSION,
  SLOHistoryMetricsSeriesMetadata.JSON_PROPERTY_METRIC,
  SLOHistoryMetricsSeriesMetadata.JSON_PROPERTY_QUERY_INDEX,
  SLOHistoryMetricsSeriesMetadata.JSON_PROPERTY_SCOPE,
  SLOHistoryMetricsSeriesMetadata.JSON_PROPERTY_UNIT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SLOHistoryMetricsSeriesMetadata {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AGGR = "aggr";
  private String aggr;

  public static final String JSON_PROPERTY_EXPRESSION = "expression";
  private String expression;

  public static final String JSON_PROPERTY_METRIC = "metric";
  private String metric;

  public static final String JSON_PROPERTY_QUERY_INDEX = "query_index";
  private Long queryIndex;

  public static final String JSON_PROPERTY_SCOPE = "scope";
  private String scope;

  public static final String JSON_PROPERTY_UNIT = "unit";
  private JsonNullable<List<SLOHistoryMetricsSeriesMetadataUnit>> unit =
      JsonNullable.<List<SLOHistoryMetricsSeriesMetadataUnit>>undefined();

  public SLOHistoryMetricsSeriesMetadata aggr(String aggr) {
    this.aggr = aggr;
    return this;
  }

  /**
   * Query aggregator function.
   *
   * @return aggr
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Query aggregator function.")
  @JsonProperty(JSON_PROPERTY_AGGR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAggr() {
    return aggr;
  }

  public void setAggr(String aggr) {
    this.aggr = aggr;
  }

  public SLOHistoryMetricsSeriesMetadata expression(String expression) {
    this.expression = expression;
    return this;
  }

  /**
   * Query expression.
   *
   * @return expression
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Query expression.")
  @JsonProperty(JSON_PROPERTY_EXPRESSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getExpression() {
    return expression;
  }

  public void setExpression(String expression) {
    this.expression = expression;
  }

  public SLOHistoryMetricsSeriesMetadata metric(String metric) {
    this.metric = metric;
    return this;
  }

  /**
   * Query metric used.
   *
   * @return metric
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Query metric used.")
  @JsonProperty(JSON_PROPERTY_METRIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMetric() {
    return metric;
  }

  public void setMetric(String metric) {
    this.metric = metric;
  }

  public SLOHistoryMetricsSeriesMetadata queryIndex(Long queryIndex) {
    this.queryIndex = queryIndex;
    return this;
  }

  /**
   * Query index from original combined query.
   *
   * @return queryIndex
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Query index from original combined query.")
  @JsonProperty(JSON_PROPERTY_QUERY_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getQueryIndex() {
    return queryIndex;
  }

  public void setQueryIndex(Long queryIndex) {
    this.queryIndex = queryIndex;
  }

  public SLOHistoryMetricsSeriesMetadata scope(String scope) {
    this.scope = scope;
    return this;
  }

  /**
   * Query scope.
   *
   * @return scope
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Query scope.")
  @JsonProperty(JSON_PROPERTY_SCOPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }

  public SLOHistoryMetricsSeriesMetadata unit(List<SLOHistoryMetricsSeriesMetadataUnit> unit) {
    this.unit = JsonNullable.<List<SLOHistoryMetricsSeriesMetadataUnit>>of(unit);
    return this;
  }

  public SLOHistoryMetricsSeriesMetadata addUnitItem(SLOHistoryMetricsSeriesMetadataUnit unitItem) {
    if (this.unit == null || !this.unit.isPresent()) {
      this.unit = JsonNullable.<List<SLOHistoryMetricsSeriesMetadataUnit>>of(new ArrayList<>());
    }
    try {
      this.unit.get().add(unitItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * An array of metric units that contains up to two unit objects. For example, bytes represents
   * one unit object and bytes per second represents two unit objects. If a metric query only has
   * one unit object, the second array element is null.
   *
   * @return unit
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      example =
          "[{\"family\":\"bytes\",\"id\":2,\"name\":\"byte\",\"plural\":\"bytes\",\"scale_factor\":1.0,\"short_name\":\"B\"},null]",
      value =
          "An array of metric units that contains up to two unit objects. For example, bytes"
              + " represents one unit object and bytes per second represents two unit objects. If"
              + " a metric query only has one unit object, the second array element is null.")
  @JsonIgnore
  public List<SLOHistoryMetricsSeriesMetadataUnit> getUnit() {
    return unit.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<SLOHistoryMetricsSeriesMetadataUnit>> getUnit_JsonNullable() {
    return unit;
  }

  @JsonProperty(JSON_PROPERTY_UNIT)
  public void setUnit_JsonNullable(JsonNullable<List<SLOHistoryMetricsSeriesMetadataUnit>> unit) {
    this.unit = unit;
  }

  public void setUnit(List<SLOHistoryMetricsSeriesMetadataUnit> unit) {
    this.unit = JsonNullable.<List<SLOHistoryMetricsSeriesMetadataUnit>>of(unit);
  }

  /** Return true if this SLOHistoryMetricsSeries_metadata object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SLOHistoryMetricsSeriesMetadata slOHistoryMetricsSeriesMetadata =
        (SLOHistoryMetricsSeriesMetadata) o;
    return Objects.equals(this.aggr, slOHistoryMetricsSeriesMetadata.aggr)
        && Objects.equals(this.expression, slOHistoryMetricsSeriesMetadata.expression)
        && Objects.equals(this.metric, slOHistoryMetricsSeriesMetadata.metric)
        && Objects.equals(this.queryIndex, slOHistoryMetricsSeriesMetadata.queryIndex)
        && Objects.equals(this.scope, slOHistoryMetricsSeriesMetadata.scope)
        && Objects.equals(this.unit, slOHistoryMetricsSeriesMetadata.unit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggr, expression, metric, queryIndex, scope, unit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SLOHistoryMetricsSeriesMetadata {\n");
    sb.append("    aggr: ").append(toIndentedString(aggr)).append("\n");
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    queryIndex: ").append(toIndentedString(queryIndex)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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
