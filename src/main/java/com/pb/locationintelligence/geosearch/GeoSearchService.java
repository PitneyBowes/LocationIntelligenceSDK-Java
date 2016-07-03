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
package com.pb.locationintelligence.geosearch;

import com.pb.locationintelligence.RequestObserver;
import com.pb.locationintelligence.common.model.Locations;
import com.pb.locationintelligence.exception.SdkException;

/**
 * This service provides local search capabilities into your apps and services.
 * It provides both independent and neutral local search information based on
 * the input of search text and location coordinate w.r.t requested Address or
 * Latitude-Longitude.
 */
public interface GeoSearchService {

    /**
     * Retrieves Geo Search results
     *
     * @param searchText      Mandatory - The input to be searched
     * @param originLatitude  Mandatory - The latitude of the location
     * @param originLongitude Mandatory - The longitude of the location
     * @return {@link com.pb.locationintelligence.common.model.Locations}
     */
    public Locations geoSearch(String searchText,
                               Double originLatitude, Double originLongitude) throws SdkException;

    /**
     * Retrieves Geo Search results
     *
     * @param searchText       Mandatory - The input to be searched
     * @param originLatitude   Mandatory - The latitude of the location
     * @param originLongitude  Mandatory - The longitude of the location
     * @param searchRadius     Optional - The radius from the given co-ordinates in which to
     *                         search for results.
     * @param searchRadiusUnit Optional - Unit used for searchRadius.The acceptable unit
     *                         values are: Feet, Kilometres, Miles and Meters. The
     *                         searchRadiusUnit is optional, if not provided; the Feet
     *                         value is taken by default. The specified values are
     *                         case-insensitive.
     * @param maxCandidates    Optional - Maximum number of results to return
     * @return {@link com.pb.locationintelligence.common.model.Locations}
     */
    public Locations geoSearch(String searchText,
                               Double originLatitude, Double originLongitude,
                               Float searchRadius, String searchRadiusUnit,
                               Integer maxCandidates) throws SdkException;


    /**
     * Retrieves Geo Search results
     *
     * @param searchText      Mandatory - The input to be searched
     * @param originLatitude  Mandatory - The latitude of the location
     * @param originLongitude Mandatory - The longitude of the location
     * @param requestObserver Required - The callback implementation to get response or errors.
     */
    public void geoSearch(String searchText, Double originLatitude, Double originLongitude, RequestObserver<Locations> requestObserver);

    /**
     * Retrieves Geo Search results
     *
     * @param searchText       Mandatory - The input to be searched
     * @param originLatitude   Mandatory - The latitude of the location
     * @param originLongitude  Mandatory - The longitude of the location
     * @param searchRadius     Optional - The radius from the given co-ordinates in which to
     *                         search for results.
     * @param searchRadiusUnit Optional - Unit used for searchRadius.The acceptable unit
     *                         values are: Feet, Kilometres, Miles and Meters. The
     *                         searchRadiusUnit is optional, if not provided; the Feet
     *                         value is taken by default. The specified values are
     *                         case-insensitive.
     * @param maxCandidates    Optional - Maximum number of results to return
     * @param requestObserver  Required - The callback implementation to get response or errors.
     */
    public void geoSearch(String searchText,
                          Double originLatitude, Double originLongitude,
                          Float searchRadius, String searchRadiusUnit,
                          Integer maxCandidates, RequestObserver<Locations> requestObserver);

}