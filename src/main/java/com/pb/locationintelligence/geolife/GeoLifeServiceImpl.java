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

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.pb.locationintelligence.RequestObserver;
import com.pb.locationintelligence.exception.SdkException;
import com.pb.locationintelligence.geolife.model.GeoLifeResponse;
import com.pb.locationintelligence.utils.UrlMaker;
import com.pb.locationintelligence.utils.Utility;

/**
 * GeoLifeService Implementation Class
 *
 */
public class GeoLifeServiceImpl implements GeoLifeService {
	
	private static final Logger _LOG = LoggerFactory.getLogger(GeoLifeServiceImpl.class);

    private static final String geoLilfeUrl = "/geolife/v1/demographics/";
    private UrlMaker urlMaker;
    
    @Override
    public GeoLifeResponse getDemographicsByAddress(String address, String country, String profile, String filter) throws SdkException{
    	urlMaker = UrlMaker.getInstance();

        StringBuilder urlBuilder = new StringBuilder(urlMaker.getAbsoluteUrl(geoLilfeUrl));
        urlBuilder.append("byaddress");
        Map<String,Object> keyValueMap = new HashMap<String, Object>();
        keyValueMap.put("address",address);
        keyValueMap.put("country",country);
        keyValueMap.put("profile",profile);
        keyValueMap.put("filter",filter);

        Utility.appendIfNotNull(urlBuilder,keyValueMap);

        _LOG.debug("API URL : " + urlBuilder);
        return Utility.processAPIRequest(urlBuilder.toString(), GeoLifeResponse.class);
    }
    
    @Override
    public GeoLifeResponse getDemographicsByLocation(Double latitude,
			Double longitude, String profile, String filter) throws SdkException {
		urlMaker = UrlMaker.getInstance();

        StringBuilder urlBuilder = new StringBuilder(urlMaker.getAbsoluteUrl(geoLilfeUrl));
        urlBuilder.append("bylocation");
        Map<String,Object> keyValueMap = new HashMap<String, Object>();
        keyValueMap.put("latitude",latitude);
        keyValueMap.put("longitude",longitude);
        keyValueMap.put("profile",profile);
        keyValueMap.put("filter",filter);

        Utility.appendIfNotNull(urlBuilder,keyValueMap);

        _LOG.debug("API URL : " + urlBuilder);
        return Utility.processAPIRequest(urlBuilder.toString(), GeoLifeResponse.class);
	}
    
    @Override
    public void getDemographicsByAddress(final String address, final String country, final String profile, final String filter, final RequestObserver<GeoLifeResponse> requestObserver) {
        final ExecutorService executorService = Executors.newFixedThreadPool(1);
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                try {
                	GeoLifeResponse geoLifeResponse = getDemographicsByAddress(address, country, profile, filter);
                    requestObserver.onSuccess(geoLifeResponse);
                } catch (SdkException e) {
                    requestObserver.onFailure(e);
                }finally{
					executorService.shutdown();					
				}
            }
        });
    }

    @Override
    public void getDemographicsByLocation(final Double latitude, final Double longitude, final String profile, final String filter, final RequestObserver<GeoLifeResponse> requestObserver) {
        final ExecutorService executorService = Executors.newFixedThreadPool(1);
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                try {
                	GeoLifeResponse geoLifeResponse = getDemographicsByLocation(latitude, longitude, profile, filter);
                    requestObserver.onSuccess(geoLifeResponse);
                } catch (SdkException e) {
                    requestObserver.onFailure(e);
                }finally{
					executorService.shutdown();					
				}
            }
        });
    }

}
