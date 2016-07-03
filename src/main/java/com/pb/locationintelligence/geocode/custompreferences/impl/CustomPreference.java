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
package com.pb.locationintelligence.geocode.custompreferences.impl;

import java.util.List;

import javax.xml.bind.annotation.XmlTransient;

import com.pb.locationintelligence.geocode.Countries;
import com.pb.locationintelligence.geocode.custompreferences.ICustomPreference;
import com.pb.locationintelligence.geocode.model.DistanceUnits;

public class CustomPreference implements ICustomPreference {

	public Countries Country;
	@XmlTransient
	public transient String countryISO;
	public Boolean returnAllCandidateInfo;
	public String clientCoordSysName;
	public String clientLocale;
	public String cornerOffset;
	public String cornerOffsetUnits;
	public Double distance;
	public DistanceUnits distanceUnits;
	public Boolean fallbackToGeographic;
	public Boolean fallbackToPostal;
	public String matchMode;
	public String streetOffset;
	public String streetOffsetUnits;
	public Integer maxReturnedCandidates;
	public Boolean matchOnAddressNumber;
	public Boolean matchOnAllStreetFields;
	public Boolean matchOnAreaName1;
	public Boolean matchOnAreaName2;
	public Boolean matchOnAreaName3;
	public Boolean matchOnAreaName4;
	public Boolean matchOnInputFields;
	public Boolean matchOnPlaceName;
	public Boolean matchOnPostCode1;
	public Boolean matchOnPostCode2;
	public Boolean matchOnStreetDirectional;
	public Boolean matchOnStreetName;
	public Boolean matchOnStreetType;
	public Boolean returnAllCustomFields;
	public Boolean returnMatchDescriptor;
	public Boolean returnStreetAddressFields;
	public Boolean returnUnitInformation;
	public List<String> returnedCustomFieldKeys;
	
	public CustomPreference(Countries Country) {
		this.Country = Country;
	}

	public CustomPreference() {

	}

	public Countries getCountry() {
		return Country;
	}

	public void setCountry(Countries country) {
		Country = country;
	}

	public Boolean getReturnAllCandidateInfo() {
		return returnAllCandidateInfo;
	}

	public void setReturnAllCandidateInfo(Boolean returnAllCandidateInfo) {
		this.returnAllCandidateInfo = returnAllCandidateInfo;
	}

	public String getClientCoordSysName() {
		return clientCoordSysName;
	}

	public void setClientCoordSysName(String clientCoordSysName) {
		this.clientCoordSysName = clientCoordSysName;
	}

	public String getClientLocale() {
		return clientLocale;
	}

	public void setClientLocale(String clientLocale) {
		this.clientLocale = clientLocale;
	}

	public String getCornerOffset() {
		return cornerOffset;
	}

	public void setCornerOffset(String cornerOffset) {
		this.cornerOffset = cornerOffset;
	}

	public String getCornerOffsetUnits() {
		return cornerOffsetUnits;
	}

	public void setCornerOffsetUnits(String cornerOffsetUnits) {
		this.cornerOffsetUnits = cornerOffsetUnits;
	}

	public Double getDistance() {
		return distance;
	}

	public void setDistance(Double distance) {
		this.distance = distance;
	}

	public DistanceUnits getDistanceUnits() {
		return distanceUnits;
	}

	public void setDistanceUnits(DistanceUnits distanceUnits) {
		this.distanceUnits = distanceUnits;
	}

	public Boolean getFallbackToGeographic() {
		return fallbackToGeographic;
	}

	public void setFallbackToGeographic(Boolean fallbackToGeographic) {
		this.fallbackToGeographic = fallbackToGeographic;
	}

	public Boolean getFallbackToPostal() {
		return fallbackToPostal;
	}

	public void setFallbackToPostal(Boolean fallbackToPostal) {
		this.fallbackToPostal = fallbackToPostal;
	}

	public String getMatchMode() {
		return matchMode;
	}

	public void setMatchMode(String matchMode) {
		this.matchMode = matchMode;
	}

	public String getStreetOffset() {
		return streetOffset;
	}

	public void setStreetOffset(String streetOffset) {
		this.streetOffset = streetOffset;
	}

	public String getStreetOffsetUnits() {
		return streetOffsetUnits;
	}

	public void setStreetOffsetUnits(String streetOffsetUnits) {
		this.streetOffsetUnits = streetOffsetUnits;
	}

	public Integer getMaxReturnedCandidates() {
		return maxReturnedCandidates;
	}

