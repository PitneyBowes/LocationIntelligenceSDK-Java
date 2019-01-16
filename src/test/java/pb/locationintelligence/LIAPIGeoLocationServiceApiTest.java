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
import pb.locationintelligence.model.GeoLocationDeviceSatus;
import pb.locationintelligence.model.GeoLocationFixedLine;
import pb.locationintelligence.model.GeoLocationIpAddr;
import pb.locationintelligence.model.GeoLocationAccessPoint;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LIAPIGeoLocationServiceApi
 */
public class LIAPIGeoLocationServiceApiTest {

    private final LIAPIGeoLocationServiceApi api = new LIAPIGeoLocationServiceApi();

    
    /**
     * Location By Device Status.
     *
     * This service accepts a phone number as input and returns details distinguishing landline and wireless numbers and also checks if a wireless number can be located.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDeviceStatusTest() throws ApiException {
        String deviceId = null;
        String includeNetworkInfo_ = null;
        // GeoLocationDeviceSatus response = api.getDeviceStatus(deviceId, includeNetworkInfo_);

        // TODO: test validations
    }
    
    /**
     * Location By Fixed Line Network.
     *
     * This service accepts a fixed line phone number and returns the location coordinates corresponding to that phone number.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLocationByFixedLineTest() throws ApiException {
        String deviceId = null;
        // GeoLocationFixedLine response = api.getLocationByFixedLine(deviceId);

        // TODO: test validations
    }
    
    /**
     * Location By IP Address.
     *
     * This service accepts an IP address and returns the location coordinates corresponding to that IP address.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLocationByIPAddressTest() throws ApiException {
        String ipAddress = null;
        // GeoLocationIpAddr response = api.getLocationByIPAddress(ipAddress);

        // TODO: test validations
    }
    
    /**
     * Location by WiFi Access Point.
     *
     * This service accepts a WiFi access point MAC address and returns the location coordinates corresponding to that access point. Only mac or accessPoint are mandatory parameters (one of them has to be provided), rest are optional.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLocationByWiFiAccessPointTest() throws ApiException {
        String mac = null;
        String ssid = null;
        String rsid = null;
        String speed = null;
        String accessPoint = null;
        // GeoLocationAccessPoint response = api.getLocationByWiFiAccessPoint(mac, ssid, rsid, speed, accessPoint);

        // TODO: test validations
    }
    
}
