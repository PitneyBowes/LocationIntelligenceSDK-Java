/**
 * Location Intelligence APIs
 * Incorporate our extensive geodata into everyday applications, business processes and workflows.
 *
 * OpenAPI spec version: 8.5.0
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
import pb.locationintelligence.model.PoiBoundary;


/**
 * POIBoundaryResponse
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2020-03-03T15:28:20.703+05:30")
public class POIBoundaryResponse   {
  @SerializedName("poiBoundary")
  private List<PoiBoundary> poiBoundary = new ArrayList<PoiBoundary>();

  public POIBoundaryResponse poiBoundary(List<PoiBoundary> poiBoundary) {
    this.poiBoundary = poiBoundary;
    return this;
  }

   /**
   * Get poiBoundary
   * @return poiBoundary
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<PoiBoundary> getPoiBoundary() {
    return poiBoundary;
  }

  public void setPoiBoundary(List<PoiBoundary> poiBoundary) {
    this.poiBoundary = poiBoundary;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    POIBoundaryResponse pOIBoundaryResponse = (POIBoundaryResponse) o;
    return Objects.equals(this.poiBoundary, pOIBoundaryResponse.poiBoundary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(poiBoundary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class POIBoundaryResponse {\n");
    
    sb.append("    poiBoundary: ").append(toIndentedString(poiBoundary)).append("\n");
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
