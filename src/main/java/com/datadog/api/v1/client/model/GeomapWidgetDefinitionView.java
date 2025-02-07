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

/** The view of the world that the map should render. */
@ApiModel(description = "The view of the world that the map should render.")
@JsonPropertyOrder({GeomapWidgetDefinitionView.JSON_PROPERTY_FOCUS})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GeomapWidgetDefinitionView {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FOCUS = "focus";
  private String focus;

  public GeomapWidgetDefinitionView() {}

  @JsonCreator
  public GeomapWidgetDefinitionView(
      @JsonProperty(required = true, value = JSON_PROPERTY_FOCUS) String focus) {
    this.focus = focus;
  }

  public GeomapWidgetDefinitionView focus(String focus) {
    this.focus = focus;
    return this;
  }

  /**
   * The 2-letter ISO code of a country to focus the map on. Or &#x60;WORLD&#x60;.
   *
   * @return focus
   */
  @ApiModelProperty(
      example = "WORLD",
      required = true,
      value = "The 2-letter ISO code of a country to focus the map on. Or `WORLD`.")
  @JsonProperty(JSON_PROPERTY_FOCUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getFocus() {
    return focus;
  }

  public void setFocus(String focus) {
    this.focus = focus;
  }

  /** Return true if this GeomapWidgetDefinition_view object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeomapWidgetDefinitionView geomapWidgetDefinitionView = (GeomapWidgetDefinitionView) o;
    return Objects.equals(this.focus, geomapWidgetDefinitionView.focus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(focus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeomapWidgetDefinitionView {\n");
    sb.append("    focus: ").append(toIndentedString(focus)).append("\n");
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
