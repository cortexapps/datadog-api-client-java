/*
 * (C) Datadog, Inc. 2019
 * All rights reserved
 * Licensed under a 3-clause BSD style license (see LICENSE)
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.datadog.api.client.v1.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * AWSAccount
 */
@JsonPropertyOrder({
  AWSAccount.JSON_PROPERTY_ACCESS_KEY_ID,
  AWSAccount.JSON_PROPERTY_ACCOUNT_ID,
  AWSAccount.JSON_PROPERTY_ACCOUNT_SPECIFIC_NAMESPACE_RULES,
  AWSAccount.JSON_PROPERTY_FILTER_TAGS,
  AWSAccount.JSON_PROPERTY_HOST_TAGS,
  AWSAccount.JSON_PROPERTY_ROLE_NAME
})

public class AWSAccount {
  public static final String JSON_PROPERTY_ACCESS_KEY_ID = "access_key_id";
  private String accessKeyId;

  public static final String JSON_PROPERTY_ACCOUNT_ID = "account_id";
  private String accountId;

  public static final String JSON_PROPERTY_ACCOUNT_SPECIFIC_NAMESPACE_RULES = "account_specific_namespace_rules";
  private Map<String, Boolean> accountSpecificNamespaceRules = null;

  public static final String JSON_PROPERTY_FILTER_TAGS = "filter_tags";
  private List<String> filterTags = null;

  public static final String JSON_PROPERTY_HOST_TAGS = "host_tags";
  private List<String> hostTags = null;

  public static final String JSON_PROPERTY_ROLE_NAME = "role_name";
  private String roleName;


  public AWSAccount accessKeyId(String accessKeyId) {
    
    this.accessKeyId = accessKeyId;
    return this;
  }

   /**
   * Get accessKeyId
   * @return accessKeyId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ACCESS_KEY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccessKeyId() {
    return accessKeyId;
  }


  public void setAccessKeyId(String accessKeyId) {
    this.accessKeyId = accessKeyId;
  }


  public AWSAccount accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1234567", value = "")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public AWSAccount accountSpecificNamespaceRules(Map<String, Boolean> accountSpecificNamespaceRules) {
    
    this.accountSpecificNamespaceRules = accountSpecificNamespaceRules;
    return this;
  }

  public AWSAccount putAccountSpecificNamespaceRulesItem(String key, Boolean accountSpecificNamespaceRulesItem) {
    if (this.accountSpecificNamespaceRules == null) {
      this.accountSpecificNamespaceRules = new HashMap<String, Boolean>();
    }
    this.accountSpecificNamespaceRules.put(key, accountSpecificNamespaceRulesItem);
    return this;
  }

   /**
   * Get accountSpecificNamespaceRules
   * @return accountSpecificNamespaceRules
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"auto_scaling\":false}", value = "")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_SPECIFIC_NAMESPACE_RULES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, Boolean> getAccountSpecificNamespaceRules() {
    return accountSpecificNamespaceRules;
  }


  public void setAccountSpecificNamespaceRules(Map<String, Boolean> accountSpecificNamespaceRules) {
    this.accountSpecificNamespaceRules = accountSpecificNamespaceRules;
  }


  public AWSAccount filterTags(List<String> filterTags) {
    
    this.filterTags = filterTags;
    return this;
  }

  public AWSAccount addFilterTagsItem(String filterTagsItem) {
    if (this.filterTags == null) {
      this.filterTags = new ArrayList<String>();
    }
    this.filterTags.add(filterTagsItem);
    return this;
  }

   /**
   * Get filterTags
   * @return filterTags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"<KEY>:<VALUE>\"]", value = "")
  @JsonProperty(JSON_PROPERTY_FILTER_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getFilterTags() {
    return filterTags;
  }


  public void setFilterTags(List<String> filterTags) {
    this.filterTags = filterTags;
  }


  public AWSAccount hostTags(List<String> hostTags) {
    
    this.hostTags = hostTags;
    return this;
  }

  public AWSAccount addHostTagsItem(String hostTagsItem) {
    if (this.hostTags == null) {
      this.hostTags = new ArrayList<String>();
    }
    this.hostTags.add(hostTagsItem);
    return this;
  }

   /**
   * Get hostTags
   * @return hostTags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"<KEY>:<VALUE>\"]", value = "")
  @JsonProperty(JSON_PROPERTY_HOST_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getHostTags() {
    return hostTags;
  }


  public void setHostTags(List<String> hostTags) {
    this.hostTags = hostTags;
  }


  public AWSAccount roleName(String roleName) {
    
    this.roleName = roleName;
    return this;
  }

   /**
   * Get roleName
   * @return roleName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "DatadogAWSIntegrationRole", value = "")
  @JsonProperty(JSON_PROPERTY_ROLE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRoleName() {
    return roleName;
  }


  public void setRoleName(String roleName) {
    this.roleName = roleName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AWSAccount awSAccount = (AWSAccount) o;
    return Objects.equals(this.accessKeyId, awSAccount.accessKeyId) &&
        Objects.equals(this.accountId, awSAccount.accountId) &&
        Objects.equals(this.accountSpecificNamespaceRules, awSAccount.accountSpecificNamespaceRules) &&
        Objects.equals(this.filterTags, awSAccount.filterTags) &&
        Objects.equals(this.hostTags, awSAccount.hostTags) &&
        Objects.equals(this.roleName, awSAccount.roleName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessKeyId, accountId, accountSpecificNamespaceRules, filterTags, hostTags, roleName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AWSAccount {\n");
    sb.append("    accessKeyId: ").append(toIndentedString(accessKeyId)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    accountSpecificNamespaceRules: ").append(toIndentedString(accountSpecificNamespaceRules)).append("\n");
    sb.append("    filterTags: ").append(toIndentedString(filterTags)).append("\n");
    sb.append("    hostTags: ").append(toIndentedString(hostTags)).append("\n");
    sb.append("    roleName: ").append(toIndentedString(roleName)).append("\n");
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

