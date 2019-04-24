/**
 * Location Intelligence APIs
 * Incorporate our extensive geodata into everyday applications, business processes and workflows.
 *
 * OpenAPI spec version: 6.5.0
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
import pb.locationintelligence.model.FieldsMatching;
import pb.locationintelligence.model.GeocodeCustomPreferences;
import pb.locationintelligence.model.ReturnFieldsDescriptor;


/**
 * GeocodePreferences
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-23T18:47:15.972+05:30")
public class GeocodePreferences   {
  @SerializedName("returnAllCandidateInfo")
  private Boolean returnAllCandidateInfo = false;

  @SerializedName("fallbackToGeographic")
  private Boolean fallbackToGeographic = true;

  @SerializedName("fallbackToPostal")
  private Boolean fallbackToPostal = true;

  @SerializedName("maxReturnedCandidates")
  private String maxReturnedCandidates = null;

  @SerializedName("streetOffset")
  private String streetOffset = null;

  @SerializedName("cornerOffset")
  private String cornerOffset = null;

  @SerializedName("matchMode")
  private String matchMode = null;

  @SerializedName("clientLocale")
  private String clientLocale = null;

  @SerializedName("clientCoordSysName")
  private String clientCoordSysName = null;

  @SerializedName("streetOffsetUnits")
  private String streetOffsetUnits = null;

  @SerializedName("cornerOffsetUnits")
  private String cornerOffsetUnits = null;

  @SerializedName("mustMatchFields")
  private FieldsMatching mustMatchFields = null;

  @SerializedName("returnFieldsDescriptor")
  private ReturnFieldsDescriptor returnFieldsDescriptor = null;

  @SerializedName("outputRecordType")
  private String outputRecordType = null;

  @SerializedName("customPreferences")
  private GeocodeCustomPreferences customPreferences = null;

  @SerializedName("preferredDictionaryOrders")
  private List<String> preferredDictionaryOrders = new ArrayList<String>();

  public GeocodePreferences returnAllCandidateInfo(Boolean returnAllCandidateInfo) {
    this.returnAllCandidateInfo = returnAllCandidateInfo;
    return this;
  }

   /**
   * Get returnAllCandidateInfo
   * @return returnAllCandidateInfo
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getReturnAllCandidateInfo() {
    return returnAllCandidateInfo;
  }

  public void setReturnAllCandidateInfo(Boolean returnAllCandidateInfo) {
    this.returnAllCandidateInfo = returnAllCandidateInfo;
  }

  public GeocodePreferences fallbackToGeographic(Boolean fallbackToGeographic) {
    this.fallbackToGeographic = fallbackToGeographic;
    return this;
  }

   /**
   * Get fallbackToGeographic
   * @return fallbackToGeographic
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getFallbackToGeographic() {
    return fallbackToGeographic;
  }

  public void setFallbackToGeographic(Boolean fallbackToGeographic) {
    this.fallbackToGeographic = fallbackToGeographic;
  }

  public GeocodePreferences fallbackToPostal(Boolean fallbackToPostal) {
    this.fallbackToPostal = fallbackToPostal;
    return this;
  }

   /**
   * Get fallbackToPostal
   * @return fallbackToPostal
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getFallbackToPostal() {
    return fallbackToPostal;
  }

  public void setFallbackToPostal(Boolean fallbackToPostal) {
    this.fallbackToPostal = fallbackToPostal;
  }

  public GeocodePreferences maxReturnedCandidates(String maxReturnedCandidates) {
    this.maxReturnedCandidates = maxReturnedCandidates;
    return this;
  }

   /**
   * Get maxReturnedCandidates
   * @return maxReturnedCandidates
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMaxReturnedCandidates() {
    return maxReturnedCandidates;
  }

  public void setMaxReturnedCandidates(String maxReturnedCandidates) {
    this.maxReturnedCandidates = maxReturnedCandidates;
  }

  public GeocodePreferences streetOffset(String streetOffset) {
    this.streetOffset = streetOffset;
    return this;
  }

   /**
   * Get streetOffset
   * @return streetOffset
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getStreetOffset() {
    return streetOffset;
  }

  public void setStreetOffset(String streetOffset) {
    this.streetOffset = streetOffset;
  }

  public GeocodePreferences cornerOffset(String cornerOffset) {
    this.cornerOffset = cornerOffset;
    return this;
  }

   /**
   * Get cornerOffset
   * @return cornerOffset
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCornerOffset() {
    return cornerOffset;
  }

  public void setCornerOffset(String cornerOffset) {
    this.cornerOffset = cornerOffset;
  }

  public GeocodePreferences matchMode(String matchMode) {
    this.matchMode = matchMode;
    return this;
  }

   /**
   * Get matchMode
   * @return matchMode
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMatchMode() {
    return matchMode;
  }

  public void setMatchMode(String matchMode) {
    this.matchMode = matchMode;
  }

  public GeocodePreferences clientLocale(String clientLocale) {
    this.clientLocale = clientLocale;
    return this;
  }

   /**
   * Get clientLocale
   * @return clientLocale
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getClientLocale() {
    return clientLocale;
  }

  public void setClientLocale(String clientLocale) {
    this.clientLocale = clientLocale;
  }

  public GeocodePreferences clientCoordSysName(String clientCoordSysName) {
    this.clientCoordSysName = clientCoordSysName;
    return this;
  }

   /**
   * Get clientCoordSysName
   * @return clientCoordSysName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getClientCoordSysName() {
    return clientCoordSysName;
  }

  public void setClientCoordSysName(String clientCoordSysName) {
    this.clientCoordSysName = clientCoordSysName;
  }

  public GeocodePreferences streetOffsetUnits(String streetOffsetUnits) {
    this.streetOffsetUnits = streetOffsetUnits;
    return this;
  }

   /**
   * Get streetOffsetUnits
   * @return streetOffsetUnits
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getStreetOffsetUnits() {
    return streetOffsetUnits;
  }

  public void setStreetOffsetUnits(String streetOffsetUnits) {
    this.streetOffsetUnits = streetOffsetUnits;
  }

  public GeocodePreferences cornerOffsetUnits(String cornerOffsetUnits) {
    this.cornerOffsetUnits = cornerOffsetUnits;
    return this;
  }

   /**
   * Get cornerOffsetUnits
   * @return cornerOffsetUnits
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCornerOffsetUnits() {
    return cornerOffsetUnits;
  }

  public void setCornerOffsetUnits(String cornerOffsetUnits) {
    this.cornerOffsetUnits = cornerOffsetUnits;
  }

  public GeocodePreferences mustMatchFields(FieldsMatching mustMatchFields) {
    this.mustMatchFields = mustMatchFields;
    return this;
  }

   /**
   * Get mustMatchFields
   * @return mustMatchFields
  **/
  @ApiModelProperty(example = "null", value = "")
  public FieldsMatching getMustMatchFields() {
    return mustMatchFields;
  }

  public void setMustMatchFields(FieldsMatching mustMatchFields) {
    this.mustMatchFields = mustMatchFields;
  }

  public GeocodePreferences returnFieldsDescriptor(ReturnFieldsDescriptor returnFieldsDescriptor) {
    this.returnFieldsDescriptor = returnFieldsDescriptor;
    return this;
  }

   /**
   * Get returnFieldsDescriptor
   * @return returnFieldsDescriptor
  **/
  @ApiModelProperty(example = "null", value = "")
  public ReturnFieldsDescriptor getReturnFieldsDescriptor() {
    return returnFieldsDescriptor;
  }

  public void setReturnFieldsDescriptor(ReturnFieldsDescriptor returnFieldsDescriptor) {
    this.returnFieldsDescriptor = returnFieldsDescriptor;
  }

  public GeocodePreferences outputRecordType(String outputRecordType) {
    this.outputRecordType = outputRecordType;
    return this;
  }

   /**
   * Get outputRecordType
   * @return outputRecordType
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getOutputRecordType() {
    return outputRecordType;
  }

  public void setOutputRecordType(String outputRecordType) {
    this.outputRecordType = outputRecordType;
  }

  public GeocodePreferences customPreferences(GeocodeCustomPreferences customPreferences) {
    this.customPreferences = customPreferences;
    return this;
  }

   /**
   * Get customPreferences
   * @return customPreferences
  **/
  @ApiModelProperty(example = "null", value = "")
  public GeocodeCustomPreferences getCustomPreferences() {
    return customPreferences;
  }

  public void setCustomPreferences(GeocodeCustomPreferences customPreferences) {
    this.customPreferences = customPreferences;
  }

  public GeocodePreferences preferredDictionaryOrders(List<String> preferredDictionaryOrders) {
    this.preferredDictionaryOrders = preferredDictionaryOrders;
    return this;
  }

   /**
   * Get preferredDictionaryOrders
   * @return preferredDictionaryOrders
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getPreferredDictionaryOrders() {
    return preferredDictionaryOrders;
  }

  public void setPreferredDictionaryOrders(List<String> preferredDictionaryOrders) {
    this.preferredDictionaryOrders = preferredDictionaryOrders;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeocodePreferences geocodePreferences = (GeocodePreferences) o;
    return Objects.equals(this.returnAllCandidateInfo, geocodePreferences.returnAllCandidateInfo) &&
        Objects.equals(this.fallbackToGeographic, geocodePreferences.fallbackToGeographic) &&
        Objects.equals(this.fallbackToPostal, geocodePreferences.fallbackToPostal) &&
        Objects.equals(this.maxReturnedCandidates, geocodePreferences.maxReturnedCandidates) &&
        Objects.equals(this.streetOffset, geocodePreferences.streetOffset) &&
        Objects.equals(this.cornerOffset, geocodePreferences.cornerOffset) &&
        Objects.equals(this.matchMode, geocodePreferences.matchMode) &&
        Objects.equals(this.clientLocale, geocodePreferences.clientLocale) &&
        Objects.equals(this.clientCoordSysName, geocodePreferences.clientCoordSysName) &&
        Objects.equals(this.streetOffsetUnits, geocodePreferences.streetOffsetUnits) &&
        Objects.equals(this.cornerOffsetUnits, geocodePreferences.cornerOffsetUnits) &&
        Objects.equals(this.mustMatchFields, geocodePreferences.mustMatchFields) &&
        Objects.equals(this.returnFieldsDescriptor, geocodePreferences.returnFieldsDescriptor) &&
        Objects.equals(this.outputRecordType, geocodePreferences.outputRecordType) &&
        Objects.equals(this.customPreferences, geocodePreferences.customPreferences) &&
        Objects.equals(this.preferredDictionaryOrders, geocodePreferences.preferredDictionaryOrders);
  }

  @Override
  public int hashCode() {
    return Objects.hash(returnAllCandidateInfo, fallbackToGeographic, fallbackToPostal, maxReturnedCandidates, streetOffset, cornerOffset, matchMode, clientLocale, clientCoordSysName, streetOffsetUnits, cornerOffsetUnits, mustMatchFields, returnFieldsDescriptor, outputRecordType, customPreferences, preferredDictionaryOrders);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeocodePreferences {\n");
    
    sb.append("    returnAllCandidateInfo: ").append(toIndentedString(returnAllCandidateInfo)).append("\n");
    sb.append("    fallbackToGeographic: ").append(toIndentedString(fallbackToGeographic)).append("\n");
    sb.append("    fallbackToPostal: ").append(toIndentedString(fallbackToPostal)).append("\n");
    sb.append("    maxReturnedCandidates: ").append(toIndentedString(maxReturnedCandidates)).append("\n");
    sb.append("    streetOffset: ").append(toIndentedString(streetOffset)).append("\n");
    sb.append("    cornerOffset: ").append(toIndentedString(cornerOffset)).append("\n");
    sb.append("    matchMode: ").append(toIndentedString(matchMode)).append("\n");
    sb.append("    clientLocale: ").append(toIndentedString(clientLocale)).append("\n");
    sb.append("    clientCoordSysName: ").append(toIndentedString(clientCoordSysName)).append("\n");
    sb.append("    streetOffsetUnits: ").append(toIndentedString(streetOffsetUnits)).append("\n");
    sb.append("    cornerOffsetUnits: ").append(toIndentedString(cornerOffsetUnits)).append("\n");
    sb.append("    mustMatchFields: ").append(toIndentedString(mustMatchFields)).append("\n");
    sb.append("    returnFieldsDescriptor: ").append(toIndentedString(returnFieldsDescriptor)).append("\n");
    sb.append("    outputRecordType: ").append(toIndentedString(outputRecordType)).append("\n");
    sb.append("    customPreferences: ").append(toIndentedString(customPreferences)).append("\n");
    sb.append("    preferredDictionaryOrders: ").append(toIndentedString(preferredDictionaryOrders)).append("\n");
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

