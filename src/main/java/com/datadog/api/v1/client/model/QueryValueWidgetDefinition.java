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

/** Query values display the current value of a given metric, APM, or log query. */
@ApiModel(
    description = "Query values display the current value of a given metric, APM, or log query.")
@JsonPropertyOrder({
  QueryValueWidgetDefinition.JSON_PROPERTY_AUTOSCALE,
  QueryValueWidgetDefinition.JSON_PROPERTY_CUSTOM_LINKS,
  QueryValueWidgetDefinition.JSON_PROPERTY_CUSTOM_UNIT,
  QueryValueWidgetDefinition.JSON_PROPERTY_PRECISION,
  QueryValueWidgetDefinition.JSON_PROPERTY_REQUESTS,
  QueryValueWidgetDefinition.JSON_PROPERTY_TEXT_ALIGN,
  QueryValueWidgetDefinition.JSON_PROPERTY_TIME,
  QueryValueWidgetDefinition.JSON_PROPERTY_TITLE,
  QueryValueWidgetDefinition.JSON_PROPERTY_TITLE_ALIGN,
  QueryValueWidgetDefinition.JSON_PROPERTY_TITLE_SIZE,
  QueryValueWidgetDefinition.JSON_PROPERTY_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class QueryValueWidgetDefinition {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTOSCALE = "autoscale";
  private Boolean autoscale;

  public static final String JSON_PROPERTY_CUSTOM_LINKS = "custom_links";
  private List<WidgetCustomLink> customLinks = null;

  public static final String JSON_PROPERTY_CUSTOM_UNIT = "custom_unit";
  private String customUnit;

  public static final String JSON_PROPERTY_PRECISION = "precision";
  private Long precision;

  public static final String JSON_PROPERTY_REQUESTS = "requests";
  private List<QueryValueWidgetRequest> requests = new ArrayList<>();

  public static final String JSON_PROPERTY_TEXT_ALIGN = "text_align";
  private WidgetTextAlign textAlign;

  public static final String JSON_PROPERTY_TIME = "time";
  private WidgetTime time;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_TITLE_ALIGN = "title_align";
  private WidgetTextAlign titleAlign;

  public static final String JSON_PROPERTY_TITLE_SIZE = "title_size";
  private String titleSize;

  public static final String JSON_PROPERTY_TYPE = "type";
  private QueryValueWidgetDefinitionType type = QueryValueWidgetDefinitionType.QUERY_VALUE;

  public QueryValueWidgetDefinition() {}

  @JsonCreator
  public QueryValueWidgetDefinition(
      @JsonProperty(required = true, value = JSON_PROPERTY_REQUESTS)
          List<QueryValueWidgetRequest> requests,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          QueryValueWidgetDefinitionType type) {
    this.requests = requests;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public QueryValueWidgetDefinition autoscale(Boolean autoscale) {
    this.autoscale = autoscale;
    return this;
  }

  /**
   * Whether to use auto-scaling or not.
   *
   * @return autoscale
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether to use auto-scaling or not.")
  @JsonProperty(JSON_PROPERTY_AUTOSCALE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getAutoscale() {
    return autoscale;
  }

  public void setAutoscale(Boolean autoscale) {
    this.autoscale = autoscale;
  }

  public QueryValueWidgetDefinition customLinks(List<WidgetCustomLink> customLinks) {
    this.customLinks = customLinks;
    for (WidgetCustomLink item : customLinks) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public QueryValueWidgetDefinition addCustomLinksItem(WidgetCustomLink customLinksItem) {
    if (this.customLinks == null) {
      this.customLinks = new ArrayList<>();
    }
    this.customLinks.add(customLinksItem);
    this.unparsed |= customLinksItem.unparsed;
    return this;
  }

  /**
   * List of custom links.
   *
   * @return customLinks
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of custom links.")
  @JsonProperty(JSON_PROPERTY_CUSTOM_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<WidgetCustomLink> getCustomLinks() {
    return customLinks;
  }

  public void setCustomLinks(List<WidgetCustomLink> customLinks) {
    this.customLinks = customLinks;
  }

  public QueryValueWidgetDefinition customUnit(String customUnit) {
    this.customUnit = customUnit;
    return this;
  }

  /**
   * Display a unit of your choice on the widget.
   *
   * @return customUnit
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Display a unit of your choice on the widget.")
  @JsonProperty(JSON_PROPERTY_CUSTOM_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCustomUnit() {
    return customUnit;
  }

  public void setCustomUnit(String customUnit) {
    this.customUnit = customUnit;
  }

  public QueryValueWidgetDefinition precision(Long precision) {
    this.precision = precision;
    return this;
  }

  /**
   * Number of decimals to show. If not defined, the widget uses the raw value.
   *
   * @return precision
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value = "Number of decimals to show. If not defined, the widget uses the raw value.")
  @JsonProperty(JSON_PROPERTY_PRECISION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getPrecision() {
    return precision;
  }

  public void setPrecision(Long precision) {
    this.precision = precision;
  }

  public QueryValueWidgetDefinition requests(List<QueryValueWidgetRequest> requests) {
    this.requests = requests;
    for (QueryValueWidgetRequest item : requests) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public QueryValueWidgetDefinition addRequestsItem(QueryValueWidgetRequest requestsItem) {
    this.requests.add(requestsItem);
    this.unparsed |= requestsItem.unparsed;
    return this;
  }

  /**
   * Widget definition.
   *
   * @return requests
   */
  @ApiModelProperty(
      example = "[{\"q/apm_query/log_query\":\"<METRIC_1>{<SCOPE_1>}\"}]",
      required = true,
      value = "Widget definition.")
  @JsonProperty(JSON_PROPERTY_REQUESTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<QueryValueWidgetRequest> getRequests() {
    return requests;
  }

  public void setRequests(List<QueryValueWidgetRequest> requests) {
    this.requests = requests;
  }

  public QueryValueWidgetDefinition textAlign(WidgetTextAlign textAlign) {
    this.textAlign = textAlign;
    this.unparsed |= !textAlign.isValid();
    return this;
  }

  /**
   * Get textAlign
   *
   * @return textAlign
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TEXT_ALIGN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public WidgetTextAlign getTextAlign() {
    return textAlign;
  }

  public void setTextAlign(WidgetTextAlign textAlign) {
    if (!textAlign.isValid()) {
      this.unparsed = true;
    }
    this.textAlign = textAlign;
  }

  public QueryValueWidgetDefinition time(WidgetTime time) {
    this.time = time;
    this.unparsed |= time.unparsed;
    return this;
  }

  /**
   * Get time
   *
   * @return time
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public WidgetTime getTime() {
    return time;
  }

  public void setTime(WidgetTime time) {
    this.time = time;
  }

  public QueryValueWidgetDefinition title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Title of your widget.
   *
   * @return title
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Title of your widget.")
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public QueryValueWidgetDefinition titleAlign(WidgetTextAlign titleAlign) {
    this.titleAlign = titleAlign;
    this.unparsed |= !titleAlign.isValid();
    return this;
  }

  /**
   * Get titleAlign
   *
   * @return titleAlign
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TITLE_ALIGN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public WidgetTextAlign getTitleAlign() {
    return titleAlign;
  }

  public void setTitleAlign(WidgetTextAlign titleAlign) {
    if (!titleAlign.isValid()) {
      this.unparsed = true;
    }
    this.titleAlign = titleAlign;
  }

  public QueryValueWidgetDefinition titleSize(String titleSize) {
    this.titleSize = titleSize;
    return this;
  }

  /**
   * Size of the title.
   *
   * @return titleSize
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Size of the title.")
  @JsonProperty(JSON_PROPERTY_TITLE_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTitleSize() {
    return titleSize;
  }

  public void setTitleSize(String titleSize) {
    this.titleSize = titleSize;
  }

  public QueryValueWidgetDefinition type(QueryValueWidgetDefinitionType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Get type
   *
   * @return type
   */
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public QueryValueWidgetDefinitionType getType() {
    return type;
  }

  public void setType(QueryValueWidgetDefinitionType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this QueryValueWidgetDefinition object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryValueWidgetDefinition queryValueWidgetDefinition = (QueryValueWidgetDefinition) o;
    return Objects.equals(this.autoscale, queryValueWidgetDefinition.autoscale)
        && Objects.equals(this.customLinks, queryValueWidgetDefinition.customLinks)
        && Objects.equals(this.customUnit, queryValueWidgetDefinition.customUnit)
        && Objects.equals(this.precision, queryValueWidgetDefinition.precision)
        && Objects.equals(this.requests, queryValueWidgetDefinition.requests)
        && Objects.equals(this.textAlign, queryValueWidgetDefinition.textAlign)
        && Objects.equals(this.time, queryValueWidgetDefinition.time)
        && Objects.equals(this.title, queryValueWidgetDefinition.title)
        && Objects.equals(this.titleAlign, queryValueWidgetDefinition.titleAlign)
        && Objects.equals(this.titleSize, queryValueWidgetDefinition.titleSize)
        && Objects.equals(this.type, queryValueWidgetDefinition.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        autoscale,
        customLinks,
        customUnit,
        precision,
        requests,
        textAlign,
        time,
        title,
        titleAlign,
        titleSize,
        type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryValueWidgetDefinition {\n");
    sb.append("    autoscale: ").append(toIndentedString(autoscale)).append("\n");
    sb.append("    customLinks: ").append(toIndentedString(customLinks)).append("\n");
    sb.append("    customUnit: ").append(toIndentedString(customUnit)).append("\n");
    sb.append("    precision: ").append(toIndentedString(precision)).append("\n");
    sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
    sb.append("    textAlign: ").append(toIndentedString(textAlign)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    titleAlign: ").append(toIndentedString(titleAlign)).append("\n");
    sb.append("    titleSize: ").append(toIndentedString(titleSize)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
