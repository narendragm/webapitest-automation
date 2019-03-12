package com.assessment.webapi.rest.data;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.DataProvider;


public class TestDataProvider {
    @DataProvider(name = "InvalidMovieIds")
    public Object[][] invalidMovieId(){
        return new Object[][] {
                { RandomStringUtils.randomAlphanumeric(20) },
                { RandomStringUtils.randomAlphanumeric(20) }
        };
    }

    @DataProvider(name = "RandomNumericDataProvider")
    public Object[][] nonExitingMovieId(){
        return new Object[][] {
                { RandomStringUtils.randomNumeric(19) },
                { RandomStringUtils.randomNumeric(20) }
        };
    }



}
