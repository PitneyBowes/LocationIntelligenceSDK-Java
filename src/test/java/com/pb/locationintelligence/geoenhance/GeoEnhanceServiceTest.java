/*******************************************************************************
 * Copyright 2016 Pitney Bowes Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  
 *  See the License for the specific language governing permissions and limitations under the License.
 *******************************************************************************/
package com.pb.locationintelligence.geoenhance;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.json.JSONException;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;
import com.pb.locationintelligence.TestUtility;
import com.pb.locationintelligence.common.model.Locations;
import com.pb.locationintelligence.exception.SdkException;
import com.pb.locationintelligence.geoenhance.model.TimezoneResponse;
import com.pb.locationintelligence.manager.LIServiceManager;
import com.pb.locationintelligence.oauth.BasicAuthServiceImpl;

/**
 * Test Class for GeoEnhance SDK, these are integration test case which will hit
 * the qa server for verification.
 */
public class GeoEnhanceServiceTest {
	private static final Logger _LOG = LoggerFactory.getLogger(GeoEnhanceServiceTest.class);

	LIServiceManager mLI;
	GeoEnhanceService geoEnhanceService;
	private static String TEST_URL = "";
	private static String TEST_TOKEN = "";

	@BeforeClass
	public static void loadProperties() {
		Properties props = new Properties();
		try {
			InputStream fileIn = GeoEnhanceServiceTest.class.getResourceAsStream("/test.properties");
			props.load(fileIn);
			TEST_URL = props.getProperty("TEST_URL");
			TEST_TOKEN = props.getProperty("TEST_TOKEN");
			fileIn.close();
		} catch (Exception e) {
			_LOG.info("Unable to load test.properties");
		}
	}

	@Before
	public void setUp() throws Exception {
		mLI = LIServiceManager.getInstance(new BasicAuthServiceImpl(TEST_TOKEN, TEST_URL));
		geoEnhanceService = new GeoEnhanceServiceImpl();
	}

	@Test
	public void testGetAddress() {
		try {
			Locations response = geoEnhanceService.getAddress(34.59667, -86.96556, 5280f, "FEET");
			assertTrue(response != null);
		} catch (Exception e) {
			fail("Unexpected Exception");
		}
	}

	@Test
	public void testGetAddressWithInvalidParams() {
		try {
			geoEnhanceService.getAddress(334.59667, -886.96556, 5280f, "FEET_ABC");
		} catch (SdkException e) {
            TestUtility.verifyException(e);
		}
	}

	@Test
	public void testGetPlaceByLocation() {
		try {
			Locations response = geoEnhanceService.getPlace(34.59667, -86.96556, 1);
			assertTrue(response.getLocation()[0].getPlace() != null);
		} catch (Exception e) {
			fail("Unexpected Exception");
		}
	}

	@Test
	public void testGetPlaceByLocationWithNoLevelHint() {
		try {
			Locations response = geoEnhanceService.getPlace(34.59667, -86.96556, null);
			assertTrue(response.getLocation()[0].getPlace() != null);
		} catch (Exception e) {
			fail("Unexpected Exception");
		}
	}

	@Test
	public void testGetPlaceByLocationWithInvalidParams() {
		try {
			geoEnhanceService.getPlace(234.59667, -886.96556, null);
		} catch (SdkException e) {
            TestUtility.verifyException(e);
		}
	}

	@Test
	public void testGetPOI() {
		try {
			Locations response = geoEnhanceService.getPOI(42.5309, -73.6572, "1023", 10, 10560f, "FEET", "PBData", "N");
			assertTrue(response.getLocation()[0].getPoi() != null);
		} catch (Exception e) {
			fail("Unexpected Exception");
		}
	}

	@Test
	public void testGetPOIWithOnlyLocation() {
		try {
			Locations response = geoEnhanceService.getPOI(42.5309, -73.6572, null, null, null, null, null, null);
			assertTrue(response.getLocation()[0].getPoi() != null);
		} catch (Exception e) {
			fail("Unexpected Exception");
		}
	}

	@Test
	public void testGetPOIWithInvalidParams() {
		try {
			geoEnhanceService.getPOI(442.5309, -793.6572, null, null, null, "FEET_ABC", null, "Z");
		} catch (SdkException e) {
			TestUtility.verifyException(e);
		}
	}

