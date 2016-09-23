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

import com.google.gson.Gson;
import com.pb.locationintelligence.geotax.model.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.pb.locationintelligence.RequestObserver;
import com.pb.locationintelligence.exception.SdkException;
import com.pb.locationintelligence.utils.UrlMaker;
import com.pb.locationintelligence.utils.Utility;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;

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


	/************************************/

	@Override
	public TaxResponseList getGeoTaxRateBatchByLocation(String taxRateTypeId, TaxRateLocationRequest request) throws SdkException {
		urlMaker = UrlMaker.getInstance();
		StringBuilder urlBuilder = new StringBuilder(urlMaker.getAbsoluteUrl(geotaxUrl));
		urlBuilder.append("taxrate/").append(taxRateTypeId).append("/bylocation");
		Gson gson = new Gson();
		Entity paramEntity = Entity.entity(gson.toJson(request), MediaType.APPLICATION_JSON_TYPE);
		_LOG.debug("API URL : " + urlBuilder);
		return Utility.processPOSTRequest(paramEntity, urlBuilder.toString(), TaxResponseList.class);
	}

	@Override
	public TaxResponseList getGeoTaxRateByBatchAddress(String taxRateTypeId, TaxRateAddressRequest request) throws SdkException {

		urlMaker = UrlMaker.getInstance();
		StringBuilder urlBuilder = new StringBuilder(urlMaker.getAbsoluteUrl(geotaxUrl));
		urlBuilder.append("taxrate/").append(taxRateTypeId).append("/byaddress");
		Gson gson = new Gson();
		Entity paramEntity = Entity.entity(gson.toJson(request), MediaType.APPLICATION_JSON_TYPE);
		_LOG.debug("API URL : " + urlBuilder);
		return Utility.processPOSTRequest(paramEntity, urlBuilder.toString(), TaxResponseList.class);

	}

	@Override
	public TaxResponseList getGeoTaxByBatchLocation(String taxRateTypeId, TaxLocationRequest request) throws SdkException {
		urlMaker = UrlMaker.getInstance();
		StringBuilder urlBuilder = new StringBuilder(urlMaker.getAbsoluteUrl(geotaxUrl));
		urlBuilder.append("tax/").append(taxRateTypeId).append("/bylocation");
		Gson gson = new Gson();
		Entity paramEntity = Entity.entity(gson.toJson(request), MediaType.APPLICATION_JSON_TYPE);
		_LOG.debug("API URL : " + urlBuilder);
		return Utility.processPOSTRequest(paramEntity, urlBuilder.toString(), TaxResponseList.class);
	}


	@Override
	public TaxResponseList getGeoTaxByBatchAddress(String taxRateTypeId, TaxAddressRequest request) throws SdkException {
		urlMaker = UrlMaker.getInstance();
		StringBuilder urlBuilder = new StringBuilder(urlMaker.getAbsoluteUrl(geotaxUrl));
		urlBuilder.append("tax/").append(taxRateTypeId).append("/byaddress");
		Gson gson = new Gson();
		Entity paramEntity = Entity.entity(gson.toJson(request), MediaType.APPLICATION_JSON_TYPE);
		_LOG.debug("API URL : " + urlBuilder);
		return Utility.processPOSTRequest(paramEntity, urlBuilder.toString(), TaxResponseList.class);
	}



	@Override
	public void getGeoTaxRateBatchByLocation(final String taxRateTypeId, final TaxRateLocationRequest request, final RequestObserver<TaxResponseList> requestObserver) throws SdkException {
		final ExecutorService executorService = Executors.newFixedThreadPool(1);
		executorService.submit(new Runnable() {
			@Override
			public void run() {
				try {
					TaxResponseList response =getGeoTaxRateBatchByLocation(taxRateTypeId, request);
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
		public void getGeoTaxRateByBatchAddress(final String taxRateTypeId, final TaxRateAddressRequest request, final RequestObserver<TaxResponseList> requestObserver) throws SdkException {
		final ExecutorService executorService = Executors.newFixedThreadPool(1);
		executorService.submit(new Runnable() {
			@Override
			public void run() {
				try {
					TaxResponseList response =getGeoTaxRateByBatchAddress(taxRateTypeId,request);
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
	public void getGeoTaxByBatchLocation(final String taxRateTypeId, final TaxLocationRequest request, final  RequestObserver<TaxResponseList> requestObserver) throws SdkException {
		final ExecutorService executorService = Executors.newFixedThreadPool(1);
		executorService.submit(new Runnable() {
			@Override
			public void run() {
				try {
					TaxResponseList response =getGeoTaxByBatchLocation(taxRateTypeId, request);
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
	public void getGeoTaxByBatchAddress(final String taxRateTypeId,final TaxAddressRequest request, final RequestObserver<TaxResponseList> requestObserver) throws SdkException {
		final ExecutorService executorService = Executors.newFixedThreadPool(1);
		executorService.submit(new Runnable() {
			@Override
			public void run() {
				try {
					TaxResponseList response =getGeoTaxByBatchAddress(taxRateTypeId, request);
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
