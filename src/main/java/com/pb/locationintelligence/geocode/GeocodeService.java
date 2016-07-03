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

import java.util.List;

import com.pb.locationintelligence.RequestObserver;
import com.pb.locationintelligence.exception.SdkException;
import com.pb.locationintelligence.geocode.model.Reverse.Point;
import com.pb.locationintelligence.geocode.model.dictionaries.ConfiguredDictionariesResponse;
import com.pb.locationintelligence.geocode.model.forward.Address;
import com.pb.locationintelligence.geocode.model.capabilities.GeocodeCapabilitiesResponse;
import com.pb.locationintelligence.geocode.preferences.GeocodePreferenceBuilder;
import com.pb.locationintelligence.geocode.model.GeocodeServiceResponseList;

public interface GeocodeService {

	/**
	 * get configured Dictionary based on country and bundleType
	 *
	 * @param bundleType
	 * @return ConfiguredDictionaryResponse
	 * @throws SdkException
	 */
	public ConfiguredDictionariesResponse getConfiguredDictionaries(BundleType bundleType) throws SdkException;

	/**
	 * get configured Dictionary based on country and bundleType
	 * 
	 * @param bundleType
	 * @param requestObserver
	 */
	public void getConfigureDictionariesAsync(BundleType bundleType,
			RequestObserver<ConfiguredDictionariesResponse> requestObserver);

	/**
	 * get configured Dictionary based on country and bundleType
	 * 
	 * @param country
	 * @param bundleType
	 * @return ConfiguredDictionaryResponse
	 * @throws SdkException
	 */
	public ConfiguredDictionariesResponse getConfiguredDictionaries(Countries country, BundleType bundleType)
			throws SdkException;

	/**
	 * get configured Dictionary based on country and bundleType
	 *
	 * @param country
	 * @param bundleType
	 * @param requestObserver
	 */
	public void getConfigureDictionariesAsync(Countries country, BundleType bundleType,
			RequestObserver<ConfiguredDictionariesResponse> requestObserver);

	/**
	 * get Capabilities based on bundleType
	 * 
	 * @param bundleType
	 * @return GeocodeCapabilitiesResponse
	 * @throws SdkException
	 */
	public GeocodeCapabilitiesResponse getCapabilities(BundleType bundleType) throws SdkException;

	/**
	 * get Capabilities based on bundleType
	 * 
	 * @param bundleType
	 * @param requestObserver
	 */
	public void getCapabilitiesAsync(BundleType bundleType,
			RequestObserver<GeocodeCapabilitiesResponse> requestObserver);

	/**
	 * get Capabilities based on country and bundleType
	 * 
	 * @param country
	 * @param bundleType
	 * @return GeocodeCapabilitiesResponse
	 * @throws SdkException
	 */
	public GeocodeCapabilitiesResponse getCapabilities(Countries country, BundleType bundleType) throws SdkException;

	/**
	 * get Capabilities based on country and bundleType
	 * 
	 * @param country
	 * @param bundleType
	 * @param requestObserver
	 */
	public void getCapabilitiesAsync(Countries country, BundleType bundleType,
			RequestObserver<GeocodeCapabilitiesResponse> requestObserver);

	/**
	 * get Capabilities based on operation and bundleType
	 * 
	 * @param operation
	 * @param bundleType
	 * @return GeocodeCapabilitiesResponse
	 * @throws SdkException
	 */
	public GeocodeCapabilitiesResponse getCapabilities(OperationType operation, BundleType bundleType)
			throws SdkException;

	/**
	 * get Capabilities based on operation and bundleType
	 * 
	 * @param operation
	 * @param bundleType
	 * @param requestObserver
	 */
	public void getCapabilitiesAsync(OperationType operation, BundleType bundleType,
			RequestObserver<GeocodeCapabilitiesResponse> requestObserver);

	/**
	 * get Capabilities based on country, operation and bundleType
	 * 
	 * @param country
	 * @param operation
	 * @param bundleType
	 * @return GeocodeCapabilitiesResponse
	 * @throws SdkException
	 */
	public GeocodeCapabilitiesResponse getCapabilities(Countries country, OperationType operation,
			BundleType bundleType) throws SdkException;

	/**
	 * get Capabilities based on country, operation and bundleType
	 * 
	 * @param country
	 * @param operation
	 * @param bundleType
	 * @param requestObserver
	 */
	public void getCapabilitiesAsync(Countries country, OperationType operation, BundleType bundleType,
			RequestObserver<GeocodeCapabilitiesResponse> requestObserver);

