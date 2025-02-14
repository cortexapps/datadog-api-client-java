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
import java.util.Objects;

/**
 * Alert values are query values showing the current value of the metric in any monitor defined on
 * your system.
 */
@ApiModel(
    description =
        "Alert values are query values showing the current value of the metric in any monitor"
            + " defined on your system.")
@JsonPropertyOrder({
  AlertValueWidgetDefinition.JSON_PROPERTY_ALERT_ID,
  AlertValueWidgetDefinition.JSON_PROPERTY_PRECISION,
  AlertValueWidgetDefinition.JSON_PROPERTY_TEXT_ALIGN,
  AlertValueWidgetDefinition.JSON_PROPERTY_TITLE,
  AlertValueWidgetDefinition.JSON_PROPERTY_TITLE_ALIGN,
  AlertValueWidgetDefinition.JSON_PROPERTY_TITLE_SIZE,
  AlertValueWidgetDefinition.JSON_PROPERTY_TYPE,
  AlertValueWidgetDefinition.JSON_PROPERTY_UNIT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlertValueWidgetDefinition {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ALERT_ID = "alert_id";
  private String alertId;

  public static final String JSON_PROPERTY_PRECISION = "precision";
  private Long precision;

  public static final String JSON_PROPERTY_TEXT_ALIGN = "text_align";
  private WidgetTextAlign textAlign;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_TITLE_ALIGN = "title_align";
  private WidgetTextAlign titleAlign;

  public static final String JSON_PROPERTY_TITLE_SIZE = "title_size";
  private String titleSize;

  public static final String JSON_PROPERTY_TYPE = "type";
  private AlertValueWidgetDefinitionType type = AlertValueWidgetDefinitionType.ALERT_VALUE;

  public static final String JSON_PROPERTY_UNIT = "unit";
  private String unit;

  public AlertValueWidgetDefinition() {}

  @JsonCreator
  public AlertValueWidgetDefinition(
      @JsonProperty(required = true, value = JSON_PROPERTY_ALERT_ID) String alertId,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          AlertValueWidgetDefinitionType type) {
    this.alertId = alertId;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public AlertValueWidgetDefinition alertId(String alertId) {
    this.alertId = alertId;
    return this;
  }

  /**
   * ID of the alert to use in the widget.
   *
   * @return alertId
   */
  @ApiModelProperty(example = "", required = true, value = "ID of the alert to use in the widget.")
  @JsonProperty(JSON_PROPERTY_ALERT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getAlertId() {
    return alertId;
  }

  public void setAlertId(String alertId) {
    this.alertId = alertId;
  }

  public AlertValueWidgetDefinition precision(Long precision) {
    this.precision = precision;
    return this;
  }

  /**
   * Number of decimal to show. If not defined, will use the raw value.
   *
   * @return precision
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of decimal to show. If not defined, will use the raw value.")
  @JsonProperty(JSON_PROPERTY_PRECISION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getPrecision() {
    return precision;
  }

  public void setPrecision(Long precision) {
    this.precision = precision;
  }

  public AlertValueWidgetDefinition textAlign(WidgetTextAlign textAlign) {
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

  public AlertValueWidgetDefinition title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Title of the widget.
   *
   * @return title
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Title of the widget.")
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public AlertValueWidgetDefinition titleAlign(WidgetTextAlign titleAlign) {
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

  public AlertValueWidgetDefinition titleSize(String titleSize) {
    this.titleSize = titleSize;
    return this;
  }

  /**
   * Size of value in the widget.
   *
   * @return titleSize
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Size of value in the widget.")
  @JsonProperty(JSON_PROPERTY_TITLE_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTitleSize() {
    return titleSize;
  }

  public void setTitleSize(String titleSize) {
    this.titleSize = titleSize;
  }

  public AlertValueWidgetDefinition type(AlertValueWidgetDefinitionType type) {
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
  public AlertValueWidgetDefinitionType getType() {
    return type;
  }

  public void setType(AlertValueWidgetDefinitionType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  public AlertValueWidgetDefinition unit(String unit) {
    this.unit = unit;
    return this;
  }

  /**
   * Unit to display with the value.
   *
   * @return unit
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unit to display with the value.")
  @JsonProperty(JSON_PROPERTY_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getUnit() {
    return unit;
  }

  public void setUnit(String unit) {
    this.unit = unit;
  }

  /** Return true if this AlertValueWidgetDefinition object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlertValueWidgetDefinition alertValueWidgetDefinition = (AlertValueWidgetDefinition) o;
    return Objects.equals(this.alertId, alertValueWidgetDefinition.alertId)
        && Objects.equals(this.precision, alertValueWidgetDefinition.precision)
        && Objects.equals(this.textAlign, alertValueWidgetDefinition.textAlign)
        && Objects.equals(this.title, alertValueWidgetDefinition.title)
        && Objects.equals(this.titleAlign, alertValueWidgetDefinition.titleAlign)
        && Objects.equals(this.titleSize, alertValueWidgetDefinition.titleSize)
        && Objects.equals(this.type, alertValueWidgetDefinition.type)
        && Objects.equals(this.unit, alertValueWidgetDefinition.unit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alertId, precision, textAlign, title, titleAlign, titleSize, type, unit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlertValueWidgetDefinition {\n");
    sb.append("    alertId: ").append(toIndentedString(alertId)).append("\n");
    sb.append("    precision: ").append(toIndentedString(precision)).append("\n");
    sb.append("    textAlign: ").append(toIndentedString(textAlign)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    titleAlign: ").append(toIndentedString(titleAlign)).append("\n");
    sb.append("    titleSize: ").append(toIndentedString(titleSize)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
