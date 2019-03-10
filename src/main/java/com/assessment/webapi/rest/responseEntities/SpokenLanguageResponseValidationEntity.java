package com.assessment.webapi.rest.responseEntities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 *  Equivallent response entity classes for validation to read from
 *  response received from GET Call By Movie Id
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SpokenLanguageResponseValidationEntity {
  @SerializedName("iso_639_1")
  @Expose
  private String iso6391;

  @SerializedName("name")
  @Expose
  private String name;

  public String getIso6391() {
    return iso6391;
  }

  public void setIso6391(String iso6391) {
    this.iso6391 = iso6391;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
