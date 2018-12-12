/**
 * Location Intelligence APIs
 * Incorporate our extensive geodata into everyday applications, business processes and workflows.
 *
 * OpenAPI spec version: 6.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package pb.locationintelligence;

import pb.ApiCallback;
import pb.ApiClient;
import pb.ApiException;
import pb.ApiResponse;
import pb.Configuration;
import pb.Pair;
import pb.ProgressRequestBody;
import pb.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;

import pb.locationintelligence.model.Timezone;
import pb.locationintelligence.model.TimezoneLocation;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LIAPIGeoTimeServiceApi {
    private ApiClient apiClient;

    public LIAPIGeoTimeServiceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public LIAPIGeoTimeServiceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for getTimezoneByAddress */
    private com.squareup.okhttp.Call getTimezoneByAddressCall(String timestamp, String address, String matchMode, String country, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'timestamp' is set
        if (timestamp == null) {
            throw new ApiException("Missing the required parameter 'timestamp' when calling getTimezoneByAddress(Async)");
        }
        
        // verify the required parameter 'address' is set
        if (address == null) {
            throw new ApiException("Missing the required parameter 'address' when calling getTimezoneByAddress(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/geotime/v1/timezone/byaddress".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (timestamp != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "timestamp", timestamp));
        if (address != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "address", address));
        if (matchMode != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "matchMode", matchMode));
        if (country != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "country", country));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oAuth2Password" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Timezone By Address.
     * Identifies and retrieves the local time of any location in the world for a given address and time. The input and retrieved time format is in milliseconds.
     * @param timestamp Timestamp in miliseconds. (required)
     * @param address The address to be searched. (required)
     * @param matchMode Match modes determine the leniency used to make a match between the input address and the reference data. (optional, default to Relaxed)
     * @param country Country ISO code. (optional, default to USA)
     * @return Timezone
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Timezone getTimezoneByAddress(String timestamp, String address, String matchMode, String country) throws ApiException {
        ApiResponse<Timezone> resp = getTimezoneByAddressWithHttpInfo(timestamp, address, matchMode, country);
        return resp.getData();
    }

    /**
     * Timezone By Address.
     * Identifies and retrieves the local time of any location in the world for a given address and time. The input and retrieved time format is in milliseconds.
     * @param timestamp Timestamp in miliseconds. (required)
     * @param address The address to be searched. (required)
     * @param matchMode Match modes determine the leniency used to make a match between the input address and the reference data. (optional, default to Relaxed)
     * @param country Country ISO code. (optional, default to USA)
     * @return ApiResponse&lt;Timezone&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Timezone> getTimezoneByAddressWithHttpInfo(String timestamp, String address, String matchMode, String country) throws ApiException {
        com.squareup.okhttp.Call call = getTimezoneByAddressCall(timestamp, address, matchMode, country, null, null);
        Type localVarReturnType = new TypeToken<Timezone>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Timezone By Address. (asynchronously)
     * Identifies and retrieves the local time of any location in the world for a given address and time. The input and retrieved time format is in milliseconds.
     * @param timestamp Timestamp in miliseconds. (required)
     * @param address The address to be searched. (required)
     * @param matchMode Match modes determine the leniency used to make a match between the input address and the reference data. (optional, default to Relaxed)
     * @param country Country ISO code. (optional, default to USA)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTimezoneByAddressAsync(String timestamp, String address, String matchMode, String country, final ApiCallback<Timezone> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getTimezoneByAddressCall(timestamp, address, matchMode, country, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Timezone>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getTimezoneByLocation */
    private com.squareup.okhttp.Call getTimezoneByLocationCall(String timestamp, String longitude, String latitude, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'timestamp' is set
        if (timestamp == null) {
            throw new ApiException("Missing the required parameter 'timestamp' when calling getTimezoneByLocation(Async)");
        }
        
        // verify the required parameter 'longitude' is set
        if (longitude == null) {
            throw new ApiException("Missing the required parameter 'longitude' when calling getTimezoneByLocation(Async)");
        }
        
        // verify the required parameter 'latitude' is set
        if (latitude == null) {
            throw new ApiException("Missing the required parameter 'latitude' when calling getTimezoneByLocation(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/geotime/v1/timezone/bylocation".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (timestamp != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "timestamp", timestamp));
        if (longitude != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "longitude", longitude));
        if (latitude != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "latitude", latitude));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oAuth2Password" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Timezone By Location.
     * Identifies and retrieves the local time of any location in the world for a given latitude, longitude and time. The input and retrieved time format is in milliseconds.
     * @param timestamp Timestamp in miliseconds. (required)
     * @param longitude Longitude of the location. (required)
     * @param latitude Latitude of the location. (required)
     * @return TimezoneLocation
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TimezoneLocation getTimezoneByLocation(String timestamp, String longitude, String latitude) throws ApiException {
        ApiResponse<TimezoneLocation> resp = getTimezoneByLocationWithHttpInfo(timestamp, longitude, latitude);
        return resp.getData();
    }

    /**
     * Timezone By Location.
     * Identifies and retrieves the local time of any location in the world for a given latitude, longitude and time. The input and retrieved time format is in milliseconds.
     * @param timestamp Timestamp in miliseconds. (required)
     * @param longitude Longitude of the location. (required)
     * @param latitude Latitude of the location. (required)
     * @return ApiResponse&lt;TimezoneLocation&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<TimezoneLocation> getTimezoneByLocationWithHttpInfo(String timestamp, String longitude, String latitude) throws ApiException {
        com.squareup.okhttp.Call call = getTimezoneByLocationCall(timestamp, longitude, latitude, null, null);
        Type localVarReturnType = new TypeToken<TimezoneLocation>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Timezone By Location. (asynchronously)
     * Identifies and retrieves the local time of any location in the world for a given latitude, longitude and time. The input and retrieved time format is in milliseconds.
     * @param timestamp Timestamp in miliseconds. (required)
     * @param longitude Longitude of the location. (required)
     * @param latitude Latitude of the location. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTimezoneByLocationAsync(String timestamp, String longitude, String latitude, final ApiCallback<TimezoneLocation> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getTimezoneByLocationCall(timestamp, longitude, latitude, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TimezoneLocation>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
