/**
 * Location Intelligence APIs
 * Incorporate our extensive geodata into everyday applications, business processes and workflows.
 *
 * OpenAPI spec version: 6.5.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package pb.locationintelligence.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import pb.locationintelligence.model.RouteDirections;
import pb.locationintelligence.model.RouteGeometry;


/**
 * GeoRouteResponse
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-23T18:47:15.972+05:30")
public class GeoRouteResponse   {
  @SerializedName("directionsStyle")
  private String directionsStyle = null;

  @SerializedName("distance")
  private BigDecimal distance = null;

  @SerializedName("distanceUnit")
  private String distanceUnit = null;

  @SerializedName("language")
  private String language = null;

  @SerializedName("timeUnit")
  private String timeUnit = null;

  @SerializedName("time")
  private BigDecimal time = null;

  @SerializedName("geometry")
  private RouteGeometry geometry = null;

  @SerializedName("routeDirections")
  private RouteDirections routeDirections = null;

  public GeoRouteResponse directionsStyle(String directionsStyle) {
    this.directionsStyle = directionsStyle;
    return this;
  }

   /**
   * Get directionsStyle
   * @return directionsStyle
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDirectionsStyle() {
    return directionsStyle;
  }

  public void setDirectionsStyle(String directionsStyle) {
    this.directionsStyle = directionsStyle;
  }

  public GeoRouteResponse distance(BigDecimal distance) {
    this.distance = distance;
    return this;
  }

   /**
   * Get distance
   * @return distance
  **/
  @ApiModelProperty(example = "null", value = "")
  public BigDecimal getDistance() {
    return distance;
  }

  public void setDistance(BigDecimal distance) {
    this.distance = distance;
  }

  public GeoRouteResponse distanceUnit(String distanceUnit) {
    this.distanceUnit = distanceUnit;
    return this;
  }

   /**
   * Get distanceUnit
   * @return distanceUnit
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDistanceUnit() {
    return distanceUnit;
  }

  public void setDistanceUnit(String distanceUnit) {
    this.distanceUnit = distanceUnit;
  }

  public GeoRouteResponse language(String language) {
    this.language = language;
    return this;
  }

   /**
   * Get language
   * @return language
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public GeoRouteResponse timeUnit(String timeUnit) {
    this.timeUnit = timeUnit;
    return this;
  }

   /**
   * Get timeUnit
   * @return timeUnit
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTimeUnit() {
    return timeUnit;
  }

  public void setTimeUnit(String timeUnit) {
    this.timeUnit = timeUnit;
  }

  public GeoRouteResponse time(BigDecimal time) {
    this.time = time;
    return this;
  }

   /**
   * Get time
   * @return time
  **/
  @ApiModelProperty(example = "null", value = "")
  public BigDecimal getTime() {
    return time;
  }

  public void setTime(BigDecimal time) {
    this.time = time;
  }

  public GeoRouteResponse geometry(RouteGeometry geometry) {
    this.geometry = geometry;
    return this;
  }

   /**
   * Get geometry
   * @return geometry
  **/
  @ApiModelProperty(example = "null", value = "")
  public RouteGeometry getGeometry() {
    return geometry;
  }

  public void setGeometry(RouteGeometry geometry) {
    this.geometry = geometry;
  }

  public GeoRouteResponse routeDirections(RouteDirections routeDirections) {
    this.routeDirections = routeDirections;
    return this;
  }

   /**
   * Get routeDirections
   * @return routeDirections
  **/
  @ApiModelProperty(example = "null", value = "")
  public RouteDirections getRouteDirections() {
    return routeDirections;
  }

  public void setRouteDirections(RouteDirections routeDirections) {
    this.routeDirections = routeDirections;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeoRouteResponse geoRouteResponse = (GeoRouteResponse) o;
    return Objects.equals(this.directionsStyle, geoRouteResponse.directionsStyle) &&
        Objects.equals(this.distance, geoRouteResponse.distance) &&
        Objects.equals(this.distanceUnit, geoRouteResponse.distanceUnit) &&
        Objects.equals(this.language, geoRouteResponse.language) &&
        Objects.equals(this.timeUnit, geoRouteResponse.timeUnit) &&
        Objects.equals(this.time, geoRouteResponse.time) &&
        Objects.equals(this.geometry, geoRouteResponse.geometry) &&
        Objects.equals(this.routeDirections, geoRouteResponse.routeDirections);
  }

  @Override
  public int hashCode() {
    return Objects.hash(directionsStyle, distance, distanceUnit, language, timeUnit, time, geometry, routeDirections);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeoRouteResponse {\n");
    
    sb.append("    directionsStyle: ").append(toIndentedString(directionsStyle)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    distanceUnit: ").append(toIndentedString(distanceUnit)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    timeUnit: ").append(toIndentedString(timeUnit)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    geometry: ").append(toIndentedString(geometry)).append("\n");
    sb.append("    routeDirections: ").append(toIndentedString(routeDirections)).append("\n");
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

