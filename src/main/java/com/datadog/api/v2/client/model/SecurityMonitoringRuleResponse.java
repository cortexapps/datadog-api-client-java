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

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Rule. */
@ApiModel(description = "Rule.")
@JsonPropertyOrder({
  SecurityMonitoringRuleResponse.JSON_PROPERTY_CASES,
  SecurityMonitoringRuleResponse.JSON_PROPERTY_CREATED_AT,
  SecurityMonitoringRuleResponse.JSON_PROPERTY_CREATION_AUTHOR_ID,
  SecurityMonitoringRuleResponse.JSON_PROPERTY_FILTERS,
  SecurityMonitoringRuleResponse.JSON_PROPERTY_HAS_EXTENDED_TITLE,
  SecurityMonitoringRuleResponse.JSON_PROPERTY_ID,
  SecurityMonitoringRuleResponse.JSON_PROPERTY_IS_DEFAULT,
  SecurityMonitoringRuleResponse.JSON_PROPERTY_IS_DELETED,
  SecurityMonitoringRuleResponse.JSON_PROPERTY_IS_ENABLED,
  SecurityMonitoringRuleResponse.JSON_PROPERTY_MESSAGE,
  SecurityMonitoringRuleResponse.JSON_PROPERTY_NAME,
  SecurityMonitoringRuleResponse.JSON_PROPERTY_OPTIONS,
  SecurityMonitoringRuleResponse.JSON_PROPERTY_QUERIES,
  SecurityMonitoringRuleResponse.JSON_PROPERTY_TAGS,
  SecurityMonitoringRuleResponse.JSON_PROPERTY_TYPE,
  SecurityMonitoringRuleResponse.JSON_PROPERTY_VERSION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SecurityMonitoringRuleResponse {
  public static final String JSON_PROPERTY_CASES = "cases";
  private List<SecurityMonitoringRuleCase> cases = null;

  public static final String JSON_PROPERTY_CREATED_AT = "createdAt";
  private Long createdAt;

  public static final String JSON_PROPERTY_CREATION_AUTHOR_ID = "creationAuthorId";
  private Long creationAuthorId;

  public static final String JSON_PROPERTY_FILTERS = "filters";
  private List<SecurityMonitoringFilter> filters = null;

  public static final String JSON_PROPERTY_HAS_EXTENDED_TITLE = "hasExtendedTitle";
  private Boolean hasExtendedTitle;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_IS_DEFAULT = "isDefault";
  private Boolean isDefault;

  public static final String JSON_PROPERTY_IS_DELETED = "isDeleted";
  private Boolean isDeleted;

  public static final String JSON_PROPERTY_IS_ENABLED = "isEnabled";
  private Boolean isEnabled;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_OPTIONS = "options";
  private SecurityMonitoringRuleOptions options;

  public static final String JSON_PROPERTY_QUERIES = "queries";
  private List<SecurityMonitoringRuleQuery> queries = null;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_TYPE = "type";
  private SecurityMonitoringRuleType type = SecurityMonitoringRuleType.LOG_DETECTION;

  public static final String JSON_PROPERTY_VERSION = "version";
  private Long version;

  public SecurityMonitoringRuleResponse cases(List<SecurityMonitoringRuleCase> cases) {
    this.cases = cases;
    return this;
  }

  public SecurityMonitoringRuleResponse addCasesItem(SecurityMonitoringRuleCase casesItem) {
    if (this.cases == null) {
      this.cases = new ArrayList<>();
    }
    this.cases.add(casesItem);
    return this;
  }

  /**
   * Cases for generating signals.
   *
   * @return cases
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Cases for generating signals.")
  @JsonProperty(JSON_PROPERTY_CASES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SecurityMonitoringRuleCase> getCases() {
    return cases;
  }

  public void setCases(List<SecurityMonitoringRuleCase> cases) {
    this.cases = cases;
  }

  public SecurityMonitoringRuleResponse createdAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * When the rule was created, timestamp in milliseconds.
   *
   * @return createdAt
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When the rule was created, timestamp in milliseconds.")
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
  }

  public SecurityMonitoringRuleResponse creationAuthorId(Long creationAuthorId) {
    this.creationAuthorId = creationAuthorId;
    return this;
  }

  /**
   * User ID of the user who created the rule.
   *
   * @return creationAuthorId
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "User ID of the user who created the rule.")
  @JsonProperty(JSON_PROPERTY_CREATION_AUTHOR_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCreationAuthorId() {
    return creationAuthorId;
  }

  public void setCreationAuthorId(Long creationAuthorId) {
    this.creationAuthorId = creationAuthorId;
  }

  public SecurityMonitoringRuleResponse filters(List<SecurityMonitoringFilter> filters) {
    this.filters = filters;
    return this;
  }

  public SecurityMonitoringRuleResponse addFiltersItem(SecurityMonitoringFilter filtersItem) {
    if (this.filters == null) {
      this.filters = new ArrayList<>();
    }
    this.filters.add(filtersItem);
    return this;
  }

  /**
   * Additional queries to filter matched events before they are processed.
   *
   * @return filters
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value = "Additional queries to filter matched events before they are processed.")
  @JsonProperty(JSON_PROPERTY_FILTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SecurityMonitoringFilter> getFilters() {
    return filters;
  }

  public void setFilters(List<SecurityMonitoringFilter> filters) {
    this.filters = filters;
  }

  public SecurityMonitoringRuleResponse hasExtendedTitle(Boolean hasExtendedTitle) {
    this.hasExtendedTitle = hasExtendedTitle;
    return this;
  }

  /**
   * Whether the notifications include the triggering group-by values in their title.
   *
   * @return hasExtendedTitle
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value = "Whether the notifications include the triggering group-by values in their title.")
  @JsonProperty(JSON_PROPERTY_HAS_EXTENDED_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getHasExtendedTitle() {
    return hasExtendedTitle;
  }

  public void setHasExtendedTitle(Boolean hasExtendedTitle) {
    this.hasExtendedTitle = hasExtendedTitle;
  }

  public SecurityMonitoringRuleResponse id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the rule.
   *
   * @return id
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the rule.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SecurityMonitoringRuleResponse isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

  /**
   * Whether the rule is included by default.
   *
   * @return isDefault
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the rule is included by default.")
  @JsonProperty(JSON_PROPERTY_IS_DEFAULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsDefault() {
    return isDefault;
  }

  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }

  public SecurityMonitoringRuleResponse isDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
    return this;
  }

  /**
   * Whether the rule has been deleted.
   *
   * @return isDeleted
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the rule has been deleted.")
  @JsonProperty(JSON_PROPERTY_IS_DELETED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsDeleted() {
    return isDeleted;
  }

  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }

  public SecurityMonitoringRuleResponse isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

  /**
   * Whether the rule is enabled.
   *
   * @return isEnabled
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the rule is enabled.")
  @JsonProperty(JSON_PROPERTY_IS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsEnabled() {
    return isEnabled;
  }

  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }

  public SecurityMonitoringRuleResponse message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Message for generated signals.
   *
   * @return message
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Message for generated signals.")
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public SecurityMonitoringRuleResponse name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the rule.
   *
   * @return name
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the rule.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SecurityMonitoringRuleResponse options(SecurityMonitoringRuleOptions options) {
    this.options = options;
    return this;
  }

  /**
   * Get options
   *
   * @return options
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SecurityMonitoringRuleOptions getOptions() {
    return options;
  }

  public void setOptions(SecurityMonitoringRuleOptions options) {
    this.options = options;
  }

  public SecurityMonitoringRuleResponse queries(List<SecurityMonitoringRuleQuery> queries) {
    this.queries = queries;
    return this;
  }

  public SecurityMonitoringRuleResponse addQueriesItem(SecurityMonitoringRuleQuery queriesItem) {
    if (this.queries == null) {
      this.queries = new ArrayList<>();
    }
    this.queries.add(queriesItem);
    return this;
  }

  /**
   * Queries for selecting logs which are part of the rule.
   *
   * @return queries
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Queries for selecting logs which are part of the rule.")
  @JsonProperty(JSON_PROPERTY_QUERIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SecurityMonitoringRuleQuery> getQueries() {
    return queries;
  }

  public void setQueries(List<SecurityMonitoringRuleQuery> queries) {
    this.queries = queries;
  }

  public SecurityMonitoringRuleResponse tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public SecurityMonitoringRuleResponse addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Tags for generated signals.
   *
   * @return tags
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Tags for generated signals.")
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public SecurityMonitoringRuleResponse type(SecurityMonitoringRuleType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   *
   * @return type
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SecurityMonitoringRuleType getType() {
    return type;
  }

  public void setType(SecurityMonitoringRuleType type) {
    this.type = type;
  }

  public SecurityMonitoringRuleResponse version(Long version) {
    this.version = version;
    return this;
  }

  /**
   * The version of the rule.
   *
   * @return version
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The version of the rule.")
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getVersion() {
    return version;
  }

  public void setVersion(Long version) {
    this.version = version;
  }

  /** Return true if this SecurityMonitoringRuleResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityMonitoringRuleResponse securityMonitoringRuleResponse =
        (SecurityMonitoringRuleResponse) o;
    return Objects.equals(this.cases, securityMonitoringRuleResponse.cases)
        && Objects.equals(this.createdAt, securityMonitoringRuleResponse.createdAt)
        && Objects.equals(this.creationAuthorId, securityMonitoringRuleResponse.creationAuthorId)
        && Objects.equals(this.filters, securityMonitoringRuleResponse.filters)
        && Objects.equals(this.hasExtendedTitle, securityMonitoringRuleResponse.hasExtendedTitle)
        && Objects.equals(this.id, securityMonitoringRuleResponse.id)
        && Objects.equals(this.isDefault, securityMonitoringRuleResponse.isDefault)
        && Objects.equals(this.isDeleted, securityMonitoringRuleResponse.isDeleted)
        && Objects.equals(this.isEnabled, securityMonitoringRuleResponse.isEnabled)
        && Objects.equals(this.message, securityMonitoringRuleResponse.message)
        && Objects.equals(this.name, securityMonitoringRuleResponse.name)
        && Objects.equals(this.options, securityMonitoringRuleResponse.options)
        && Objects.equals(this.queries, securityMonitoringRuleResponse.queries)
        && Objects.equals(this.tags, securityMonitoringRuleResponse.tags)
        && Objects.equals(this.type, securityMonitoringRuleResponse.type)
        && Objects.equals(this.version, securityMonitoringRuleResponse.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        cases,
        createdAt,
        creationAuthorId,
        filters,
        hasExtendedTitle,
        id,
        isDefault,
        isDeleted,
        isEnabled,
        message,
        name,
        options,
        queries,
        tags,
        type,
        version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityMonitoringRuleResponse {\n");
    sb.append("    cases: ").append(toIndentedString(cases)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    creationAuthorId: ").append(toIndentedString(creationAuthorId)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    hasExtendedTitle: ").append(toIndentedString(hasExtendedTitle)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    queries: ").append(toIndentedString(queries)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
