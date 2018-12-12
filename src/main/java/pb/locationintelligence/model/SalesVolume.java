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
 * SalesVolume
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-11T15:23:20.199+05:30")
public class SalesVolume   {
  @SerializedName("currencyCode")
  private String currencyCode = null;

  @SerializedName("worldBaseCurrencyCode")
  private String worldBaseCurrencyCode = null;

  @SerializedName("value")
  private String value = null;

  public SalesVolume currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Get currencyCode
   * @return currencyCode
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public SalesVolume worldBaseCurrencyCode(String worldBaseCurrencyCode) {
    this.worldBaseCurrencyCode = worldBaseCurrencyCode;
    return this;
  }

   /**
   * Get worldBaseCurrencyCode
   * @return worldBaseCurrencyCode
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getWorldBaseCurrencyCode() {
    return worldBaseCurrencyCode;
  }

  public void setWorldBaseCurrencyCode(String worldBaseCurrencyCode) {
    this.worldBaseCurrencyCode = worldBaseCurrencyCode;
  }

  public SalesVolume value(String value) {
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
    SalesVolume salesVolume = (SalesVolume) o;
    return Objects.equals(this.currencyCode, salesVolume.currencyCode) &&
        Objects.equals(this.worldBaseCurrencyCode, salesVolume.worldBaseCurrencyCode) &&
        Objects.equals(this.value, salesVolume.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currencyCode, worldBaseCurrencyCode, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SalesVolume {\n");
    
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    worldBaseCurrencyCode: ").append(toIndentedString(worldBaseCurrencyCode)).append("\n");
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

