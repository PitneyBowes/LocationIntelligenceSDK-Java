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

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.pb.locationintelligence.RequestObserver;
import com.pb.locationintelligence.common.model.Locations;
import com.pb.locationintelligence.exception.SdkException;
import com.pb.locationintelligence.geoenhance.model.TimezoneResponse;
import com.pb.locationintelligence.utils.UrlMaker;
import com.pb.locationintelligence.utils.Utility;

/**
 * GeoEnhanceService Implementation Class
 *
 */

public class GeoEnhanceServiceImpl implements GeoEnhanceService {

	private static final Logger _LOG = LoggerFactory.getLogger(GeoEnhanceServiceImpl.class);

	private static final String geoenhanceUrl = "/geoenhance/v1/";

	@Override
	public Locations getAddress(Double latitude, Double longitude, Float searchRadius, String searchRadiusUnit) throws SdkException {
		UrlMaker urlMaker = UrlMaker.getInstance();

		StringBuilder urlBuilder = new StringBuilder(urlMaker.getAbsoluteUrl(geoenhanceUrl));
		urlBuilder.append("address/bylocation");

		Map<String, Object> keyValueMap = new HashMap<String, Object>();
		keyValueMap.put("latitude", latitude);
		keyValueMap.put("longitude", longitude);
		keyValueMap.put("searchRadius", searchRadius);
		keyValueMap.put("searchRadiusUnit", searchRadiusUnit);

		Utility.appendIfNotNull(urlBuilder, keyValueMap);

		_LOG.debug("API URL : " + urlBuilder);
		return Utility.processAPIRequest(urlBuilder.toString(), Locations.class);
	}

	@Override
	public Locations getPlace(Double latitude, Double longitude, Integer levelHint) throws SdkException {
		UrlMaker urlMaker = UrlMaker.getInstance();

		StringBuilder urlBuilder = new StringBuilder(urlMaker.getAbsoluteUrl(geoenhanceUrl));
		urlBuilder.append("place/bylocation");

		Map<String, Object> keyValueMap = new HashMap<String, Object>();
		keyValueMap.put("latitude", latitude);
		keyValueMap.put("longitude", longitude);
		keyValueMap.put("levelHint", levelHint);

		Utility.appendIfNotNull(urlBuilder, keyValueMap);

		_LOG.debug("API URL : " + urlBuilder);
		return Utility.processAPIRequest(urlBuilder.toString(), Locations.class);
	}

	@Override
	public Locations getPOI(Double latitude, Double longitude, String category, Integer maxCandidates, Float searchRadius, String searchRadiusUnit, String searchDataset,
			String searchPriority) throws SdkException {
		UrlMaker urlMaker = UrlMaker.getInstance();

		StringBuilder urlBuilder = new StringBuilder(urlMaker.getAbsoluteUrl(geoenhanceUrl));
		urlBuilder.append("poi/bylocation");

		Map<String, Object> keyValueMap = new HashMap<String, Object>();
		keyValueMap.put("latitude", latitude);
		keyValueMap.put("longitude", longitude);
		keyValueMap.put("category", category);
		keyValueMap.put("maxCandidates", maxCandidates);
		keyValueMap.put("searchRadius", searchRadius);
		keyValueMap.put("searchRadiusUnit", searchRadiusUnit);
		keyValueMap.put("searchDataset", searchDataset);
		keyValueMap.put("searchPriority", searchPriority);

		Utility.appendIfNotNull(urlBuilder, keyValueMap);

		_LOG.debug("API URL : " + urlBuilder);
		return Utility.processAPIRequest(urlBuilder.toString(), Locations.class);
	}

	@Override
	public void getPOI(final Double latitude, final Double longitude, final String category, final Integer maxCandidates, final Float searchRadius, final String searchRadiusUnit,
			final String searchDataset, final String searchPriority, final RequestObserver<Locations> requestObserver) {
		final ExecutorService executorService = Executors.newFixedThreadPool(1);
		executorService.submit(new Runnable() {
			@Override
			public void run() {
				try {
					Locations response = getPOI(latitude, longitude, category, maxCandidates, searchRadius, searchRadiusUnit, searchDataset, searchPriority);
					requestObserver.onSuccess(response);
				} catch (SdkException e) {
					requestObserver.onFailure(e);
				}finally{
					executorService.shutdown();					
				}
			}
		});
	}

	@Override
	public void getPlace(final Double latitude, final Double longitude, final Integer levelHint, final RequestObserver<Locations> requestObserver) {
		final ExecutorService executorService = Executors.newFixedThreadPool(1);
		executorService.submit(new Runnable() {
			@Override
			public void run() {
				try {
					Locations response = getPlace(latitude, longitude, levelHint);
					requestObserver.onSuccess(response);
				} catch (SdkException e) {
					requestObserver.onFailure(e);
				}finally{
					executorService.shutdown();					
				}
			}
		});
	}

	@Override
	public void getAddress(final Double latitude, final Double longitude, final Float searchRadius, final String searchRadiusUnit, final RequestObserver<Locations> requestObserver) {
		final ExecutorService executorService = Executors.newFixedThreadPool(1);
		executorService.submit(new Runnable() {
			@Override
			public void run() {
				try {
					Locations response = getAddress(latitude, longitude, searchRadius, searchRadiusUnit);
					requestObserver.onSuccess(response);
				} catch (SdkException e) {
					requestObserver.onFailure(e);
				}finally{
					executorService.shutdown();					
				}
			}
		});
	}

	@Override
	public TimezoneResponse getTimezone(Long timestamp,
			 Double latitude, Double longitude) throws SdkException {
		UrlMaker urlMaker = UrlMaker.getInstance();

		StringBuilder urlBuilder = new StringBuilder(urlMaker.getAbsoluteUrl(geoenhanceUrl));
		urlBuilder.append("timezone/bylocation");

		Map<String, Object> keyValueMap = new HashMap<String, Object>();
		keyValueMap.put("latitude", latitude);
		keyValueMap.put("longitude", longitude);
		keyValueMap.put("timestamp", timestamp);
		
		Utility.appendIfNotNull(urlBuilder, keyValueMap);

		_LOG.debug("API URL : " + urlBuilder);
		return Utility.processAPIRequest(urlBuilder.toString(), TimezoneResponse.class);
	}

	@Override
	public void getTimezone(final Long timestamp, final Double latitude,
			final Double longitude, final RequestObserver<TimezoneResponse> requestObserver) {
		final ExecutorService executorService = Executors.newFixedThreadPool(1);
		executorService.submit(new Runnable() {
			@Override
			public void run() {
				try {
					TimezoneResponse response = getTimezone(timestamp, latitude, longitude);
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
