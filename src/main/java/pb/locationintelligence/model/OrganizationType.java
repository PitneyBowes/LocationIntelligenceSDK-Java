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


/**
 * OrganizationType
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2019-01-15T12:57:00.076+05:30")
public class OrganizationType   {
  @SerializedName("naicsCode")
  private String naicsCode = null;

  @SerializedName("isicCode")
  private String isicCode = null;

  @SerializedName("value")
  private String value = null;

  public OrganizationType naicsCode(String naicsCode) {
    this.naicsCode = naicsCode;
    return this;
  }

   /**
   * Get naicsCode
   * @return naicsCode
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getNaicsCode() {
    return naicsCode;
  }

  public void setNaicsCode(String naicsCode) {
    this.naicsCode = naicsCode;
  }

  public OrganizationType isicCode(String isicCode) {
    this.isicCode = isicCode;
    return this;
  }

   /**
   * Get isicCode
   * @return isicCode
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getIsicCode() {
    return isicCode;
  }

  public void setIsicCode(String isicCode) {
    this.isicCode = isicCode;
  }

  public OrganizationType value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationType organizationType = (OrganizationType) o;
    return Objects.equals(this.naicsCode, organizationType.naicsCode) &&
        Objects.equals(this.isicCode, organizationType.isicCode) &&
        Objects.equals(this.value, organizationType.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(naicsCode, isicCode, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationType {\n");
    
    sb.append("    naicsCode: ").append(toIndentedString(naicsCode)).append("\n");
    sb.append("    isicCode: ").append(toIndentedString(isicCode)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

