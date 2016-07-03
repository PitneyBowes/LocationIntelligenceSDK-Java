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

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
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
import com.pb.locationintelligence.RequestObserver;
import com.pb.locationintelligence.TestUtility;
import com.pb.locationintelligence.exception.SdkException;
import com.pb.locationintelligence.geocode.custompreferences.ICustomPreference;
import com.pb.locationintelligence.geocode.custompreferences.impl.CustomPreference;
import com.pb.locationintelligence.geocode.model.GeocodeServiceResponse;
import com.pb.locationintelligence.geocode.model.GeocodeServiceResponseList;
import com.pb.locationintelligence.geocode.model.MatchMode;
import com.pb.locationintelligence.geocode.model.forward.Address;
import com.pb.locationintelligence.geocode.model.forward.MatchFieldPreferences;
import com.pb.locationintelligence.geocode.preferences.GeocodePreference;
import com.pb.locationintelligence.geocode.preferences.GeocodePreferenceBuilder;
import com.pb.locationintelligence.manager.LIServiceManager;
import com.pb.locationintelligence.oauth.BasicAuthServiceImpl;

/**
 * Test Case for Forward Geocode SDK, This test case hits the QA environment to
 * validate SDK and compares responses returned by API and SDK.
 */
public class ForwardGeocodeTest {

	private static final Logger _LOG = LoggerFactory.getLogger(ForwardGeocodeTest.class);

	private LIServiceManager mLI;
	private GeocodeService geocodeService;
	private static String TEST_URL = "";
	private static String TEST_TOKEN = "";
	private static final String GEOCODE_REQUEST_SRC = "\\src\\test\\resources\\geocodeForwardRequest.json";
	private static final String GEOCODE_BATCH_REQUEST_SRC = "\\src\\test\\resources\\geocodeForwardBatchRequest.json";
	private static final String GEOCODE_ADVANCED_REQUEST_SRC = "\\src\\test\\resources\\geocodeForwardAdvancedRequest.json";

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

	private GeocodePreferenceBuilder buildDummyPreferences() {
		GeocodePreferenceBuilder preferenceBuilder = new GeocodePreferenceBuilder();
		GeocodePreference preference = new GeocodePreference();
		preference.setMatchMode(MatchMode.STANDARD);
		preference.setFallbackToGeographic(true);

		MatchFieldPreferences fieldPreferences = new MatchFieldPreferences();
		fieldPreferences.setMatchOnAddressNumber(false);
		fieldPreferences.setMatchOnAllStreetFields(false);

		ICustomPreference customPreference = new CustomPreference();
		customPreference.setFallbackToGeographic(false);
		List<ICustomPreference> customPreferences = new ArrayList<ICustomPreference>();
		customPreferences.add(customPreference);

		preference.setMustMatchFields(fieldPreferences);
		preferenceBuilder.setGeocodePreference(preference);
		preferenceBuilder.setCustomPreferences(customPreferences);

		return preferenceBuilder;
	}

	private List<Address> buildDummyAddresses() {
		Address address1 = new Address();
		address1.setMainAddressLine("39 SycamoreRd, Stafford 08050");
		address1.setPostCode1("08050");
		address1.setCountry("USA");

		Address address2 = new Address();
		address2.setMainAddressLine("Pitney Bowes, 1 Global View, Troy, NY 12180");
		address2.setPostCode1("12180");
		address2.setCountry("USA");

		List<Address> addresses = new ArrayList<Address>();
		addresses.add(address1);
		addresses.add(address2);

		return addresses;

	}

	private static RequestObserver getFrwrdGeocodeCallBack(final List<GeocodeServiceResponse> responses,
			final SdkException[] sdkException) {
		return new RequestObserver<GeocodeServiceResponseList>() {
			@Override
			public void onSuccess(GeocodeServiceResponseList responseList) {
				responses.addAll(responseList.getResponses());

			}

			@Override
			public void onFailure(SdkException e) {
				sdkException[0] = e;
			}
		};
	}

	@Test
	public void testWhetherSDKAndAPIResponsesMatchForGeocode() throws SdkException, JSONException, IOException {

		String jsonResponseFromAPI = TestUtility.getJSONResponseFromApiForPOSTRequest(GEOCODE_REQUEST_SRC, TEST_URL,
				"geocodeapis/services/geocode-service/v1/transient/PREMIUM/geocode");
		Address address = new Address();
		address.setMainAddressLine("39 SycamoreRd, Stafford 08050");
		address.setPostCode1("08050");
		address.setCountry("USA");

		GeocodeServiceResponseList response = geocodeService.getGeocode(address, BundleType.PREMIUM);
		Gson gson = new GsonBuilder().serializeNulls().create();
		String jsonResponseFromSDK = gson.toJson(response);
		JSONAssert.assertEquals(jsonResponseFromAPI, jsonResponseFromSDK, JSONCompareMode.STRICT);

	}

