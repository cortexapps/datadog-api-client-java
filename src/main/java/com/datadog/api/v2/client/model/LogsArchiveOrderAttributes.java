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
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** The attributes associated with the archive order. */
@ApiModel(description = "The attributes associated with the archive order.")
@JsonPropertyOrder({LogsArchiveOrderAttributes.JSON_PROPERTY_ARCHIVE_IDS})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class LogsArchiveOrderAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ARCHIVE_IDS = "archive_ids";
  private List<String> archiveIds = new ArrayList<>();

  public LogsArchiveOrderAttributes() {}

  @JsonCreator
  public LogsArchiveOrderAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_ARCHIVE_IDS) List<String> archiveIds) {
    this.archiveIds = archiveIds;
  }

  public LogsArchiveOrderAttributes archiveIds(List<String> archiveIds) {
    this.archiveIds = archiveIds;
    return this;
  }

  public LogsArchiveOrderAttributes addArchiveIdsItem(String archiveIdsItem) {
    this.archiveIds.add(archiveIdsItem);
    return this;
  }

  /**
   * An ordered array of &#x60;&lt;ARCHIVE_ID&gt;&#x60; strings, the order of archive IDs in the
   * array define the overall archives order for Datadog.
   *
   * @return archiveIds
   */
  @ApiModelProperty(
      example =
          "[\"a2zcMylnM4OCHpYusxIi1g\",\"a2zcMylnM4OCHpYusxIi2g\",\"a2zcMylnM4OCHpYusxIi3g\"]",
      required = true,
      value =
          "An ordered array of `<ARCHIVE_ID>` strings, the order of archive IDs in the array"
              + " define the overall archives order for Datadog.")
  @JsonProperty(JSON_PROPERTY_ARCHIVE_IDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getArchiveIds() {
    return archiveIds;
  }

  public void setArchiveIds(List<String> archiveIds) {
    this.archiveIds = archiveIds;
  }

  /** Return true if this LogsArchiveOrderAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsArchiveOrderAttributes logsArchiveOrderAttributes = (LogsArchiveOrderAttributes) o;
    return Objects.equals(this.archiveIds, logsArchiveOrderAttributes.archiveIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(archiveIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsArchiveOrderAttributes {\n");
    sb.append("    archiveIds: ").append(toIndentedString(archiveIds)).append("\n");
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
