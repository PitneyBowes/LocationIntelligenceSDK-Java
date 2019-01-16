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
 * SpecialPurposeDistrictTax
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2019-01-15T12:57:00.076+05:30")
public class SpecialPurposeDistrictTax   {
  @SerializedName("districtNumber")
  private String districtNumber = null;

  @SerializedName("taxRate")
  private Double taxRate = null;

  @SerializedName("taxAmount")
  private Double taxAmount = null;

  public SpecialPurposeDistrictTax districtNumber(String districtNumber) {
    this.districtNumber = districtNumber;
    return this;
  }

   /**
   * Get districtNumber
   * @return districtNumber
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDistrictNumber() {
    return districtNumber;
  }

  public void setDistrictNumber(String districtNumber) {
    this.districtNumber = districtNumber;
  }

  public SpecialPurposeDistrictTax taxRate(Double taxRate) {
    this.taxRate = taxRate;
    return this;
  }

   /**
   * Get taxRate
   * @return taxRate
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getTaxRate() {
    return taxRate;
  }

  public void setTaxRate(Double taxRate) {
    this.taxRate = taxRate;
  }

  public SpecialPurposeDistrictTax taxAmount(Double taxAmount) {
    this.taxAmount = taxAmount;
    return this;
  }

   /**
   * Get taxAmount
   * @return taxAmount
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getTaxAmount() {
    return taxAmount;
  }

  public void setTaxAmount(Double taxAmount) {
    this.taxAmount = taxAmount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpecialPurposeDistrictTax specialPurposeDistrictTax = (SpecialPurposeDistrictTax) o;
    return Objects.equals(this.districtNumber, specialPurposeDistrictTax.districtNumber) &&
        Objects.equals(this.taxRate, specialPurposeDistrictTax.taxRate) &&
        Objects.equals(this.taxAmount, specialPurposeDistrictTax.taxAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(districtNumber, taxRate, taxAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpecialPurposeDistrictTax {\n");
    
    sb.append("    districtNumber: ").append(toIndentedString(districtNumber)).append("\n");
    sb.append("    taxRate: ").append(toIndentedString(taxRate)).append("\n");
    sb.append("    taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
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

