package com.assessment.webapi.rest.reportutils;

import com.assessment.webapi.rest.testbase.TestBase;
import com.relevantcodes.extentreports.ExtentReports;

public class ExtentManager {
  private static ExtentReports extent;

  public static synchronized ExtentReports getReporter() {
    if (extent == null) {
      String workingDir = System.getProperty("user.dir");
      extent = new ExtentReports(workingDir+TestBase.EXTENT_REPORT_FILE_PATH, true);
    }
    return extent;
  }
}
