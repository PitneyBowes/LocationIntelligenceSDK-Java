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

import java.util.Map;

public class CandidateRangeUnit {

	/**
	 * If applicable, indicates the name of the candidate's place or building.
	 */
	protected String placeName;
	
	/**
	 * Indicates the unit type (APT, STE, etc.).
	 */
	protected String unitType;
	
	/**
	 * Indicates the high unit number for this range unit.
	 */
	protected String highUnitValue;
	
	/**
	 * Indicates the low unit number for this range unit.
	 */
	protected String lowUnitValue;
	
	/**
	 * A map of local values associated with the unit.
	 */
	protected Map customValues;

	public String getPlaceName() {
		return placeName;
	}

	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}

	public String getUnitType() {
		return unitType;
	}

	public void setUnitType(String unitType) {
		this.unitType = unitType;
	}

	public String getHighUnitValue() {
		return highUnitValue;
	}

	public void setHighUnitValue(String highUnitValue) {
		this.highUnitValue = highUnitValue;
	}

	public String getLowUnitValue() {
		return lowUnitValue;
	}

	public void setLowUnitValue(String lowUnitValue) {
		this.lowUnitValue = lowUnitValue;
	}

	public Map getCustomValues() {
		return customValues;
	}

	public void setCustomValues(Map customValues) {
		this.customValues = customValues;
	}

}