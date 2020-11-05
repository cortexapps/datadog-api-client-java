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
import java.util.Map;
import java.util.HashMap;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.datadog.api.v1.client.JSON;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Color palette to apply.
 */
public enum WidgetPalette {
  
  BLUE("blue"),
  
  CUSTOM_BACKGROUND("custom_bg"),
  
  CUSTOM_IMAGE("custom_image"),
  
  CUSTOM_TEXT("custom_text"),
  
  GRAY_ON_WHITE("gray_on_white"),
  
  GREY("grey"),
  
  GREEN("green"),
  
  ORANGE("orange"),
  
  RED("red"),
  
  RED_ON_WHITE("red_on_white"),
  
  WHITE_ON_GRAY("white_on_gray"),
  
  WHITE_ON_GREEN("white_on_green"),
  
  GREEN_ON_WHITE("green_on_white"),
  
  WHITE_ON_RED("white_on_red"),
  
  WHITE_ON_YELLOW("white_on_yellow"),
  
  YELLOW_ON_WHITE("yellow_on_white"),
  
  BLACK_ON_LIGHT_YELLOW("black_on_light_yellow"),
  
  BLACK_ON_LIGHT_GREEN("black_on_light_green"),
  
  BLACK_ON_LIGHT_RED("black_on_light_red");

  private String value;

  WidgetPalette(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static WidgetPalette fromValue(String value) {
    for (WidgetPalette b : WidgetPalette.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

