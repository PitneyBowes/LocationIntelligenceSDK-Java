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

public class Place {
	/**
	 * State name.
	 */
	private String name;
	
	/**
	 * State code.
	 */
	private String code;
	
	/**	
	 *	Place class code. Place class codes are used to determine the proper taxing jurisdictions. 
	 */
	private String classCode;
	
	/**
	 * Indicates whether the address is located in an incorporated or unincorporated place. 
	 * A "place" is a geographic area defined on the basis of population criteria that vary by state. 
	 * Or, an area recognized as significant because it is located in an incorporated municipality.
	 */
	private String incorporatedFlag;
	
	/**
	 * Last annexed date, in the format MM/YYYY, representing the month and 
	 * year of the most recent boundary change or 
	 * the most recent available boundary information.
	 */
	private String lastAnnexedDate;
	
	/**
	 * Last updated date, in the format MM/YYYY, reflecting the month and year.
	 */
	private String lastUpdatedDate;
	
	/**
	 * Last verified date, in the format MM/YYYY, representing the month and year.
	 */
	private String lastVerifiedDate;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getClassCode() {
		return classCode;
	}

	public void setClassCode(String classCode) {
		this.classCode = classCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIncorporatedFlag() {
		return incorporatedFlag;
	}

	public void setIncorporatedFlag(String incorporatedFlag) {
		this.incorporatedFlag = incorporatedFlag;
	}

	public String getLastAnnexedDate() {
		return lastAnnexedDate;
	}

	public void setLastAnnexedDate(String lastAnnexedDate) {
		this.lastAnnexedDate = lastAnnexedDate;
	}

	public String getLastUpdatedDate() {
		return lastUpdatedDate;
	}

	public void setLastUpdatedDate(String lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}

	public String getLastVerifiedDate() {
		return lastVerifiedDate;
	}

	public void setLastVerifiedDate(String lastVerifiedDate) {
		this.lastVerifiedDate = lastVerifiedDate;
	}

}
