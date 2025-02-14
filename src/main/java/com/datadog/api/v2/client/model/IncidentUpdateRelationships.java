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

/** The incident&#39;s relationships for an update request. */
@ApiModel(description = "The incident's relationships for an update request.")
@JsonPropertyOrder({
  IncidentUpdateRelationships.JSON_PROPERTY_COMMANDER_USER,
  IncidentUpdateRelationships.JSON_PROPERTY_CREATED_BY_USER,
  IncidentUpdateRelationships.JSON_PROPERTY_INTEGRATIONS,
  IncidentUpdateRelationships.JSON_PROPERTY_LAST_MODIFIED_BY_USER,
  IncidentUpdateRelationships.JSON_PROPERTY_POSTMORTEM
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IncidentUpdateRelationships {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COMMANDER_USER = "commander_user";
  private RelationshipToUser commanderUser;

  public static final String JSON_PROPERTY_CREATED_BY_USER = "created_by_user";
  private RelationshipToUser createdByUser;

  public static final String JSON_PROPERTY_INTEGRATIONS = "integrations";
  private RelationshipToIncidentIntegrationMetadatas integrations;

  public static final String JSON_PROPERTY_LAST_MODIFIED_BY_USER = "last_modified_by_user";
  private RelationshipToUser lastModifiedByUser;

  public static final String JSON_PROPERTY_POSTMORTEM = "postmortem";
  private RelationshipToIncidentPostmortem postmortem;

  public IncidentUpdateRelationships commanderUser(RelationshipToUser commanderUser) {
    this.commanderUser = commanderUser;
    this.unparsed |= commanderUser.unparsed;
    return this;
  }

  /**
   * Get commanderUser
   *
   * @return commanderUser
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COMMANDER_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RelationshipToUser getCommanderUser() {
    return commanderUser;
  }

  public void setCommanderUser(RelationshipToUser commanderUser) {
    this.commanderUser = commanderUser;
  }

  public IncidentUpdateRelationships createdByUser(RelationshipToUser createdByUser) {
    this.createdByUser = createdByUser;
    this.unparsed |= createdByUser.unparsed;
    return this;
  }

  /**
   * Get createdByUser
   *
   * @return createdByUser
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATED_BY_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RelationshipToUser getCreatedByUser() {
    return createdByUser;
  }

  public void setCreatedByUser(RelationshipToUser createdByUser) {
    this.createdByUser = createdByUser;
  }

  public IncidentUpdateRelationships integrations(
      RelationshipToIncidentIntegrationMetadatas integrations) {
    this.integrations = integrations;
    this.unparsed |= integrations.unparsed;
    return this;
  }

  /**
   * Get integrations
   *
   * @return integrations
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INTEGRATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RelationshipToIncidentIntegrationMetadatas getIntegrations() {
    return integrations;
  }

  public void setIntegrations(RelationshipToIncidentIntegrationMetadatas integrations) {
    this.integrations = integrations;
  }

  public IncidentUpdateRelationships lastModifiedByUser(RelationshipToUser lastModifiedByUser) {
    this.lastModifiedByUser = lastModifiedByUser;
    this.unparsed |= lastModifiedByUser.unparsed;
    return this;
  }

  /**
   * Get lastModifiedByUser
   *
   * @return lastModifiedByUser
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LAST_MODIFIED_BY_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RelationshipToUser getLastModifiedByUser() {
    return lastModifiedByUser;
  }

  public void setLastModifiedByUser(RelationshipToUser lastModifiedByUser) {
    this.lastModifiedByUser = lastModifiedByUser;
  }

  public IncidentUpdateRelationships postmortem(RelationshipToIncidentPostmortem postmortem) {
    this.postmortem = postmortem;
    this.unparsed |= postmortem.unparsed;
    return this;
  }

  /**
   * Get postmortem
   *
   * @return postmortem
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_POSTMORTEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RelationshipToIncidentPostmortem getPostmortem() {
    return postmortem;
  }

  public void setPostmortem(RelationshipToIncidentPostmortem postmortem) {
    this.postmortem = postmortem;
  }

  /** Return true if this IncidentUpdateRelationships object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentUpdateRelationships incidentUpdateRelationships = (IncidentUpdateRelationships) o;
    return Objects.equals(this.commanderUser, incidentUpdateRelationships.commanderUser)
        && Objects.equals(this.createdByUser, incidentUpdateRelationships.createdByUser)
        && Objects.equals(this.integrations, incidentUpdateRelationships.integrations)
        && Objects.equals(this.lastModifiedByUser, incidentUpdateRelationships.lastModifiedByUser)
        && Objects.equals(this.postmortem, incidentUpdateRelationships.postmortem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commanderUser, createdByUser, integrations, lastModifiedByUser, postmortem);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentUpdateRelationships {\n");
    sb.append("    commanderUser: ").append(toIndentedString(commanderUser)).append("\n");
    sb.append("    createdByUser: ").append(toIndentedString(createdByUser)).append("\n");
    sb.append("    integrations: ").append(toIndentedString(integrations)).append("\n");
    sb.append("    lastModifiedByUser: ").append(toIndentedString(lastModifiedByUser)).append("\n");
    sb.append("    postmortem: ").append(toIndentedString(postmortem)).append("\n");
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
