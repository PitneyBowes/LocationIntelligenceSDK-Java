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
package com.pb.locationintelligence.geosearch;

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
import com.pb.locationintelligence.manager.LIServiceManager;
import com.pb.locationintelligence.oauth.BasicAuthServiceImpl;

/**
 * Test Class for GeoSearch SDK, these are integration test case which will hit the qa server for verification.
 */
public class GeoSearchServiceTest {
    private static final Logger _LOG = LoggerFactory.getLogger(GeoSearchServiceTest.class);

    LIServiceManager mLI;
    GeoSearchService geoSearchService;
    private static String TEST_URL = "";
    private static String TEST_TOKEN = "";

    @BeforeClass
    public static void loadProperties() {
        Properties props = new Properties();
        try {
            InputStream fileIn = GeoSearchServiceTest.class.getResourceAsStream("/test.properties");
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
        geoSearchService = new GeoSearchServiceImpl();
    }


    @Test
    public void testGeoSearch() {
        try {
            Locations response = geoSearchService.geoSearch("times sq", 40.761819, -73.997533);
            assertTrue(response != null);
        } catch (Exception e) {
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testGeoSearchWithInvalidParams() {
        try {
            geoSearchService.geoSearch("times sq", 240.761819, -73.997533);
        } catch (SdkException e) {
            TestUtility.verifyException(e);
        }
    }

    @Test
    public void testGeoSearchWithAllParams() {
        try {
            Locations response = geoSearchService.geoSearch("times sq", 40.761819, -73.997533, 1.00f, "MILES", 5);
            assertTrue(response != null);
        } catch (Exception e) {
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testGeoSearchWithInvalidRequest() {
        try {
            geoSearchService.geoSearch("times sq", 440.761819, -743.997533, 1.00f, "MILES_AA", 59);
        } catch (SdkException e) {
            TestUtility.verifyException(e);
        }
    }

    @Test
    public void testGeoSearchAsync() throws InterruptedException {
        final Locations[] locations = new Locations[1];
        geoSearchService.geoSearch("times sq", 40.761819, -73.997533, TestUtility.getCallBack(locations, null));
        Thread.sleep(3000);
        assertTrue(locations[0] != null);
    }

    @Test
    public void testGeoSearchWithInvalidParamsAsync() throws InterruptedException {
        final SdkException[] sdkException = new SdkException[1];
        geoSearchService.geoSearch("times sq", 240.761819, -73.997533, TestUtility.getCallBack(new Locations[1], sdkException));
        Thread.sleep(3000);
        TestUtility.verifyException(sdkException[0]);
    }

    @Test
    public void testGeoSearchWithAllParamsAsync() throws InterruptedException {
        final Locations[] locations = new Locations[1];
        geoSearchService.geoSearch("times sq", 40.761819, -73.997533, 1.00f, "MILES", 5, TestUtility.getCallBack(locations, null));
        Thread.sleep(3000);
        assertTrue(locations[0] != null);
    }

    @Test
    public void testGeoSearchWithInvalidRequestAsync() throws InterruptedException {
        final SdkException[] sdkException = new SdkException[1];
        geoSearchService.geoSearch("times sq", 440.761819, -743.997533, 1.00f, "MILES_AA", 59, TestUtility.getCallBack(new Locations[1], sdkException));
        Thread.sleep(3000);
        TestUtility.verifyException(sdkException[0]);
    }
    
    @Test
  	public void testToCompareSDKAndAPIResponseOfGeoSearch() throws SdkException, JSONException  {
    	 Map<String, Object> keyValueMap = new HashMap<String, Object>();
         keyValueMap.put("searchText", "times sq");
         keyValueMap.put("latitude", 40.761819);
         keyValueMap.put("longitude", -73.997533);
  		 String jsonResponseFromAPI = TestUtility.getJSONResponseFromAPI(keyValueMap,TEST_URL,"geosearch/services/geosearch/v1/locations");
         Gson gson = new Gson();
         Locations response = geoSearchService.geoSearch("times sq", 40.761819, -73.997533);
         String jsonResponseFromSDK = gson.toJson(response);
  	     JSONAssert.assertEquals(jsonResponseFromAPI,jsonResponseFromSDK, JSONCompareMode.STRICT);
  	}

    @After
    public void tearDown() throws Exception {
        mLI = null;
        geoSearchService = null;
    }
}
