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
import pb.locationintelligence.model.GeoIdentityResponse;
import pb.locationintelligence.model.Identity;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LIAPIGeoIdentityServiceApi
 */
public class LIAPIGeoIdentityServiceApiTest {

    private final LIAPIGeoIdentityServiceApi api = new LIAPIGeoIdentityServiceApi();

    
    /**
     * Gets GeoIdentityResponse
     *
     * Gets GeoIdentityResponse
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getIdentityByAddressTest() throws ApiException {
        String address = null;
        String givenName = null;
        String familyName = null;
        String confidence = null;
        String maxCandidates = null;
        String includeNeighborhoodDetails = null;
        // GeoIdentityResponse response = api.getIdentityByAddress(address, givenName, familyName, confidence, maxCandidates, includeNeighborhoodDetails);

        // TODO: test validations
    }
    
    /**
     * Gets Identity
     *
     * Gets Identity
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getIdentityByEmailTest() throws ApiException {
        String email = null;
        String confidence = null;
        // Identity response = api.getIdentityByEmail(email, confidence);

        // TODO: test validations
    }
    
    /**
     * Gets GeoIdentityResponse
     *
     * Gets GeoIdentityResponse
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getIdentityByPBKeyTest() throws ApiException {
        String pbKey = null;
        String givenName = null;
        String familyName = null;
        String confidence = null;
        String maxCandidates = null;
        String includeNeighborhoodDetails = null;
        // GeoIdentityResponse response = api.getIdentityByPBKey(pbKey, givenName, familyName, confidence, maxCandidates, includeNeighborhoodDetails);

        // TODO: test validations
    }
    
    /**
     * Gets Identity
     *
     * Gets Identity
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getIdentityByTwitterTest() throws ApiException {
        String twitter = null;
        String confidence = null;
        // Identity response = api.getIdentityByTwitter(twitter, confidence);

        // TODO: test validations
    }
    
}
