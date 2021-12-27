/*
 * TigerGraph REST++ API
 * Title
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.github.karol_brejna_i.tigergraph.restppclient.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * ProcessInfo
 */


public class ProcessInfo {
  @SerializedName("requestid")
  private String requestid = null;

  @SerializedName("startTime")
  private String startTime = null;

  @SerializedName("expirationTime")
  private String expirationTime = null;

  @SerializedName("url")
  private String url = null;

  @SerializedName("elapsedTime")
  private Integer elapsedTime = null;

  public ProcessInfo requestid(String requestid) {
    this.requestid = requestid;
    return this;
  }

   /**
   * Get requestid
   * @return requestid
  **/
  @Schema(description = "")
  public String getRequestid() {
    return requestid;
  }

  public void setRequestid(String requestid) {
    this.requestid = requestid;
  }

  public ProcessInfo startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Get startTime
   * @return startTime
  **/
  @Schema(example = "2021-12-25 08:20:08.272", description = "")
  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public ProcessInfo expirationTime(String expirationTime) {
    this.expirationTime = expirationTime;
    return this;
  }

   /**
   * Get expirationTime
   * @return expirationTime
  **/
  @Schema(example = "2021-12-25 08:20:08.272", description = "")
  public String getExpirationTime() {
    return expirationTime;
  }

  public void setExpirationTime(String expirationTime) {
    this.expirationTime = expirationTime;
  }

  public ProcessInfo url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @Schema(description = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public ProcessInfo elapsedTime(Integer elapsedTime) {
    this.elapsedTime = elapsedTime;
    return this;
  }

   /**
   * Get elapsedTime
   * @return elapsedTime
  **/
  @Schema(description = "")
  public Integer getElapsedTime() {
    return elapsedTime;
  }

  public void setElapsedTime(Integer elapsedTime) {
    this.elapsedTime = elapsedTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessInfo processInfo = (ProcessInfo) o;
    return Objects.equals(this.requestid, processInfo.requestid) &&
        Objects.equals(this.startTime, processInfo.startTime) &&
        Objects.equals(this.expirationTime, processInfo.expirationTime) &&
        Objects.equals(this.url, processInfo.url) &&
        Objects.equals(this.elapsedTime, processInfo.elapsedTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestid, startTime, expirationTime, url, elapsedTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessInfo {\n");
    
    sb.append("    requestid: ").append(toIndentedString(requestid)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    expirationTime: ").append(toIndentedString(expirationTime)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    elapsedTime: ").append(toIndentedString(elapsedTime)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
