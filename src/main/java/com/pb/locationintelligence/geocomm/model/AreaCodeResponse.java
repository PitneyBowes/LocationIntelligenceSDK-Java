/*
 * Copyright 2016 Pitney Bowes Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and limitations under the License.
 *
 */
package com.pb.locationintelligence.geocomm.model;

public class AreaCodeResponse
{
	private String companyName;
	
	private String ocn;
	
	private String ocnCategory;
	
	private String npa;
	
	private String nxx;
	
	private String startRange;
	
	private String endRange;
	
	private String lata;
	
	private String areaName4;

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getOcn() {
		return ocn;
	}

	public void setOcn(String ocn) {
		this.ocn = ocn;
	}

	public String getOcnCategory() {
		return ocnCategory;
	}

	public void setOcnCategory(String ocnCategory) {
		this.ocnCategory = ocnCategory;
	}

	public String getNpa() {
		return npa;
	}

	public void setNpa(String npa) {
		this.npa = npa;
	}

	public String getNxx() {
		return nxx;
	}

	public void setNxx(String nxx) {
		this.nxx = nxx;
	}

	public String getStartRange() {
		return startRange;
	}

	public void setStartRange(String startRange) {
		this.startRange = startRange;
	}

	public String getEndRange() {
		return endRange;
	}

	public void setEndRange(String endRange) {
		this.endRange = endRange;
	}

	public String getLata() {
		return lata;
	}

	public void setLata(String lata) {
		this.lata = lata;
	}

	public String getAreaName4() {
		return areaName4;
	}

	public void setAreaName4(String areaName4) {
		this.areaName4 = areaName4;
	}
		
}