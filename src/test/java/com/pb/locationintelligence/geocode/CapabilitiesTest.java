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
package com.pb.locationintelligence.geocode;

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
import com.google.gson.GsonBuilder;
import com.pb.locationintelligence.TestUtility;
import com.pb.locationintelligence.exception.SdkException;
import com.pb.locationintelligence.geocode.model.capabilities.GeocodeCapabilitiesResponse;
import com.pb.locationintelligence.manager.LIServiceManager;
import com.pb.locationintelligence.oauth.BasicAuthServiceImpl;

/**
 * Test Class for Geocode getCapabilities SDK, these are integration test case
 * which will hit the qa server for verification.
 */
public class CapabilitiesTest {
	private static final Logger _LOG = LoggerFactory.getLogger(CapabilitiesTest.class);

	LIServiceManager mLI;
	GeocodeService geocodeService;
	private static String TEST_URL = "";
	private static String TEST_TOKEN = "";

	@BeforeClass
	public static void loadProperties() {
		Properties props = new Properties();
		try {
			InputStream fileIn = CapabilitiesTest.class.getResourceAsStream("/test.properties");
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
		geocodeService = new GeocodeServiceImpl();
	}

	@Test
	public void testWhetherSDKAndAPIResponsesMatchForCapabilitiesWithInputBundleType()
			throws SdkException, JSONException {
		String jsonResponseFromAPI = TestUtility.getJSONResponseFromAPI(null, TEST_URL,
				"geocodeapis/services/geocode-service/v1/transient/PREMIUM/capabilities");

		Gson gson = new GsonBuilder().serializeNulls().create();
		GeocodeCapabilitiesResponse response = geocodeService.getCapabilities(BundleType.PREMIUM);
		String jsonResponseFromSDK = gson.toJson(response);
		JSONAssert.assertEquals(jsonResponseFromAPI, jsonResponseFromSDK, JSONCompareMode.STRICT);
	}

	@Test
	public void testWhetherSDKAndAPIResponsesMatchForCapabilitiesWithInputBundleTypeAsync()
			throws SdkException, JSONException, InterruptedException {
		String jsonResponseFromAPI = TestUtility.getJSONResponseFromAPI(null, TEST_URL,
				"geocodeapis/services/geocode-service/v1/transient/BASIC/capabilities");

		final GeocodeCapabilitiesResponse[] capabilitiesResponses = new GeocodeCapabilitiesResponse[1];
		geocodeService.getCapabilitiesAsync(BundleType.BASIC, TestUtility.getCallBack(capabilitiesResponses, null));
		Thread.sleep(5000);

		Gson gson = new GsonBuilder().serializeNulls().create();
		String jsonResponseFromSDK = gson.toJson(capabilitiesResponses[0]);
		JSONAssert.assertEquals(jsonResponseFromAPI, jsonResponseFromSDK, JSONCompareMode.STRICT);
	}

	@Test
	public void testWhetherSDKAndAPIResponsesMatchForCapabilitiesWithInputCountryAndBundleType()
			throws SdkException, JSONException {
		Map<String, Object> keyValueMap = new HashMap<String, Object>();
		keyValueMap.put("country", "USA");
		String jsonResponseFromAPI = TestUtility.getJSONResponseFromAPI(keyValueMap, TEST_URL,
				"geocodeapis/services/geocode-service/v1/transient/BASIC/capabilities");

		Gson gson = new GsonBuilder().serializeNulls().create();
		GeocodeCapabilitiesResponse response = geocodeService.getCapabilities(Countries.UNITED_STATES,
				BundleType.BASIC);
		String jsonResponseFromSDK = gson.toJson(response);
		JSONAssert.assertEquals(jsonResponseFromAPI, jsonResponseFromSDK, JSONCompareMode.STRICT);
	}

	@Test
	public void testWhetherSDKAndAPIResponsesMatchForCapabilitiesWithInputCountryAndBundleTypeAsync()
			throws SdkException, JSONException, InterruptedException {
		Map<String, Object> keyValueMap = new HashMap<String, Object>();
		keyValueMap.put("country", "USA");
		String jsonResponseFromAPI = TestUtility.getJSONResponseFromAPI(keyValueMap, TEST_URL,
				"geocodeapis/services/geocode-service/v1/transient/PREMIUM/capabilities");

		final GeocodeCapabilitiesResponse[] capabilitiesResponses = new GeocodeCapabilitiesResponse[1];
		geocodeService.getCapabilitiesAsync(Countries.UNITED_STATES, BundleType.PREMIUM,
				TestUtility.getCallBack(capabilitiesResponses, null));

		Thread.sleep(5000);

		Gson gson = new GsonBuilder().serializeNulls().create();
		String jsonResponseFromSDK = gson.toJson(capabilitiesResponses[0]);
		JSONAssert.assertEquals(jsonResponseFromAPI, jsonResponseFromSDK, JSONCompareMode.STRICT);
	}

	@Test
	public void testWhetherSDKAndAPIResponsesMatchForCapabilitiesWithInputOperationAndBundleType()
			throws SdkException, JSONException {
		Map<String, Object> keyValueMap = new HashMap<String, Object>();
		keyValueMap.put("operation", OperationType.geocode);
		String jsonResponseFromAPI = TestUtility.getJSONResponseFromAPI(keyValueMap, TEST_URL,
				"geocodeapis/services/geocode-service/v1/transient/BASIC/capabilities");

		Gson gson = new GsonBuilder().serializeNulls().create();
		GeocodeCapabilitiesResponse response = geocodeService.getCapabilities(OperationType.geocode,
				BundleType.BASIC);
		String jsonResponseFromSDK = gson.toJson(response);
		JSONAssert.assertEquals(jsonResponseFromAPI, jsonResponseFromSDK, JSONCompareMode.STRICT);
	}

	@Test
	public void testWhetherSDKAndAPIResponsesMatchForCapabilitiesWithInputOperationAndBundleTypeAsync()
			throws SdkException, JSONException, InterruptedException {
		Map<String, Object> keyValueMap = new HashMap<String, Object>();
		keyValueMap.put("operation", OperationType.geocode);
		String jsonResponseFromAPI = TestUtility.getJSONResponseFromAPI(keyValueMap, TEST_URL,
				"geocodeapis/services/geocode-service/v1/transient/PREMIUM/capabilities");

		final GeocodeCapabilitiesResponse[] capabilitiesResponses = new GeocodeCapabilitiesResponse[1];
		geocodeService.getCapabilitiesAsync(OperationType.geocode, BundleType.PREMIUM,
				TestUtility.getCallBack(capabilitiesResponses, null));

		Thread.sleep(5000);

		Gson gson = new GsonBuilder().serializeNulls().create();
		String jsonResponseFromSDK = gson.toJson(capabilitiesResponses[0]);
		JSONAssert.assertEquals(jsonResponseFromAPI, jsonResponseFromSDK, JSONCompareMode.STRICT);
	}

	@Test
	public void testWhetherSDKAndAPIResponsesMatchForCapabilitiesWithInputCountryWithOperationAndBundleType()
			throws SdkException, JSONException, InterruptedException {
		Map<String, Object> keyValueMap = new HashMap<String, Object>();
		keyValueMap.put("country", "USA");
		keyValueMap.put("operation", OperationType.geocode);
		String jsonResponseFromAPI = TestUtility.getJSONResponseFromAPI(keyValueMap, TEST_URL,
				"geocodeapis/services/geocode-service/v1/transient/BASIC/capabilities");

		GeocodeCapabilitiesResponse response = geocodeService.getCapabilities(Countries.UNITED_STATES,
				OperationType.geocode, BundleType.BASIC);

		Gson gson = new GsonBuilder().serializeNulls().create();
		String jsonResponseFromSDK = gson.toJson(response);
		JSONAssert.assertEquals(jsonResponseFromAPI, jsonResponseFromSDK, JSONCompareMode.STRICT);
	}

	@Test
	public void testWhetherSDKAndAPIResponsesMatchForCapabilitiesWithInputCountryWithOperationAndBundleTypeAsync()
			throws SdkException, JSONException, InterruptedException {
		Map<String, Object> keyValueMap = new HashMap<String, Object>();
		keyValueMap.put("country", "USA");
		keyValueMap.put("operation", OperationType.geocode);
		String jsonResponseFromAPI = TestUtility.getJSONResponseFromAPI(keyValueMap, TEST_URL,
				"geocodeapis/services/geocode-service/v1/transient/PREMIUM/capabilities");

		final GeocodeCapabilitiesResponse[] capabilitiesResponses = new GeocodeCapabilitiesResponse[1];
		geocodeService.getCapabilitiesAsync(Countries.UNITED_STATES, OperationType.geocode, BundleType.PREMIUM,
				TestUtility.getCallBack(capabilitiesResponses, null));

		Thread.sleep(5000);

		Gson gson = new GsonBuilder().serializeNulls().create();
		String jsonResponseFromSDK = gson.toJson(capabilitiesResponses[0]);
		JSONAssert.assertEquals(jsonResponseFromAPI, jsonResponseFromSDK, JSONCompareMode.STRICT);
	}

	@After
	public void tearDown() throws Exception {
		mLI = null;
		geocodeService = null;
	}
}