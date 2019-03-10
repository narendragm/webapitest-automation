package com.assessment.webapi.rest.response.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
*  Equivallent response entity classes for validation to read from
*  response received from GET Call By Movie Id
*/
@JsonIgnoreProperties(ignoreUnknown = true)
public class CrewResponseDto {
  @SerializedName("id")
  @Expose
  private Integer id;

  @SerializedName("credit_id")
  @Expose
  private String creditId;

  @SerializedName("name")
  @Expose
  private String name;

  @SerializedName("department")
  @Expose
  private String department;

  @SerializedName("job")
  @Expose
  private String job;

  @SerializedName("profile_path")
  @Expose
  private Object profilePath;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getCreditId() {
    return creditId;
  }

  public void setCreditId(String creditId) {
    this.creditId = creditId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public String getJob() {
    return job;
  }

  public void setJob(String job) {
    this.job = job;
  }

  public Object getProfilePath() {
    return profilePath;
  }

  public void setProfilePath(Object profilePath) {
    this.profilePath = profilePath;
  }
}
