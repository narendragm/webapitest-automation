package com.assessment.webapi.rest.responseEntities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Equivallent response entity classes for validation to read from response received from GET Call
 * By Movie Id
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class BelongsToCollectionResponseValidationEntity {
  @SerializedName("id")
  @Expose
  private Integer id;

  @SerializedName("name")
  @Expose
  private String name;

  @SerializedName("poster_path")
  @Expose
  private String posterPath;

  @SerializedName("backdrop_path")
  @Expose
  private String backdropPath;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPosterPath() {
    return posterPath;
  }

  public void setPosterPath(String posterPath) {
    this.posterPath = posterPath;
  }

  public String getBackdropPath() {
    return backdropPath;
  }

  public void setBackdropPath(String backdropPath) {
    this.backdropPath = backdropPath;
  }
}
