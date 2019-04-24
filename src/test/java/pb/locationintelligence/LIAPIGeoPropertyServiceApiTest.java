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


package pb.locationintelligence;

import pb.ApiException;
import pb.locationintelligence.model.GeoPropertyResponse;
import pb.locationintelligence.model.GeoPropertyAddressRequest;
import pb.locationintelligence.model.GeoPropertyResponses;
import pb.locationintelligence.model.GeoPropertyPBKeyResponse;
import pb.locationintelligence.model.GeoPropertyPBKeyRequest;
import pb.locationintelligence.model.GeoPropertyPBKeyResponses;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LIAPIGeoPropertyServiceApi
 */
public class LIAPIGeoPropertyServiceApiTest {

    private final LIAPIGeoPropertyServiceApi api = new LIAPIGeoPropertyServiceApi();

    
    /**
     * Gets GeoPropertyResponse
     *
     * Gets GeoPropertyResponse
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getGeoPropertyByAddressTest() throws ApiException {
        String address = null;
        // GeoPropertyResponse response = api.getGeoPropertyByAddress(address);

        // TODO: test validations
    }
    
    /**
     * Gets GeoPropertyResponses
     *
     * Gets GeoPropertyResponses
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getGeoPropertyByAddressBatchTest() throws ApiException {
        GeoPropertyAddressRequest body = null;
        // GeoPropertyResponses response = api.getGeoPropertyByAddressBatch(body);

        // TODO: test validations
    }
    
    /**
     * Gets GeoPropertyResponse
     *
     * Gets GeoPropertyResponse
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getGeoPropertyByPBKeyTest() throws ApiException {
        String pbKey = null;
        // GeoPropertyPBKeyResponse response = api.getGeoPropertyByPBKey(pbKey);

        // TODO: test validations
    }
    
    /**
     * Gets GeoPropertyResponses
     *
     * Gets GeoPropertyResponses
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getGeoPropertyByPBKeyBatchTest() throws ApiException {
        GeoPropertyPBKeyRequest body = null;
        // GeoPropertyPBKeyResponses response = api.getGeoPropertyByPBKeyBatch(body);

        // TODO: test validations
    }
    
}