	@Test
	public void testGetAddressAsync() throws InterruptedException {
		final Locations[] locations = new Locations[1];
		geoEnhanceService.getAddress(34.59667, -86.96556, 5280f, "FEET", TestUtility.getCallBack(locations, null));
		Thread.sleep(3000);
		assertTrue(locations[0] != null);
	}

	@Test
	public void testGetAddressWithInvalidParamsAsync() throws InterruptedException {
		final SdkException[] sdkException = new SdkException[1];
		geoEnhanceService.getAddress(334.59667, -886.96556, 5280f, "FEET_ABC", TestUtility.getCallBack(new Locations[1], sdkException));
		Thread.sleep(3000);
		TestUtility.verifyException(sdkException[0]);
	}

	@Test
	public void testGetPlaceByLocationAsync() throws InterruptedException {
		final Locations[] locations = new Locations[1];
		geoEnhanceService.getPlace(34.59667, -86.96556, 1, TestUtility.getCallBack(locations, null));
		Thread.sleep(3000);
		assertTrue(locations[0] != null);
	}

	@Test
	public void testGetPlaceByLocationWithNoLevelHintAsync() throws InterruptedException {
		final Locations[] locations = new Locations[1];
		geoEnhanceService.getPlace(34.59667, -86.96556, null, TestUtility.getCallBack(locations, null));
		Thread.sleep(3000);
		assertTrue(locations[0] != null);
	}

	@Test
	public void testGetPlaceByLocationWithInvalidParamsAsync() throws InterruptedException {
		final SdkException[] sdkException = new SdkException[1];
		geoEnhanceService.getPlace(234.59667, -886.96556, null, TestUtility.getCallBack(new Locations[1], sdkException));
		Thread.sleep(3000);
		TestUtility.verifyException(sdkException[0]);
	}

	@Test
	public void testGetPOIAsync() throws InterruptedException {
		final Locations[] locations = new Locations[1];
		geoEnhanceService.getPOI(42.5309, -73.6572, "1023", 10, 10560f, "FEET", "PBData", "N", TestUtility.getCallBack(locations, null));
		Thread.sleep(3000);
		assertTrue(locations[0] != null);
	}

	@Test
	public void testGetPOIWithOnlyLocationAsync() throws InterruptedException {
		final Locations[] locations = new Locations[1];
		geoEnhanceService.getPOI(42.5309, -73.6572, null, null, null, null, null, null, TestUtility.getCallBack(locations, null));
		Thread.sleep(3000);
		assertTrue(locations[0] != null);
	}

	@Test
	public void testGetPOIWithInvalidParamsAsync() throws InterruptedException {
        final SdkException[] sdkException = new SdkException[1];
        geoEnhanceService.getPOI(442.5309, -793.6572, null, null, null, "FEET_ABC", null, "Z", TestUtility.getCallBack(new Locations[1], sdkException));
        Thread.sleep(3000);
        TestUtility.verifyException(sdkException[0]);
	}
	
	@Test
	public void testGetTimezoneByLocationSync() {
		try {
			TimezoneResponse response = geoEnhanceService.getTimezone(1434526026157L, 42.5309D,-73.6572D);
			assertTrue(response.getTimezoneName() != null);
		} catch (Exception e) {
			fail("Unexpected Exception");
		}
	}
	
	@Test
	public void testGetTimezoneByLocationSyncWithInvalidParam(){
		try {
			geoEnhanceService.getTimezone(null, 42.5309D, -73.6572D);
		} catch (SdkException e) {
			TestUtility.verifyException(e);
		}
	}
	
	@Test
	public void testGetTimezoneByLocationASync() throws InterruptedException{
		final TimezoneResponse[] timezone = new TimezoneResponse[1];
		geoEnhanceService.getTimezone(1434526026157L, 42.5309D, -73.6572D, TestUtility.getCallBack(timezone, null));
		Thread.sleep(3000);
		assertTrue(timezone[0] != null);
	}
	
	@Test
	public void testGetTimezoneByLocationASyncWithInvalidParam() throws InterruptedException{
		final SdkException[] sdkException = new SdkException[1];
        geoEnhanceService.getTimezone(null, 42.5309D, -73.6572D, TestUtility.getCallBack(new TimezoneResponse[1], sdkException));
        Thread.sleep(3000);
        TestUtility.verifyException(sdkException[0]);
	}
	
