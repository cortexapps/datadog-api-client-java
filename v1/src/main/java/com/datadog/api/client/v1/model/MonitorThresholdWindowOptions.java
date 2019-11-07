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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * MonitorThresholdWindowOptions
 */
@JsonPropertyOrder({
  MonitorThresholdWindowOptions.JSON_PROPERTY_RECOVERY_WINDOW,
  MonitorThresholdWindowOptions.JSON_PROPERTY_TRIGGER_WINDOW
})

public class MonitorThresholdWindowOptions {
  public static final String JSON_PROPERTY_RECOVERY_WINDOW = "recovery_window";
  private String recoveryWindow;

  public static final String JSON_PROPERTY_TRIGGER_WINDOW = "trigger_window";
  private String triggerWindow;


  public MonitorThresholdWindowOptions recoveryWindow(String recoveryWindow) {
    
    this.recoveryWindow = recoveryWindow;
    return this;
  }

   /**
   * Get recoveryWindow
   * @return recoveryWindow
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RECOVERY_WINDOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRecoveryWindow() {
    return recoveryWindow;
  }


  public void setRecoveryWindow(String recoveryWindow) {
    this.recoveryWindow = recoveryWindow;
  }


  public MonitorThresholdWindowOptions triggerWindow(String triggerWindow) {
    
    this.triggerWindow = triggerWindow;
    return this;
  }

   /**
   * Get triggerWindow
   * @return triggerWindow
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TRIGGER_WINDOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTriggerWindow() {
    return triggerWindow;
  }


  public void setTriggerWindow(String triggerWindow) {
    this.triggerWindow = triggerWindow;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonitorThresholdWindowOptions monitorThresholdWindowOptions = (MonitorThresholdWindowOptions) o;
    return Objects.equals(this.recoveryWindow, monitorThresholdWindowOptions.recoveryWindow) &&
        Objects.equals(this.triggerWindow, monitorThresholdWindowOptions.triggerWindow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recoveryWindow, triggerWindow);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitorThresholdWindowOptions {\n");
    sb.append("    recoveryWindow: ").append(toIndentedString(recoveryWindow)).append("\n");
    sb.append("    triggerWindow: ").append(toIndentedString(triggerWindow)).append("\n");
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

