package com.assessment.webapi.rest.testutils;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.specification.RequestSpecification;
import org.testng.Reporter;

public class RestUtils {

  public static RequestSpecification buildGetRequest() {
    RequestSpecification requestSpecification = RestAssured.given();
    requestSpecification.contentType("application/json");
    requestSpecification.accept("application/json");
    return requestSpecification;
  }

  public static String postGetRequest(
      RequestSpecification requestSpecification, String serviceURL) {
    Reporter.log("Endpoint URL is : " + serviceURL, true);
    try {
      return requestSpecification.get(serviceURL).getBody().prettyPrint();
    } catch (Exception e) {
      e.printStackTrace();
    }
    return null;
  }
}