	 @Test
	   	public void testToCompareSDKAndAPIResponseOfGeoEnhanceByAddress() throws SdkException, JSONException  {
		 	Map<String, Object> keyValueMap = new HashMap<String, Object>();
			keyValueMap.put("latitude", 34.59667);
			keyValueMap.put("longitude", -86.96556);
			keyValueMap.put("searchRadius", 5280f);
			keyValueMap.put("searchRadiusUnit", "FEET");
	   		String jsonResponseFromAPI = TestUtility.getJSONResponseFromAPI(keyValueMap,TEST_URL,"geoapis/services/geoenhance/v1/address/bylocation");
	        Gson gson = new Gson();
	        Locations response = geoEnhanceService.getAddress(34.59667, -86.96556, 5280f, "FEET");
	        String jsonResponseFromSDK = gson.toJson(response);
	   	    JSONAssert.assertEquals(jsonResponseFromAPI,jsonResponseFromSDK, JSONCompareMode.STRICT);
	   	}

	   	@Test
	   	public void testToCompareSDKAndAPIResponseOfGeoEnhanceByLocation() throws SdkException, JSONException  {
	   		Map<String, Object> keyValueMap = new HashMap<String, Object>();
			keyValueMap.put("latitude", 34.59667);
			keyValueMap.put("longitude", -86.96556);
			keyValueMap.put("levelHint", 1);
	   		String jsonResponseFromAPI = TestUtility.getJSONResponseFromAPI(keyValueMap,TEST_URL,"geoapis/services/geoenhance/v1/place/bylocation");
	        Gson gson = new Gson();
	        Locations response = geoEnhanceService.getPlace(34.59667, -86.96556, 1);
	        String jsonResponseFromSDK = gson.toJson(response);
	   	    JSONAssert.assertEquals(jsonResponseFromAPI,jsonResponseFromSDK, JSONCompareMode.STRICT);
	   	}
	   	
	    @Test
	   	public void testToCompareSDKAndAPIResponseOfGeoEnhancePOI() throws SdkException, JSONException  {
	    	Map<String, Object> keyValueMap = new HashMap<String, Object>();
			keyValueMap.put("latitude", 42.5309);
			keyValueMap.put("longitude", -73.6572);
			keyValueMap.put("category", "1023");
			keyValueMap.put("maxCandidates", 10);
			keyValueMap.put("searchRadius", 10560f);
			keyValueMap.put("searchRadiusUnit", "FEET");
			keyValueMap.put("searchDataset", "PBData");
			keyValueMap.put("searchPriority",  "N");
	   		String jsonResponseFromAPI = TestUtility.getJSONResponseFromAPI(keyValueMap,TEST_URL,"geoapis/services/geoenhance/v1/poi/bylocation");
	        Gson gson = new Gson();
	         
	        Locations response = geoEnhanceService.getPOI(42.5309, -73.6572, "1023", 10, 10560f, "FEET", "PBData", "N");
	        String jsonResponseFromSDK = gson.toJson(response);
	   	    JSONAssert.assertEquals(jsonResponseFromAPI,jsonResponseFromSDK, JSONCompareMode.STRICT);
	   	}

	   	@Test
	   	public void testToCompareSDKAndAPIResponseOfGeoEnhanceTimezone() throws SdkException, JSONException  {
	   		Map<String, Object> keyValueMap = new HashMap<String, Object>();
			keyValueMap.put("latitude", 42.5309D);
			keyValueMap.put("longitude", -73.6572D);
			keyValueMap.put("timestamp", 1434526026157L);
	   		String jsonResponseFromAPI = TestUtility.getJSONResponseFromAPI(keyValueMap,TEST_URL,"geoapis/services/geoenhance/v1/timezone/bylocation");
	        Gson gson = new Gson();
	        TimezoneResponse response = geoEnhanceService.getTimezone(1434526026157L, 42.5309D, -73.6572D);
	        String jsonResponseFromSDK = gson.toJson(response);
	   	    JSONAssert.assertEquals(jsonResponseFromAPI,jsonResponseFromSDK, JSONCompareMode.STRICT);
	   	}
	
	
	@After
	public void tearDown() throws Exception {
		mLI = null;
		geoEnhanceService = null;
	}
}
