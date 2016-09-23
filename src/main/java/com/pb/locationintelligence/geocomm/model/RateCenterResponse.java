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

import java.util.List;

import com.pb.locationintelligence.common.model.Address;
import com.pb.locationintelligence.common.model.Geometry;
import com.pb.locationintelligence.common.model.Match;
import com.pb.locationintelligence.geo911.model.County;

public class RateCenterResponse
{
	
	private String id;
	
	private String name;
	
	private String alternateName;
	
	private String areaName1;
	
	private Geometry geometry;
	
	private List<AreaCodeResponse> areaCodeInfoList;
	
	private Address matchedAddress;
	
	private Match match;
	
	private County county;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAlternateName() {
		return alternateName;
	}

	public void setAlternateName(String alternateName) {
		this.alternateName = alternateName;
	}


	public String getAreaName1() {
		return areaName1;
	}

	public void setAreaName1(String areaName1) {
		this.areaName1 = areaName1;
	}

	public Geometry getGeometry() {
		return geometry;
	}

	public void setGeometry(Geometry geometry) {
		this.geometry = geometry;
	}	

	public List<AreaCodeResponse> getAreaCodeInfos() {
		return areaCodeInfoList;
	}

	public void setAreaCodeInfos(List<AreaCodeResponse> areaCodeInfoList) {
		this.areaCodeInfoList = areaCodeInfoList;
	}

	public Address getMatchedAddress() {
		return matchedAddress;
	}

	public void setMatchedAddress(Address matchedAddress) {
		this.matchedAddress = matchedAddress;
	}

	public Match getMatch() {
		return match;
	}

	public void setMatch(Match match) {
		this.match = match;
	}

	public County getCounty() {
		return county;
	}

	public void setCounty(County county) {
		this.county = county;
	}
	
}