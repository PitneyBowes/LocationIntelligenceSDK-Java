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
import com.pb.locationintelligence.RequestObserver;
import com.pb.locationintelligence.TestUtility;
import com.pb.locationintelligence.exception.SdkException;
import com.pb.locationintelligence.geocode.model.Crs;
import com.pb.locationintelligence.geocode.model.DistanceUnits;
import com.pb.locationintelligence.geocode.model.GeoPos;
import com.pb.locationintelligence.geocode.model.GeocodeServiceResponse;
import com.pb.locationintelligence.geocode.model.GeocodeServiceResponseList;
import com.pb.locationintelligence.geocode.model.Reverse.Point;
import com.pb.locationintelligence.geocode.model.forward.MatchFieldPreferences;
import com.pb.locationintelligence.geocode.preferences.GeocodePreference;
import com.pb.locationintelligence.geocode.preferences.GeocodePreferenceBuilder;
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

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * Test Case for Reverse Geocode SDK, This test case hits the QA environment to
 * validate SDK and compares responses returned by API and SDK.
 */
public class ReverseGeocodeTest {

	private static final Logger _LOG = LoggerFactory.getLogger(DictionaryServiceTest.class);
	LIServiceManager mLI;
	GeocodeService geocodeService;
	private static String TEST_URL = "";
	private static String TEST_TOKEN = "";

	private static final String REVERSE_GEOCODE_REQUEST_SRC = "\\src\\test\\resources\\geocodeReverseRequest.json";
	private static final String REVERSE_GEOCODE_BATCH_REQUEST_SRC = "\\src\\test\\resources\\geocodeReverseBatchRequest.json";
	private static final String REVERSE_GEOCODE_ADVANCED_REQUEST_SRC = "\\src\\test\\resources\\geocodeReverseAdvancedRequest.json";

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

	private GeocodePreferenceBuilder buildDummyPreferences() {
		GeocodePreferenceBuilder preferenceBuilder = new GeocodePreferenceBuilder();
		GeocodePreference preference = new GeocodePreference();
		preference.setFallbackToGeographic(true);
		preference.setMaxReturnedCandidates("5");
		preference.setDistance(100d);
		preference.setStreetOffset("7");
		preference.setCornerOffset("7");
		preference.setClientLocale("en_US");
		preference.setClientCoordSysName("epsg:4326");
		preference.setDistanceUnits(DistanceUnits.METER);
		preference.setStreetOffsetUnits(DistanceUnits.METER);
		preference.setCornerOffsetUnits(DistanceUnits.METER);

		MatchFieldPreferences fieldPreferences = new MatchFieldPreferences();
		fieldPreferences.setMatchOnAddressNumber(false);
		fieldPreferences.setMatchOnAllStreetFields(true);

		preference.setMustMatchFields(fieldPreferences);
		preferenceBuilder.setGeocodePreference(preference);
		return preferenceBuilder;
	}

	private List<Point> buildDummyPoints() {
		Point point = new Point();
		point.setCountry("FRA");
		GeoPos pos = new GeoPos();
		pos.setType("Point");
		pos.getCoordinates().add(2.294449);
		pos.getCoordinates().add(48.85838);
		point.setGeometry(pos);
		Crs crs = new Crs();
		crs.setType("name");
		Properties properties = new Properties();
		properties.put("name", "EPSG:4326");
		crs.setProperties(properties);
		pos.setCrs(crs);

		Point point1 = new Point();
		point1.setCountry("AUS");
		GeoPos pos1 = new GeoPos();
		pos1.setType("Point");
		pos1.getCoordinates().add(151.19603);
		pos1.getCoordinates().add(-33.879637);
		point1.setGeometry(pos1);
		pos1.setCrs(crs);

		List<Point> points = new ArrayList<Point>();
		points.add(point);
		points.add(point1);

		return points;

	}

