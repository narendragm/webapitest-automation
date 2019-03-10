package com.assessment.webapi.rest.testbase;

import com.assessment.webapi.rest.config.LoadTestProperties;
import com.assessment.webapi.rest.reportutils.ExtentTestManager;
import org.testng.annotations.Listeners;

@Listeners(com.assessment.webapi.rest.reportutils.TestListner.class )
public class BaseTest {
    public static final String TEST_CONFIG_FILE_PATH = "/test_config.properties";

    public static final String EXTENT_REPORT_FILE_PATH = new LoadTestProperties(TEST_CONFIG_FILE_PATH).getProperty("extent_report_path");

    public static final String API_KEY = new LoadTestProperties(TEST_CONFIG_FILE_PATH).getProperty("api_key");

    public static final String LANGUAGE_OPTION = new LoadTestProperties(TEST_CONFIG_FILE_PATH).getProperty("language_option");

    public static final String VALID_MOVIE_ID = new LoadTestProperties(TEST_CONFIG_FILE_PATH).getProperty("valid_movie_id");

    public static final String GET_MOVIE_BY_ID_ENDPOINT  = new LoadTestProperties(TEST_CONFIG_FILE_PATH).getProperty("movie_by_id_endpoint");

    public static void pushTestReportingNotification(String testObjectiveMessage){
        ExtentTestManager.getTest().setDescription(testObjectiveMessage);
    }
}
