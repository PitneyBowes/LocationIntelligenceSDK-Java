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

import com.pb.locationintelligence.RequestObserver;
import com.pb.locationintelligence.exception.SdkException;
import com.pb.locationintelligence.geotax.model.TaxRateResponse;

/**
 * This service provides tax details w.r.t requested Address or
 * Latitude-Longitude.
 *
 */
public interface GeoTaxService {

	/**
	 * Retrieves tax rates applicable to a specific location.
     *
	 * @param taxRateTypeId
	 *            Required - Tax Rate Types
	 * @param latitude
	 *            Required - latitude of the location
	 * @param longitude
	 *            Required - longitude of the location
	 * @return {@link TaxRateResponse}
	 */
	public TaxRateResponse getGeoTaxRateByLocation(String taxRateTypeId, Double latitude, Double longitude) throws SdkException;

	/**
	 * Retrieves tax rates applicable to a specific address.
     *
	 * @param taxRateTypeId
	 *            Required - Tax Rate Types
	 * @param address
	 *            Required - Free-form address text
	 * @return {@link TaxRateResponse}
	 */
	public TaxRateResponse getGeoTaxRateByAddress(String taxRateTypeId, String address) throws SdkException;

	/**
	 * Calculates and returns tax applicable at a specific location.
     *
	 * @param taxRateTypeId
	 *            Required - Tax Rate Types
	 * @param latitude
	 *            Required - latitude of the location
	 * @param longitude
	 *            Required - longitude of the location
	 * @param purchaseAmount
	 *            Required - Amount on which tax will be calculated
	 * @return {@link TaxRateResponse}
	 */
	public TaxRateResponse getGeoTaxByLocation(String taxRateTypeId, Double latitude, Double longitude, Double purchaseAmount) throws SdkException;

	/**
	 * Calculates and returns tax applicable at a specific address.
     *
	 * @param taxRateTypeId
	 *            Required - Tax Rate Types
	 * @param address
	 *            Required - Free-form address text
	 * @param purchaseAmount
	 *            Required - Amount on which tax will be calculated
	 * @return {@link TaxRateResponse}
	 */
	public TaxRateResponse getGeoTaxByAddress(String taxRateTypeId, String address, Double purchaseAmount) throws SdkException;

	/**
	 * Calculates and returns tax applicable at a specific address.
     *
	 * @param taxRateTypeId
	 *            Required - Tax Rate Types
	 * @param address
	 *            Required - Free-form address text
	 * @param purchaseAmount
	 *            Required - Amount on which tax will be calculated
	 * @param requestObserver
	 *            Required - The callback implementation to get response or errors.
	 */
	public void getGeoTaxByAddress(String taxRateTypeId, String address, Double purchaseAmount, RequestObserver<TaxRateResponse> requestObserver);

	/**
	 * Calculates and returns tax applicable at a specific location.
     *
	 * @param taxRateTypeId
	 *            Required - Tax Rate Types
	 * @param latitude
	 *            Required - latitude of the location
	 * @param longitude
	 *            Required - longitude of the location
	 * @param purchaseAmount
	 *            Required - Amount on which tax will be calculated
	 * @param requestObserver
	 *            Required - The callback implementation to get response or errors.
	 */
	public void getGeoTaxByLocation(String taxRateTypeId, Double latitude, Double longitude, Double purchaseAmount, RequestObserver<TaxRateResponse> requestObserver);

	/**
	 * Retrieves tax rates applicable to a specific location.
     *
	 * @param taxRateTypeId
	 *            Required - Tax Rate Types
	 * @param latitude
	 *            Required - latitude of the location
	 * @param longitude
	 *            Required - longitude of the location
	 * @param requestObserver
	 *            Required - The callback implementation to get response or errors.
	 */
	public void getGeoTaxRateByLocation(String taxRateTypeId, Double latitude, Double longitude, RequestObserver<TaxRateResponse> requestObserver);

	/**
	 * Retrieves tax rates applicable to a specific address.
     *
	 * @param taxRateTypeId
	 *            Required - Tax Rate Types
	 * @param address
	 *            Required - Free-form address text
	 * @param requestObserver
	 *            Required - The callback implementation to get response or errors.
	 */
	public void getGeoTaxRateByAddress(String taxRateTypeId, String address, RequestObserver<TaxRateResponse> requestObserver);
}
