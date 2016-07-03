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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CandidateRange {

	protected String placeName;
	protected String lowHouse;
	protected String highHouse;
	protected StreetSideIndicator side;
	protected OddEvenIndicator oddEvenIndicator;
	protected List<CandidateRangeUnit> units;
	protected Map customValues;

	public String getPlaceName() {
		return placeName;
	}

	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}

	public String getLowHouse() {
		return lowHouse;
	}

	public void setLowHouse(String lowHouse) {
		this.lowHouse = lowHouse;
	}

	public String getHighHouse() {
		return highHouse;
	}

	public void setHighHouse(String highHouse) {
		this.highHouse = highHouse;
	}

	public StreetSideIndicator getSide() {
		return side;
	}

	public void setSide(StreetSideIndicator side) {
		this.side = side;
	}

	public OddEvenIndicator getOddEvenIndicator() {
		return oddEvenIndicator;
	}

	public void setOddEvenIndicator(OddEvenIndicator oddEvenIndicator) {
		this.oddEvenIndicator = oddEvenIndicator;
	}

	/**
	 * Gets the value of the units property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. This is why there is not a <CODE>set</CODE> method for the
	 * units property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getUnits().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link CandidateRangeUnit }
	 * 
	 * 
	 */
	public List<CandidateRangeUnit> getUnits() {
		if (units == null) {
			units = new ArrayList<CandidateRangeUnit>();
		}
		return this.units;
	}

	public Map getCustomValues() {
		return customValues;
	}

	public void setCustomValues(Map customValues) {
		this.customValues = customValues;
	}

}