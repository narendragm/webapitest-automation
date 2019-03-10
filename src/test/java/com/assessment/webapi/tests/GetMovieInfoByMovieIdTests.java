package com.assessment.webapi.tests;

import com.assessment.webapi.rest.assertionutil.ExpectedErrorMessage;
import com.assessment.webapi.rest.assertionutil.TestAssertions;
import com.assessment.webapi.rest.data.TestDataProvider;
import com.assessment.webapi.rest.testbase.TestBase;
import com.assessment.webapi.rest.testutils.LanguageOption;
import com.assessment.webapi.rest.testutils.RestUtils;
import org.testng.annotations.Test;

/**
 * @author Narendra Marbate
 *
 * 1) This Test Class coveres test cases for GET Call "/movie/{movie_id}"
 * 2) More test can be written than covered here based on
 *      -Combination of tests.
 *      -Depending on detail understanding of requirements
 * 3) Some of the tests are marked as Regression candidate for future test runoo
 */

public class GetMovieInfoByMovieIdTests extends TestBase {

    /**
     * Test ID - 001 - Find Movie Details By Valid Movie Id
     * Verify that when GET Call "/movie/{movie_id}" executed with
     * - Valid Movie ID with Leading And Trailing Spaces
     * - With NO Language option mentioned (Should fall back to default US English)
     * call should get executed successfully with no error and response should return
     * expected Movie details (Should fall back to default US English)
     */
    @Test(description = "TestID-001", groups = "Regression")
    public void getMovieDetailsByValidMovieId(){
        /* Push Extent Report notification  */
        pushTestReportingNotification("Test ID - 001 - Find Movie Details By Valid Movie Id");

        /* Build the GET Call "/movie/{movie_id}" request and execute it*/
        String response = RestUtils.postGetRequest(RestUtils.buildGetRequest(),
                        TestBase.GET_MOVIE_BY_ID_ENDPOINT+"   "+ TestBase.VALID_MOVIE_ID+"   "+ TestBase.API_KEY);

        /* Validate the response returned by above call with expected */
        TestAssertions.assertMovieDetails(response);
    }

    /**
     * Test ID - 002 - Find Movie Details By Valid Movie Id And Language Option
     * Verify that when GET Call "/movie/{movie_id}" executed with
     * - Valid Movie ID
     * - With valid Language option (For e.g. French - "&language=fr-FR")
     * call should get executed successfully with no error
     * and response should return expected Movie details
     */
    @Test(description = "TestID-002", groups = "Regression")
    public void getMovieDetailsByValidMovieIdAndLangOpt(){
        /* Push Extent Report notification  */
        pushTestReportingNotification(
            "Test ID - 002 - Find Movie Details By Valid Movie Id And Language Option");

        /* Build the GET Call "/movie/{movie_id}" request and execute it*/
        String response = RestUtils.postGetRequest(RestUtils.buildGetRequest(),
                TestBase.GET_MOVIE_BY_ID_ENDPOINT+ TestBase.VALID_MOVIE_ID+ TestBase.API_KEY
                        + TestBase.LANGUAGE_OPTION + LanguageOption.FRENCH.getValue());

        /* Validate the response returned by above call with expected */
        TestAssertions.assertMovieDetails(response);
    }

    /**
     * Test ID - 003 - Find Movie Details By Valid Movie Id And INVALID Language Option
     * Verify that when GET Call "/movie/{movie_id}" executed with
     * - Valid Movie ID
     * - With INVALID/Non-Existing Language option (For e.g.  "&language=zz-ZZ")
     * having Leading And Trailing Spaces
     * call should get executed successfully with no error and
     * response should return expected Movie details (Should fall back to default US English)
     */
    @Test(description = "TestID-003", groups = "Regression")
    public void getMovieDetailsByValidMovieIdAndInvalidLangOpt(){
        /* Push Extent Report notification  */
        pushTestReportingNotification(
            "Test ID - 003 - Find Movie Details By Valid Movie Id And INVALID Language Option");

        /* Build the GET Call "/movie/{movie_id}" request and execute it*/
        String response = RestUtils.postGetRequest(RestUtils.buildGetRequest(),
                TestBase.GET_MOVIE_BY_ID_ENDPOINT+ TestBase.VALID_MOVIE_ID+ TestBase.API_KEY
                        + TestBase.LANGUAGE_OPTION + LanguageOption.INVALID.getValue());

        /* Validate the response returned by above call with expected */
        TestAssertions.assertMovieDetails(response);
    }

