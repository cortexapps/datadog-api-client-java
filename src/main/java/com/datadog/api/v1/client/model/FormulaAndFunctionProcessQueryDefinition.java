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

/** Process query using formulas and functions. */
@ApiModel(description = "Process query using formulas and functions.")
@JsonPropertyOrder({
  FormulaAndFunctionProcessQueryDefinition.JSON_PROPERTY_AGGREGATOR,
  FormulaAndFunctionProcessQueryDefinition.JSON_PROPERTY_DATA_SOURCE,
  FormulaAndFunctionProcessQueryDefinition.JSON_PROPERTY_IS_NORMALIZED_CPU,
  FormulaAndFunctionProcessQueryDefinition.JSON_PROPERTY_LIMIT,
  FormulaAndFunctionProcessQueryDefinition.JSON_PROPERTY_METRIC,
  FormulaAndFunctionProcessQueryDefinition.JSON_PROPERTY_NAME,
  FormulaAndFunctionProcessQueryDefinition.JSON_PROPERTY_SORT,
  FormulaAndFunctionProcessQueryDefinition.JSON_PROPERTY_TAG_FILTERS,
  FormulaAndFunctionProcessQueryDefinition.JSON_PROPERTY_TEXT_FILTER
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FormulaAndFunctionProcessQueryDefinition {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AGGREGATOR = "aggregator";
  private FormulaAndFunctionMetricAggregation aggregator;

  public static final String JSON_PROPERTY_DATA_SOURCE = "data_source";
  private FormulaAndFunctionProcessQueryDataSource dataSource;

  public static final String JSON_PROPERTY_IS_NORMALIZED_CPU = "is_normalized_cpu";
  private Boolean isNormalizedCpu;

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private Long limit;

  public static final String JSON_PROPERTY_METRIC = "metric";
  private String metric;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SORT = "sort";
  private QuerySortOrder sort = QuerySortOrder.DESC;

  public static final String JSON_PROPERTY_TAG_FILTERS = "tag_filters";
  private List<String> tagFilters = null;

  public static final String JSON_PROPERTY_TEXT_FILTER = "text_filter";
  private String textFilter;

  public FormulaAndFunctionProcessQueryDefinition() {}

  @JsonCreator
  public FormulaAndFunctionProcessQueryDefinition(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA_SOURCE)
          FormulaAndFunctionProcessQueryDataSource dataSource,
      @JsonProperty(required = true, value = JSON_PROPERTY_METRIC) String metric,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name) {
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    this.metric = metric;
    this.name = name;
  }

  public FormulaAndFunctionProcessQueryDefinition aggregator(
      FormulaAndFunctionMetricAggregation aggregator) {
    this.aggregator = aggregator;
    this.unparsed |= !aggregator.isValid();
    return this;
  }

  /**
   * Get aggregator
   *
   * @return aggregator
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AGGREGATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public FormulaAndFunctionMetricAggregation getAggregator() {
    return aggregator;
  }

  public void setAggregator(FormulaAndFunctionMetricAggregation aggregator) {
    if (!aggregator.isValid()) {
      this.unparsed = true;
    }
    this.aggregator = aggregator;
  }

  public FormulaAndFunctionProcessQueryDefinition dataSource(
      FormulaAndFunctionProcessQueryDataSource dataSource) {
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    return this;
  }

  /**
   * Get dataSource
   *
   * @return dataSource
   */
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_DATA_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public FormulaAndFunctionProcessQueryDataSource getDataSource() {
    return dataSource;
  }

  public void setDataSource(FormulaAndFunctionProcessQueryDataSource dataSource) {
    if (!dataSource.isValid()) {
      this.unparsed = true;
    }
    this.dataSource = dataSource;
  }

  public FormulaAndFunctionProcessQueryDefinition isNormalizedCpu(Boolean isNormalizedCpu) {
    this.isNormalizedCpu = isNormalizedCpu;
    return this;
  }

  /**
   * Whether to normalize the CPU percentages.
   *
   * @return isNormalizedCpu
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether to normalize the CPU percentages.")
  @JsonProperty(JSON_PROPERTY_IS_NORMALIZED_CPU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsNormalizedCpu() {
    return isNormalizedCpu;
  }

  public void setIsNormalizedCpu(Boolean isNormalizedCpu) {
    this.isNormalizedCpu = isNormalizedCpu;
  }

  public FormulaAndFunctionProcessQueryDefinition limit(Long limit) {
    this.limit = limit;
    return this;
  }

  /**
   * Number of hits to return.
   *
   * @return limit
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of hits to return.")
  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getLimit() {
    return limit;
  }

  public void setLimit(Long limit) {
    this.limit = limit;
  }

  public FormulaAndFunctionProcessQueryDefinition metric(String metric) {
    this.metric = metric;
    return this;
  }

  /**
   * Process metric name.
   *
   * @return metric
   */
  @ApiModelProperty(
      example = "avg:system.cpu.user{*}",
      required = true,
      value = "Process metric name.")
  @JsonProperty(JSON_PROPERTY_METRIC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getMetric() {
    return metric;
  }

  public void setMetric(String metric) {
    this.metric = metric;
  }

  public FormulaAndFunctionProcessQueryDefinition name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of query for use in formulas.
   *
   * @return name
   */
  @ApiModelProperty(
      example = "query_errors",
      required = true,
      value = "Name of query for use in formulas.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FormulaAndFunctionProcessQueryDefinition sort(QuerySortOrder sort) {
    this.sort = sort;
    this.unparsed |= !sort.isValid();
    return this;
  }

  /**
   * Get sort
   *
   * @return sort
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public QuerySortOrder getSort() {
    return sort;
  }

  public void setSort(QuerySortOrder sort) {
    if (!sort.isValid()) {
      this.unparsed = true;
    }
    this.sort = sort;
  }

  public FormulaAndFunctionProcessQueryDefinition tagFilters(List<String> tagFilters) {
    this.tagFilters = tagFilters;
    return this;
  }

  public FormulaAndFunctionProcessQueryDefinition addTagFiltersItem(String tagFiltersItem) {
    if (this.tagFilters == null) {
      this.tagFilters = new ArrayList<>();
    }
    this.tagFilters.add(tagFiltersItem);
    return this;
  }

  /**
   * An array of tags to filter by.
   *
   * @return tagFilters
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of tags to filter by.")
  @JsonProperty(JSON_PROPERTY_TAG_FILTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getTagFilters() {
    return tagFilters;
  }

  public void setTagFilters(List<String> tagFilters) {
    this.tagFilters = tagFilters;
  }

  public FormulaAndFunctionProcessQueryDefinition textFilter(String textFilter) {
    this.textFilter = textFilter;
    return this;
  }

  /**
   * Text to use as filter.
   *
   * @return textFilter
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Text to use as filter.")
  @JsonProperty(JSON_PROPERTY_TEXT_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTextFilter() {
    return textFilter;
  }

  public void setTextFilter(String textFilter) {
    this.textFilter = textFilter;
  }

  /** Return true if this FormulaAndFunctionProcessQueryDefinition object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormulaAndFunctionProcessQueryDefinition formulaAndFunctionProcessQueryDefinition =
        (FormulaAndFunctionProcessQueryDefinition) o;
    return Objects.equals(this.aggregator, formulaAndFunctionProcessQueryDefinition.aggregator)
        && Objects.equals(this.dataSource, formulaAndFunctionProcessQueryDefinition.dataSource)
        && Objects.equals(
            this.isNormalizedCpu, formulaAndFunctionProcessQueryDefinition.isNormalizedCpu)
        && Objects.equals(this.limit, formulaAndFunctionProcessQueryDefinition.limit)
        && Objects.equals(this.metric, formulaAndFunctionProcessQueryDefinition.metric)
        && Objects.equals(this.name, formulaAndFunctionProcessQueryDefinition.name)
        && Objects.equals(this.sort, formulaAndFunctionProcessQueryDefinition.sort)
        && Objects.equals(this.tagFilters, formulaAndFunctionProcessQueryDefinition.tagFilters)
        && Objects.equals(this.textFilter, formulaAndFunctionProcessQueryDefinition.textFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        aggregator, dataSource, isNormalizedCpu, limit, metric, name, sort, tagFilters, textFilter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormulaAndFunctionProcessQueryDefinition {\n");
    sb.append("    aggregator: ").append(toIndentedString(aggregator)).append("\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    isNormalizedCpu: ").append(toIndentedString(isNormalizedCpu)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    tagFilters: ").append(toIndentedString(tagFilters)).append("\n");
    sb.append("    textFilter: ").append(toIndentedString(textFilter)).append("\n");
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
