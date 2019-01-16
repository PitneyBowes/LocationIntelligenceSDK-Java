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
import pb.locationintelligence.model.Preferences;
import pb.locationintelligence.model.TaxRateAddress;


/**
 * TaxRateAddressRequest
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2019-01-15T12:57:00.076+05:30")
public class TaxRateAddressRequest   {
  @SerializedName("preferences")
  private Preferences preferences = null;

  @SerializedName("taxRateAddresses")
  private List<TaxRateAddress> taxRateAddresses = new ArrayList<TaxRateAddress>();

  public TaxRateAddressRequest preferences(Preferences preferences) {
    this.preferences = preferences;
    return this;
  }

   /**
   * Get preferences
   * @return preferences
  **/
  @ApiModelProperty(example = "null", value = "")
  public Preferences getPreferences() {
    return preferences;
  }

  public void setPreferences(Preferences preferences) {
    this.preferences = preferences;
  }

  public TaxRateAddressRequest taxRateAddresses(List<TaxRateAddress> taxRateAddresses) {
    this.taxRateAddresses = taxRateAddresses;
    return this;
  }

   /**
   * Get taxRateAddresses
   * @return taxRateAddresses
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public List<TaxRateAddress> getTaxRateAddresses() {
    return taxRateAddresses;
  }

  public void setTaxRateAddresses(List<TaxRateAddress> taxRateAddresses) {
    this.taxRateAddresses = taxRateAddresses;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxRateAddressRequest taxRateAddressRequest = (TaxRateAddressRequest) o;
    return Objects.equals(this.preferences, taxRateAddressRequest.preferences) &&
        Objects.equals(this.taxRateAddresses, taxRateAddressRequest.taxRateAddresses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(preferences, taxRateAddresses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxRateAddressRequest {\n");
    
    sb.append("    preferences: ").append(toIndentedString(preferences)).append("\n");
    sb.append("    taxRateAddresses: ").append(toIndentedString(taxRateAddresses)).append("\n");
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

