package com.assessment.webapi.rest.response.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 *  Equivallent response entity classes for validation to read from
 *  error response received from GET Call By Movie Id
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ErrorMessageResponseDto {
  @SerializedName("status_code")
  @Expose
  private String statusCode;

  @SerializedName("status_message")
  @Expose
  private String statusMessage;

  public String getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(String name) {
    this.statusCode = statusCode;
  }

  public String getStatusMessage() {
    return statusMessage;
  }

  public void setStatusMessage(String department) {
    this.statusMessage = statusMessage;
  }
}