	private static RequestObserver getReverseGeocodeCallBack(final List<GeocodeServiceResponse> responses,
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
	public void testWhetherSDKAndAPIResponsesMatchForReverseGeocode() throws SdkException, JSONException, IOException {

		String jsonResponseFromAPI = TestUtility.getJSONResponseFromApiForPOSTRequest(REVERSE_GEOCODE_REQUEST_SRC,
				TEST_URL, "geocodeapis/services/geocode-service/v1/transient/PREMIUM/reverseGeocode");
		Point point = new Point();
		point.setCountry("FRA");
		GeoPos pos = new GeoPos();
		pos.setType("Point");
		pos.getCoordinates().add(2.294449);
		pos.getCoordinates().add(48.85838);
		point.setGeometry(pos);
		Crs crs = new Crs();
		crs.setType("name");
		Properties properties = new Properties();
		properties.put("name", "EPSG:4326");
		crs.setProperties(properties);
		pos.setCrs(crs);

		GeocodeServiceResponseList response = geocodeService.getReverseGeocode(point, BundleType.PREMIUM);
		Gson gson = new GsonBuilder().serializeNulls().create();
		String jsonResponseFromSDK = gson.toJson(response);
		JSONAssert.assertEquals(jsonResponseFromAPI, jsonResponseFromSDK, JSONCompareMode.STRICT);

	}

	@Test
	public void testWhetherSDKAndAPIResponsesMatchForReverseGeocodeAsync()
			throws SdkException, JSONException, IOException, InterruptedException {

		String jsonResponseFromAPI = TestUtility.getJSONResponseFromApiForPOSTRequest(REVERSE_GEOCODE_REQUEST_SRC,
				TEST_URL, "geocodeapis/services/geocode-service/v1/transient/PREMIUM/reverseGeocode");
		Point point = new Point();
		point.setCountry("FRA");
		GeoPos pos = new GeoPos();
		pos.setType("Point");
		pos.getCoordinates().add(2.294449);
		pos.getCoordinates().add(48.85838);
		point.setGeometry(pos);
		Crs crs = new Crs();
		crs.setType("name");
		Properties properties = new Properties();
		properties.put("name", "EPSG:4326");
		crs.setProperties(properties);
		pos.setCrs(crs);

		final GeocodeServiceResponseList geocodeResponse = new GeocodeServiceResponseList();
		geocodeService.getReverseGeocodeAsync(point, BundleType.PREMIUM,
				getReverseGeocodeCallBack(geocodeResponse.getResponses(), null));

		Thread.sleep(5000);

		Gson gson = new GsonBuilder().serializeNulls().create();
		String jsonResponseFromSDK = gson.toJson(geocodeResponse);
		JSONAssert.assertEquals(jsonResponseFromAPI, jsonResponseFromSDK, JSONCompareMode.STRICT);

	}

	@Test
	public void testWhetherSDKAndAPIResponsesMatchForReverseGeocodeBatch() throws SdkException, JSONException, IOException {

		String jsonResponseFromAPI = TestUtility.getJSONResponseFromApiForPOSTRequest(REVERSE_GEOCODE_BATCH_REQUEST_SRC,
				TEST_URL, "geocodeapis/services/geocode-service/v1/transient/PREMIUM/reverseGeocode");

		GeocodeServiceResponseList response = geocodeService.getReverseGeocodeBatch(buildDummyPoints(),
				BundleType.PREMIUM);
		Gson gson = new GsonBuilder().serializeNulls().create();
		String jsonResponseFromSDK = gson.toJson(response);
		JSONAssert.assertEquals(jsonResponseFromAPI, jsonResponseFromSDK, JSONCompareMode.STRICT);

	}

	@Test
	public void testWhetherSDKAndAPIResponsesMatchForReverseGeocodeBatchAsync()
			throws SdkException, JSONException, IOException, InterruptedException {

		String jsonResponseFromAPI = TestUtility.getJSONResponseFromApiForPOSTRequest(REVERSE_GEOCODE_BATCH_REQUEST_SRC,
				TEST_URL, "geocodeapis/services/geocode-service/v1/transient/PREMIUM/reverseGeocode");

		final GeocodeServiceResponseList geocodeResponse = new GeocodeServiceResponseList();
		geocodeService.getReverseGeocodeBatchAsync(buildDummyPoints(), BundleType.PREMIUM,
				getReverseGeocodeCallBack(geocodeResponse.getResponses(), null));

		Thread.sleep(5000);

		Gson gson = new GsonBuilder().serializeNulls().create();
		String jsonResponseFromSDK = gson.toJson(geocodeResponse);
		JSONAssert.assertEquals(jsonResponseFromAPI, jsonResponseFromSDK, JSONCompareMode.STRICT);

	}

	@Test
	public void testWhetherSDKAndAPIResponsesMatchForReverseGeocodeAdvancedBatch()
			throws SdkException, JSONException, IOException, InterruptedException {

		String jsonResponseFromAPI = TestUtility.getJSONResponseFromApiForPOSTRequest(
				REVERSE_GEOCODE_ADVANCED_REQUEST_SRC, TEST_URL,
				"geocodeapis/services/geocode-service/v1/transient/PREMIUM/reverseGeocode");

		GeocodeServiceResponseList geocodeResponse = geocodeService.getReverseGeocodeAdvancedBatch(buildDummyPoints(),
				BundleType.PREMIUM, buildDummyPreferences());

		Thread.sleep(5000);

		Gson gson = new GsonBuilder().serializeNulls().create();
		String jsonResponseFromSDK = gson.toJson(geocodeResponse);
		JSONAssert.assertEquals(jsonResponseFromAPI, jsonResponseFromSDK, JSONCompareMode.STRICT);

	}

	@Test
	public void testWhetherSDKAndAPIResponsesMatchForReverseGeocodeAdvancedBatchAsync()
			throws SdkException, JSONException, IOException, InterruptedException {

		String jsonResponseFromAPI = TestUtility.getJSONResponseFromApiForPOSTRequest(
				REVERSE_GEOCODE_ADVANCED_REQUEST_SRC, TEST_URL,
				"geocodeapis/services/geocode-service/v1/transient/PREMIUM/reverseGeocode");

		final GeocodeServiceResponseList geocodeResponse = new GeocodeServiceResponseList();
		geocodeService.getReverseGeocodeAdvancedBatchAsync(buildDummyPoints(), BundleType.PREMIUM,
				buildDummyPreferences(), getReverseGeocodeCallBack(geocodeResponse.getResponses(), null));

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