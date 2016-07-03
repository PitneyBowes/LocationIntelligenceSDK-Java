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
package com.pb.locationintelligence.segmentation;

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
import com.pb.locationintelligence.manager.LIServiceManager;
import com.pb.locationintelligence.oauth.BasicAuthServiceImpl;
import com.pb.locationintelligence.segmentation.model.Segmentation;

/**
 * Test Class for GeoLife Segmentation SDK, these are integration test case which will hit the qa server for verification.
 *
 */
public class SegmentationServiceTest {
	private static final Logger _LOG = LoggerFactory.getLogger(SegmentationServiceTest.class);
	
	LIServiceManager mLI;
	SegmentationService mSegmentationService;
	private static String TEST_URL = "";
	private static String TEST_TOKEN = "";

	@BeforeClass
	public static void loadProperties(){
		Properties props = new Properties();
		try{
			InputStream fileIn = SegmentationServiceTest.class.getResourceAsStream("/test.properties");
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
		mSegmentationService = mLI.getSegmentationService();
	}
	
	@Test
	public void getSegmentationByAddressTest() {
		try {
			Segmentation response = mSegmentationService.getSegmentationByAddress("1 Global View, Troy, NY", "USA");
            assertTrue(response != null);
		} catch (SdkException e) {
			TestUtility.verifyException(e);
		}
	}
	
	@Test
	public void getSegmentationByAddressNegativeTest() {
		try{
			mSegmentationService.getSegmentationByAddress(null, "USA");
		}catch(SdkException e){
            TestUtility.verifyException(e);
		}
	}
	
	@Test
	public void getSegmentationByAddressBadRequestTest() {
		try{
			mSegmentationService.getSegmentationByAddress("1 Global View, Troy, NY", "1234");
		}catch(SdkException e){
            TestUtility.verifyException(e);
		}
	}
	
	@Test
	public void getSegmentationByAddressNoFilterTest() {
		try{
			Segmentation response = mSegmentationService.getSegmentationByAddress("1 Global View, Troy, NY", "USA");
			assertTrue(response != null);
		}catch(Exception e){
			fail("Unexpected Exception");
		}
	}
	
	@Test
	public void getSegmentationByLocationTest() {
		try{
			Segmentation response = mSegmentationService.getSegmentationByLocation(35.0118D, -81.9571D);
			assertTrue(response != null);
		}catch(Exception e){
			fail("Unexpected Exception");
		}
	}
	
	@Test
	public void getSegmentationByLocationNegativeTest() {
		try{
			mSegmentationService.getSegmentationByLocation(null, -81.9571D);
		}catch(SdkException e){
            TestUtility.verifyException(e);
		}
	}
	
	@Test
	public void getSegmentationByLocationBadRequestTest() {
		try{
			mSegmentationService.getSegmentationByLocation(35.0118D, -81.9571D);
		}catch(SdkException e){
            TestUtility.verifyException(e);
		}
	}
	
	@Test
	public void getSegmentationByLocationNoFilterTest() {
		try{
			Segmentation response = mSegmentationService.getSegmentationByLocation(35.0118D, -81.9571D);
			assertTrue(response != null);
		}catch(Exception e){
			fail("Unexpected Exception");
		}
	}

    @Test
    public void testGetSegmentationByAddressAsync() throws InterruptedException {
        Segmentation[] segmentationResponses = new Segmentation[1];
        mSegmentationService.getSegmentationByAddress("1 Global View, Troy, NY", "USA", TestUtility.getCallBack(segmentationResponses, null));
        Thread.sleep(3000);
        assertTrue(segmentationResponses[0] != null);
    }

    @Test
    public void testGetSegmentationByAddressWithInvalidParamsAsync() throws InterruptedException {
        final SdkException[] sdkException = new SdkException[1];
        mSegmentationService.getSegmentationByAddress(null, "USA", TestUtility.getCallBack(new Segmentation[0], sdkException));
        Thread.sleep(3000);
        TestUtility.verifyException(sdkException[0]);
    }

    @Test
    public void testGetSegmentationByLocationAsync() throws InterruptedException {
        Segmentation[] segmentationResponses = new Segmentation[1];
        mSegmentationService.getSegmentationByLocation(35.0118D, -81.9571D, TestUtility.getCallBack(segmentationResponses, null));
        Thread.sleep(3000);
        assertTrue(segmentationResponses[0] != null);
    }

    @Test
    public void testGetSegmentationByLocationWithInvalidParamsAsync() throws InterruptedException {
        final SdkException[] sdkException = new SdkException[1];
        mSegmentationService.getSegmentationByLocation(355.0118D, -811.9571D, TestUtility.getCallBack(new Segmentation[0], sdkException));
        Thread.sleep(3000);
        TestUtility.verifyException(sdkException[0]);
    }
    
    @Test
   	public void testToCompareSDKAndAPIResponseOfSegmentationByAddress() throws SdkException, JSONException  {
    	 Map<String,Object> keyValueMap = new HashMap<String, Object>();
         keyValueMap.put("address","1 Global View, Troy, NY");
         keyValueMap.put("country","USA");
   		 String jsonResponseFromAPI = TestUtility.getJSONResponseFromAPI(keyValueMap,TEST_URL,"geoapis/services/geolife/v1/segmentation/byaddress");
         Gson gson = new Gson();
         Segmentation response = mSegmentationService.getSegmentationByAddress("1 Global View, Troy, NY", "USA");
         String jsonResponseFromSDK = gson.toJson(response);
   	     JSONAssert.assertEquals(jsonResponseFromAPI,jsonResponseFromSDK, JSONCompareMode.STRICT);
   	}

   	@Test
   	public void testToCompareSDKAndAPIResponseOfSegmentationByLocation() throws SdkException, JSONException  {
   		Map<String,Object> keyValueMap = new HashMap<String, Object>();
        keyValueMap.put("latitude",35.0118D);
        keyValueMap.put("longitude",-81.9571D);
   		String jsonResponseFromAPI = TestUtility.getJSONResponseFromAPI(keyValueMap,TEST_URL,"geoapis/services/geolife/v1/segmentation/bylocation");
        Gson gson = new Gson();
        Segmentation response = mSegmentationService.getSegmentationByLocation(35.0118D, -81.9571D);
        String jsonResponseFromSDK = gson.toJson(response);
   	    JSONAssert.assertEquals(jsonResponseFromAPI,jsonResponseFromSDK, JSONCompareMode.STRICT);
   	}

    @After
	public void tearDown() throws Exception {
		mLI = null;
		mSegmentationService = null;
		
	}

}
