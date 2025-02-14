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
import org.openapitools.jackson.nullable.JsonNullable;

/** Datadog-Webhooks integration. */
@ApiModel(description = "Datadog-Webhooks integration.")
@JsonPropertyOrder({
  WebhooksIntegration.JSON_PROPERTY_CUSTOM_HEADERS,
  WebhooksIntegration.JSON_PROPERTY_ENCODE_AS,
  WebhooksIntegration.JSON_PROPERTY_NAME,
  WebhooksIntegration.JSON_PROPERTY_PAYLOAD,
  WebhooksIntegration.JSON_PROPERTY_URL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WebhooksIntegration {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CUSTOM_HEADERS = "custom_headers";
  private JsonNullable<String> customHeaders = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ENCODE_AS = "encode_as";
  private WebhooksIntegrationEncoding encodeAs = WebhooksIntegrationEncoding.JSON;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PAYLOAD = "payload";
  private JsonNullable<String> payload = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public WebhooksIntegration() {}

  @JsonCreator
  public WebhooksIntegration(
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_URL) String url) {
    this.name = name;
    this.url = url;
  }

  public WebhooksIntegration customHeaders(String customHeaders) {
    this.customHeaders = JsonNullable.<String>of(customHeaders);
    return this;
  }

  /**
   * If &#x60;null&#x60;, uses no header. If given a JSON payload, these will be headers attached to
   * your webhook.
   *
   * @return customHeaders
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "If `null`, uses no header. If given a JSON payload, these will be headers attached to"
              + " your webhook.")
  @JsonIgnore
  public String getCustomHeaders() {
    return customHeaders.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CUSTOM_HEADERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getCustomHeaders_JsonNullable() {
    return customHeaders;
  }

  @JsonProperty(JSON_PROPERTY_CUSTOM_HEADERS)
  public void setCustomHeaders_JsonNullable(JsonNullable<String> customHeaders) {
    this.customHeaders = customHeaders;
  }

  public void setCustomHeaders(String customHeaders) {
    this.customHeaders = JsonNullable.<String>of(customHeaders);
  }

  public WebhooksIntegration encodeAs(WebhooksIntegrationEncoding encodeAs) {
    this.encodeAs = encodeAs;
    this.unparsed |= !encodeAs.isValid();
    return this;
  }

  /**
   * Get encodeAs
   *
   * @return encodeAs
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ENCODE_AS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public WebhooksIntegrationEncoding getEncodeAs() {
    return encodeAs;
  }

  public void setEncodeAs(WebhooksIntegrationEncoding encodeAs) {
    if (!encodeAs.isValid()) {
      this.unparsed = true;
    }
    this.encodeAs = encodeAs;
  }

  public WebhooksIntegration name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the webhook. It corresponds with &#x60;&lt;WEBHOOK_NAME&gt;&#x60;. Learn more on
   * how to use it in [monitor notifications](https://docs.datadoghq.com/monitors/notify).
   *
   * @return name
   */
  @ApiModelProperty(
      example = "WEBHOOK_NAME",
      required = true,
      value =
          "The name of the webhook. It corresponds with `<WEBHOOK_NAME>`. Learn more on how to use"
              + " it in [monitor notifications](https://docs.datadoghq.com/monitors/notify).")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public WebhooksIntegration payload(String payload) {
    this.payload = JsonNullable.<String>of(payload);
    return this;
  }

  /**
   * If &#x60;null&#x60;, uses the default payload. If given a JSON payload, the webhook returns the
   * payload specified by the given payload. [Webhooks variable
   * usage](https://docs.datadoghq.com/integrations/webhooks/#usage).
   *
   * @return payload
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "If `null`, uses the default payload. If given a JSON payload, the webhook returns the"
              + " payload specified by the given payload. [Webhooks variable"
              + " usage](https://docs.datadoghq.com/integrations/webhooks/#usage).")
  @JsonIgnore
  public String getPayload() {
    return payload.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PAYLOAD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getPayload_JsonNullable() {
    return payload;
  }

  @JsonProperty(JSON_PROPERTY_PAYLOAD)
  public void setPayload_JsonNullable(JsonNullable<String> payload) {
    this.payload = payload;
  }

  public void setPayload(String payload) {
    this.payload = JsonNullable.<String>of(payload);
  }

  public WebhooksIntegration url(String url) {
    this.url = url;
    return this;
  }

  /**
   * URL of the webhook.
   *
   * @return url
   */
  @ApiModelProperty(
      example = "https://example.com/webhook",
      required = true,
      value = "URL of the webhook.")
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  /** Return true if this WebhooksIntegration object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhooksIntegration webhooksIntegration = (WebhooksIntegration) o;
    return Objects.equals(this.customHeaders, webhooksIntegration.customHeaders)
        && Objects.equals(this.encodeAs, webhooksIntegration.encodeAs)
        && Objects.equals(this.name, webhooksIntegration.name)
        && Objects.equals(this.payload, webhooksIntegration.payload)
        && Objects.equals(this.url, webhooksIntegration.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customHeaders, encodeAs, name, payload, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhooksIntegration {\n");
    sb.append("    customHeaders: ").append(toIndentedString(customHeaders)).append("\n");
    sb.append("    encodeAs: ").append(toIndentedString(encodeAs)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
