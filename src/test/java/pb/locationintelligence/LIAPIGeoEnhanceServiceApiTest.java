/**
 * Location Intelligence APIs
 * Incorporate our extensive geodata into everyday applications, business processes and workflows.
 *
 * OpenAPI spec version: 3.0.0
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
import pb.locationintelligence.model.Locations;
import pb.locationintelligence.model.PlaceByLocations;
import pb.locationintelligence.model.Timezone;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LIAPIGeoEnhanceServiceApi
 */
public class LIAPIGeoEnhanceServiceApiTest {

    private final LIAPIGeoEnhanceServiceApi api = new LIAPIGeoEnhanceServiceApi();

    
    /**
     * Address By Location.
     *
     * This service accepts longitude and latitude as input and returns an address for that location.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAddressTest() throws ApiException {
        String latitude = null;
        String longitude = null;
        String searchRadius = null;
        String searchRadiusUnit = null;
        // Locations response = api.getAddress(latitude, longitude, searchRadius, searchRadiusUnit);

        // TODO: test validations
    }
    
    /**
     * Points Of Interest By Location.
     *
     * Identifies and retrieves Points of Interest that exist around a specific location (ordered by distance from the location).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEntityByLocationTest() throws ApiException {
        String longitude = null;
        String latitude = null;
        String brandName = null;
        String category = null;
        String maxCandidates = null;
        String searchRadius = null;
        String searchRadiusUnit = null;
        String searchDataset = null;
        String searchPriority = null;
        String travelTime = null;
        String travelTimeUnit = null;
        String travelDistance = null;
        String travelDistanceUnit = null;
        String mode = null;
        // Locations response = api.getEntityByLocation(longitude, latitude, brandName, category, maxCandidates, searchRadius, searchRadiusUnit, searchDataset, searchPriority, travelTime, travelTimeUnit, travelDistance, travelDistanceUnit, mode);

        // TODO: test validations
    }
    
    /**
     * Place By Location.
     *
     * Identifies and retrieves the nearest neighborhood around a specific location. This GeoEnhance service accepts latitude &amp; longitude as input and returns a place name.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPlaceByLocationTest() throws ApiException {
        String longitude = null;
        String latitude = null;
        String levelHint = null;
        // PlaceByLocations response = api.getPlaceByLocation(longitude, latitude, levelHint);

        // TODO: test validations
    }
    
    /**
     * Timezone By Location.
     *
     * Identifies and retrieves the local time of any location in the world for a given latitude, longitude and time. The input and retrieved time format is in milliseconds.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTimezoneByLocationTest() throws ApiException {
        String timestamp = null;
        String longitude = null;
        String latitude = null;
        // Timezone response = api.getTimezoneByLocation(timestamp, longitude, latitude);

        // TODO: test validations
    }
    
}
