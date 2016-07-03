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
package com.pb.locationintelligence.geotax;

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
import com.pb.locationintelligence.geotax.model.TaxRateResponse;
import com.pb.locationintelligence.manager.LIServiceManager;
import com.pb.locationintelligence.oauth.BasicAuthServiceImpl;

public class GeoTaxServiceTest {
	private static final Logger _LOG = LoggerFactory.getLogger(GeoTaxServiceTest.class);

	LIServiceManager mLI;
	GeoTaxService mGeoTaxService;
	private static String TEST_URL = "";
   	private static String TEST_TOKEN = "";

   	@BeforeClass
   	public static void loadProperties(){
   		Properties props = new Properties();
   		try{
   			InputStream fileIn = GeoTaxServiceTest.class.getResourceAsStream("/test.properties");
   			props.load(fileIn);
   			TEST_URL = props.getProperty("TEST_URL");
   			TEST_TOKEN = props.getProperty("TEST_TOKEN");
   			fileIn.close();
   		}catch(Exception e){
   			_LOG.info("Unable to load test.properties");
   		}
   	}
	
	@Before
	public void setUp() throws Exception {
		mLI = LIServiceManager.getInstance(new BasicAuthServiceImpl(TEST_TOKEN, TEST_URL));
		mGeoTaxService = mLI.getGeoTaxService();
	}

	@Test
	public void getGeoTaxRateByLocationTest() {
		try{
			TaxRateResponse response = mGeoTaxService.getGeoTaxRateByLocation("General", 40.018912D, -105.239771D);
			assertTrue(response != null);
		}catch(Exception e){
			fail("Unexpected Exception");
		}
	}
	
	@Test
	public void getGeoTaxRateByAddressTest() {
		try{
			TaxRateResponse response = mGeoTaxService.getGeoTaxRateByAddress("Auto", "4750 Walnut st, Boulder, CO");
			assertTrue(response != null);
		}catch(Exception e){
			fail("Unexpected Exception");
		}
	}
	
	@Test
	public void getGeoTaxByLocationTest() {
		try{
			TaxRateResponse response = mGeoTaxService.getGeoTaxByLocation("General", 40.018912D, -105.239771D, 100D);
			assertTrue(response != null);
		}catch(Exception e){
			fail("Unexpected Exception");
		}
	}
	
	@Test
	public void getGeoTaxByAddressTest() {
		try{
			TaxRateResponse response = mGeoTaxService.getGeoTaxByAddress("Auto", "4750 Walnut st, Boulder, CO", 100D);
			assertTrue(response != null);
		}catch(Exception e){
			fail("Unexpected Exception");
		}
	}
	
	@Test
	public void getGeoTaxRateByLocationInvalidParamTest() {
		try{
			mGeoTaxService.getGeoTaxRateByLocation("General", null, -105.239771D);
		}catch(SdkException e){
            TestUtility.verifyException(e);
		}catch(Exception e){
			fail("Unexpected Exception");
		}
	}
	
	@Test
	public void getGeoTaxRateByAddressInvalidParamTest() {
		try{
			mGeoTaxService.getGeoTaxRateByAddress("Auto", null);
		}catch(SdkException e){
            TestUtility.verifyException(e);
		}catch(Exception e){
			fail("Unexpected Exception");
		}
	}
	
	@Test
	public void getGeoTaxByLocationInvalidParamTest() {
		try{
			mGeoTaxService.getGeoTaxByLocation("General", null, -105.239771D, 100D);
		}catch(SdkException e){
            TestUtility.verifyException(e);
		}catch(Exception e){
			fail("Unexpected Exception");
		}
	}
	
	@Test
	public void getGeoTaxByAddressInvalidParamTest() {
		try{
			mGeoTaxService.getGeoTaxByAddress("Auto", null, 100D);
		}catch(SdkException e){
            TestUtility.verifyException(e);
		}catch(Exception e){
			fail("Unexpected Exception");
		}
	}
	
	@Test
	public void getGeoTaxRateByLocationAsyncTest() throws InterruptedException {
	        final TaxRateResponse[] taxRateResponse = new TaxRateResponse[1];
			mGeoTaxService.getGeoTaxRateByLocation("General", 40.018912D, -105.239771D,TestUtility.getCallBack(taxRateResponse, null));
			Thread.sleep(3000);
			assertTrue(taxRateResponse[0] != null);
	}
	
	@Test
	public void getGeoTaxRateByAddressAsyncTest() throws InterruptedException {
			final TaxRateResponse[] taxRateResponse = new TaxRateResponse[1];
			mGeoTaxService.getGeoTaxRateByAddress("Auto", "4750 Walnut st, Boulder, CO",TestUtility.getCallBack(taxRateResponse, null));
			Thread.sleep(3000);
			assertTrue(taxRateResponse[0] != null);
	}
	
	@Test
	public void getGeoTaxByLocationAsyncTest() throws InterruptedException {
			final TaxRateResponse[] taxRateResponse = new TaxRateResponse[1];
			mGeoTaxService.getGeoTaxByLocation("General", 40.018912D, -105.239771D, 100D,TestUtility.getCallBack(taxRateResponse, null));
			Thread.sleep(3000);
			assertTrue(taxRateResponse[0] != null);
	}
	
	@Test
	public void getGeoTaxByAddressAsyncTest() throws InterruptedException {
			final TaxRateResponse[] taxRateResponse = new TaxRateResponse[1];
			mGeoTaxService.getGeoTaxByAddress("Auto", "4750 Walnut st, Boulder, CO", 100D,TestUtility.getCallBack(taxRateResponse, null));
			Thread.sleep(3000);
			assertTrue(taxRateResponse[0] != null);
	}
	
