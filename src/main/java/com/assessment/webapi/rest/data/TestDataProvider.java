package com.assessment.webapi.rest.data;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.DataProvider;


public class TestDataProvider {
    @DataProvider(name = "InvalidMovieIds")
    public Object[][] invalidMovieId(){
        return new Object[][] {
                { RandomStringUtils.randomAlphanumeric(15) },
                { RandomStringUtils.randomAlphanumeric(14) }
        };
    }

    @DataProvider(name = "RandomNumericDataProvider")
    public Object[][] nonExitingMovieId(){
        return new Object[][] {
                { RandomStringUtils.randomNumeric(15) },
                { RandomStringUtils.randomNumeric(14) }
        };
    }



}
