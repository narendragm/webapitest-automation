package com.assessment.webapi.rest.reportutils;

import com.assessment.webapi.rest.testbase.BaseTest;
import com.relevantcodes.extentreports.ExtentReports;

public class ExtentManager {
  private static ExtentReports extent;

  public static synchronized ExtentReports getReporter() {
    if (extent == null) {
      extent = new ExtentReports(BaseTest.EXTENT_REPORT_FILE_PATH, true);
    }
    return extent;
  }
}