    /**
     * Test ID - 004 - Find Movie Details By INVALID(Alpha-Numeric) Movie Id And valid Language Option
     * Verify that when GET Call "/movie/{movie_id}" executed with
     * - INVALID(Alpha-Numeric) Movie ID
     * - With valid Language option (For e.g. French - "&language=fr-FR")
     * call should return "404 Not Found" with error message
     * "status_code": 34,
     * "status_message": "The resource you requested could not be found."
     */
    @Test(description = "TestID-004", dataProvider = "InvalidMovieIds", dataProviderClass= TestDataProvider.class, priority = 1, alwaysRun = true)
    public void getMovieDetailsByInvalidMovieIdAndValidLangOpt(String alphaNumericMovieId){
        /* Push Extent Report notification  */
        pushTestReportingNotification(
            "Test ID - 004 - Find Movie Details By INVALID(Alpha-Numeric) Movie Id And valid Language Option");

        /* Build the GET Call "/movie/{movie_id}" request and execute it*/
        String response =
            RestUtils.postGetRequest(
                RestUtils.buildGetRequest(),
                TestBase.GET_MOVIE_BY_ID_ENDPOINT
                    + alphaNumericMovieId
                    + TestBase.API_KEY
                    + TestBase.LANGUAGE_OPTION
                    + LanguageOption.SPANISH.getValue());

        /* Validate the response returned expected error message */
        TestAssertions.assertErrorMessage(
                response,
                ExpectedErrorMessage.STATUS_CODE_404.getValue(),
                ExpectedErrorMessage.STATUS_MSG__NOT_FOUND.getValue());
    }

    /**
     * Test ID - 005 - Find Movie Details By Movie Id NOT exist And valid Language Option
     * Verify that when GET Call "/movie/{movie_id}" executed with
     * - Movie ID NOT exist in system
     * call should return "404 Not Found" with error message
     * "status_code": 34,
     * "status_message": "The resource you requested could not be found."
     *
     * This test also demonstrates multiple Input Data can be provided through DataProvider
     * Providing multiple Input Dta to test also can be achieved through Json, Properties, CSV, Excel files
     */
    @Test(description = "TestID-005", dataProvider = "RandomNumericDataProvider", dataProviderClass= TestDataProvider.class, alwaysRun = true)
    public void getMovieDetailsByNonExistingMovieId(String nonExistMovieId) throws InterruptedException {
        /* Push Extent Report notification  */
        pushTestReportingNotification(
                "Test ID - 005 - Find Movie Details By Movie Id NOT exist And valid Language Option");
        /* Build the GET Call "/movie/{movie_id}" request and execute it*/
        String response =
            RestUtils.postGetRequest(
                RestUtils.buildGetRequest(),
                TestBase.GET_MOVIE_BY_ID_ENDPOINT + nonExistMovieId + TestBase.API_KEY);

        /* Validate the response returned expected error message */
        TestAssertions.assertErrorMessage(
            response,
            ExpectedErrorMessage.STATUS_CODE_404.getValue(),
            ExpectedErrorMessage.STATUS_MSG__NOT_FOUND.getValue());
    }

  /**
   * Test ID - 006 - Find Movie Details By valid Movie And invalid API Key
   * Verify that when GET Call "/movie/{movie_id}" executed with
   * - INVALID API-KEY
   * call should return "401 Unauthorized" with error message
   * "status_code": 7,
   * "status_message": "Invalid API key: You must be granted a valid key.
   */
  @Test(
      description = "TestID-006", dataProvider = "RandomNumericDataProvider", dataProviderClass = TestDataProvider.class, alwaysRun = true)
  public void getMovieDetailsByValidMovieIdAndInvalidApiKey(String invalidApiKey) throws InterruptedException {
        /* Push Extent Report notification  */
        pushTestReportingNotification(
            "Test ID - 006 - Find Movie Details By valid Movie And invalid API Key");

        /* Build the GET Call "/movie/{movie_id}" request and execute it*/
        String response =
            RestUtils.postGetRequest(
                RestUtils.buildGetRequest(),
                TestBase.GET_MOVIE_BY_ID_ENDPOINT
                    + TestBase.VALID_MOVIE_ID
                    + "?api_key="
                    + invalidApiKey);

        /* Validate the response returned expected error message */
        TestAssertions.assertErrorMessage(
            response,
            ExpectedErrorMessage.STATUS_CODE_401.getValue(),
            ExpectedErrorMessage.STATUS_MSG__NOT_AUTHORIZRD.getValue());
  }

  /**
   * Test ID - 007 - Find Movie Details By valid Movie And invalid API Key Verify that when GET Call
   * "/movie/{movie_id}" executed with
   * - Missing API-KEY
   * call should return "401 Unauthorized" with error message
   * "status_code": 7,
   * "status_message": "Invalid API key: You must be granted a valid key."
   */
  @Test(description = "TestID-007")
  public void getMovieDetailsByValidMovieIdAndMissingApiKey() throws InterruptedException {
        /* Push Extent Report notification  */
        pushTestReportingNotification(
              "Test ID - 007 - Find Movie Details By valid Movie And invalid API Key Verify that when GET Call");

        /* Build the GET Call "/movie/{movie_id}" request and execute it*/
        String response =
                RestUtils.postGetRequest(
                        RestUtils.buildGetRequest(),
                        TestBase.GET_MOVIE_BY_ID_ENDPOINT + TestBase.VALID_MOVIE_ID + "?api_key=");

        /* Validate the response returned expected error message */
        TestAssertions.assertErrorMessage(
                response,
                ExpectedErrorMessage.STATUS_CODE_401.getValue(),
                ExpectedErrorMessage.STATUS_MSG__NOT_AUTHORIZRD.getValue());
    }
}
