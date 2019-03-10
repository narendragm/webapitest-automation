package com.assessment.webapi.rest.response.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 *  Equivallent response entity classes for validation to read from
 *  response received from GET Call By Movie Id
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductionCompanyResponseDto {
  @SerializedName("id")
  @Expose
  private Integer id;

  @SerializedName("logo_path")
  @Expose
  private String logoPath;

  @SerializedName("name")
  @Expose
  private String name;

  @SerializedName("origin_country")
  @Expose
  private String originCountry;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getLogoPath() {
    return logoPath;
  }

  public void setLogoPath(String logoPath) {
    this.logoPath = logoPath;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getOriginCountry() {
    return originCountry;
  }

  public void setOriginCountry(String originCountry) {
    this.originCountry = originCountry;
  }
}
