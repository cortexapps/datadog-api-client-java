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
import java.util.Objects;

/** List of errors. */
@ApiModel(description = "List of errors.")
@JsonPropertyOrder({
  HTTPLogError.JSON_PROPERTY_DETAIL,
  HTTPLogError.JSON_PROPERTY_STATUS,
  HTTPLogError.JSON_PROPERTY_TITLE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class HTTPLogError {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DETAIL = "detail";
  private String detail;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public HTTPLogError detail(String detail) {
    this.detail = detail;
    return this;
  }

  /**
   * Error message.
   *
   * @return detail
   */
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Malformed payload", value = "Error message.")
  @JsonProperty(JSON_PROPERTY_DETAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDetail() {
    return detail;
  }

  public void setDetail(String detail) {
    this.detail = detail;
  }

  public HTTPLogError status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Error code.
   *
   * @return status
   */
  @javax.annotation.Nullable
  @ApiModelProperty(example = "400", value = "Error code.")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public HTTPLogError title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Error title.
   *
   * @return title
   */
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Bad Request", value = "Error title.")
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  /** Return true if this HTTPLogError object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HTTPLogError htTPLogError = (HTTPLogError) o;
    return Objects.equals(this.detail, htTPLogError.detail)
        && Objects.equals(this.status, htTPLogError.status)
        && Objects.equals(this.title, htTPLogError.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(detail, status, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HTTPLogError {\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
