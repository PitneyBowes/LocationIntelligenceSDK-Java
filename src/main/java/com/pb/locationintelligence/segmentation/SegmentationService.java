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

import com.pb.locationintelligence.RequestObserver;
import com.pb.locationintelligence.exception.SdkException;
import com.pb.locationintelligence.segmentation.model.Segmentation;

/**
 * This Service provides lifestyle segmentation data for a specific area.
 *
 */
public interface SegmentationService {

	/**
	 * Returns the lifestyle segmentation data for the specified address
	 *
     * @param address
     * 			Required - address text
     * @param country
     * 			Optional - Country Code
*          Acceptable list of country codes: USA,CAN,AUS,SWE,JPN,GBR
     * @return {@link Segmentation}
	 * @throws SdkException
	 */
    public Segmentation getSegmentationByAddress(String address, String country) throws SdkException;

    /**
     * Returns the lifestyle segmentation data for the specified location
     *
     * @param longitude
     * 		Required - longitude of the location
     * @param latitude
     * 		Required - latitude of the location
     * @return  {@link Segmentation}
     * @throws SdkException
     */
    public Segmentation getSegmentationByLocation(Double latitude,Double longitude) throws SdkException;

    /**
     * Returns the lifestyle segmentation data for the specified address asynchronously
     * @param address
	 * 			Required - address text
	 * @param country
	 * 			Optional - Country Code
     *          Acceptable list of country codes: USA,CAN,AUS,SWE,JPN,GBR
     * @param requestObserver
     */
    public void getSegmentationByAddress(String address, String country, RequestObserver<Segmentation> requestObserver);

    /**
     * Returns the lifestyle segmentation data for the specified location asynchronously
     * @param longitude
     * 		Required - longitude of the location
     * @param latitude
     * 		Required - latitude of the location
     * @param requestObserver
     */
    public void getSegmentationByLocation(Double latitude, Double longitude, RequestObserver<Segmentation> requestObserver);
}
