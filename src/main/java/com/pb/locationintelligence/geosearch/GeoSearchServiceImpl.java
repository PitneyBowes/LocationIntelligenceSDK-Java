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
import com.pb.locationintelligence.utils.UrlMaker;
import com.pb.locationintelligence.utils.Utility;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * GeoSearchService Implementation Class
 */

public class GeoSearchServiceImpl implements GeoSearchService {

    private static final Logger _LOG = LoggerFactory.getLogger(GeoSearchServiceImpl.class);

    private static final String geoSearchURL = "/geosearch/v1/locations";

    @Override
    public Locations geoSearch(String searchText, Double originLatitude, Double originLongitude) throws SdkException {

        UrlMaker urlMaker = UrlMaker.getInstance();

        StringBuilder urlBuilder = new StringBuilder(urlMaker.getAbsoluteUrl(geoSearchURL));

        Map<String, Object> keyValueMap = new HashMap<String, Object>();
        keyValueMap.put("searchText", searchText);
        keyValueMap.put("latitude", originLatitude);
        keyValueMap.put("longitude", originLongitude);

        Utility.appendIfNotNull(urlBuilder, keyValueMap);

        _LOG.debug("API URL : " + urlBuilder);
        return Utility.processAPIRequest(urlBuilder.toString(), Locations.class);
    }

    @Override
    public Locations geoSearch(String searchText, Double originLatitude, Double originLongitude, Float searchRadius, String searchRadiusUnit, Integer maxCandidates) throws SdkException {
        UrlMaker urlMaker = UrlMaker.getInstance();

        StringBuilder urlBuilder = new StringBuilder(urlMaker.getAbsoluteUrl(geoSearchURL));

        Map<String, Object> keyValueMap = new HashMap<String, Object>();
        keyValueMap.put("searchText", searchText);
        keyValueMap.put("latitude", originLatitude);
        keyValueMap.put("longitude", originLongitude);
        keyValueMap.put("searchRadius", searchRadius);
        keyValueMap.put("searchRadiusUnit", searchRadiusUnit);
        keyValueMap.put("maxCandidates", maxCandidates);

        Utility.appendIfNotNull(urlBuilder, keyValueMap);

        _LOG.debug("API URL : " + urlBuilder);
        return Utility.processAPIRequest(urlBuilder.toString(), Locations.class);
    }

    @Override
    public void geoSearch(final String searchText, final Double originLatitude, final Double originLongitude, final RequestObserver<Locations> requestObserver) {
        final ExecutorService executorService = Executors.newFixedThreadPool(1);
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                try {
                    Locations locations = geoSearch(searchText, originLatitude, originLongitude);
                    requestObserver.onSuccess(locations);
                } catch (SdkException e) {
                    requestObserver.onFailure(e);
                }finally{
					executorService.shutdown();					
				}
            }
        });
    }

    @Override
    public void geoSearch(final String searchText, final Double originLatitude, final Double originLongitude, final Float searchRadius, final String searchRadiusUnit, final Integer maxCandidates, final RequestObserver<Locations> requestObserver) {
        final ExecutorService executorService = Executors.newFixedThreadPool(1);
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                try {
                    Locations locations = geoSearch(searchText, originLatitude, originLongitude, searchRadius, searchRadiusUnit, maxCandidates);
                    requestObserver.onSuccess(locations);
                } catch (SdkException e) {
                    requestObserver.onFailure(e);
                }finally{
					executorService.shutdown();					
				}
            }
        });
    }
}