	public void setMaxReturnedCandidates(Integer maxReturnedCandidates) {
		this.maxReturnedCandidates = maxReturnedCandidates;
	}

	public Boolean getmatchOnAddressNumber() {
		return matchOnAddressNumber;
	}

	public void setmatchOnAddressNumber(Boolean matchOnAddressNumber) {
		this.matchOnAddressNumber = matchOnAddressNumber;
	}

	public Boolean getmatchOnAllStreetFields() {
		return matchOnAllStreetFields;
	}

	public void setmatchOnAllStreetFields(Boolean matchOnAllStreetFields) {
		this.matchOnAllStreetFields = matchOnAllStreetFields;
	}

	public Boolean getmatchOnAreaName1() {
		return matchOnAreaName1;
	}

	public void setmatchOnAreaName1(Boolean matchOnAreaName1) {
		this.matchOnAreaName1 = matchOnAreaName1;
	}

	public Boolean getmatchOnAreaName2() {
		return matchOnAreaName2;
	}

	public void setmatchOnAreaName2(Boolean matchOnAreaName2) {
		this.matchOnAreaName2 = matchOnAreaName2;
	}

	public Boolean getmatchOnAreaName3() {
		return matchOnAreaName3;
	}

	public void setmatchOnAreaName3(Boolean matchOnAreaName3) {
		this.matchOnAreaName3 = matchOnAreaName3;
	}

	public Boolean getmatchOnAreaName4() {
		return matchOnAreaName4;
	}

	public void setmatchOnAreaName4(Boolean matchOnAreaName4) {
		this.matchOnAreaName4 = matchOnAreaName4;
	}

	public Boolean getmatchOnInputFields() {
		return matchOnInputFields;
	}

	public void setmatchOnInputFields(Boolean matchOnInputFields) {
		this.matchOnInputFields = matchOnInputFields;
	}

	public Boolean getmatchOnPlaceName() {
		return matchOnPlaceName;
	}

	public void setmatchOnPlaceName(Boolean matchOnPlaceName) {
		this.matchOnPlaceName = matchOnPlaceName;
	}

	public Boolean getmatchOnPostCode1() {
		return matchOnPostCode1;
	}

	public void setmatchOnPostCode1(Boolean matchOnPostCode1) {
		this.matchOnPostCode1 = matchOnPostCode1;
	}

	public Boolean getmatchOnPostCode2() {
		return matchOnPostCode2;
	}

	public void setmatchOnPostCode2(Boolean matchOnPostCode2) {
		this.matchOnPostCode2 = matchOnPostCode2;
	}

	public Boolean getmatchOnStreetDirectional() {
		return matchOnStreetDirectional;
	}

	public void setmatchOnStreetDirectional(Boolean matchOnStreetDirectional) {
		this.matchOnStreetDirectional = matchOnStreetDirectional;
	}

	public Boolean getmatchOnStreetName() {
		return matchOnStreetName;
	}

	public void setmatchOnStreetName(Boolean matchOnStreetName) {
		this.matchOnStreetName = matchOnStreetName;
	}

	public Boolean getmatchOnStreetType() {
		return matchOnStreetType;
	}

	public void setmatchOnStreetType(Boolean matchOnStreetType) {
		this.matchOnStreetType = matchOnStreetType;
	}

	public Boolean getReturnAllCustomFields() {
		return returnAllCustomFields;
	}

	public void setReturnAllCustomFields(Boolean returnAllCustomFields) {
		this.returnAllCustomFields = returnAllCustomFields;
	}

	public Boolean getReturnMatchDescriptor() {
		return returnMatchDescriptor;
	}

	public void setReturnMatchDescriptor(Boolean returnMatchDescriptor) {
		this.returnMatchDescriptor = returnMatchDescriptor;
	}

	public Boolean getReturnStreetAddressFields() {
		return returnStreetAddressFields;
	}

	public void setReturnStreetAddressFields(Boolean returnStreetAddressFields) {
		this.returnStreetAddressFields = returnStreetAddressFields;
	}

	public Boolean getReturnUnitInformation() {
		return returnUnitInformation;
	}

	public void setReturnUnitInformation(Boolean returnUnitInformation) {
		this.returnUnitInformation = returnUnitInformation;
	}

	public List<String> getReturnedCustomFieldKeys() {
		return returnedCustomFieldKeys;
	}

	public void setReturnedCustomFieldKeys(List<String> returnedCustomFieldKeys) {
		this.returnedCustomFieldKeys = returnedCustomFieldKeys;
	}

}