/**
 * Location Intelligence APIs
 * Incorporate our extensive geodata into everyday applications, business processes and workflows.
 *
 * OpenAPI spec version: 8.5.0
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
import pb.locationintelligence.model.BasicBoundaryAddress;
import pb.locationintelligence.model.BasicBoundary;
import pb.locationintelligence.model.PoiBoundary;
import pb.locationintelligence.model.POIBoundaryResponse;
import pb.locationintelligence.model.POIBoundaryAddressRequest;
import pb.locationintelligence.model.POIBoundaryLocationRequest;
import pb.locationintelligence.model.TravelBoundaries;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LIAPIGeoZoneServiceApi
 */
public class LIAPIGeoZoneServiceApiTest {

    private final LIAPIGeoZoneServiceApi api = new LIAPIGeoZoneServiceApi();

    
    /**
     * Gets Basic Boundary by Address
     *
     * Gets Basic Boundary by Address
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBasicBoundaryByAddressTest() throws ApiException {
        String address = null;
        String distance = null;
        String country = null;
        String distanceUnit = null;
        String resolution = null;
        String responseSrs = null;
        // BasicBoundaryAddress response = api.getBasicBoundaryByAddress(address, distance, country, distanceUnit, resolution, responseSrs);

        // TODO: test validations
    }
    
    /**
     * Gets Basic Boundary by Location
     *
     * Gets Basic Boundary by Location
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBasicBoundaryByLocationTest() throws ApiException {
        String latitude = null;
        String longitude = null;
        String distance = null;
        String distanceUnit = null;
        String resolution = null;
        String responseSrs = null;
        String srsName = null;
        // BasicBoundary response = api.getBasicBoundaryByLocation(latitude, longitude, distance, distanceUnit, resolution, responseSrs, srsName);

        // TODO: test validations
    }
    
    /**
     * Get Point of Interests Boundary by Address
     *
     * Gets Point of Interests Boundary by Address
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPOIBoundaryByAddressTest() throws ApiException {
        String address = null;
        String categoryCode = null;
        String sicCode = null;
        String naicsCode = null;
        // PoiBoundary response = api.getPOIBoundaryByAddress(address, categoryCode, sicCode, naicsCode);

        // TODO: test validations
    }
    
    /**
     * Batch method for getting Point of Interests Boundary by Address
     *
     * Batch method for getting Point of Interests Boundary by Address
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPOIBoundaryByAddressBatchTest() throws ApiException {
        POIBoundaryAddressRequest body = null;
        // POIBoundaryResponse response = api.getPOIBoundaryByAddressBatch(body);

        // TODO: test validations
    }
    
    /**
     * Get Point of Interests Boundary by Location
     *
     * Get Point of Interests Boundary by Location
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPOIBoundaryByLocationTest() throws ApiException {
        String latitude = null;
        String longitude = null;
        String categoryCode = null;
        String sicCode = null;
        String naicsCode = null;
        // PoiBoundary response = api.getPOIBoundaryByLocation(latitude, longitude, categoryCode, sicCode, naicsCode);

        // TODO: test validations
    }
    
    /**
     * Batch method for getting Point of Interests Boundary by Location
     *
     * Batch method for getting Point of Interests Boundary by Location
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPOIBoundaryByLocationBatchTest() throws ApiException {
        POIBoundaryLocationRequest body = null;
        // POIBoundaryResponse response = api.getPOIBoundaryByLocationBatch(body);

        // TODO: test validations
    }
    
    /**
     * Gets travel Boundary by Distance
     *
     * Returns the travel boundary based on travel distance.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTravelBoundaryByDistanceTest() throws ApiException {
        String costs = null;
        String point = null;
        String address = null;
        String costUnit = null;
        String db = null;
        String country = null;
        String maxOffroadDistance = null;
        String maxOffroadDistanceUnit = null;
        String destinationSrs = null;
        String majorRoads = null;
        String returnHoles = null;
        String returnIslands = null;
        String simplificationFactor = null;
        String bandingStyle = null;
        String historicTrafficTimeBucket = null;
        String defaultAmbientSpeed = null;
        String ambientSpeedUnit = null;
        // TravelBoundaries response = api.getTravelBoundaryByDistance(costs, point, address, costUnit, db, country, maxOffroadDistance, maxOffroadDistanceUnit, destinationSrs, majorRoads, returnHoles, returnIslands, simplificationFactor, bandingStyle, historicTrafficTimeBucket, defaultAmbientSpeed, ambientSpeedUnit);

        // TODO: test validations
    }
    
    /**
     * Gets travel Boundary by Time
     *
     * Travel boundary based on travel time.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTravelBoundaryByTimeTest() throws ApiException {
        String costs = null;
        String point = null;
        String address = null;
        String costUnit = null;
        String db = null;
        String country = null;
        String maxOffroadDistance = null;
        String maxOffroadDistanceUnit = null;
        String destinationSrs = null;
        String majorRoads = null;
        String returnHoles = null;
        String returnIslands = null;
        String simplificationFactor = null;
        String bandingStyle = null;
        String historicTrafficTimeBucket = null;
        String defaultAmbientSpeed = null;
        String ambientSpeedUnit = null;
        // TravelBoundaries response = api.getTravelBoundaryByTime(costs, point, address, costUnit, db, country, maxOffroadDistance, maxOffroadDistanceUnit, destinationSrs, majorRoads, returnHoles, returnIslands, simplificationFactor, bandingStyle, historicTrafficTimeBucket, defaultAmbientSpeed, ambientSpeedUnit);

        // TODO: test validations
    }
    
}
