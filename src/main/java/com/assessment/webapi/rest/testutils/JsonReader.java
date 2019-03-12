package com.assessment.webapi.rest.testutils;

import java.io.File;
import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonReader {
    ObjectMapper mapper = new ObjectMapper();

    public Map<String, Object> getExpectedResult() {
        Map<String, Object> expectedResult = null;
        try {
            expectedResult = mapper.readValue(new File(
                    "src/main/resources/ExpectedTestResult.json"), new TypeReference<Map<String, Object>>() {
            });
        } catch (Exception e) {
            e.printStackTrace();
        }

        return expectedResult;
    }
}
