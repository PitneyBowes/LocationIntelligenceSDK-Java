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
import pb.locationintelligence.model.InputParameter;
import pb.locationintelligence.model.OutputParameter;


/**
 * SupportLevel
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2019-01-15T12:57:00.076+05:30")
public class SupportLevel   {
  @SerializedName("supportedDataLevel")
  private Integer supportedDataLevel = null;

  @SerializedName("countries")
  private List<String> countries = new ArrayList<String>();

  @SerializedName("updatedRequiredInputs")
  private List<InputParameter> updatedRequiredInputs = new ArrayList<InputParameter>();

  @SerializedName("updatedOptionalInputs")
  private List<InputParameter> updatedOptionalInputs = new ArrayList<InputParameter>();

  @SerializedName("updatedOptionalOutputs")
  private List<OutputParameter> updatedOptionalOutputs = new ArrayList<OutputParameter>();

  public SupportLevel supportedDataLevel(Integer supportedDataLevel) {
    this.supportedDataLevel = supportedDataLevel;
    return this;
  }

   /**
   * Get supportedDataLevel
   * @return supportedDataLevel
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getSupportedDataLevel() {
    return supportedDataLevel;
  }

  public void setSupportedDataLevel(Integer supportedDataLevel) {
    this.supportedDataLevel = supportedDataLevel;
  }

  public SupportLevel countries(List<String> countries) {
    this.countries = countries;
    return this;
  }

   /**
   * Get countries
   * @return countries
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getCountries() {
    return countries;
  }

  public void setCountries(List<String> countries) {
    this.countries = countries;
  }

  public SupportLevel updatedRequiredInputs(List<InputParameter> updatedRequiredInputs) {
    this.updatedRequiredInputs = updatedRequiredInputs;
    return this;
  }

   /**
   * Get updatedRequiredInputs
   * @return updatedRequiredInputs
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<InputParameter> getUpdatedRequiredInputs() {
    return updatedRequiredInputs;
  }

  public void setUpdatedRequiredInputs(List<InputParameter> updatedRequiredInputs) {
    this.updatedRequiredInputs = updatedRequiredInputs;
  }

  public SupportLevel updatedOptionalInputs(List<InputParameter> updatedOptionalInputs) {
    this.updatedOptionalInputs = updatedOptionalInputs;
    return this;
  }

   /**
   * Get updatedOptionalInputs
   * @return updatedOptionalInputs
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<InputParameter> getUpdatedOptionalInputs() {
    return updatedOptionalInputs;
  }

  public void setUpdatedOptionalInputs(List<InputParameter> updatedOptionalInputs) {
    this.updatedOptionalInputs = updatedOptionalInputs;
  }

  public SupportLevel updatedOptionalOutputs(List<OutputParameter> updatedOptionalOutputs) {
    this.updatedOptionalOutputs = updatedOptionalOutputs;
    return this;
  }

   /**
   * Get updatedOptionalOutputs
   * @return updatedOptionalOutputs
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<OutputParameter> getUpdatedOptionalOutputs() {
    return updatedOptionalOutputs;
  }

  public void setUpdatedOptionalOutputs(List<OutputParameter> updatedOptionalOutputs) {
    this.updatedOptionalOutputs = updatedOptionalOutputs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SupportLevel supportLevel = (SupportLevel) o;
    return Objects.equals(this.supportedDataLevel, supportLevel.supportedDataLevel) &&
        Objects.equals(this.countries, supportLevel.countries) &&
        Objects.equals(this.updatedRequiredInputs, supportLevel.updatedRequiredInputs) &&
        Objects.equals(this.updatedOptionalInputs, supportLevel.updatedOptionalInputs) &&
        Objects.equals(this.updatedOptionalOutputs, supportLevel.updatedOptionalOutputs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(supportedDataLevel, countries, updatedRequiredInputs, updatedOptionalInputs, updatedOptionalOutputs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SupportLevel {\n");
    
    sb.append("    supportedDataLevel: ").append(toIndentedString(supportedDataLevel)).append("\n");
    sb.append("    countries: ").append(toIndentedString(countries)).append("\n");
    sb.append("    updatedRequiredInputs: ").append(toIndentedString(updatedRequiredInputs)).append("\n");
    sb.append("    updatedOptionalInputs: ").append(toIndentedString(updatedOptionalInputs)).append("\n");
    sb.append("    updatedOptionalOutputs: ").append(toIndentedString(updatedOptionalOutputs)).append("\n");
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

