package com.assessment.webapi.rest.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * This class is to read the properties file to pick test configs/properties
 */
public class LoadTestProperties {
  private Properties prop;

  public LoadTestProperties(String filePath) {
    super();
    init(filePath);
  }

  private static class PropertiesInstance {
    private static LoadTestProperties instance = null;

    public static LoadTestProperties getInstance(String filePath) {
      if (null == instance) {
        instance = new LoadTestProperties(filePath);
      }
      return instance;
    }
  }

  public static LoadTestProperties getInstance(String filePath) {
    return PropertiesInstance.getInstance(filePath);
  }

  private void init(String filePath) {

    prop = new Properties();
    try (InputStream input = getClass().getResourceAsStream(filePath)) {

      // load a properties file
      prop.load(input);

    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }

  public String getProperty(String key) {
    return prop.getProperty(key);
  }
}
