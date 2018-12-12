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
import pb.locationintelligence.model.AHJmailingAddress;
import pb.locationintelligence.model.ContactPerson;
import pb.locationintelligence.model.Coverage;


/**
 * AHJ
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-11T15:23:20.199+05:30")
public class AHJ   {
  @SerializedName("ahjType")
  private String ahjType = null;

  @SerializedName("ahjId")
  private String ahjId = null;

  @SerializedName("agency")
  private String agency = null;

  @SerializedName("phone")
  private String phone = null;

  @SerializedName("comments")
  private String comments = null;

  @SerializedName("coverage")
  private Coverage coverage = null;

  @SerializedName("contactPerson")
  private ContactPerson contactPerson = null;

  @SerializedName("mailingAddress")
  private AHJmailingAddress mailingAddress = null;

  public AHJ ahjType(String ahjType) {
    this.ahjType = ahjType;
    return this;
  }

   /**
   * Get ahjType
   * @return ahjType
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAhjType() {
    return ahjType;
  }

  public void setAhjType(String ahjType) {
    this.ahjType = ahjType;
  }

  public AHJ ahjId(String ahjId) {
    this.ahjId = ahjId;
    return this;
  }

   /**
   * Get ahjId
   * @return ahjId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAhjId() {
    return ahjId;
  }

  public void setAhjId(String ahjId) {
    this.ahjId = ahjId;
  }

  public AHJ agency(String agency) {
    this.agency = agency;
    return this;
  }

   /**
   * Get agency
   * @return agency
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAgency() {
    return agency;
  }

  public void setAgency(String agency) {
    this.agency = agency;
  }

  public AHJ phone(String phone) {
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

  public AHJ comments(String comments) {
    this.comments = comments;
    return this;
  }

   /**
   * Get comments
   * @return comments
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getComments() {
    return comments;
  }

  public void setComments(String comments) {
    this.comments = comments;
  }

  public AHJ coverage(Coverage coverage) {
    this.coverage = coverage;
    return this;
  }

   /**
   * Get coverage
   * @return coverage
  **/
  @ApiModelProperty(example = "null", value = "")
  public Coverage getCoverage() {
    return coverage;
  }

  public void setCoverage(Coverage coverage) {
    this.coverage = coverage;
  }

  public AHJ contactPerson(ContactPerson contactPerson) {
    this.contactPerson = contactPerson;
    return this;
  }

   /**
   * Get contactPerson
   * @return contactPerson
  **/
  @ApiModelProperty(example = "null", value = "")
  public ContactPerson getContactPerson() {
    return contactPerson;
  }

  public void setContactPerson(ContactPerson contactPerson) {
    this.contactPerson = contactPerson;
  }

  public AHJ mailingAddress(AHJmailingAddress mailingAddress) {
    this.mailingAddress = mailingAddress;
    return this;
  }

   /**
   * Get mailingAddress
   * @return mailingAddress
  **/
  @ApiModelProperty(example = "null", value = "")
  public AHJmailingAddress getMailingAddress() {
    return mailingAddress;
  }

  public void setMailingAddress(AHJmailingAddress mailingAddress) {
    this.mailingAddress = mailingAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AHJ AHJ = (AHJ) o;
    return Objects.equals(this.ahjType, AHJ.ahjType) &&
        Objects.equals(this.ahjId, AHJ.ahjId) &&
        Objects.equals(this.agency, AHJ.agency) &&
        Objects.equals(this.phone, AHJ.phone) &&
        Objects.equals(this.comments, AHJ.comments) &&
        Objects.equals(this.coverage, AHJ.coverage) &&
        Objects.equals(this.contactPerson, AHJ.contactPerson) &&
        Objects.equals(this.mailingAddress, AHJ.mailingAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ahjType, ahjId, agency, phone, comments, coverage, contactPerson, mailingAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AHJ {\n");
    
    sb.append("    ahjType: ").append(toIndentedString(ahjType)).append("\n");
    sb.append("    ahjId: ").append(toIndentedString(ahjId)).append("\n");
    sb.append("    agency: ").append(toIndentedString(agency)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    coverage: ").append(toIndentedString(coverage)).append("\n");
    sb.append("    contactPerson: ").append(toIndentedString(contactPerson)).append("\n");
    sb.append("    mailingAddress: ").append(toIndentedString(mailingAddress)).append("\n");
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

