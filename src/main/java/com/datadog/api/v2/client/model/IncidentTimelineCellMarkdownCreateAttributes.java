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
import java.util.Objects;

/** Timeline cell data for Markdown timeline cells for a create request. */
@ApiModel(description = "Timeline cell data for Markdown timeline cells for a create request.")
@JsonPropertyOrder({
  IncidentTimelineCellMarkdownCreateAttributes.JSON_PROPERTY_CELL_TYPE,
  IncidentTimelineCellMarkdownCreateAttributes.JSON_PROPERTY_CONTENT,
  IncidentTimelineCellMarkdownCreateAttributes.JSON_PROPERTY_IMPORTANT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IncidentTimelineCellMarkdownCreateAttributes {
  public static final String JSON_PROPERTY_CELL_TYPE = "cell_type";
  private IncidentTimelineCellMarkdownContentType cellType =
      IncidentTimelineCellMarkdownContentType.MARKDOWN;

  public static final String JSON_PROPERTY_CONTENT = "content";
  private IncidentTimelineCellMarkdownCreateAttributesContent content;

  public static final String JSON_PROPERTY_IMPORTANT = "important";
  private Boolean important = false;

  public IncidentTimelineCellMarkdownCreateAttributes() {}

  @JsonCreator
  public IncidentTimelineCellMarkdownCreateAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_CELL_TYPE)
          IncidentTimelineCellMarkdownContentType cellType,
      @JsonProperty(required = true, value = JSON_PROPERTY_CONTENT)
          IncidentTimelineCellMarkdownCreateAttributesContent content) {
    this.cellType = cellType;
    this.content = content;
  }

  public IncidentTimelineCellMarkdownCreateAttributes cellType(
      IncidentTimelineCellMarkdownContentType cellType) {
    this.cellType = cellType;
    return this;
  }

  /**
   * Get cellType
   *
   * @return cellType
   */
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CELL_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public IncidentTimelineCellMarkdownContentType getCellType() {
    return cellType;
  }

  public void setCellType(IncidentTimelineCellMarkdownContentType cellType) {
    this.cellType = cellType;
  }

  public IncidentTimelineCellMarkdownCreateAttributes content(
      IncidentTimelineCellMarkdownCreateAttributesContent content) {
    this.content = content;
    return this;
  }

  /**
   * Get content
   *
   * @return content
   */
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public IncidentTimelineCellMarkdownCreateAttributesContent getContent() {
    return content;
  }

  public void setContent(IncidentTimelineCellMarkdownCreateAttributesContent content) {
    this.content = content;
  }

  public IncidentTimelineCellMarkdownCreateAttributes important(Boolean important) {
    this.important = important;
    return this;
  }

  /**
   * A flag indicating whether the timeline cell is important and should be highlighted.
   *
   * @return important
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      example = "false",
      value = "A flag indicating whether the timeline cell is important and should be highlighted.")
  @JsonProperty(JSON_PROPERTY_IMPORTANT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getImportant() {
    return important;
  }

  public void setImportant(Boolean important) {
    this.important = important;
  }

  /** Return true if this IncidentTimelineCellMarkdownCreateAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentTimelineCellMarkdownCreateAttributes incidentTimelineCellMarkdownCreateAttributes =
        (IncidentTimelineCellMarkdownCreateAttributes) o;
    return Objects.equals(this.cellType, incidentTimelineCellMarkdownCreateAttributes.cellType)
        && Objects.equals(this.content, incidentTimelineCellMarkdownCreateAttributes.content)
        && Objects.equals(this.important, incidentTimelineCellMarkdownCreateAttributes.important);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cellType, content, important);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentTimelineCellMarkdownCreateAttributes {\n");
    sb.append("    cellType: ").append(toIndentedString(cellType)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    important: ").append(toIndentedString(important)).append("\n");
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
