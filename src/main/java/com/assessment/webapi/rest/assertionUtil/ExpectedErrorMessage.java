package com.assessment.webapi.rest.assertionUtil;

/**
 * 1) Built this Enum class for Standard Error message assertions
 * 2) Alternatively same messages could be read from Json or CSV,
 * or Excel file if want to implement that way
 * 3) There message alternatively can be read from DB table
 * and and asserted on if want to implement that way
 */
public enum ExpectedErrorMessage {
  STATUS_CODE_404("34"),
  STATUS_MSG__NOT_FOUND("The resource you requested could not be found."),
  STATUS_CODE_401("7"),
  STATUS_MSG__NOT_AUTHORIZRD("Invalid API key: You must be granted a valid key.");

  private String value;

  ExpectedErrorMessage(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }
}
