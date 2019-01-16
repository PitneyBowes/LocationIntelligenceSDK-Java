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
import pb.locationintelligence.model.SpecialPurposeDistrictTaxRate;


/**
 * SalesTax
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2019-01-15T12:57:00.076+05:30")
public class SalesTax   {
  @SerializedName("totalTax")
  private Double totalTax = null;

  @SerializedName("totalTaxRate")
  private Double totalTaxRate = null;

  @SerializedName("totalTaxAmount")
  private Double totalTaxAmount = null;

  @SerializedName("stateTax")
  private Double stateTax = null;

  @SerializedName("stateTaxRate")
  private Double stateTaxRate = null;

  @SerializedName("stateTaxAmount")
  private Double stateTaxAmount = null;

  @SerializedName("countyTax")
  private Double countyTax = null;

  @SerializedName("countyTaxRate")
  private Double countyTaxRate = null;

  @SerializedName("countyTaxAmount")
  private Double countyTaxAmount = null;

  @SerializedName("municipalTax")
  private Double municipalTax = null;

  @SerializedName("municipalTaxRate")
  private Double municipalTaxRate = null;

  @SerializedName("municipalTaxAmount")
  private Double municipalTaxAmount = null;

  @SerializedName("spdsTax")
  private List<SpecialPurposeDistrictTaxRate> spdsTax = new ArrayList<SpecialPurposeDistrictTaxRate>();

  @SerializedName("specialTaxRulesApplied")
  private Boolean specialTaxRulesApplied = false;

  @SerializedName("specialTaxRulesDescriptor")
  private String specialTaxRulesDescriptor = null;

  public SalesTax totalTax(Double totalTax) {
    this.totalTax = totalTax;
    return this;
  }

   /**
   * Get totalTax
   * @return totalTax
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getTotalTax() {
    return totalTax;
  }

  public void setTotalTax(Double totalTax) {
    this.totalTax = totalTax;
  }

  public SalesTax totalTaxRate(Double totalTaxRate) {
    this.totalTaxRate = totalTaxRate;
    return this;
  }

   /**
   * Get totalTaxRate
   * @return totalTaxRate
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getTotalTaxRate() {
    return totalTaxRate;
  }

  public void setTotalTaxRate(Double totalTaxRate) {
    this.totalTaxRate = totalTaxRate;
  }

  public SalesTax totalTaxAmount(Double totalTaxAmount) {
    this.totalTaxAmount = totalTaxAmount;
    return this;
  }

   /**
   * Get totalTaxAmount
   * @return totalTaxAmount
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getTotalTaxAmount() {
    return totalTaxAmount;
  }

  public void setTotalTaxAmount(Double totalTaxAmount) {
    this.totalTaxAmount = totalTaxAmount;
  }

  public SalesTax stateTax(Double stateTax) {
    this.stateTax = stateTax;
    return this;
  }

   /**
   * Get stateTax
   * @return stateTax
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getStateTax() {
    return stateTax;
  }

  public void setStateTax(Double stateTax) {
    this.stateTax = stateTax;
  }

  public SalesTax stateTaxRate(Double stateTaxRate) {
    this.stateTaxRate = stateTaxRate;
    return this;
  }

   /**
   * Get stateTaxRate
   * @return stateTaxRate
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getStateTaxRate() {
    return stateTaxRate;
  }

  public void setStateTaxRate(Double stateTaxRate) {
    this.stateTaxRate = stateTaxRate;
  }

  public SalesTax stateTaxAmount(Double stateTaxAmount) {
    this.stateTaxAmount = stateTaxAmount;
    return this;
  }

   /**
   * Get stateTaxAmount
   * @return stateTaxAmount
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getStateTaxAmount() {
    return stateTaxAmount;
  }

  public void setStateTaxAmount(Double stateTaxAmount) {
    this.stateTaxAmount = stateTaxAmount;
  }

  public SalesTax countyTax(Double countyTax) {
    this.countyTax = countyTax;
    return this;
  }

   /**
   * Get countyTax
   * @return countyTax
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getCountyTax() {
    return countyTax;
  }

  public void setCountyTax(Double countyTax) {
    this.countyTax = countyTax;
  }

  public SalesTax countyTaxRate(Double countyTaxRate) {
    this.countyTaxRate = countyTaxRate;
    return this;
  }

   /**
   * Get countyTaxRate
   * @return countyTaxRate
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getCountyTaxRate() {
    return countyTaxRate;
  }

  public void setCountyTaxRate(Double countyTaxRate) {
    this.countyTaxRate = countyTaxRate;
  }

  public SalesTax countyTaxAmount(Double countyTaxAmount) {
    this.countyTaxAmount = countyTaxAmount;
    return this;
  }

   /**
   * Get countyTaxAmount
   * @return countyTaxAmount
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getCountyTaxAmount() {
    return countyTaxAmount;
  }

  public void setCountyTaxAmount(Double countyTaxAmount) {
    this.countyTaxAmount = countyTaxAmount;
  }

  public SalesTax municipalTax(Double municipalTax) {
    this.municipalTax = municipalTax;
    return this;
  }

   /**
   * Get municipalTax
   * @return municipalTax
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getMunicipalTax() {
    return municipalTax;
  }

  public void setMunicipalTax(Double municipalTax) {
    this.municipalTax = municipalTax;
  }

  public SalesTax municipalTaxRate(Double municipalTaxRate) {
    this.municipalTaxRate = municipalTaxRate;
    return this;
  }

   /**
   * Get municipalTaxRate
   * @return municipalTaxRate
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getMunicipalTaxRate() {
    return municipalTaxRate;
  }

  public void setMunicipalTaxRate(Double municipalTaxRate) {
    this.municipalTaxRate = municipalTaxRate;
  }

  public SalesTax municipalTaxAmount(Double municipalTaxAmount) {
    this.municipalTaxAmount = municipalTaxAmount;
    return this;
  }

   /**
   * Get municipalTaxAmount
   * @return municipalTaxAmount
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getMunicipalTaxAmount() {
    return municipalTaxAmount;
  }

  public void setMunicipalTaxAmount(Double municipalTaxAmount) {
    this.municipalTaxAmount = municipalTaxAmount;
  }

  public SalesTax spdsTax(List<SpecialPurposeDistrictTaxRate> spdsTax) {
    this.spdsTax = spdsTax;
    return this;
  }

   /**
   * Get spdsTax
   * @return spdsTax
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<SpecialPurposeDistrictTaxRate> getSpdsTax() {
    return spdsTax;
  }

  public void setSpdsTax(List<SpecialPurposeDistrictTaxRate> spdsTax) {
    this.spdsTax = spdsTax;
  }

  public SalesTax specialTaxRulesApplied(Boolean specialTaxRulesApplied) {
    this.specialTaxRulesApplied = specialTaxRulesApplied;
    return this;
  }

   /**
   * Get specialTaxRulesApplied
   * @return specialTaxRulesApplied
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getSpecialTaxRulesApplied() {
    return specialTaxRulesApplied;
  }

  public void setSpecialTaxRulesApplied(Boolean specialTaxRulesApplied) {
    this.specialTaxRulesApplied = specialTaxRulesApplied;
  }

  public SalesTax specialTaxRulesDescriptor(String specialTaxRulesDescriptor) {
    this.specialTaxRulesDescriptor = specialTaxRulesDescriptor;
    return this;
  }

   /**
   * Get specialTaxRulesDescriptor
   * @return specialTaxRulesDescriptor
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSpecialTaxRulesDescriptor() {
    return specialTaxRulesDescriptor;
  }

  public void setSpecialTaxRulesDescriptor(String specialTaxRulesDescriptor) {
    this.specialTaxRulesDescriptor = specialTaxRulesDescriptor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SalesTax salesTax = (SalesTax) o;
    return Objects.equals(this.totalTax, salesTax.totalTax) &&
        Objects.equals(this.totalTaxRate, salesTax.totalTaxRate) &&
        Objects.equals(this.totalTaxAmount, salesTax.totalTaxAmount) &&
        Objects.equals(this.stateTax, salesTax.stateTax) &&
        Objects.equals(this.stateTaxRate, salesTax.stateTaxRate) &&
        Objects.equals(this.stateTaxAmount, salesTax.stateTaxAmount) &&
        Objects.equals(this.countyTax, salesTax.countyTax) &&
        Objects.equals(this.countyTaxRate, salesTax.countyTaxRate) &&
        Objects.equals(this.countyTaxAmount, salesTax.countyTaxAmount) &&
        Objects.equals(this.municipalTax, salesTax.municipalTax) &&
        Objects.equals(this.municipalTaxRate, salesTax.municipalTaxRate) &&
        Objects.equals(this.municipalTaxAmount, salesTax.municipalTaxAmount) &&
        Objects.equals(this.spdsTax, salesTax.spdsTax) &&
        Objects.equals(this.specialTaxRulesApplied, salesTax.specialTaxRulesApplied) &&
        Objects.equals(this.specialTaxRulesDescriptor, salesTax.specialTaxRulesDescriptor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalTax, totalTaxRate, totalTaxAmount, stateTax, stateTaxRate, stateTaxAmount, countyTax, countyTaxRate, countyTaxAmount, municipalTax, municipalTaxRate, municipalTaxAmount, spdsTax, specialTaxRulesApplied, specialTaxRulesDescriptor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SalesTax {\n");
    
    sb.append("    totalTax: ").append(toIndentedString(totalTax)).append("\n");
    sb.append("    totalTaxRate: ").append(toIndentedString(totalTaxRate)).append("\n");
    sb.append("    totalTaxAmount: ").append(toIndentedString(totalTaxAmount)).append("\n");
    sb.append("    stateTax: ").append(toIndentedString(stateTax)).append("\n");
    sb.append("    stateTaxRate: ").append(toIndentedString(stateTaxRate)).append("\n");
    sb.append("    stateTaxAmount: ").append(toIndentedString(stateTaxAmount)).append("\n");
    sb.append("    countyTax: ").append(toIndentedString(countyTax)).append("\n");
    sb.append("    countyTaxRate: ").append(toIndentedString(countyTaxRate)).append("\n");
    sb.append("    countyTaxAmount: ").append(toIndentedString(countyTaxAmount)).append("\n");
    sb.append("    municipalTax: ").append(toIndentedString(municipalTax)).append("\n");
    sb.append("    municipalTaxRate: ").append(toIndentedString(municipalTaxRate)).append("\n");
    sb.append("    municipalTaxAmount: ").append(toIndentedString(municipalTaxAmount)).append("\n");
    sb.append("    spdsTax: ").append(toIndentedString(spdsTax)).append("\n");
    sb.append("    specialTaxRulesApplied: ").append(toIndentedString(specialTaxRulesApplied)).append("\n");
    sb.append("    specialTaxRulesDescriptor: ").append(toIndentedString(specialTaxRulesDescriptor)).append("\n");
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

