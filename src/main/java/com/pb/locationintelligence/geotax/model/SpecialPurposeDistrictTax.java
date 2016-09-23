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


public class SpecialPurposeDistrictTax {

	/**
	 * District Number of SPD for Tax
	 */
	private String districtNumber;

	/**
	 *tax rate for SPD w.r.t district number
	 */
	private Double taxRate;
	
	/**
	 * tax Amount for SPD w.r.t district number
	 */
	private Double taxAmount;
	
	public String getDistrictNumber() {
		return districtNumber;
	}

	public void setDistrictNumber(String districtNumber) {
		this.districtNumber = districtNumber;
	}

	public Double getTaxRate() {
		return taxRate;
	}

	public void setTaxRate(Double taxRate) {
		this.taxRate = taxRate;
	}

	public Double getTaxAmount() {
		return taxAmount;
	}

	public void setTaxAmount(Double taxAmount) {
		this.taxAmount = taxAmount;
	}

}