	/**
	 * get Forward Geocode based on address and bundleType
	 * 
	 * @param address
	 * @param bundleType
	 * @return GeocodeServiceResponseList
	 * @throws SdkException
	 */
	public GeocodeServiceResponseList getGeocode(Address address, BundleType bundleType) throws SdkException;

	/**
	 * get Forward Geocode based on address and bundleType
	 * 
	 * @param address
	 * @param bundleType
	 * @param requestObserver
	 */
	public void getGeocodeAsync(Address address, BundleType bundleType,
			RequestObserver<GeocodeServiceResponseList> requestObserver);

	/**
	 * get Forward Geocode based on address and bundleType
	 * 
	 * @param addresses
	 * @param bundleType
	 * @return GeocodeServiceResponseList
	 * @throws SdkException
	 */
	public GeocodeServiceResponseList getGeocodeBatch(List<Address> addresses, BundleType bundleType)
			throws SdkException;

	/**
	 * get Forward Geocode based on address and bundleType
	 * 
	 * @param addresses
	 * @param bundleType
	 * @param requestObserver
	 */
	public void getGeocodeBatchAsync(List<Address> addresses, BundleType bundleType,
			RequestObserver<GeocodeServiceResponseList> requestObserver);

	/**
	 * get Forward Geocode based on address, bundleType and preferenceBuilder
	 * 
	 * @param addresses
	 * @param bundleType
	 * @param preferenceBuilder
	 * @return GeocodeServiceResponseList
	 * @throws SdkException
	 */

	public GeocodeServiceResponseList getGeocodeAdvancedBatch(List<Address> addresses, BundleType bundleType,
			GeocodePreferenceBuilder preferenceBuilder) throws SdkException;

	/**
	 * get Forward Geocode based on address, bundleType and preferenceBuilder
	 * 
	 * @param addresses
	 * @param bundleType
	 * @param preferenceBuilder
	 * @param requestObserver
	 */

	public void getGeocodeAdvancedBatchAsync(List<Address> addresses, BundleType bundleType,
			GeocodePreferenceBuilder preferenceBuilder, RequestObserver<GeocodeServiceResponseList> requestObserver);

	/**
	 * get Reverse Geocode based on a point and bundleType
	 * 
	 * @param point
	 * @param bundleType
	 * @return GeocodeServiceResponse
	 */
	public GeocodeServiceResponseList getReverseGeocode(Point point, BundleType bundleType) throws SdkException;

	/**
	 * get Reverse Geocode based on a point and bundleType
	 * 
	 * @param point
	 * @param bundleType
	 * @param requestObserver
	 */
	public void getReverseGeocodeAsync(Point point, BundleType bundleType,
			RequestObserver<GeocodeServiceResponseList> requestObserver);

	/**
	 * get Reverse Geocode based on a set of points and bundleType
	 * 
	 * @param points
	 * @param bundleType
	 * @return GeocodeServiceResponseList
	 * @throws SdkException
	 */
	public GeocodeServiceResponseList getReverseGeocodeBatch(List<Point> points, BundleType bundleType)
			throws SdkException;

	/**
	 * get Reverse Geocode based on a set of points and bundleType
	 * 
	 * @param points
	 * @param bundleType
	 * @param requestObserver
	 */
	public void getReverseGeocodeBatchAsync(List<Point> points, BundleType bundleType,
			RequestObserver<GeocodeServiceResponseList> requestObserver);

	/**
	 * get Reverse Geocode based on a set of points, bundleType and preferences
	 * 
	 * @param points
	 * @param bundleType
	 * @param preferenceBuilder
	 * @return GeocodeServiceResponseList
	 * @throws SdkException
	 */
	public GeocodeServiceResponseList getReverseGeocodeAdvancedBatch(List<Point> points, BundleType bundleType,
			GeocodePreferenceBuilder preferenceBuilder) throws SdkException;

	/**
	 * get Reverse Geocode based on a set of points, bundleType and preferences
	 * 
	 * @param points
	 * @param bundleType
	 * @param preferenceBuilder
	 * @param requestObserver
	 */
	public void getReverseGeocodeAdvancedBatchAsync(List<Point> points, BundleType bundleType,
			GeocodePreferenceBuilder preferenceBuilder, RequestObserver<GeocodeServiceResponseList> requestObserver);

}