	@Test
	public void getGeoTaxRateByLocationInvalidParamAsyncTest() throws InterruptedException {
			final SdkException[] sdkException = new SdkException[1];
			mGeoTaxService.getGeoTaxRateByLocation("General", null, -105.239771D,TestUtility.getCallBack(new TaxRateResponse[1], sdkException));
			Thread.sleep(3000);
			TestUtility.verifyException(sdkException[0]);
	}
	
	@Test
	public void getGeoTaxRateByAddressInvalidParamAsyncTest() throws InterruptedException {
			final SdkException[] sdkException = new SdkException[1];
			mGeoTaxService.getGeoTaxRateByAddress("Auto", null,TestUtility.getCallBack(new TaxRateResponse[1], sdkException));
			Thread.sleep(3000);
			TestUtility.verifyException(sdkException[0]);
	}
	
	@Test
	public void getGeoTaxByLocationInvalidParamAsyncTest() throws InterruptedException {
		final SdkException[] sdkException = new SdkException[1];
			mGeoTaxService.getGeoTaxByLocation("General", null, -105.239771D, 100D,TestUtility.getCallBack(new TaxRateResponse[1], sdkException));
			Thread.sleep(3000);
			TestUtility.verifyException(sdkException[0]);
	}
	
	@Test
	public void getGeoTaxByAddressInvalidParamAsyncTest() throws InterruptedException {
		final SdkException[] sdkException = new SdkException[1];
		mGeoTaxService.getGeoTaxByAddress("Auto", null, 100D,TestUtility.getCallBack(new TaxRateResponse[1], sdkException));
		Thread.sleep(3000);
		TestUtility.verifyException(sdkException[0]);
	}
	
	@Test
	public void testToCompareSDKAndAPIResponseOfGeoTaxRateByAddress() throws SdkException, JSONException  {
		 Map<String, Object> keyValueMap = new HashMap<String, Object>();
		 keyValueMap.put("address", "4750 Walnut st, Boulder, CO");
		 String jsonResponseFromAPI = TestUtility.getJSONResponseFromAPI(keyValueMap,TEST_URL,"geotax/services/geotax/v1/taxrate/Auto/byaddress");
         Gson gson = new Gson();
         TaxRateResponse response = mGeoTaxService.getGeoTaxRateByAddress("Auto", "4750 Walnut st, Boulder, CO");
         String jsonResponseFromSDK = gson.toJson(response);
	     JSONAssert.assertEquals(jsonResponseFromAPI,jsonResponseFromSDK, JSONCompareMode.STRICT);
	}

	@Test
	public void testToCompareSDKAndAPIResponseOfGeoTaxRateByLocation() throws SdkException, JSONException  {
		Map<String, Object> keyValueMap = new HashMap<String, Object>();
		keyValueMap.put("latitude", 40.018912);
		keyValueMap.put("longitude", -105.239771D);
		String jsonResponseFromAPI = TestUtility.getJSONResponseFromAPI(keyValueMap,TEST_URL,"geotax/services/geotax/v1/taxrate/General/bylocation");
        Gson gson = new Gson();
        TaxRateResponse response = mGeoTaxService.getGeoTaxRateByLocation("General", 40.018912D, -105.239771D);
        String jsonResponseFromSDK = gson.toJson(response);
	    JSONAssert.assertEquals(jsonResponseFromAPI,jsonResponseFromSDK, JSONCompareMode.STRICT);
	}
	
	@Test
	public void testToCompareSDKAndAPIResponseOfGeoTaxByAddress() throws SdkException, JSONException  {
		 Map<String, Object> keyValueMap = new HashMap<String, Object>();
		 keyValueMap.put("address", "4750 Walnut st, Boulder, CO");
		 keyValueMap.put("purchaseAmount", 100D);
		 String jsonResponseFromAPI = TestUtility.getJSONResponseFromAPI(keyValueMap,TEST_URL,"geotax/services/geotax/v1/tax/Auto/byaddress");
         Gson gson = new Gson();
         TaxRateResponse response = mGeoTaxService.getGeoTaxByAddress("Auto", "4750 Walnut st, Boulder, CO", 100D);
         String jsonResponseFromSDK = gson.toJson(response);
	     JSONAssert.assertEquals(jsonResponseFromAPI,jsonResponseFromSDK, JSONCompareMode.STRICT);
	}

	@Test
	public void testToCompareSDKAndAPIResponseOfGeoTaxByLocation() throws SdkException, JSONException  {
		Map<String, Object> keyValueMap = new HashMap<String, Object>();
		keyValueMap.put("latitude", 40.018912);
		keyValueMap.put("longitude", -105.239771D);
		keyValueMap.put("purchaseAmount", 100D);
		String jsonResponseFromAPI = TestUtility.getJSONResponseFromAPI(keyValueMap,TEST_URL,"geotax/services/geotax/v1/tax/General/bylocation");
        Gson gson = new Gson();
        TaxRateResponse response = mGeoTaxService.getGeoTaxByLocation("General", 40.018912D, -105.239771D, 100D);
        String jsonResponseFromSDK = gson.toJson(response);
	    JSONAssert.assertEquals(jsonResponseFromAPI,jsonResponseFromSDK, JSONCompareMode.STRICT);
	}

	
	@After
	public void tearDown() throws Exception {
		mLI = null;
		mGeoTaxService = null;
	}

}
