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
import java.time.OffsetDateTime;
import java.util.Objects;

/** Your Datadog Dashboards. */
@ApiModel(description = "Your Datadog Dashboards.")
@JsonPropertyOrder({
  DashboardList.JSON_PROPERTY_AUTHOR,
  DashboardList.JSON_PROPERTY_CREATED,
  DashboardList.JSON_PROPERTY_DASHBOARD_COUNT,
  DashboardList.JSON_PROPERTY_ID,
  DashboardList.JSON_PROPERTY_IS_FAVORITE,
  DashboardList.JSON_PROPERTY_MODIFIED,
  DashboardList.JSON_PROPERTY_NAME,
  DashboardList.JSON_PROPERTY_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DashboardList {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTHOR = "author";
  private Creator author;

  public static final String JSON_PROPERTY_CREATED = "created";
  private OffsetDateTime created;

  public static final String JSON_PROPERTY_DASHBOARD_COUNT = "dashboard_count";
  private Long dashboardCount;

  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_IS_FAVORITE = "is_favorite";
  private Boolean isFavorite;

  public static final String JSON_PROPERTY_MODIFIED = "modified";
  private OffsetDateTime modified;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public DashboardList() {}

  @JsonCreator
  public DashboardList(@JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name) {
    this.name = name;
  }

  public DashboardList author(Creator author) {
    this.author = author;
    this.unparsed |= author.unparsed;
    return this;
  }

  /**
   * Get author
   *
   * @return author
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AUTHOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Creator getAuthor() {
    return author;
  }

  public void setAuthor(Creator author) {
    this.author = author;
  }

  /**
   * Date of creation of the dashboard list.
   *
   * @return created
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date of creation of the dashboard list.")
  @JsonProperty(JSON_PROPERTY_CREATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getCreated() {
    return created;
  }

  /**
   * The number of dashboards in the list.
   *
   * @return dashboardCount
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of dashboards in the list.")
  @JsonProperty(JSON_PROPERTY_DASHBOARD_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getDashboardCount() {
    return dashboardCount;
  }

  /**
   * The ID of the dashboard list.
   *
   * @return id
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the dashboard list.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getId() {
    return id;
  }

  /**
   * Whether or not the list is in the favorites.
   *
   * @return isFavorite
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether or not the list is in the favorites.")
  @JsonProperty(JSON_PROPERTY_IS_FAVORITE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsFavorite() {
    return isFavorite;
  }

  /**
   * Date of last edition of the dashboard list.
   *
   * @return modified
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date of last edition of the dashboard list.")
  @JsonProperty(JSON_PROPERTY_MODIFIED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getModified() {
    return modified;
  }

  public DashboardList name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the dashboard list.
   *
   * @return name
   */
  @ApiModelProperty(
      example = "My Dashboard",
      required = true,
      value = "The name of the dashboard list.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The type of dashboard list.
   *
   * @return type
   */
  @javax.annotation.Nullable
  @ApiModelProperty(example = "manual_dashboard_list", value = "The type of dashboard list.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getType() {
    return type;
  }

  /** Return true if this DashboardList object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DashboardList dashboardList = (DashboardList) o;
    return Objects.equals(this.author, dashboardList.author)
        && Objects.equals(this.created, dashboardList.created)
        && Objects.equals(this.dashboardCount, dashboardList.dashboardCount)
        && Objects.equals(this.id, dashboardList.id)
        && Objects.equals(this.isFavorite, dashboardList.isFavorite)
        && Objects.equals(this.modified, dashboardList.modified)
        && Objects.equals(this.name, dashboardList.name)
        && Objects.equals(this.type, dashboardList.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(author, created, dashboardCount, id, isFavorite, modified, name, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DashboardList {\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    dashboardCount: ").append(toIndentedString(dashboardCount)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isFavorite: ").append(toIndentedString(isFavorite)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
