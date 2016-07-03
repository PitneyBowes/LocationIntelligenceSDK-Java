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
package com.pb.locationintelligence.geoenhance;

import com.pb.locationintelligence.RequestObserver;
import com.pb.locationintelligence.common.model.Locations;
import com.pb.locationintelligence.exception.SdkException;
import com.pb.locationintelligence.geoenhance.model.TimezoneResponse;

/**
 * This service provides addresses, place names, and points of interests.
 */
public interface GeoEnhanceService {

	/**
	 * Accepts longitude and latitude and returns an Address for that location
	 * 
	 * @param latitude
	 *            Required - Latitude of the location
	 * @param longitude
	 *            Required - Longitude of the location
	 * @param searchRadius
	 *            Optional - Search Radius, in feet. Default Value is 150 feet,
	 *            Allowed range is 0- 5280 feet
	 * @param searchRadiusUnit
	 *            Optional - Unit used for searchRadius. Allowed values are
	 *            FEET,METERS,MILES,KILOMETERS (Case insensitive)
	 * @return {@link com.pb.locationintelligence.common.model.Locations}
	 */
	public Locations getAddress(Double latitude, Double longitude, Float searchRadius, String searchRadiusUnit) throws SdkException;

	/**
	 * Retrieves the nearest neighborhood around a specific location. This service accepts latitude & longitude as input and returns a place name.
     *
	 * @param latitude
	 *            Required - latitude of the location
	 * @param longitude
	 *            Required - longitude of the location
	 * @param levelHint
	 *            Optional - Level of Information. Below are the numeric codes
	 *            for geographic hierarchy level: LEVEL 1 = Country LEVEL 2 =
	 *            State or equivalent LEVEL 3 = District or equivalent LEVEL 4
	 *            =City or Town LEVEL 5 = Locality LEVEL 6 = Neighbourhood If
	 *            not provided, returns the lowest geographic hierarchy level
	 *            information available
	 * @return {@link com.pb.locationintelligence.common.model.Locations}
	 */
	public Locations getPlace(Double latitude, Double longitude, Integer levelHint) throws SdkException;

	/**
	 * Retrieves Point of Interests (POI) around the given location.
	 * 
	 * @param latitude
	 *            Required - latitude of the location
	 * @param longitude
	 *            Required - longitude of the location
	 * @param category
	 *            Optional - Category or Sub-Category to refine the POI search
	 *            results
	 * @param maxCandidates
	 *            Optional - Maximum number of POIs that will be returned.
	 *            Default is 10
	 * @param searchRadius
	 *            Optional - Search Radius, in miles. Default Value is 2 miles,
	 *            Allowed range is 0-50 miles
	 * @param searchRadiusUnit
	 *            Optional - Unit used for searchRadius. Allowed values are
	 *            FEET,METERS,MILES,KILOMETERS (Case insensitive)
	 * @param searchDataset
	 *            Optional - Comma-separated input of dataSet names ('PBData'
	 *            for searching in PB Data).
	 * @param searchPriority
	 *            Optional - Define priority while searching on DataSets.
	 *            Allowed values are Y/N.
	 * @return {@link com.pb.locationintelligence.common.model.Locations}
	 */
	public Locations getPOI(Double latitude, Double longitude, String category, Integer maxCandidates, Float searchRadius, String searchRadiusUnit, String searchDataset,
			String searchPriority) throws SdkException;

	/**
	 * Retrieves Point of Interests (POI) around the given location.
	 * 
	 * @param latitude
	 *            Required - latitude of the location
	 * @param longitude
	 *            Required - longitude of the location
	 * @param category
	 *            Optional - Category or Sub-Category to refine the POI search
	 *            results
	 * @param maxCandidates
	 *            Optional - Maximum number of POIs that will be returned.
	 *            Default is 10
	 * @param searchRadius
	 *            Optional - Search Radius, in miles. Default Value is 2 miles,
	 *            Allowed range is 0-50 miles
	 * @param searchRadiusUnit
	 *            Optional - Unit used for searchRadius. Allowed values are
	 *            FEET,METERS,MILES,KILOMETERS (Case insensitive)
	 * @param searchDataset
	 *            Optional - Comma-separated input of dataSet names ('PBData'
	 *            for searching in PB Data).
	 * @param searchPriority
	 *            Optional - Define priority while searching on DataSets.
	 *            Allowed values are Y/N.
	 * @param requestObserver
	 *            Required - The callback implementation to get response or errors.
	 */
	public void getPOI(Double latitude, Double longitude, String category, Integer maxCandidates, Float searchRadius, String searchRadiusUnit, String searchDataset,
			String searchPriority, RequestObserver<Locations> requestObserver);

	/**
     * Retrieves the nearest neighborhood around a specific location. This service accepts latitude & longitude as input and returns a place name.
     *
	 * @param latitude
	 *            Required - latitude of the location
	 * @param longitude
	 *            Required - longitude of the location
	 * @param levelHint
	 *            Optional - Level of Information. Below are the numeric codes
	 *            for geographic hierarchy level: LEVEL 1 = Country LEVEL 2 =
	 *            State or equivalent LEVEL 3 = District or equivalent LEVEL 4
	 *            =City or Town LEVEL 5 = Locality LEVEL 6 = Neighbourhood If
	 *            not provided, returns the lowest geographic hierarchy level
	 *            information available
	 * @param requestObserver
	 *            Required - The callback implementation to get response or errors.
	 */
	public void getPlace(Double latitude, Double longitude, Integer levelHint, RequestObserver<Locations> requestObserver);

	/**
	 * Accepts longitude and latitude and returns an Address for that location
	 * 
	 * @param latitude
	 *            Required - Latitude of the location
	 * @param longitude
	 *            Required - Longitude of the location
	 * @param searchRadius
	 *            Optional - Search Radius, in feet. Default Value is 150 feet,
	 *            Allowed range is 0- 5280 feet
	 * @param searchRadiusUnit
	 *            Optional - Unit used for searchRadius. Allowed values are
	 *            FEET,METERS,MILES,KILOMETERS (Case insensitive)
	 * @param requestObserver
	 *            Required - The callback implementation to get response or errors.
	 */
	public void getAddress(Double latitude, Double longitude, Float searchRadius, String searchRadiusUnit, RequestObserver<Locations> requestObserver);
	
	/**
	 * Return timezone details synchronously for the given latitude and longitude
	 * @param timestamp
	 *  		 Required - timestamp
	 * @param latitude
	 * 			 Required - Latitude of the location
	 * @param longitude
	 * 			 Required - Longitude of the location
	 * @return {@link TimezoneResponse}
	 * @throws SdkException
	 */
	public TimezoneResponse getTimezone(Long timestamp, Double latitude, Double longitude) throws SdkException;

	/**
	 * Retrieves timezone details asynchronously for the given latitude and longitude
	 * @param timestamp
	 *  		 Required - timestamp
	 * @param latitude
	 * 			 Required - Latitude of the location
	 *  @param longitude
	 * 			 Required - Longitude of the location
	 *  @param requestObserver
	 *			 Required - The callback implementation to get response or errors.
	 */
	public void getTimezone(Long timestamp, Double latitude, Double longitude, RequestObserver<TimezoneResponse> requestObserver);
}
