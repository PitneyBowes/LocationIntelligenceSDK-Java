/*
 * Copyright 2016 Pitney Bowes Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and limitations under the License.
 *
 */

package com.pb.locationintelligence.geocomm;

import com.pb.locationintelligence.RequestObserver;
import com.pb.locationintelligence.exception.SdkException;
import com.pb.locationintelligence.geocomm.model.RateCenterResponse;


/**
 * This service provides rate center information w.r.t requested Address or Latitude-Longitude.
 *
 * @author MU001UP
 */
public interface GeocommService {

    /** Get Rate center Response by Address async
     * @param address
     * @param requestObserver
     */
    public void getRateCenterByAddress(String address, RequestObserver<RateCenterResponse> requestObserver) throws SdkException;

    /** Get Rate center Response by Address async
     * @param address
     * @param areaCodeInfo
     * @param requestObserver
     */
    public void getRateCenterByAddress(String address, boolean areaCodeInfo, RequestObserver<RateCenterResponse> requestObserver) throws SdkException;

    /** Get Rate center Response by Address async
     * @param address
     * @param areaCodeInfo
     * @param level
     * @param requestObserver
     */
    public void getRateCenterByAddress(String address, boolean areaCodeInfo, String level, RequestObserver<RateCenterResponse> requestObserver) throws SdkException;

    /**
     * @param address
     * @param country
     * @param requestObserver
     */
    public void getRateCenterByAddress(String address, String country, RequestObserver<RateCenterResponse> requestObserver) throws SdkException;

    /** Get Rate center Response by Address async
     * @param address
     * @param country
     * @param areaCodeInfo
     * @param requestObserver
     */
    public void getRateCenterByAddress(String address, String country, boolean areaCodeInfo, RequestObserver<RateCenterResponse> requestObserver) throws SdkException;

    /** Get Rate center Response by Address async
     * @param address
     * @param country
     * @param areaCodeInfo
     * @param level
     * @param requestObserver
     */
    public void getRateCenterByAddress(String address, String country, boolean areaCodeInfo, String level, RequestObserver<RateCenterResponse> requestObserver) throws SdkException;

    /** Get Rate center Response by Location async
     * @param longitude
     * @param latitude
     * @param requestObserver
     */
    public void getRateCenterByLocation(Double longitude, Double latitude, RequestObserver<RateCenterResponse> requestObserver) throws SdkException;

    /**
     * Get Rate center Response by Location async
     * @param longitude
     * @param latitude
     * @param areaCodeInfo
     * @param requestObserver
     */
    public void getRateCenterByLocation(Double longitude, Double latitude, boolean areaCodeInfo, RequestObserver<RateCenterResponse> requestObserver) throws SdkException;

    /** Get Rate center Response by Location async
     * @param longitude
     * @param latitude
     * @param areaCodeInfo
     * @param level
     * @param requestObserver
     */
    public void getRateCenterByLocation(Double longitude, Double latitude, boolean areaCodeInfo, String level, RequestObserver<RateCenterResponse> requestObserver) throws SdkException;


    /** Get Rate center Response by Address
     * @param address
     */
    public RateCenterResponse getRateCenterByAddress(String address) throws SdkException;

    /** Get Rate center Response by Address
     * @param address
     * @param areaCodeInfo
     */
    public RateCenterResponse getRateCenterByAddress(String address, boolean areaCodeInfo) throws SdkException;

    /** Get Rate center Response by Address
     * @param address
     * @param areaCodeInfo
     * @param level
     */
    public RateCenterResponse getRateCenterByAddress(String address, boolean areaCodeInfo, String level) throws SdkException;

    /** Get Rate center Response by Address
     * @param address
     * @param country
     */
    public RateCenterResponse getRateCenterByAddress(String address, String country) throws SdkException;

    /** Get Rate center Response by Address
     * @param address
     * @param country
     * @param areaCodeInfo
     */
    public RateCenterResponse getRateCenterByAddress(String address, String country, boolean areaCodeInfo) throws SdkException;

    /** Get Rate center Response by Address
     * @param address
     * @param country
     * @param areaCodeInfo
     * @param level
     */
    public RateCenterResponse getRateCenterByAddress(String address, String country, boolean areaCodeInfo, String level) throws SdkException;

    /** Get Rate center Response by Location
     * @param longitude
     * @param latitude
     */
    public RateCenterResponse getRateCenterByLocation(Double longitude, Double latitude) throws SdkException;

    /**
     * Get Rate center Response by Location
     * @param longitude
     * @param latitude
     * @param areaCodeInfo
     */
    public RateCenterResponse getRateCenterByLocation(Double longitude, Double latitude, boolean areaCodeInfo) throws SdkException;

    /** Get Rate center Response by Location
     * @param longitude
     * @param latitude
     * @param areaCodeInfo
     * @param level
     */
    public RateCenterResponse getRateCenterByLocation(Double longitude, Double latitude, boolean areaCodeInfo, String level) throws SdkException;
}
