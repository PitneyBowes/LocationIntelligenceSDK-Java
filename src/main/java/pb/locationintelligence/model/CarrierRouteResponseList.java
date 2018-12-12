/**
 * Location Intelligence APIs
 * Incorporate our extensive geodata into everyday applications, business processes and workflows.
 *
 * OpenAPI spec version: 6.0.0
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
import java.util.ArrayList;
import java.util.List;
import pb.locationintelligence.model.CarrierRouteBoundaries;
import pb.locationintelligence.model.CarrierRouteResponse;


/**
 * CarrierRouteResponseList
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-11T15:23:20.199+05:30")
public class CarrierRouteResponseList   {
  @SerializedName("boundaries")
  private CarrierRouteBoundaries boundaries = null;

  @SerializedName("carrierRoute")
  private List<CarrierRouteResponse> carrierRoute = new ArrayList<CarrierRouteResponse>();

  public CarrierRouteResponseList boundaries(CarrierRouteBoundaries boundaries) {
    this.boundaries = boundaries;
    return this;
  }

   /**
   * Get boundaries
   * @return boundaries
  **/
  @ApiModelProperty(example = "null", value = "")
  public CarrierRouteBoundaries getBoundaries() {
    return boundaries;
  }

  public void setBoundaries(CarrierRouteBoundaries boundaries) {
    this.boundaries = boundaries;
  }

  public CarrierRouteResponseList carrierRoute(List<CarrierRouteResponse> carrierRoute) {
    this.carrierRoute = carrierRoute;
    return this;
  }

   /**
   * Get carrierRoute
   * @return carrierRoute
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<CarrierRouteResponse> getCarrierRoute() {
    return carrierRoute;
  }

  public void setCarrierRoute(List<CarrierRouteResponse> carrierRoute) {
    this.carrierRoute = carrierRoute;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CarrierRouteResponseList carrierRouteResponseList = (CarrierRouteResponseList) o;
    return Objects.equals(this.boundaries, carrierRouteResponseList.boundaries) &&
        Objects.equals(this.carrierRoute, carrierRouteResponseList.carrierRoute);
  }

  @Override
  public int hashCode() {
    return Objects.hash(boundaries, carrierRoute);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CarrierRouteResponseList {\n");
    
    sb.append("    boundaries: ").append(toIndentedString(boundaries)).append("\n");
    sb.append("    carrierRoute: ").append(toIndentedString(carrierRoute)).append("\n");
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

