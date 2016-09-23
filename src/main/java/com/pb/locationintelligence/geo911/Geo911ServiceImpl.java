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

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.pb.locationintelligence.RequestObserver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.pb.locationintelligence.exception.SdkException;
import com.pb.locationintelligence.geo911.model.AHJPlusPSAPResponse;
import com.pb.locationintelligence.geo911.model.PsapResponse;
import com.pb.locationintelligence.utils.UrlMaker;
import com.pb.locationintelligence.utils.Utility;

/**
 * Geo911Service Implementation Class
 *
 */

public class Geo911ServiceImpl implements Geo911Service {
	
	private static final Logger _LOG = LoggerFactory.getLogger(Geo911ServiceImpl.class);

    private static final String geo911Url = "/geo911/v1/psap/";
    
    private static final String GEO911_AHJ_URL = "/geo911/v1/ahj-psap/";

    @Override
    public PsapResponse getPSAPByAddress(String address) throws SdkException {
        UrlMaker urlMaker = UrlMaker.getInstance();

        StringBuilder urlBuilder = new StringBuilder(urlMaker.getAbsoluteUrl(geo911Url));
        urlBuilder.append("byaddress");

        Map<String,Object> keyValueMap = new HashMap<String, Object>();
        keyValueMap.put("address",address);

        Utility.appendIfNotNull(urlBuilder,keyValueMap);

        _LOG.debug("API URL : " + urlBuilder);
        return Utility.processAPIRequest(urlBuilder.toString(),PsapResponse.class);
    }

    @Override
	public void getPSAPByAddress(final String address, final RequestObserver<PsapResponse> requestObserver) {
		final ExecutorService executorService = Executors.newFixedThreadPool(1);
		executorService.submit(new Runnable() {
			@Override
			public void run() {
				try {
					PsapResponse psapByAddress = getPSAPByAddress(address);
					requestObserver.onSuccess(psapByAddress);
				} catch (SdkException e) {
					requestObserver.onFailure(e);
				} finally {
					executorService.shutdown();
				}
			}
		});
	}

    @Override
    public PsapResponse getPSAPByLocation(Double latitude, Double longitude) throws SdkException {
        UrlMaker urlMaker = UrlMaker.getInstance();

        StringBuilder urlBuilder = new StringBuilder(urlMaker.getAbsoluteUrl(geo911Url));
        urlBuilder.append("bylocation");

        Map<String,Object> keyValueMap = new HashMap<String, Object>();
        keyValueMap.put("latitude",latitude);
        keyValueMap.put("longitude",longitude);

        Utility.appendIfNotNull(urlBuilder,keyValueMap);

        _LOG.debug("API URL : " + urlBuilder);
        return Utility.processAPIRequest(urlBuilder.toString(), PsapResponse.class);
    }

    @Override
    public void getPSAPByLocation(final Double latitude, final Double longitude, final RequestObserver<PsapResponse> requestObserver) {
        final ExecutorService executorService = Executors.newFixedThreadPool(1);
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                try {
                    PsapResponse response = getPSAPByLocation(latitude, longitude);
                    requestObserver.onSuccess(response);
                } catch (SdkException e) {
                    requestObserver.onFailure(e);
                }finally{
					executorService.shutdown();					
				}
            }
        });
    }

	public AHJPlusPSAPResponse getAHJPlusPSAPByAddress(String address) throws SdkException {
		UrlMaker urlMaker = UrlMaker.getInstance();

        StringBuilder urlBuilder = new StringBuilder(urlMaker.getAbsoluteUrl(GEO911_AHJ_URL));
        urlBuilder.append("byaddress");

        Map<String,Object> keyValueMap = new HashMap<String, Object>();
        keyValueMap.put("address",address);

        Utility.appendIfNotNull(urlBuilder,keyValueMap);

        _LOG.debug("API URL : " + urlBuilder);
        return Utility.processAPIRequest(urlBuilder.toString(),AHJPlusPSAPResponse.class);
	}

	public void getAHJPlusPSAPByAddress(final String address, final RequestObserver<AHJPlusPSAPResponse> requestObserver) {
		final ExecutorService executorService = Executors.newFixedThreadPool(1);
		executorService.submit(new Runnable() {
			@Override
			public void run() {
				try {
					AHJPlusPSAPResponse psapByAddress = getAHJPlusPSAPByAddress(address);
					requestObserver.onSuccess(psapByAddress);
				} catch (SdkException e) {
					requestObserver.onFailure(e);
				} finally {
					executorService.shutdown();
				}
			}
		});
		
	}

	public AHJPlusPSAPResponse getAHJPlusPSAPByLocation(Double latitude, Double longitude) throws SdkException {
		 UrlMaker urlMaker = UrlMaker.getInstance();

	        StringBuilder urlBuilder = new StringBuilder(urlMaker.getAbsoluteUrl(GEO911_AHJ_URL));
	        urlBuilder.append("bylocation");

	        Map<String,Object> keyValueMap = new HashMap<String, Object>();
	        keyValueMap.put("latitude",latitude);
	        keyValueMap.put("longitude",longitude);

	        Utility.appendIfNotNull(urlBuilder,keyValueMap);

	        _LOG.debug("API URL : " + urlBuilder);
	        return Utility.processAPIRequest(urlBuilder.toString(), AHJPlusPSAPResponse.class);
	}

	public void getAHJPlusPSAPByLocation(final Double latitude, final Double longitude,
			final RequestObserver<AHJPlusPSAPResponse> requestObserver) {
        final ExecutorService executorService = Executors.newFixedThreadPool(1);
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                try {
                	AHJPlusPSAPResponse response = getAHJPlusPSAPByLocation(latitude, longitude);
                    requestObserver.onSuccess(response);
                } catch (SdkException e) {
                    requestObserver.onFailure(e);
                }finally{
					executorService.shutdown();					
				}
            }
        });
    }
}