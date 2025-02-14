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

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** Private key for the private location. */
@ApiModel(description = "Private key for the private location.")
@JsonPropertyOrder({SyntheticsPrivateLocationSecretsConfigDecryption.JSON_PROPERTY_KEY})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SyntheticsPrivateLocationSecretsConfigDecryption {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_KEY = "key";
  private String key;

  /**
   * Private key for the private location.
   *
   * @return key
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Private key for the private location.")
  @JsonProperty(JSON_PROPERTY_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getKey() {
    return key;
  }

  /**
   * Return true if this SyntheticsPrivateLocation_secrets_config_decryption object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsPrivateLocationSecretsConfigDecryption
        syntheticsPrivateLocationSecretsConfigDecryption =
            (SyntheticsPrivateLocationSecretsConfigDecryption) o;
    return Objects.equals(this.key, syntheticsPrivateLocationSecretsConfigDecryption.key);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsPrivateLocationSecretsConfigDecryption {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
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
