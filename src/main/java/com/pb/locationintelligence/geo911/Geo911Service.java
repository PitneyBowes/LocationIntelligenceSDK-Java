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
package com.pb.locationintelligence.geo911;

import com.pb.locationintelligence.RequestObserver;
import com.pb.locationintelligence.exception.SdkException;
import com.pb.locationintelligence.geo911.model.AHJPlusPSAPResponse;
import com.pb.locationintelligence.geo911.model.PsapResponse;

/**
 * This service provides Life-saving emergency call-routing information (PSAP details) w.r.t requested Address or Latitude-Longitude.
 */
public interface Geo911Service {

	/**
	 * Retrieves Public Safety Answering Points (PSAP) details. 
	 * Accepts the address as input and returns PSAP locations' details 
	 * including agency name, phone number, county name, coverage, contact person's 
	 * details, site details and mailing address.
	 * @param address
	 * 			Required - Free-form address text
     * @return {@link PsapResponse}
     */
    public PsapResponse getPSAPByAddress(String address) throws SdkException;

    /**
     * Retrieves Public Safety Answering Points (PSAP) details.
     * Accepts the address as input and returns PSAP locations' details
     * including agency name, phone number, county name, coverage, contact person's
     * details, site details and mailing address.
     *
     * @param address
     * 			Required - Free-form address text
     * @param requestObserver
     *          Required - The callback implementation to get response or errors.
     */
    public void getPSAPByAddress(String address, RequestObserver<PsapResponse> requestObserver);
    
    /**
     * Retrieves Public Safety Answering Points (PSAP) details.
     * Accepts latitude and longitude co-ordinates as input and returns PSAP locations' details
     * including agency name, phone number, county name, coverage,
     * contact person's details, site details and mailing address.
     * @param latitude
     * 			Required - latitude of the location
     * @param longitude
     * 			Required - longitude of the location
     * @return {@link PsapResponse}
     */
    public PsapResponse getPSAPByLocation(Double latitude, Double longitude) throws SdkException;

    /**
     * Retrieves Public Safety Answering Points (PSAP) details.
     * Accepts latitude and longitude co-ordinates as input and returns PSAP locations' details
     * including agency name, phone number, county name, coverage,
     * contact person's details, site details and mailing address.
     *
     * @param latitude
     * 			Required - latitude of the location
     * @param longitude
     * 			Required - longitude of the location
     * @param requestObserver
     *          Required - The callback implementation to get response or errors.
     */
    public void getPSAPByLocation(Double latitude, Double longitude, RequestObserver<PsapResponse> requestObserver);
    
    /**
	 * Retrieves the authority having jurisdiction and public safety answering points at a location
	 * Accepts the address as input and returns PSAP locations' details 
	 * including agency name, phone number, county name, coverage, contact person's 
	 * details, site details and mailing address.
	 * @param address
	 * 			Required - Free-form address text
     * @return {@link PsapResponse}
     */
    public AHJPlusPSAPResponse getAHJPlusPSAPByAddress(String address) throws SdkException;
    
    
    /**
     * Retrieves the authority having jurisdiction and public safety answering points at a location.
     * Accepts the address as input and returns PSAP locations' details
     * including agency name, phone number, county name, coverage, contact person's
     * details, site details and mailing address.
     *
     * @param address
     * 			Required - Free-form address text
     * @param requestObserver
     *          Required - The callback implementation to get response or errors.
     */
    public void getAHJPlusPSAPByAddress(String address, RequestObserver<AHJPlusPSAPResponse> requestObserver);
    
    /**
     * Retrieves the authority having jurisdiction and public safety answering points at a location.
     * Accepts latitude and longitude co-ordinates as input and returns PSAP locations' details
     * including agency name, phone number, county name, coverage,
     * contact person's details, site details and mailing address.
     * @param latitude
     * 			Required - latitude of the location
     * @param longitude
     * 			Required - longitude of the location
     * @return {@link PsapResponse}
     */
    public AHJPlusPSAPResponse getAHJPlusPSAPByLocation(Double latitude, Double longitude) throws SdkException;
    
    /**
     * Retrieves the authority having jurisdiction and public safety answering points at a location.
     * Accepts latitude and longitude co-ordinates as input and returns PSAP locations' details
     * including agency name, phone number, county name, coverage,
     * contact person's details, site details and mailing address.
     *
     * @param latitude
     * 			Required - latitude of the location
     * @param longitude
     * 			Required - longitude of the location
     * @param requestObserver
     *          Required - The callback implementation to get response or errors.
     */
    public void getAHJPlusPSAPByLocation(Double latitude, Double longitude, RequestObserver<AHJPlusPSAPResponse> requestObserver);
   
}