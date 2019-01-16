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
import pb.locationintelligence.model.Dictionary;


/**
 * ConfiguredDictionaryResponse
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2019-01-15T12:57:00.076+05:30")
public class ConfiguredDictionaryResponse   {
  @SerializedName("dictionaries")
  private List<Dictionary> dictionaries = new ArrayList<Dictionary>();

  public ConfiguredDictionaryResponse dictionaries(List<Dictionary> dictionaries) {
    this.dictionaries = dictionaries;
    return this;
  }

   /**
   * Get dictionaries
   * @return dictionaries
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<Dictionary> getDictionaries() {
    return dictionaries;
  }

  public void setDictionaries(List<Dictionary> dictionaries) {
    this.dictionaries = dictionaries;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfiguredDictionaryResponse configuredDictionaryResponse = (ConfiguredDictionaryResponse) o;
    return Objects.equals(this.dictionaries, configuredDictionaryResponse.dictionaries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dictionaries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfiguredDictionaryResponse {\n");
    
    sb.append("    dictionaries: ").append(toIndentedString(dictionaries)).append("\n");
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

