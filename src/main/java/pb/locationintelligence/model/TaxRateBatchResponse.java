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
import pb.locationintelligence.model.Census;
import pb.locationintelligence.model.LatLongFields;
import pb.locationintelligence.model.MatchedAddress;
import pb.locationintelligence.model.SalesTaxRate;
import pb.locationintelligence.model.TaxJurisdiction;
import pb.locationintelligence.model.UseTaxRate;


/**
 * TaxRateBatchResponse
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2019-01-15T12:57:00.076+05:30")
public class TaxRateBatchResponse   {
  @SerializedName("objectId")
  private String objectId = null;

  @SerializedName("confidence")
  private Double confidence = null;

  @SerializedName("jurisdiction")
  private TaxJurisdiction jurisdiction = null;

  @SerializedName("matchedAddress")
  private MatchedAddress matchedAddress = null;

  @SerializedName("salesTax")
  private SalesTaxRate salesTax = null;

  @SerializedName("useTax")
  private UseTaxRate useTax = null;

  @SerializedName("census")
  private Census census = null;

  @SerializedName("latLongFields")
  private LatLongFields latLongFields = null;

  public TaxRateBatchResponse objectId(String objectId) {
    this.objectId = objectId;
    return this;
  }

   /**
   * Get objectId
   * @return objectId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getObjectId() {
    return objectId;
  }

  public void setObjectId(String objectId) {
    this.objectId = objectId;
  }

  public TaxRateBatchResponse confidence(Double confidence) {
    this.confidence = confidence;
    return this;
  }

   /**
   * Get confidence
   * @return confidence
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getConfidence() {
    return confidence;
  }

  public void setConfidence(Double confidence) {
    this.confidence = confidence;
  }

  public TaxRateBatchResponse jurisdiction(TaxJurisdiction jurisdiction) {
    this.jurisdiction = jurisdiction;
    return this;
  }

   /**
   * Get jurisdiction
   * @return jurisdiction
  **/
  @ApiModelProperty(example = "null", value = "")
  public TaxJurisdiction getJurisdiction() {
    return jurisdiction;
  }

  public void setJurisdiction(TaxJurisdiction jurisdiction) {
    this.jurisdiction = jurisdiction;
  }

  public TaxRateBatchResponse matchedAddress(MatchedAddress matchedAddress) {
    this.matchedAddress = matchedAddress;
    return this;
  }

   /**
   * Get matchedAddress
   * @return matchedAddress
  **/
  @ApiModelProperty(example = "null", value = "")
  public MatchedAddress getMatchedAddress() {
    return matchedAddress;
  }

  public void setMatchedAddress(MatchedAddress matchedAddress) {
    this.matchedAddress = matchedAddress;
  }

  public TaxRateBatchResponse salesTax(SalesTaxRate salesTax) {
    this.salesTax = salesTax;
    return this;
  }

   /**
   * Get salesTax
   * @return salesTax
  **/
  @ApiModelProperty(example = "null", value = "")
  public SalesTaxRate getSalesTax() {
    return salesTax;
  }

  public void setSalesTax(SalesTaxRate salesTax) {
    this.salesTax = salesTax;
  }

  public TaxRateBatchResponse useTax(UseTaxRate useTax) {
    this.useTax = useTax;
    return this;
  }

   /**
   * Get useTax
   * @return useTax
  **/
  @ApiModelProperty(example = "null", value = "")
  public UseTaxRate getUseTax() {
    return useTax;
  }

  public void setUseTax(UseTaxRate useTax) {
    this.useTax = useTax;
  }

  public TaxRateBatchResponse census(Census census) {
    this.census = census;
    return this;
  }

   /**
   * Get census
   * @return census
  **/
  @ApiModelProperty(example = "null", value = "")
  public Census getCensus() {
    return census;
  }

  public void setCensus(Census census) {
    this.census = census;
  }

  public TaxRateBatchResponse latLongFields(LatLongFields latLongFields) {
    this.latLongFields = latLongFields;
    return this;
  }

   /**
   * Get latLongFields
   * @return latLongFields
  **/
  @ApiModelProperty(example = "null", value = "")
  public LatLongFields getLatLongFields() {
    return latLongFields;
  }

  public void setLatLongFields(LatLongFields latLongFields) {
    this.latLongFields = latLongFields;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxRateBatchResponse taxRateBatchResponse = (TaxRateBatchResponse) o;
    return Objects.equals(this.objectId, taxRateBatchResponse.objectId) &&
        Objects.equals(this.confidence, taxRateBatchResponse.confidence) &&
        Objects.equals(this.jurisdiction, taxRateBatchResponse.jurisdiction) &&
        Objects.equals(this.matchedAddress, taxRateBatchResponse.matchedAddress) &&
        Objects.equals(this.salesTax, taxRateBatchResponse.salesTax) &&
        Objects.equals(this.useTax, taxRateBatchResponse.useTax) &&
        Objects.equals(this.census, taxRateBatchResponse.census) &&
        Objects.equals(this.latLongFields, taxRateBatchResponse.latLongFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objectId, confidence, jurisdiction, matchedAddress, salesTax, useTax, census, latLongFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxRateBatchResponse {\n");
    
    sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
    sb.append("    jurisdiction: ").append(toIndentedString(jurisdiction)).append("\n");
    sb.append("    matchedAddress: ").append(toIndentedString(matchedAddress)).append("\n");
    sb.append("    salesTax: ").append(toIndentedString(salesTax)).append("\n");
    sb.append("    useTax: ").append(toIndentedString(useTax)).append("\n");
    sb.append("    census: ").append(toIndentedString(census)).append("\n");
    sb.append("    latLongFields: ").append(toIndentedString(latLongFields)).append("\n");
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

