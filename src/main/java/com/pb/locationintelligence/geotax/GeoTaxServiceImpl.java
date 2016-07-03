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
package com.pb.locationintelligence.geotax;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.pb.locationintelligence.RequestObserver;
import com.pb.locationintelligence.exception.SdkException;
import com.pb.locationintelligence.geotax.model.TaxRateResponse;
import com.pb.locationintelligence.utils.UrlMaker;
import com.pb.locationintelligence.utils.Utility;

public class GeoTaxServiceImpl implements GeoTaxService {
	private static final Logger _LOG = LoggerFactory.getLogger(GeoTaxServiceImpl.class);

	private static final String geotaxUrl = "/geotax/v1/";
	private UrlMaker urlMaker;

	@Override
	public TaxRateResponse getGeoTaxRateByAddress(String taxRateTypeId, String address) throws SdkException {
		urlMaker = UrlMaker.getInstance();

		StringBuilder urlBuilder = new StringBuilder(urlMaker.getAbsoluteUrl(geotaxUrl));
		urlBuilder.append("taxrate/").append(taxRateTypeId).append("/byaddress");

		Map<String, Object> keyValueMap = new HashMap<String, Object>();
		keyValueMap.put("address", address);

		Utility.appendIfNotNull(urlBuilder, keyValueMap);

		_LOG.debug("API URL : " + urlBuilder);
		return Utility.processAPIRequest(urlBuilder.toString(), TaxRateResponse.class);

	}

	@Override
	public TaxRateResponse getGeoTaxRateByLocation(String taxRateTypeId, Double latitude, Double longitude) throws SdkException {
		urlMaker = UrlMaker.getInstance();

		StringBuilder urlBuilder = new StringBuilder(urlMaker.getAbsoluteUrl(geotaxUrl));
		urlBuilder.append("taxrate/").append(taxRateTypeId).append("/bylocation");

		Map<String, Object> keyValueMap = new HashMap<String, Object>();
		keyValueMap.put("latitude", latitude);
		keyValueMap.put("longitude", longitude);

		Utility.appendIfNotNull(urlBuilder, keyValueMap);

		_LOG.debug("API URL : " + urlBuilder);
		return Utility.processAPIRequest(urlBuilder.toString(), TaxRateResponse.class);
	}

	@Override
	public TaxRateResponse getGeoTaxByLocation(String taxRateTypeId, Double latitude, Double longitude, Double purchaseAmount) throws SdkException {
		urlMaker = UrlMaker.getInstance();

		StringBuilder urlBuilder = new StringBuilder(urlMaker.getAbsoluteUrl(geotaxUrl));
		urlBuilder.append("tax/").append(taxRateTypeId).append("/bylocation");

		Map<String, Object> keyValueMap = new HashMap<String, Object>();
		keyValueMap.put("latitude", latitude);
		keyValueMap.put("longitude", longitude);
		keyValueMap.put("purchaseAmount", purchaseAmount);

		Utility.appendIfNotNull(urlBuilder, keyValueMap);

		_LOG.debug("API URL : " + urlBuilder);
		return Utility.processAPIRequest(urlBuilder.toString(), TaxRateResponse.class);
	}

	@Override
	public TaxRateResponse getGeoTaxByAddress(String taxRateTypeId, String address, Double purchaseAmount) throws SdkException {
		urlMaker = UrlMaker.getInstance();

		StringBuilder urlBuilder = new StringBuilder(urlMaker.getAbsoluteUrl(geotaxUrl));
		urlBuilder.append("tax/").append(taxRateTypeId).append("/byaddress");

		Map<String, Object> keyValueMap = new HashMap<String, Object>();
		keyValueMap.put("address", address);
		keyValueMap.put("purchaseAmount", purchaseAmount);

		Utility.appendIfNotNull(urlBuilder, keyValueMap);

		_LOG.debug("API URL : " + urlBuilder);
		return Utility.processAPIRequest(urlBuilder.toString(), TaxRateResponse.class);
	}

	@Override
	public void getGeoTaxByAddress(final String taxRateTypeId, final String address, final Double purchaseAmount, final RequestObserver<TaxRateResponse> requestObserver) {
		final ExecutorService executorService = Executors.newFixedThreadPool(1);
		executorService.submit(new Runnable() {
			@Override
			public void run() {
				try {
					TaxRateResponse response = getGeoTaxByAddress(taxRateTypeId, address, purchaseAmount);
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
	public void getGeoTaxByLocation(final String taxRateTypeId, final Double latitude, final Double longitude, final Double purchaseAmount,
			final RequestObserver<TaxRateResponse> requestObserver) {
		final ExecutorService executorService = Executors.newFixedThreadPool(1);
		executorService.submit(new Runnable() {
			@Override
			public void run() {
				try {
					TaxRateResponse response = getGeoTaxByLocation(taxRateTypeId, latitude, longitude, purchaseAmount);
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
	public void getGeoTaxRateByLocation(final String taxRateTypeId, final Double latitude, final Double longitude, final RequestObserver<TaxRateResponse> requestObserver) {
		final ExecutorService executorService = Executors.newFixedThreadPool(1);
		executorService.submit(new Runnable() {
			@Override
			public void run() {
				try {
					TaxRateResponse response = getGeoTaxRateByLocation(taxRateTypeId, latitude, longitude);
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
	public void getGeoTaxRateByAddress(final String taxRateTypeId, final String address, final RequestObserver<TaxRateResponse> requestObserver) {
		final ExecutorService executorService = Executors.newFixedThreadPool(1);
		executorService.submit(new Runnable() {
			@Override
			public void run() {
				try {
					TaxRateResponse response = getGeoTaxRateByAddress(taxRateTypeId, address);
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
