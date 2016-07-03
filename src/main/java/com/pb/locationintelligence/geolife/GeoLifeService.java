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
package com.pb.locationintelligence.geolife;

import com.pb.locationintelligence.RequestObserver;
import com.pb.locationintelligence.exception.SdkException;
import com.pb.locationintelligence.geolife.model.GeoLifeResponse;

/**
 * This Service provides demographic data and lifestyle characteristics for a specific area.
 *
 */
public interface GeoLifeService {
	
	/**
	 * Returns the geodemographic variables - age, gender, marital status, ethnicity, and household income
	 * based on an address provided
	 * @param address
	 *   		Required - address text
	 * @param country
     *          Optional - Country Code
     *          Acceptable list of country codes: USA,CAN,AUS,SWE,JPN,GBR
	 * @param profile
	 * 			Optional - Pre-defined profiles sets. Below are the values:
	 * 			  			'Top5Ascending': Retrieves the top 5 results in ascending order.
	 * 						'Top5Descending': Retrieves the top 5 results in descending order.
	 * 						'Top3Ascending': Retrieves the top 3 results in ascending order.
	 * 						'Top3Descending': Retrieves the top 3 results in descending order
	 * @param filter
	 * 			Optional - Represents demographic themes to narrow down search results
	 * 						for example; AgeTheme, IncomeTheme, EthnicityTheme.
	 * 						Maximum number of themes that can be provided as a filter are 10.
	 * @return {@link GeoLifeResponse}
	 */
    public GeoLifeResponse getDemographicsByAddress(String address,String country, String profile, String filter) throws SdkException;
    
    /**
     * Returns the geodemographic variables - age, gender, marital status, ethnicity, and household income based on the location provided
     * @param latitude
     *  		Required - latitude of the location
     * @param longitude
     *  		Required - longitude of the location
     * @param profile
     * 			Optional - Pre-defined profiles sets. Below are the values:
	 * 			  			'Top5Ascending': Retrieves the top 5 results in ascending order.
	 * 						'Top5Descending': Retrieves the top 5 results in descending order.
	 * 						'Top3Ascending': Retrieves the top 3 results in ascending order.
	 * 						'Top3Descending': Retrieves the top 3 results in descending order
     * @param filter
     *  		Optional - Represents demographic themes to narrow down search results
	 * 					   for example; AgeTheme, IncomeTheme, EthnicityTheme.
	 * 					   Maximum number of themes that can be provided as a filter are 10.
	 *
	 * @return {@link GeoLifeResponse}
     */
    public GeoLifeResponse getDemographicsByLocation(Double latitude, Double longitude, String profile, String filter) throws SdkException;
    
    /**
     * Returns the geodemographic variables - age, gender, marital status, ethnicity, and household income
     * based on an address provided
     * @param address
     *   		Required - address text
     * @param country
     *          Optional - Country Code
     *          Acceptable list of country codes: USA,CAN,AUS,SWE,JPN,GBR
     * @param profile
     * 			Optional - Pre-defined profiles sets. Below are the values:
     * 			  			'Top5Ascending': Retrieves the top 5 results in ascending order.
     * 						'Top5Descending': Retrieves the top 5 results in descending order.
     * 						'Top3Ascending': Retrieves the top 3 results in ascending order.
     * 						'Top3Descending': Retrieves the top 3 results in descending order
     * @param filter
     * 			Optional - Represents demographic themes to narrow down search results
     * 						for example; AgeTheme, IncomeTheme, EthnicityTheme.
     * 						Maximum number of themes that can be provided as a filter are 10.
     * @param requestObserver
     *          Required - The callback implementation to get response or errors
     */
    public void getDemographicsByAddress(String address,String country, String profile, String filter, RequestObserver<GeoLifeResponse> requestObserver);

    /**
     * Returns the geodemographic variables - age, gender, marital status, ethnicity, and household income based on the location provided
     * @param latitude
     *  		Required - latitude of the location
     * @param longitude
     *  		Required - longitude of the location
     * @param profile
     * 			Optional - Pre-defined profiles sets. Below are the values:
     * 			  			'Top5Ascending': Retrieves the top 5 results in ascending order.
     * 						'Top5Descending': Retrieves the top 5 results in descending order.
     * 						'Top3Ascending': Retrieves the top 3 results in ascending order.
     * 						'Top3Descending': Retrieves the top 3 results in descending order
     * @param filter
     *  		Optional - Represents demographic themes to narrow down search results
     * 					   for example; AgeTheme, IncomeTheme, EthnicityTheme.
     * 					   Maximum number of themes that can be provided as a filter are 10.
     * @param requestObserver
     *          Required - The callback implementation to get response or errors
     */
    public void getDemographicsByLocation(Double latitude, Double longitude, String profile, String filter, RequestObserver<GeoLifeResponse> requestObserver);

}
