package com.assessment.webapi.rest.assertionUtil;

import com.assessment.webapi.rest.responseEntities.ErrorMessageResponseValidation;
import com.assessment.webapi.rest.responseEntities.MovieCollectionResponseValidationEntity;
import com.google.gson.Gson;
import org.testng.Assert;

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
    MovieCollectionResponseValidationEntity movieCollectionResponseValidationEntity =
        gson.fromJson(response, MovieCollectionResponseValidationEntity.class);

    Assert.assertEquals(movieCollectionResponseValidationEntity.getId(), (Integer) 550);
    Assert.assertEquals(movieCollectionResponseValidationEntity.getImdbId(), "tt0137523");
    Assert.assertEquals(movieCollectionResponseValidationEntity.getBudget(), (Integer) 63000000);
    Assert.assertEquals(
        movieCollectionResponseValidationEntity.getHomepage(),
        "http://www.foxmovies.com/movies/fight-club");
    Assert.assertEquals(movieCollectionResponseValidationEntity.getOriginalTitle(), "Fight Club");
    Assert.assertEquals(movieCollectionResponseValidationEntity.getOriginalLanguage(), "en");
  }

  public static void assertErrorMessage(String response, String statusCode, String errorMessage) {
    ErrorMessageResponseValidation errorMessageResponseValidation =
        gson.fromJson(response, ErrorMessageResponseValidation.class);

    Assert.assertEquals(errorMessageResponseValidation.getStatusCode(), statusCode);
    Assert.assertEquals(errorMessageResponseValidation.getStatusMessage(), errorMessage);
  }
}
