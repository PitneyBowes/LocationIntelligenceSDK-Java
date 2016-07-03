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

package com.pb.locationintelligence.geotax.model;

import com.pb.locationintelligence.common.model.Address;


public class TaxRateResponse {

	private double confidence;
	private TaxJurisdiction jurisdiction;
	private Address matchedAddress;
	private SalesTax salesTax;
	private UseTax useTax;

	public double getConfidence() {
		return confidence;
	}

	public void setConfidence(double confidence) {
		this.confidence = confidence;
	}

	public Address getMatchedAddress() {
		return matchedAddress;
	}

	public void setAddress(Address matchedAddress) {
		this.matchedAddress = matchedAddress;
	}

	public TaxJurisdiction getJurisdiction() {
		return jurisdiction;
	}

	public void setJurisdiction(TaxJurisdiction jurisdiction) {
		this.jurisdiction = jurisdiction;
	}

	public SalesTax getSalesTax() {
		return salesTax;
	}

	public void setSalesTax(SalesTax salesTax) {
		this.salesTax = salesTax;
	}

	public UseTax getUseTax() {
		return useTax;
	}

	public void setUseTax(UseTax useTax) {
		this.useTax = useTax;
	}

}