	@Test
	public void testWhetherSDKAndAPIResponsesMatchForGeocodeAsync()
			throws SdkException, JSONException, IOException, InterruptedException {

		String jsonResponseFromAPI = TestUtility.getJSONResponseFromApiForPOSTRequest(GEOCODE_REQUEST_SRC, TEST_URL,
				"geocodeapis/services/geocode-service/v1/transient/BASIC/geocode");

		Address address = new Address();
		address.setMainAddressLine("39 SycamoreRd, Stafford 08050");
		address.setPostCode1("08050");
		address.setCountry("USA");

		final GeocodeServiceResponseList geocodeResponse = new GeocodeServiceResponseList();
		geocodeService.getGeocodeAsync(address, BundleType.BASIC,
				getFrwrdGeocodeCallBack(geocodeResponse.getResponses(), null));

		Thread.sleep(5000);

		Gson gson = new GsonBuilder().serializeNulls().create();
		String jsonResponseFromSDK = gson.toJson(geocodeResponse);
		JSONAssert.assertEquals(jsonResponseFromAPI, jsonResponseFromSDK, JSONCompareMode.STRICT);

	}

	@Test
	public void testWhetherSDKAndAPIResponsesMatchForGeocodeBatch() throws SdkException, JSONException, IOException {

		String jsonResponseFromAPI = TestUtility.getJSONResponseFromApiForPOSTRequest(GEOCODE_BATCH_REQUEST_SRC,
				TEST_URL, "geocodeapis/services/geocode-service/v1/transient/BASIC/geocode");

		GeocodeServiceResponseList response = geocodeService.getGeocodeBatch(buildDummyAddresses(), BundleType.BASIC);
		Gson gson = new GsonBuilder().serializeNulls().create();
		String jsonResponseFromSDK = gson.toJson(response);
		JSONAssert.assertEquals(jsonResponseFromAPI, jsonResponseFromSDK, JSONCompareMode.STRICT);

	}

	@Test
	public void testWhetherSDKAndAPIResponsesMatchForGeocodeBatchAsync()
			throws SdkException, JSONException, IOException, InterruptedException {

		String jsonResponseFromAPI = TestUtility.getJSONResponseFromApiForPOSTRequest(GEOCODE_BATCH_REQUEST_SRC,
				TEST_URL, "geocodeapis/services/geocode-service/v1/transient/BASIC/geocode");

		final GeocodeServiceResponseList geocodeResponse = new GeocodeServiceResponseList();
		geocodeService.getGeocodeBatchAsync(buildDummyAddresses(), BundleType.BASIC,
				getFrwrdGeocodeCallBack(geocodeResponse.getResponses(), null));

		Thread.sleep(5000);

		Gson gson = new GsonBuilder().serializeNulls().create();
		String jsonResponseFromSDK = gson.toJson(geocodeResponse);
		JSONAssert.assertEquals(jsonResponseFromAPI, jsonResponseFromSDK, JSONCompareMode.STRICT);

	}

	@Test
	public void testWhetherSDKAndAPIResponsesMatchForGeocodeAdvancedBatch()
			throws SdkException, JSONException, IOException {

		String jsonResponseFromAPI = TestUtility.getJSONResponseFromApiForPOSTRequest(GEOCODE_ADVANCED_REQUEST_SRC,
				TEST_URL, "geocodeapis/services/geocode-service/v1/transient/BASIC/geocode");

		GeocodeServiceResponseList response = geocodeService.getGeocodeAdvancedBatch(buildDummyAddresses(),
				BundleType.BASIC, buildDummyPreferences());

		Gson gson = new GsonBuilder().serializeNulls().create();
		String jsonResponseFromSDK = gson.toJson(response);
		JSONAssert.assertEquals(jsonResponseFromAPI, jsonResponseFromSDK, JSONCompareMode.STRICT);

	}

	@Test
	public void testWhetherSDKAndAPIResponsesMatchForGeocodeAdvancedBatchAsync()
			throws SdkException, JSONException, IOException, InterruptedException {

		String jsonResponseFromAPI = TestUtility.getJSONResponseFromApiForPOSTRequest(GEOCODE_ADVANCED_REQUEST_SRC,
				TEST_URL, "geocodeapis/services/geocode-service/v1/transient/BASIC/geocode");

		final GeocodeServiceResponseList geocodeResponse = new GeocodeServiceResponseList();
		geocodeService.getGeocodeAdvancedBatchAsync(buildDummyAddresses(), BundleType.BASIC, buildDummyPreferences(),
				getFrwrdGeocodeCallBack(geocodeResponse.getResponses(), null));

		Thread.sleep(5000);

		Gson gson = new GsonBuilder().serializeNulls().create();
		String jsonResponseFromSDK = gson.toJson(geocodeResponse);
		JSONAssert.assertEquals(jsonResponseFromAPI, jsonResponseFromSDK, JSONCompareMode.STRICT);

	}

	@After
	public void tearDown() throws Exception {
		mLI = null;
		geocodeService = null;
	}

}