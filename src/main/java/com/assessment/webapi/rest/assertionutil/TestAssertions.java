package com.assessment.webapi.rest.assertionutil;

import com.assessment.webapi.rest.response.dto.ErrorMessageResponseDto;
import com.assessment.webapi.rest.response.dto.MovieCollectionResponseDto;
import com.assessment.webapi.rest.testutils.JasonReader;
import com.google.gson.Gson;
import org.testng.Assert;

import java.util.Map;

/**
 * 1) Only subset of test assertions written due to demonstrative purpose of the project
 * 2) Ideally we could with DB integration Hibernate support can retrieve data from DB
 * and verify response from the call
 * 3) Other possible way of doing when fixed set of input data provided for that data
 * expected can be built in Json, csv, excel file and reading from the file, response can be
 * validated
 */
public class TestAssertions {
  private static final Gson gson = new Gson();

  public static void assertMovieDetails(String response) {
    JasonReader jasonReader = new JasonReader();
    Map<String, Object> expectedResult =  jasonReader.getExpectedResult();
    MovieCollectionResponseDto movieCollectionResponseDto =
        gson.fromJson(response, MovieCollectionResponseDto.class);

    Assert.assertEquals(movieCollectionResponseDto.getId(), (Integer) expectedResult.get("id"));
    Assert.assertEquals(movieCollectionResponseDto.getImdbId(), expectedResult.get("imdb_id"));
    Assert.assertEquals(movieCollectionResponseDto.getBudget(), (Integer) expectedResult.get("budget"));
    Assert.assertEquals(
        movieCollectionResponseDto.getHomepage(), expectedResult.get("homepage"));
    Assert.assertEquals(movieCollectionResponseDto.getOriginalTitle(), expectedResult.get("original_title"));
    Assert.assertEquals(movieCollectionResponseDto.getOriginalLanguage(), expectedResult.get("original_language"));
  }

  public static void assertErrorMessage(String response, String statusCode, String errorMessage) {
    ErrorMessageResponseDto errorMessageResponseDto =
        gson.fromJson(response, ErrorMessageResponseDto.class);

    Assert.assertEquals(errorMessageResponseDto.getStatusCode(), statusCode);
    Assert.assertEquals(errorMessageResponseDto.getStatusMessage(), errorMessage);
  }
}
