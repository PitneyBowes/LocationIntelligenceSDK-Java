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
package com.pb.locationintelligence;

import com.pb.locationintelligence.common.model.ErrorCode;
import com.pb.locationintelligence.exception.SdkException;
import com.pb.locationintelligence.utils.Constants;
import com.pb.locationintelligence.utils.Utility;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import static org.junit.Assert.assertTrue;

public class TestUtility {
	
	private static final String CURRENT_DIRECTORY = "user.dir";

	private static final String LINE_SEPERATOR = "line.separator";

    private static final Logger _LOG = LoggerFactory.getLogger(TestUtility.class);

    public static void verifyException(SdkException e) {
        assertTrue(SdkException.ErrorResponseType.LI.equals(e.getErrorResponseType()));
        assertTrue(e.getLiApiErrors() != null);
        List<ErrorCode> errors = e.getLiApiErrors().getErrors();
        assertTrue(errors.size() > 0);

        for(ErrorCode errorCode : errors)
        {
            assertTrue(errorCode.getErrorCode().length()>0);
            assertTrue(errorCode.getErrorDescription().length()>0);
        }

        assertTrue(Response.Status.BAD_REQUEST.getStatusCode()==e.getLiApiErrors().getHttpStatusCode());
        assertTrue(e.getLiApiErrors().getReason().length() > 0);
        assertTrue(e.getLiApiErrors().getJsonResponse().length() > 0);
    }
    
    public static <T> RequestObserver<T> getCallBack(final T[] responseArray, final SdkException[] sdkException)
    {
        return new RequestObserver<T>() {
            @Override
            public void onSuccess(T response) {
                responseArray[0] = response;
            }

            @Override
            public void onFailure(SdkException e) {
                sdkException[0] = e;
            }
        };
    }
    
	public static String getJSONResponseFromAPI(Map<String, Object> keyValueMap, String baseURL, String serviceEndPoint) {
		StringBuilder URL = new StringBuilder(baseURL + serviceEndPoint);
		Utility.appendIfNotNull(URL, keyValueMap);
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target(URL.toString());

        Properties props = new Properties();
        try {
            InputStream fileIn = TestUtility.class.getResourceAsStream("/test.properties");
            props.load(fileIn);
            fileIn.close();
		} catch (Exception e) {
			_LOG.error("Unable to load test.properties");
			throw new RuntimeException(e);
		}

		Response apiResponse = target.request(MediaType.APPLICATION_JSON).header(Constants.AUTH_HEADER, props.getProperty("TEST_TOKEN")).buildGet().invoke();
		String jsonResponseFromAPI = apiResponse.readEntity(String.class);
		return jsonResponseFromAPI;
	}
	
	public static String getJSONResponseFromApiForPOSTRequest(String resourceURL, String baseURL, String serviceEndPoint) throws IOException {
		
		Entity paramEntity=buildEntityFromSuppliedJSON(resourceURL);
		
		StringBuilder URL = new StringBuilder(baseURL + serviceEndPoint);
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target(URL.toString());

        Properties props = new Properties();
        try {
            InputStream fileIn = TestUtility.class.getResourceAsStream("/test.properties");
            props.load(fileIn);
            fileIn.close();
		} catch (Exception e) {
			_LOG.error("Unable to load test.properties");
			throw new RuntimeException(e);
		}

        Response apiResponse = target.request(MediaType.APPLICATION_JSON).header(Constants.AUTH_HEADER, props.getProperty("TEST_TOKEN")).buildPost(paramEntity).invoke();
		String jsonResponseFromAPI = apiResponse.readEntity(String.class);
		return jsonResponseFromAPI;
	}
	
	/**
	 * Builds POST request by parsing json template
	 * 
	 * @param resourceURL
	 * @return Entity
	 * 
	 */
	private static Entity buildEntityFromSuppliedJSON(String resourceURL) throws IOException {

		String currentDir = System.getProperty(CURRENT_DIRECTORY);
		BufferedReader reader = new BufferedReader(new FileReader(currentDir + resourceURL));
		String line = null;
		StringBuilder builder = new StringBuilder();
		String ls = System.getProperty(LINE_SEPERATOR);
		String jsonRequest = null;

		try {
			while ((line = reader.readLine()) != null) {
				builder.append(line);
				builder.append(ls);
			}

			jsonRequest = builder.toString();

			Entity paramEntity = Entity.entity(jsonRequest, MediaType.APPLICATION_JSON_TYPE);

			return paramEntity;
		} finally {
			reader.close();
		}

	}
}
