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

import java.util.Objects;
import java.util.Arrays;
import com.datadog.api.v1.client.model.SyntheticsTestAuthor;
import com.datadog.api.v1.client.model.SyntheticsTestConfig;
import com.datadog.api.v1.client.model.SyntheticsTestDetailsSubType;
import com.datadog.api.v1.client.model.SyntheticsTestDetailsType;
import com.datadog.api.v1.client.model.SyntheticsTestOptions;
import com.datadog.api.v1.client.model.SyntheticsTestPauseStatus;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * TODO.
 */
@ApiModel(description = "TODO.")
@JsonPropertyOrder({
  SyntheticsTestDetails.JSON_PROPERTY_CONFIG,
  SyntheticsTestDetails.JSON_PROPERTY_CREATED_AT,
  SyntheticsTestDetails.JSON_PROPERTY_CREATED_BY,
  SyntheticsTestDetails.JSON_PROPERTY_LOCATIONS,
  SyntheticsTestDetails.JSON_PROPERTY_MESSAGE,
  SyntheticsTestDetails.JSON_PROPERTY_MODIFIED_AT,
  SyntheticsTestDetails.JSON_PROPERTY_MODIFIED_BY,
  SyntheticsTestDetails.JSON_PROPERTY_MONITOR_ID,
  SyntheticsTestDetails.JSON_PROPERTY_NAME,
  SyntheticsTestDetails.JSON_PROPERTY_OPTIONS,
  SyntheticsTestDetails.JSON_PROPERTY_PUBLIC_ID,
  SyntheticsTestDetails.JSON_PROPERTY_STATUS,
  SyntheticsTestDetails.JSON_PROPERTY_SUBTYPE,
  SyntheticsTestDetails.JSON_PROPERTY_TAGS,
  SyntheticsTestDetails.JSON_PROPERTY_TYPE
})

public class SyntheticsTestDetails {
  public static final String JSON_PROPERTY_CONFIG = "config";
  private SyntheticsTestConfig config;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private String createdAt;

  public static final String JSON_PROPERTY_CREATED_BY = "created_by";
  private SyntheticsTestAuthor createdBy;

  public static final String JSON_PROPERTY_LOCATIONS = "locations";
  private List<String> locations = null;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public static final String JSON_PROPERTY_MODIFIED_AT = "modified_at";
  private String modifiedAt;

  public static final String JSON_PROPERTY_MODIFIED_BY = "modified_by";
  private SyntheticsTestAuthor modifiedBy;

  public static final String JSON_PROPERTY_MONITOR_ID = "monitor_id";
  private Long monitorId;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_OPTIONS = "options";
  private SyntheticsTestOptions options;

  public static final String JSON_PROPERTY_PUBLIC_ID = "public_id";
  private String publicId;

  public static final String JSON_PROPERTY_STATUS = "status";
  private SyntheticsTestPauseStatus status;

  public static final String JSON_PROPERTY_SUBTYPE = "subtype";
  private SyntheticsTestDetailsSubType subtype;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_TYPE = "type";
  private SyntheticsTestDetailsType type;


  public SyntheticsTestDetails config(SyntheticsTestConfig config) {
    
    this.config = config;
    return this;
  }

