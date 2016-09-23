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
package com.pb.locationintelligence.geoenhance.model;

public class TimezoneResponse {
	/**
	 * Name and abbreviation of the timezone for the given location coordinates, such as, Central Europe Time (CET/CEST), 
	 * Hawaiian Standard Time (HST) etc.timezoneName can contain blank values. 
	 * The blank values generally get displayed for locations that do not fall under any country or for ocean/water regions.
	 */
	private String timezoneName;
	/**
	 * For a given location coordinates, the offset in milliseconds from the UTC time. 
	 * This can be a 0 or a positive or negative number.
	 */
	private Long utcOffset;
	/**
	 * For a given location coordinates, the offset in milliseconds for daylight saving. 
	 * This can be 0 or positive or negative number. For example, for the US timezone - Central Time (CST/CDT)
	 */
	private Long dstOffset;
	/**
	 * Input UTC time.
	 */
	private Long timestamp;
	
	public String getTimezoneName() {
		return timezoneName;
	}
	public void setTimezoneName(String timezoneName) {
		this.timezoneName = timezoneName;
	}
	public Long getUtcOffset() {
		return utcOffset;
	}
	public void setUtcOffset(Long utcOffset) {
		this.utcOffset = utcOffset;
	}
	public Long getDstOffset() {
		return dstOffset;
	}
	public void setDstOffset(Long dstOffset) {
		this.dstOffset = dstOffset;
	}
	public Long getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}
}
