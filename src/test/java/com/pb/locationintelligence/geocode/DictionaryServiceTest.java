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

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.pb.locationintelligence.TestUtility;
import com.pb.locationintelligence.exception.SdkException;
import com.pb.locationintelligence.geocode.model.dictionaries.ConfiguredDictionariesResponse;
import com.pb.locationintelligence.manager.LIServiceManager;
import com.pb.locationintelligence.oauth.BasicAuthServiceImpl;

import org.json.JSONException;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class DictionaryServiceTest {

	private static final Logger _LOG = LoggerFactory.getLogger(DictionaryServiceTest.class);

	LIServiceManager mLI;
	GeocodeService geocodeService;
	private static String TEST_URL = "";
	private static String TEST_TOKEN = "";

	@BeforeClass
	public static void loadProperties() {
		Properties props = new Properties();
		try {
			InputStream fileIn = DictionaryServiceTest.class.getResourceAsStream("/test.properties");
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
	public void testWhetherSDKAndAPIResponsesMatchForDictionariesWithInputBundleType()
			throws SdkException, JSONException {
		String jsonResponseFromAPI = TestUtility.getJSONResponseFromAPI(null, TEST_URL,
				"geocodeapis/services/geocode-service/v1/transient/PREMIUM/dictionaries");
		Gson gson = new GsonBuilder().serializeNulls().create();
		ConfiguredDictionariesResponse response = geocodeService.getConfiguredDictionaries(BundleType.PREMIUM);
		String jsonResponseFromSDK = gson.toJson(response);
		JSONAssert.assertEquals(jsonResponseFromAPI, jsonResponseFromSDK, JSONCompareMode.STRICT);
	}

	@Test
	public void testWhetherSDKAndAPIResponsesMatchForDictionariesWithInputBundleTypeAsync()
			throws SdkException, JSONException, InterruptedException {
		String jsonResponseFromAPI = TestUtility.getJSONResponseFromAPI(null, TEST_URL,
				"geocodeapis/services/geocode-service/v1/transient/BASIC/dictionaries");

		final ConfiguredDictionariesResponse[] dictionariesResponses = new ConfiguredDictionariesResponse[1];
		geocodeService.getConfigureDictionariesAsync(BundleType.BASIC,
				TestUtility.getCallBack(dictionariesResponses, null));

		Thread.sleep(5000);

		Gson gson = new GsonBuilder().serializeNulls().create();
		String jsonResponseFromSDK = gson.toJson(dictionariesResponses[0]);
		JSONAssert.assertEquals(jsonResponseFromAPI, jsonResponseFromSDK, JSONCompareMode.STRICT);
	}

	@Test
	public void testWhetherSDKAndAPIResponsesMatchForDictionariesWithInputCountryAndBundleType()
			throws SdkException, JSONException {
		Map<String, Object> keyValueMap = new HashMap<String, Object>();
		keyValueMap.put("country", "USA");

		String jsonResponseFromAPI = TestUtility.getJSONResponseFromAPI(keyValueMap, TEST_URL,
				"geocodeapis/services/geocode-service/v1/transient/PREMIUM/dictionaries");
		Gson gson = new GsonBuilder().serializeNulls().create();
		ConfiguredDictionariesResponse response = geocodeService.getConfiguredDictionaries(Countries.UNITED_STATES,
				BundleType.PREMIUM);
		String jsonResponseFromSDK = gson.toJson(response);
		JSONAssert.assertEquals(jsonResponseFromAPI, jsonResponseFromSDK, JSONCompareMode.STRICT);
	}

	@Test
	public void testWhetherSDKAndAPIResponsesMatchForDictionariesWithInputCountryAndBundleTypeAsync()
			throws SdkException, JSONException, InterruptedException {
		Map<String, Object> keyValueMap = new HashMap<String, Object>();
		keyValueMap.put("country", "USA");

		String jsonResponseFromAPI = TestUtility.getJSONResponseFromAPI(keyValueMap, TEST_URL,
				"geocodeapis/services/geocode-service/v1/transient/PREMIUM/dictionaries");

		final ConfiguredDictionariesResponse[] dictionariesResponses = new ConfiguredDictionariesResponse[1];
		geocodeService.getConfigureDictionariesAsync(Countries.UNITED_STATES, BundleType.PREMIUM,
				TestUtility.getCallBack(dictionariesResponses, null));

		Thread.sleep(5000);

		Gson gson = new GsonBuilder().serializeNulls().create();
		String jsonResponseFromSDK = gson.toJson(dictionariesResponses[0]);
		JSONAssert.assertEquals(jsonResponseFromAPI, jsonResponseFromSDK, JSONCompareMode.STRICT);
	}

	@After
	public void tearDown() throws Exception {
		mLI = null;
		geocodeService = null;
	}

}