   /**
   * Get config
   * @return config
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SyntheticsTestConfig getConfig() {
    return config;
  }


  public void setConfig(SyntheticsTestConfig config) {
    this.config = config;
  }


  public SyntheticsTestDetails createdAt(String createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * TODO.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "TODO.")
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public SyntheticsTestDetails createdBy(SyntheticsTestAuthor createdBy) {
    
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SyntheticsTestAuthor getCreatedBy() {
    return createdBy;
  }


  public void setCreatedBy(SyntheticsTestAuthor createdBy) {
    this.createdBy = createdBy;
  }


  public SyntheticsTestDetails locations(List<String> locations) {
    
    this.locations = locations;
    return this;
  }

  public SyntheticsTestDetails addLocationsItem(String locationsItem) {
    if (this.locations == null) {
      this.locations = new ArrayList<>();
    }
    this.locations.add(locationsItem);
    return this;
  }

   /**
   * TODO.
   * @return locations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "TODO.")
  @JsonProperty(JSON_PROPERTY_LOCATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getLocations() {
    return locations;
  }


  public void setLocations(List<String> locations) {
    this.locations = locations;
  }


  public SyntheticsTestDetails message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * TODO.
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "TODO.")
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public SyntheticsTestDetails modifiedAt(String modifiedAt) {
    
    this.modifiedAt = modifiedAt;
    return this;
  }

   /**
   * TODO.
   * @return modifiedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "TODO.")
  @JsonProperty(JSON_PROPERTY_MODIFIED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getModifiedAt() {
    return modifiedAt;
  }


  public void setModifiedAt(String modifiedAt) {
    this.modifiedAt = modifiedAt;
  }


  public SyntheticsTestDetails modifiedBy(SyntheticsTestAuthor modifiedBy) {
    
    this.modifiedBy = modifiedBy;
    return this;
  }

   /**
   * Get modifiedBy
   * @return modifiedBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MODIFIED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SyntheticsTestAuthor getModifiedBy() {
    return modifiedBy;
  }


  public void setModifiedBy(SyntheticsTestAuthor modifiedBy) {
    this.modifiedBy = modifiedBy;
  }


  public SyntheticsTestDetails monitorId(Long monitorId) {
    
    this.monitorId = monitorId;
    return this;
  }

   /**
   * TODO.
   * @return monitorId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "TODO.")
  @JsonProperty(JSON_PROPERTY_MONITOR_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getMonitorId() {
    return monitorId;
  }


  public void setMonitorId(Long monitorId) {
    this.monitorId = monitorId;
  }


  public SyntheticsTestDetails name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * TODO.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "TODO.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public SyntheticsTestDetails options(SyntheticsTestOptions options) {
    
    this.options = options;
    return this;
  }

   /**
   * Get options
   * @return options
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SyntheticsTestOptions getOptions() {
    return options;
  }


  public void setOptions(SyntheticsTestOptions options) {
    this.options = options;
  }


  public SyntheticsTestDetails publicId(String publicId) {
    
    this.publicId = publicId;
    return this;
  }

   /**
   * TODO.
   * @return publicId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "TODO.")
  @JsonProperty(JSON_PROPERTY_PUBLIC_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPublicId() {
    return publicId;
  }


  public void setPublicId(String publicId) {
    this.publicId = publicId;
  }


  public SyntheticsTestDetails status(SyntheticsTestPauseStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SyntheticsTestPauseStatus getStatus() {
    return status;
  }


  public void setStatus(SyntheticsTestPauseStatus status) {
    this.status = status;
  }


  public SyntheticsTestDetails subtype(SyntheticsTestDetailsSubType subtype) {
    
    this.subtype = subtype;
    return this;
  }

   /**
   * Get subtype
   * @return subtype
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SUBTYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SyntheticsTestDetailsSubType getSubtype() {
    return subtype;
  }


  public void setSubtype(SyntheticsTestDetailsSubType subtype) {
    this.subtype = subtype;
  }


  public SyntheticsTestDetails tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public SyntheticsTestDetails addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * TODO.
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "TODO.")
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public SyntheticsTestDetails type(SyntheticsTestDetailsType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SyntheticsTestDetailsType getType() {
    return type;
  }


  public void setType(SyntheticsTestDetailsType type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsTestDetails syntheticsTestDetails = (SyntheticsTestDetails) o;
    return Objects.equals(this.config, syntheticsTestDetails.config) &&
        Objects.equals(this.createdAt, syntheticsTestDetails.createdAt) &&
        Objects.equals(this.createdBy, syntheticsTestDetails.createdBy) &&
        Objects.equals(this.locations, syntheticsTestDetails.locations) &&
        Objects.equals(this.message, syntheticsTestDetails.message) &&
        Objects.equals(this.modifiedAt, syntheticsTestDetails.modifiedAt) &&
        Objects.equals(this.modifiedBy, syntheticsTestDetails.modifiedBy) &&
        Objects.equals(this.monitorId, syntheticsTestDetails.monitorId) &&
        Objects.equals(this.name, syntheticsTestDetails.name) &&
        Objects.equals(this.options, syntheticsTestDetails.options) &&
        Objects.equals(this.publicId, syntheticsTestDetails.publicId) &&
        Objects.equals(this.status, syntheticsTestDetails.status) &&
        Objects.equals(this.subtype, syntheticsTestDetails.subtype) &&
        Objects.equals(this.tags, syntheticsTestDetails.tags) &&
        Objects.equals(this.type, syntheticsTestDetails.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(config, createdAt, createdBy, locations, message, modifiedAt, modifiedBy, monitorId, name, options, publicId, status, subtype, tags, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsTestDetails {\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    locations: ").append(toIndentedString(locations)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    monitorId: ").append(toIndentedString(monitorId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    publicId: ").append(toIndentedString(publicId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    subtype: ").append(toIndentedString(subtype)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

