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


package pb.locationintelligence;

import pb.ApiException;
import pb.locationintelligence.model.GeoRouteResponse;
import pb.locationintelligence.model.TravelCostMatrixResponse;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LIAPIGeoRouteServiceApi
 */
public class LIAPIGeoRouteServiceApiTest {

    private final LIAPIGeoRouteServiceApi api = new LIAPIGeoRouteServiceApi();

    
    /**
     * Gets Route by Address
     *
     * Routing Directions for Single and Multiple Origin &amp; Destination Inputs. Accepts addresses as input and Returns Point-to-Point and Multi-Point travel directions by various travel modes.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRouteByAddressTest() throws ApiException {
        String startAddress = null;
        String endAddress = null;
        String db = null;
        String country = null;
        String intermediateAddresses = null;
        String oip = null;
        String destinationSrs = null;
        String optimizeBy = null;
        String returnDistance = null;
        String distanceUnit = null;
        String returnTime = null;
        String timeUnit = null;
        String language = null;
        String directionsStyle = null;
        String segmentGeometryStyle = null;
        String primaryNameOnly = null;
        String majorRoads = null;
        String historicTrafficTimeBucket = null;
        String returnDirectionGeometry = null;
        // GeoRouteResponse response = api.getRouteByAddress(startAddress, endAddress, db, country, intermediateAddresses, oip, destinationSrs, optimizeBy, returnDistance, distanceUnit, returnTime, timeUnit, language, directionsStyle, segmentGeometryStyle, primaryNameOnly, majorRoads, historicTrafficTimeBucket, returnDirectionGeometry);

        // TODO: test validations
    }
    
    /**
     * Gets Route by Location
     *
     * Returns the fastest or shortest route based on a starting and ending location with optional intermediate points as input.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRouteByLocationTest() throws ApiException {
        String startPoint = null;
        String endPoint = null;
        String db = null;
        String intermediatePoints = null;
        String oip = null;
        String destinationSrs = null;
        String optimizeBy = null;
        String returnDistance = null;
        String distanceUnit = null;
        String returnTime = null;
        String timeUnit = null;
        String language = null;
        String directionsStyle = null;
        String segmentGeometryStyle = null;
        String primaryNameOnly = null;
        String majorRoads = null;
        String historicTrafficTimeBucket = null;
        String returnDirectionGeometry = null;
        // GeoRouteResponse response = api.getRouteByLocation(startPoint, endPoint, db, intermediatePoints, oip, destinationSrs, optimizeBy, returnDistance, distanceUnit, returnTime, timeUnit, language, directionsStyle, segmentGeometryStyle, primaryNameOnly, majorRoads, historicTrafficTimeBucket, returnDirectionGeometry);

        // TODO: test validations
    }
    
    /**
     * Gets Cost Matrix by Address
     *
     * Calculates the travel time and distances between an array of start and end addresses.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTravelCostMatrixByAddressTest() throws ApiException {
        String startAddresses = null;
        String endAddresses = null;
        String db = null;
        String country = null;
        String optimizeBy = null;
        String returnDistance = null;
        String destinationSrs = null;
        String distanceUnit = null;
        String returnTime = null;
        String timeUnit = null;
        String majorRoads = null;
        String returnOptimalRoutesOnly = null;
        String historicTrafficTimeBucket = null;
        // TravelCostMatrixResponse response = api.getTravelCostMatrixByAddress(startAddresses, endAddresses, db, country, optimizeBy, returnDistance, destinationSrs, distanceUnit, returnTime, timeUnit, majorRoads, returnOptimalRoutesOnly, historicTrafficTimeBucket);

        // TODO: test validations
    }
    
    /**
     * Gets Cost Matrix by Location
     *
     * GeoRoute&#39;s &#39;Travel Cost Matrix By Location&#39; service calculates the travel time and distances between an array of start and end points based on location coordinates.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTravelCostMatrixByLocationTest() throws ApiException {
        String startPoints = null;
        String endPoints = null;
        String db = null;
        String optimizeBy = null;
        String returnDistance = null;
        String destinationSrs = null;
        String distanceUnit = null;
        String returnTime = null;
        String timeUnit = null;
        String majorRoads = null;
        String returnOptimalRoutesOnly = null;
        String historicTrafficTimeBucket = null;
        // TravelCostMatrixResponse response = api.getTravelCostMatrixByLocation(startPoints, endPoints, db, optimizeBy, returnDistance, destinationSrs, distanceUnit, returnTime, timeUnit, majorRoads, returnOptimalRoutesOnly, historicTrafficTimeBucket);

        // TODO: test validations
    }
    
}
