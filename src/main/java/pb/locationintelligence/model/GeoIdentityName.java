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


/**
 * GeoIdentityName
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-23T18:47:15.972+05:30")
public class GeoIdentityName   {
  @SerializedName("given")
  private String given = null;

  @SerializedName("family")
  private String family = null;

  @SerializedName("middle")
  private String middle = null;

  @SerializedName("prefix")
  private String prefix = null;

  @SerializedName("suffix")
  private String suffix = null;

  @SerializedName("nickname")
  private String nickname = null;

  public GeoIdentityName given(String given) {
    this.given = given;
    return this;
  }

   /**
   * Get given
   * @return given
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getGiven() {
    return given;
  }

  public void setGiven(String given) {
    this.given = given;
  }

  public GeoIdentityName family(String family) {
    this.family = family;
    return this;
  }

   /**
   * Get family
   * @return family
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getFamily() {
    return family;
  }

  public void setFamily(String family) {
    this.family = family;
  }

  public GeoIdentityName middle(String middle) {
    this.middle = middle;
    return this;
  }

   /**
   * Get middle
   * @return middle
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMiddle() {
    return middle;
  }

  public void setMiddle(String middle) {
    this.middle = middle;
  }

  public GeoIdentityName prefix(String prefix) {
    this.prefix = prefix;
    return this;
  }

   /**
   * Get prefix
   * @return prefix
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPrefix() {
    return prefix;
  }

  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }

  public GeoIdentityName suffix(String suffix) {
    this.suffix = suffix;
    return this;
  }

   /**
   * Get suffix
   * @return suffix
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSuffix() {
    return suffix;
  }

  public void setSuffix(String suffix) {
    this.suffix = suffix;
  }

  public GeoIdentityName nickname(String nickname) {
    this.nickname = nickname;
    return this;
  }

   /**
   * Get nickname
   * @return nickname
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeoIdentityName geoIdentityName = (GeoIdentityName) o;
    return Objects.equals(this.given, geoIdentityName.given) &&
        Objects.equals(this.family, geoIdentityName.family) &&
        Objects.equals(this.middle, geoIdentityName.middle) &&
        Objects.equals(this.prefix, geoIdentityName.prefix) &&
        Objects.equals(this.suffix, geoIdentityName.suffix) &&
        Objects.equals(this.nickname, geoIdentityName.nickname);
  }

  @Override
  public int hashCode() {
    return Objects.hash(given, family, middle, prefix, suffix, nickname);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeoIdentityName {\n");
    
    sb.append("    given: ").append(toIndentedString(given)).append("\n");
    sb.append("    family: ").append(toIndentedString(family)).append("\n");
    sb.append("    middle: ").append(toIndentedString(middle)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    suffix: ").append(toIndentedString(suffix)).append("\n");
    sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
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

