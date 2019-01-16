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
 * Start
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2019-01-15T12:57:00.076+05:30")
public class Start   {
  @SerializedName("year")
  private Integer year = null;

  @SerializedName("month")
  private Integer month = null;

  @SerializedName("day")
  private Integer day = null;

  public Start year(Integer year) {
    this.year = year;
    return this;
  }

   /**
   * Get year
   * @return year
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getYear() {
    return year;
  }

  public void setYear(Integer year) {
    this.year = year;
  }

  public Start month(Integer month) {
    this.month = month;
    return this;
  }

   /**
   * Get month
   * @return month
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getMonth() {
    return month;
  }

  public void setMonth(Integer month) {
    this.month = month;
  }

  public Start day(Integer day) {
    this.day = day;
    return this;
  }

   /**
   * Get day
   * @return day
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getDay() {
    return day;
  }

  public void setDay(Integer day) {
    this.day = day;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Start start = (Start) o;
    return Objects.equals(this.year, start.year) &&
        Objects.equals(this.month, start.month) &&
        Objects.equals(this.day, start.day);
  }

  @Override
  public int hashCode() {
    return Objects.hash(year, month, day);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Start {\n");
    
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
    sb.append("    month: ").append(toIndentedString(month)).append("\n");
    sb.append("    day: ").append(toIndentedString(day)).append("\n");
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

