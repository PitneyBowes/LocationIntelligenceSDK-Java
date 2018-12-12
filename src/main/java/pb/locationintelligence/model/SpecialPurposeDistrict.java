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
 * SpecialPurposeDistrict
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-11T15:23:20.199+05:30")
public class SpecialPurposeDistrict   {
  @SerializedName("districtName")
  private String districtName = null;

  @SerializedName("districtCode")
  private String districtCode = null;

  @SerializedName("districtNumber")
  private String districtNumber = null;

  @SerializedName("versionDate")
  private String versionDate = null;

  @SerializedName("effectiveDate")
  private String effectiveDate = null;

  @SerializedName("compiledDate")
  private String compiledDate = null;

  @SerializedName("updateDate")
  private String updateDate = null;

  public SpecialPurposeDistrict districtName(String districtName) {
    this.districtName = districtName;
    return this;
  }

   /**
   * Get districtName
   * @return districtName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDistrictName() {
    return districtName;
  }

  public void setDistrictName(String districtName) {
    this.districtName = districtName;
  }

  public SpecialPurposeDistrict districtCode(String districtCode) {
    this.districtCode = districtCode;
    return this;
  }

   /**
   * Get districtCode
   * @return districtCode
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDistrictCode() {
    return districtCode;
  }

  public void setDistrictCode(String districtCode) {
    this.districtCode = districtCode;
  }

  public SpecialPurposeDistrict districtNumber(String districtNumber) {
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

  public SpecialPurposeDistrict versionDate(String versionDate) {
    this.versionDate = versionDate;
    return this;
  }

   /**
   * Get versionDate
   * @return versionDate
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getVersionDate() {
    return versionDate;
  }

  public void setVersionDate(String versionDate) {
    this.versionDate = versionDate;
  }

  public SpecialPurposeDistrict effectiveDate(String effectiveDate) {
    this.effectiveDate = effectiveDate;
    return this;
  }

   /**
   * Get effectiveDate
   * @return effectiveDate
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getEffectiveDate() {
    return effectiveDate;
  }

  public void setEffectiveDate(String effectiveDate) {
    this.effectiveDate = effectiveDate;
  }

  public SpecialPurposeDistrict compiledDate(String compiledDate) {
    this.compiledDate = compiledDate;
    return this;
  }

   /**
   * Get compiledDate
   * @return compiledDate
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCompiledDate() {
    return compiledDate;
  }

  public void setCompiledDate(String compiledDate) {
    this.compiledDate = compiledDate;
  }

  public SpecialPurposeDistrict updateDate(String updateDate) {
    this.updateDate = updateDate;
    return this;
  }

   /**
   * Get updateDate
   * @return updateDate
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getUpdateDate() {
    return updateDate;
  }

  public void setUpdateDate(String updateDate) {
    this.updateDate = updateDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpecialPurposeDistrict specialPurposeDistrict = (SpecialPurposeDistrict) o;
    return Objects.equals(this.districtName, specialPurposeDistrict.districtName) &&
        Objects.equals(this.districtCode, specialPurposeDistrict.districtCode) &&
        Objects.equals(this.districtNumber, specialPurposeDistrict.districtNumber) &&
        Objects.equals(this.versionDate, specialPurposeDistrict.versionDate) &&
        Objects.equals(this.effectiveDate, specialPurposeDistrict.effectiveDate) &&
        Objects.equals(this.compiledDate, specialPurposeDistrict.compiledDate) &&
        Objects.equals(this.updateDate, specialPurposeDistrict.updateDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(districtName, districtCode, districtNumber, versionDate, effectiveDate, compiledDate, updateDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpecialPurposeDistrict {\n");
    
    sb.append("    districtName: ").append(toIndentedString(districtName)).append("\n");
    sb.append("    districtCode: ").append(toIndentedString(districtCode)).append("\n");
    sb.append("    districtNumber: ").append(toIndentedString(districtNumber)).append("\n");
    sb.append("    versionDate: ").append(toIndentedString(versionDate)).append("\n");
    sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
    sb.append("    compiledDate: ").append(toIndentedString(compiledDate)).append("\n");
    sb.append("    updateDate: ").append(toIndentedString(updateDate)).append("\n");
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

