package com.assessment.webapi.rest.testutils;

public enum LanguageOption {
    US_English("en-US"),
    SPANISH("es-ES"),
    FRENCH("fr-FR  "),
    INVALID("zz-ZZ");

    private String value;

    LanguageOption(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
