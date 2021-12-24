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
import io.github.karol_brejna_i.tigergraph.restppclient.model.StatisticsResponseGETStatisticsgraphName;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * StatisticsResponse
 */


public class StatisticsResponse {
  @SerializedName("GET /statistics/{graph_name}")
  private StatisticsResponseGETStatisticsgraphName geTStatisticsgraphName = null;

  public StatisticsResponse geTStatisticsgraphName(StatisticsResponseGETStatisticsgraphName geTStatisticsgraphName) {
    this.geTStatisticsgraphName = geTStatisticsgraphName;
    return this;
  }

   /**
   * Get geTStatisticsgraphName
   * @return geTStatisticsgraphName
  **/
  @Schema(description = "")
  public StatisticsResponseGETStatisticsgraphName getGeTStatisticsgraphName() {
    return geTStatisticsgraphName;
  }

  public void setGeTStatisticsgraphName(StatisticsResponseGETStatisticsgraphName geTStatisticsgraphName) {
    this.geTStatisticsgraphName = geTStatisticsgraphName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatisticsResponse statisticsResponse = (StatisticsResponse) o;
    return Objects.equals(this.geTStatisticsgraphName, statisticsResponse.geTStatisticsgraphName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(geTStatisticsgraphName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatisticsResponse {\n");
    
    sb.append("    geTStatisticsgraphName: ").append(toIndentedString(geTStatisticsgraphName)).append("\n");
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
