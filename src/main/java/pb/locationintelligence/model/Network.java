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
import pb.locationintelligence.model.Carrier;
import pb.locationintelligence.model.OrganizationType;


/**
 * Network
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-11T15:23:20.199+05:30")
public class Network   {
  @SerializedName("connectionFromHome")
  private String connectionFromHome = null;

  @SerializedName("organization")
  private String organization = null;

  @SerializedName("carrier")
  private Carrier carrier = null;

  @SerializedName("organizationType")
  private OrganizationType organizationType = null;

  @SerializedName("connectionType")
  private String connectionType = null;

  @SerializedName("lineSpeed")
  private String lineSpeed = null;

  @SerializedName("ipRouteType")
  private String ipRouteType = null;

  @SerializedName("hostingFacility")
  private String hostingFacility = null;

  public Network connectionFromHome(String connectionFromHome) {
    this.connectionFromHome = connectionFromHome;
    return this;
  }

   /**
   * Get connectionFromHome
   * @return connectionFromHome
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getConnectionFromHome() {
    return connectionFromHome;
  }

  public void setConnectionFromHome(String connectionFromHome) {
    this.connectionFromHome = connectionFromHome;
  }

  public Network organization(String organization) {
    this.organization = organization;
    return this;
  }

   /**
   * Get organization
   * @return organization
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getOrganization() {
    return organization;
  }

  public void setOrganization(String organization) {
    this.organization = organization;
  }

  public Network carrier(Carrier carrier) {
    this.carrier = carrier;
    return this;
  }

   /**
   * Get carrier
   * @return carrier
  **/
  @ApiModelProperty(example = "null", value = "")
  public Carrier getCarrier() {
    return carrier;
  }

  public void setCarrier(Carrier carrier) {
    this.carrier = carrier;
  }

  public Network organizationType(OrganizationType organizationType) {
    this.organizationType = organizationType;
    return this;
  }

   /**
   * Get organizationType
   * @return organizationType
  **/
  @ApiModelProperty(example = "null", value = "")
  public OrganizationType getOrganizationType() {
    return organizationType;
  }

  public void setOrganizationType(OrganizationType organizationType) {
    this.organizationType = organizationType;
  }

  public Network connectionType(String connectionType) {
    this.connectionType = connectionType;
    return this;
  }

   /**
   * Get connectionType
   * @return connectionType
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getConnectionType() {
    return connectionType;
  }

  public void setConnectionType(String connectionType) {
    this.connectionType = connectionType;
  }

  public Network lineSpeed(String lineSpeed) {
    this.lineSpeed = lineSpeed;
    return this;
  }

   /**
   * Get lineSpeed
   * @return lineSpeed
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLineSpeed() {
    return lineSpeed;
  }

  public void setLineSpeed(String lineSpeed) {
    this.lineSpeed = lineSpeed;
  }

  public Network ipRouteType(String ipRouteType) {
    this.ipRouteType = ipRouteType;
    return this;
  }

   /**
   * Get ipRouteType
   * @return ipRouteType
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getIpRouteType() {
    return ipRouteType;
  }

  public void setIpRouteType(String ipRouteType) {
    this.ipRouteType = ipRouteType;
  }

  public Network hostingFacility(String hostingFacility) {
    this.hostingFacility = hostingFacility;
    return this;
  }

   /**
   * Get hostingFacility
   * @return hostingFacility
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getHostingFacility() {
    return hostingFacility;
  }

  public void setHostingFacility(String hostingFacility) {
    this.hostingFacility = hostingFacility;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Network network = (Network) o;
    return Objects.equals(this.connectionFromHome, network.connectionFromHome) &&
        Objects.equals(this.organization, network.organization) &&
        Objects.equals(this.carrier, network.carrier) &&
        Objects.equals(this.organizationType, network.organizationType) &&
        Objects.equals(this.connectionType, network.connectionType) &&
        Objects.equals(this.lineSpeed, network.lineSpeed) &&
        Objects.equals(this.ipRouteType, network.ipRouteType) &&
        Objects.equals(this.hostingFacility, network.hostingFacility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectionFromHome, organization, carrier, organizationType, connectionType, lineSpeed, ipRouteType, hostingFacility);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Network {\n");
    
    sb.append("    connectionFromHome: ").append(toIndentedString(connectionFromHome)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("    carrier: ").append(toIndentedString(carrier)).append("\n");
    sb.append("    organizationType: ").append(toIndentedString(organizationType)).append("\n");
    sb.append("    connectionType: ").append(toIndentedString(connectionType)).append("\n");
    sb.append("    lineSpeed: ").append(toIndentedString(lineSpeed)).append("\n");
    sb.append("    ipRouteType: ").append(toIndentedString(ipRouteType)).append("\n");
    sb.append("    hostingFacility: ").append(toIndentedString(hostingFacility)).append("\n");
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

