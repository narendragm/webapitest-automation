package com.assessment.webapi.rest.data;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.DataProvider;


public class TestDataProvider {
    @DataProvider(name = "InvalidMovieIds")
    public Object[][] invalidMovieId(){
        return new Object[][] {
                { RandomStringUtils.randomNumeric(10)+RandomStringUtils.randomAlphabetic(10) },
                { RandomStringUtils.randomNumeric(10)+RandomStringUtils.randomAlphabetic(10) }
        };
    }

    @DataProvider(name = "RandomNumericDataProvider")
    public Object[][] nonExitingMovieId(){
        return new Object[][] {
                { RandomStringUtils.randomNumeric(15) },
                { RandomStringUtils.randomNumeric(15) }
        };
    }



}
