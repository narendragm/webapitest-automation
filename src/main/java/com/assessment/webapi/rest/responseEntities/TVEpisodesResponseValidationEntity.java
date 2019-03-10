package com.assessment.webapi.rest.responseEntities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 *  Equivallent response entity classes for validation to read from
 *  response received from GET Call By Movie Id
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TVEpisodesResponseValidationEntity {

  @SerializedName("air_date")
  @Expose
  private String airDate;

  @SerializedName("crew")
  @Expose
  private List<CrewResponseValidationEntity> crewResponseValidationEntity = null;

  @SerializedName("episode_number")
  @Expose
  private Integer episodeNumber;

  @SerializedName("guest_stars")
  @Expose
  private List<Object> guestStars = null;

  @SerializedName("name")
  @Expose
  private String name;

  @SerializedName("overview")
  @Expose
  private String overview;

  @SerializedName("id")
  @Expose
  private Integer id;

  @SerializedName("production_code")
  @Expose
  private String productionCode;

  @SerializedName("season_number")
  @Expose
  private Integer seasonNumber;

  @SerializedName("still_path")
  @Expose
  private Object stillPath;

  @SerializedName("vote_average")
  @Expose
  private Double voteAverage;

  @SerializedName("vote_count")
  @Expose
  private Integer voteCount;

  public String getAirDate() {
    return airDate;
  }

  public void setAirDate(String airDate) {
    this.airDate = airDate;
  }

  public List<CrewResponseValidationEntity> getCrew() {
    return crewResponseValidationEntity;
  }

  public void setCrew(List<CrewResponseValidationEntity> crewResponseValidationEntity) {
    this.crewResponseValidationEntity = crewResponseValidationEntity;
  }

  public Integer getEpisodeNumber() {
    return episodeNumber;
  }

  public void setEpisodeNumber(Integer episodeNumber) {
    this.episodeNumber = episodeNumber;
  }

  public List<Object> getGuestStars() {
    return guestStars;
  }

  public void setGuestStars(List<Object> guestStars) {
    this.guestStars = guestStars;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getOverview() {
    return overview;
  }

  public void setOverview(String overview) {
    this.overview = overview;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getProductionCode() {
    return productionCode;
  }

  public void setProductionCode(String productionCode) {
    this.productionCode = productionCode;
  }

  public Integer getSeasonNumber() {
    return seasonNumber;
  }

  public void setSeasonNumber(Integer seasonNumber) {
    this.seasonNumber = seasonNumber;
  }

  public Object getStillPath() {
    return stillPath;
  }

  public void setStillPath(Object stillPath) {
    this.stillPath = stillPath;
  }

  public Double getVoteAverage() {
    return voteAverage;
  }

  public void setVoteAverage(Double voteAverage) {
    this.voteAverage = voteAverage;
  }

  public Integer getVoteCount() {
    return voteCount;
  }

  public void setVoteCount(Integer voteCount) {
    this.voteCount = voteCount;
  }
}
