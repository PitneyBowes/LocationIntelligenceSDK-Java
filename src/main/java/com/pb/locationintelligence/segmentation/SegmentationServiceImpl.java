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
import com.pb.locationintelligence.utils.UrlMaker;
import com.pb.locationintelligence.utils.Utility;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * SegmentationService Implementation Class
 *
 */
public class SegmentationServiceImpl implements SegmentationService {
	
	private static final Logger _LOG = LoggerFactory.getLogger(SegmentationServiceImpl.class);

    private static final String geoLifeSegmentationUrl = "/geolife/v1/segmentation/";
    private UrlMaker urlMaker;

	@Override
	public Segmentation getSegmentationByAddress(String address,
                                                 String country) throws SdkException {
		urlMaker = UrlMaker.getInstance();

        StringBuilder urlBuilder = new StringBuilder(urlMaker.getAbsoluteUrl(geoLifeSegmentationUrl));
        urlBuilder.append("byaddress");
        Map<String,Object> keyValueMap = new HashMap<String, Object>();
        keyValueMap.put("address",address);
        keyValueMap.put("country",country);

        Utility.appendIfNotNull(urlBuilder,keyValueMap);

        _LOG.debug("API URL : " + urlBuilder);
        return Utility.processAPIRequest(urlBuilder.toString(), Segmentation.class);
	}

	@Override
	public Segmentation getSegmentationByLocation(Double latitude,
                                                  Double longitude) throws SdkException {
		urlMaker = UrlMaker.getInstance();

        StringBuilder urlBuilder = new StringBuilder(urlMaker.getAbsoluteUrl(geoLifeSegmentationUrl));
        urlBuilder.append("bylocation");
        Map<String,Object> keyValueMap = new HashMap<String, Object>();
        keyValueMap.put("longitude",longitude);
        keyValueMap.put("latitude",latitude);

        Utility.appendIfNotNull(urlBuilder,keyValueMap);

        _LOG.debug("API URL : " + urlBuilder);
        return Utility.processAPIRequest(urlBuilder.toString(), Segmentation.class);
	}

	@Override
	public void getSegmentationByAddress(final String address, final String country,
                                         final RequestObserver<Segmentation> requestObserver) {
		final ExecutorService executorService = Executors.newFixedThreadPool(1);
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                try {
                    Segmentation segmentationResponse = getSegmentationByAddress(address, country);
                    requestObserver.onSuccess(segmentationResponse);
                } catch (SdkException e) {
                    requestObserver.onFailure(e);
                }finally{
					executorService.shutdown();					
				}
            }
        });
		
	}

	@Override
	public void getSegmentationByLocation(final Double latitude, final Double longitude,
                                          final RequestObserver<Segmentation> requestObserver) {

		final ExecutorService executorService = Executors.newFixedThreadPool(1);
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                try {
                    Segmentation segmentationResponse = getSegmentationByLocation(latitude, longitude);
                    requestObserver.onSuccess(segmentationResponse);
                } catch (SdkException e) {
                    requestObserver.onFailure(e);
                }finally{
					executorService.shutdown();					
				}
            }
        });
		
	
		
	}
}
