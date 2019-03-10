package com.assessment.webapi.rest.responseEntities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 *  Equivallent response entity classes for validation to read from
 *  response received from GET Call By Movie Id
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductionCountryResponseValidationEntity {
  @SerializedName("iso_3166_1")
  @Expose
  private String iso31661;

  @SerializedName("name")
  @Expose
  private String name;

  public String getIso31661() {
    return iso31661;
  }

  public void setIso31661(String iso31661) {
    this.iso31661 = iso31661;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
