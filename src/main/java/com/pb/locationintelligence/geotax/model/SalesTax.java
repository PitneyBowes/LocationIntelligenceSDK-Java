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

import java.util.List;

public class SalesTax {
	
	/**
	 * The sum of the individual Municipal, County, State and SPD sales tax rates.
	 */
	private Double totalTaxRate;
	
	/**
	 * The sum of the individual Municipal, County, State and SPD sales tax amounts.
	 */
	private Double totalTaxAmount;
	
	/**
	 * State sales tax rate for the selected tax rate type.
	 */
	private Double stateTaxRate;
	
	/**
	 * State sales tax amount for the selected tax rate type.
	 */
	private Double stateTaxAmount;
	
	/**
	 * County sales tax rate for the selected tax rate type.
	 */
	private Double countyTaxRate;
	
	/**
	 * County sales tax amount for the selected tax rate type.
	 */
	private Double countyTaxAmount;
	
	/**
	 * Municipality sales tax rate for the selected tax rate type.
	 */
	private Double municipalTaxRate;
	
	/**
	 * Municipality sales tax amount for the selected tax rate type.
	 */
	private Double municipalTaxAmount;
	
	/**
	 * SPD w.r.t district number.
	 */
	private List<SpecialPurposeDistrictTax> spdsTax;

	public Double getTotalTaxRate() {
		return totalTaxRate;
	}

	public void setTotalTaxRate(Double totalTaxRate) {
		this.totalTaxRate = totalTaxRate;
	}

	public Double getStateTaxRate() {
		return stateTaxRate;
	}

	public void setStateTaxRate(Double stateTaxRate) {
		this.stateTaxRate = stateTaxRate;
	}

	public Double getCountyTaxRate() {
		return countyTaxRate;
	}

	public void setCountyTaxRate(Double countyTaxRate) {
		this.countyTaxRate = countyTaxRate;
	}

	public Double getMunicipalTaxRate() {
		return municipalTaxRate;
	}

	public void setMunicipalTaxRate(Double municipalTaxRate) {
		this.municipalTaxRate = municipalTaxRate;
	}

	public List<SpecialPurposeDistrictTax> getSpdsTax() {
		return spdsTax;
	}

	public void setSpdsTax(
			List<SpecialPurposeDistrictTax> spdsTax) {
		this.spdsTax = spdsTax;
	}

	public Double getTotalTaxAmount() {
		return totalTaxAmount;
	}

	public void setTotalTaxAmount(Double totalTaxAmount) {
		this.totalTaxAmount = totalTaxAmount;
	}

	public Double getStateTaxAmount() {
		return stateTaxAmount;
	}

	public void setStateTaxAmount(Double stateTaxAmount) {
		this.stateTaxAmount = stateTaxAmount;
	}

	public Double getCountyTaxAmount() {
		return countyTaxAmount;
	}

	public void setCountyTaxAmount(Double countyTaxAmount) {
		this.countyTaxAmount = countyTaxAmount;
	}

	public Double getMunicipalTaxAmount() {
		return municipalTaxAmount;
	}

	public void setMunicipalTaxAmount(Double municipalTaxAmount) {
		this.municipalTaxAmount = municipalTaxAmount;
	}
}
