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
import pb.locationintelligence.model.Address;


/**
 * PoiContactDetails
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2019-01-15T12:57:00.076+05:30")
public class PoiContactDetails   {
  @SerializedName("address")
  private Address address = null;

  @SerializedName("phone")
  private String phone = null;

  @SerializedName("fax")
  private String fax = null;

  @SerializedName("countryAccessCode")
  private String countryAccessCode = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("url")
  private String url = null;

  public PoiContactDetails address(Address address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(example = "null", value = "")
  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public PoiContactDetails phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Get phone
   * @return phone
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public PoiContactDetails fax(String fax) {
    this.fax = fax;
    return this;
  }

   /**
   * Get fax
   * @return fax
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getFax() {
    return fax;
  }

  public void setFax(String fax) {
    this.fax = fax;
  }

  public PoiContactDetails countryAccessCode(String countryAccessCode) {
    this.countryAccessCode = countryAccessCode;
    return this;
  }

   /**
   * Get countryAccessCode
   * @return countryAccessCode
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCountryAccessCode() {
    return countryAccessCode;
  }

  public void setCountryAccessCode(String countryAccessCode) {
    this.countryAccessCode = countryAccessCode;
  }

  public PoiContactDetails email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public PoiContactDetails url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoiContactDetails poiContactDetails = (PoiContactDetails) o;
    return Objects.equals(this.address, poiContactDetails.address) &&
        Objects.equals(this.phone, poiContactDetails.phone) &&
        Objects.equals(this.fax, poiContactDetails.fax) &&
        Objects.equals(this.countryAccessCode, poiContactDetails.countryAccessCode) &&
        Objects.equals(this.email, poiContactDetails.email) &&
        Objects.equals(this.url, poiContactDetails.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, phone, fax, countryAccessCode, email, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoiContactDetails {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    fax: ").append(toIndentedString(fax)).append("\n");
    sb.append("    countryAccessCode: ").append(toIndentedString(countryAccessCode)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

