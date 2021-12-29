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
import io.github.karol_brejna_i.tigergraph.restppclient.model.Version;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * QueryResultResponse
 */


public class QueryResultResponse {
  @SerializedName("version")
  private Version version = null;

  @SerializedName("error")
  private Boolean error = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("results")
  private List<Object> results = null;

  public QueryResultResponse version(Version version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @Schema(description = "")
  public Version getVersion() {
    return version;
  }

  public void setVersion(Version version) {
    this.version = version;
  }

  public QueryResultResponse error(Boolean error) {
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @Schema(description = "")
  public Boolean isError() {
    return error;
  }

  public void setError(Boolean error) {
    this.error = error;
  }

  public QueryResultResponse message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @Schema(description = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public QueryResultResponse results(List<Object> results) {
    this.results = results;
    return this;
  }

  public QueryResultResponse addResultsItem(Object resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<Object>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * Get results
   * @return results
  **/
  @Schema(description = "")
  public List<Object> getResults() {
    return results;
  }

  public void setResults(List<Object> results) {
    this.results = results;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryResultResponse queryResultResponse = (QueryResultResponse) o;
    return Objects.equals(this.version, queryResultResponse.version) &&
        Objects.equals(this.error, queryResultResponse.error) &&
        Objects.equals(this.message, queryResultResponse.message) &&
        Objects.equals(this.results, queryResultResponse.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, error, message, results);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryResultResponse {\n");
    
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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
