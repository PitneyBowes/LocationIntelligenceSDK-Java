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
package com.pb.locationintelligence.geo911;

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
import com.pb.locationintelligence.exception.SdkException;
import com.pb.locationintelligence.geo911.model.PsapResponse;
import com.pb.locationintelligence.manager.LIServiceManager;
import com.pb.locationintelligence.oauth.BasicAuthServiceImpl;

/**
 * Test Class for Geo911 SDK, these are integration test case which will hit the qa server for verification.
 */
public class Geo911ServiceTest {
    private static final Logger _LOG = LoggerFactory.getLogger(Geo911ServiceTest.class);

    LIServiceManager mLI;
    Geo911Service geo911Service;
    private static String TEST_URL = "";
    private static String TEST_TOKEN = "";

    @BeforeClass
    public static void loadProperties() {
        Properties props = new Properties();
        try {
            InputStream fileIn = Geo911ServiceTest.class.getResourceAsStream("/test.properties");
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
        geo911Service = new Geo911ServiceImpl();
    }


    @Test
    public void test911ByAddress() {
        try {
            PsapResponse response = geo911Service.getPSAPByAddress("4750 Walnut St, Boulder, CO");
            assertTrue(response != null);
        } catch (Exception e) {
            fail("Unexpected Exception");
        }
    }

    @Test
    public void test911ByAddressWithInvalidParams() {
        try {
            geo911Service.getPSAPByAddress(null);
        } catch (SdkException e) {
            TestUtility.verifyException(e);
        }
    }

    @Test
    public void test911ByLocation() {
        try {
            PsapResponse response = geo911Service.getPSAPByLocation(35.0118, -81.9571);
            assertTrue(response != null);
        } catch (Exception e) {
            fail("Unexpected Exception");
        }
    }

    @Test
    public void test911ByLocationWithInvalidParams() {
        try {
            geo911Service.getPSAPByLocation(335.0118, -811.9571);
        } catch (SdkException e) {
            TestUtility.verifyException(e);
        }
    }

    @Test
    public void test911ByAddressAsync() throws InterruptedException {
        final PsapResponse[] psapResponse = new PsapResponse[1];
        geo911Service.getPSAPByAddress("4750 Walnut St, Boulder, CO", TestUtility.getCallBack(psapResponse, null));
        Thread.sleep(3000);
        assertTrue(psapResponse[0] != null);
    }

    @Test
    public void test911ByAddressWithInvalidParamsAsync() throws InterruptedException {
        final SdkException[] sdkException = new SdkException[1];
        geo911Service.getPSAPByAddress(null, TestUtility.getCallBack(new PsapResponse[1], sdkException));
        Thread.sleep(3000);
        TestUtility.verifyException(sdkException[0]);
    }

    @Test
    public void test911ByLocationAsync() throws InterruptedException {
        final PsapResponse[] psapResponse = new PsapResponse[1];
        geo911Service.getPSAPByLocation(35.0118, -81.9571, TestUtility.getCallBack(psapResponse, null));
        Thread.sleep(3000);
        assertTrue(psapResponse[0] != null);
    }

    @Test
    public void test911ByLocationWithInvalidParamsAsync() throws InterruptedException {
        final SdkException[] sdkException = new SdkException[1];
        geo911Service.getPSAPByLocation(335.0118, -811.9571, TestUtility.getCallBack(new PsapResponse[1], sdkException));
        Thread.sleep(3000);
        TestUtility.verifyException(sdkException[0]);
    }
    
    @Test
	public void testToCompareSDKAndAPIResponseOfGeo911ByAddress() throws SdkException, JSONException  {
		 Map<String, Object> keyValueMap = new HashMap<String, Object>();
		 keyValueMap.put("address", "4750 Walnut st, Boulder, CO");
		 String jsonResponseFromAPI = TestUtility.getJSONResponseFromAPI(keyValueMap,TEST_URL,"geoapis/services/geo911/v1/psap/byaddress");
         Gson gson = new Gson();
         PsapResponse response = geo911Service.getPSAPByAddress("4750 Walnut St, Boulder, CO");
         String jsonResponseFromSDK = gson.toJson(response);
	     JSONAssert.assertEquals(jsonResponseFromAPI,jsonResponseFromSDK, JSONCompareMode.STRICT);
	}

	@Test
	public void testToCompareSDKAndAPIResponseOfGeo911ByLocation() throws SdkException, JSONException  {
		Map<String, Object> keyValueMap = new HashMap<String, Object>();
		keyValueMap.put("latitude", 35.0118);
		keyValueMap.put("longitude", -81.9571);
		String jsonResponseFromAPI = TestUtility.getJSONResponseFromAPI(keyValueMap,TEST_URL,"geoapis/services/geo911/v1/psap/bylocation");
        Gson gson = new Gson();
        PsapResponse response = geo911Service.getPSAPByLocation(35.0118, -81.9571);
        String jsonResponseFromSDK = gson.toJson(response);
	    JSONAssert.assertEquals(jsonResponseFromAPI,jsonResponseFromSDK, JSONCompareMode.STRICT);
	}

    @After
    public void tearDown() throws Exception {
        mLI = null;
        geo911Service = null;
    }
}
