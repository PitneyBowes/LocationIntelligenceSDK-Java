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
package com.pb.locationintelligence.geocode.model;

public class FieldsMatching {

	/**
	 * Indicates if the input address number matched the candidate's address number.
		True:
		The input address number matched the candidate's address number.
		False:
		The input address number did not match the candidate's address number.
	 */
	protected boolean matchOnAddressNumber;
	
	/**
	 * Indicates if the input postCode1 field matched the candidate's postCode1 field.
	True:
	The input postCode1 matched the candidate's postCode1.
	False:
	The input postCode1 did not match the candidate's postCode1.
	 */
	protected boolean matchOnPostCode1;
	
	/**
	 * Indicates if the input postCode2 field (post code extension) matched the candidate's postCode2 field.
		True:
		The input postCode2 matched the candidate's postCode2.
		False:
		The input postCode2 did not match candidate's postCode2.
	 */
	protected boolean matchOnPostCode2;
	
	/**
	 * ndicates if the input areaName1 field matched the candidate's areaName1 field.
		True:
		The input areaName1 matched the candidate's areaName1.
		False:
		The input areaName1 did not match the candidate's areaName1.
	 */
	protected boolean matchOnAreaName1;
	
	/**
	 * ndicates if the input areaName2 field matched the candidate's areaName2 field.
		True:
		The input areaName2 matched the candidate's areaName2.
		False:
		The input areaName2 did not match the candidate's areaName2.
	 */
	protected boolean matchOnAreaName2;
	
	/**
	 * ndicates if the input areaName3 field matched the candidate's areaName3 field.
		True:
		The input areaName3 matched the candidate's areaName3.
		False:
		The input areaName3 did not match the candidate's areaName3.
	 */
	protected boolean matchOnAreaName3;
	
	/**
	 * ndicates if the input areaName4 field matched the candidate's areaName4 field.
		True:
		The input areaName4 matched the candidate's areaName4.
		False:
		The input areaName4 did not match the candidate's areaName4.
	 */
	protected boolean matchOnAreaName4;
	protected boolean matchOnAllStreetFields;
	
	/**
	 * Indicates if the input street name matched the candidate's street name.
	True:
	The input street name matched the candidate's street name.
	False:
	The input street name did not match the candidate's street name.
	 */
	protected boolean matchOnStreetName;
	
	/**
	 * Indicates if the input street type matched the candidate's street type.
	True:
	The input street type matched the candidate's street type.
	False:
	The input street type did not match the candidate's street type.
	 */
	protected boolean matchOnStreetType;
	
	/**
	 * ndicates if the input street directional matched the candidate's street directional.
		True
		The input street directional matched the candidate's street directional.
		False
		The input street directional did not match the candidate's street directional.
	 */
	protected boolean matchOnStreetDirectional;
	
	/**
	 * Indicates if the input place name matched the candidate's place name.
		True
		The input place name matched the candidate's place name.
		False
		The input place name did not match the candidate's place name.
	 */
	protected boolean matchOnPlaceName;
	protected boolean matchOnInputFields;

	public boolean isMatchOnAddressNumber() {
		return matchOnAddressNumber;
	}

	public void setMatchOnAddressNumber(boolean matchOnAddressNumber) {
		this.matchOnAddressNumber = matchOnAddressNumber;
	}

	public boolean isMatchOnPostCode1() {
		return matchOnPostCode1;
	}

	public void setMatchOnPostCode1(boolean matchOnPostCode1) {
		this.matchOnPostCode1 = matchOnPostCode1;
	}

	public boolean isMatchOnPostCode2() {
		return matchOnPostCode2;
	}

	public void setMatchOnPostCode2(boolean matchOnPostCode2) {
		this.matchOnPostCode2 = matchOnPostCode2;
	}

	public boolean isMatchOnAreaName1() {
		return matchOnAreaName1;
	}

	public void setMatchOnAreaName1(boolean matchOnAreaName1) {
		this.matchOnAreaName1 = matchOnAreaName1;
	}

	public boolean isMatchOnAreaName2() {
		return matchOnAreaName2;
	}

	public void setMatchOnAreaName2(boolean matchOnAreaName2) {
		this.matchOnAreaName2 = matchOnAreaName2;
	}

	public boolean isMatchOnAreaName3() {
		return matchOnAreaName3;
	}

	public void setMatchOnAreaName3(boolean matchOnAreaName3) {
		this.matchOnAreaName3 = matchOnAreaName3;
	}

	public boolean isMatchOnAreaName4() {
		return matchOnAreaName4;
	}

	public void setMatchOnAreaName4(boolean matchOnAreaName4) {
		this.matchOnAreaName4 = matchOnAreaName4;
	}

	public boolean isMatchOnAllStreetFields() {
		return matchOnAllStreetFields;
	}

	public void setMatchOnAllStreetFields(boolean matchOnAllStreetFields) {
		this.matchOnAllStreetFields = matchOnAllStreetFields;
	}

	public boolean isMatchOnStreetName() {
		return matchOnStreetName;
	}

	public void setMatchOnStreetName(boolean matchOnStreetName) {
		this.matchOnStreetName = matchOnStreetName;
	}

	public boolean isMatchOnStreetType() {
		return matchOnStreetType;
	}

	public void setMatchOnStreetType(boolean matchOnStreetType) {
		this.matchOnStreetType = matchOnStreetType;
	}

	public boolean isMatchOnStreetDirectional() {
		return matchOnStreetDirectional;
	}

	public void setMatchOnStreetDirectional(boolean matchOnStreetDirectional) {
		this.matchOnStreetDirectional = matchOnStreetDirectional;
	}

	public boolean isMatchOnPlaceName() {
		return matchOnPlaceName;
	}

	public void setMatchOnPlaceName(boolean matchOnPlaceName) {
		this.matchOnPlaceName = matchOnPlaceName;
	}

	public boolean isMatchOnInputFields() {
		return matchOnInputFields;
	}

	public void setMatchOnInputFields(boolean matchOnInputFields) {
		this.matchOnInputFields = matchOnInputFields;
	}

}