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

import com.pb.locationintelligence.geocode.model.DistanceUnits;

public class CustomPreferenceCAN extends CustomPreference{
	
	private static final String COUNTRY_ISO_CODE="CAN";

	private Boolean KEY_MUST_HAVE_LDU;
	private Boolean USE_ADDRESS_POINT_INTERPOLATION;
	private Boolean USE_CENTERLINE_OFFSET;
	private Integer CENTERLINE_OFFSET;
	private DistanceUnits CENTERLINE_OFFSET_UNIT;
	
	public CustomPreferenceCAN() {
		this.countryISO=COUNTRY_ISO_CODE;
	}

	public Boolean getKEY_MUST_HAVE_LDU() {
		return KEY_MUST_HAVE_LDU;
	}

	public void setKEY_MUST_HAVE_LDU(Boolean kEY_MUST_HAVE_LDU) {
		KEY_MUST_HAVE_LDU = kEY_MUST_HAVE_LDU;
	}

	public Boolean getUSE_ADDRESS_POINT_INTERPOLATION() {
		return USE_ADDRESS_POINT_INTERPOLATION;
	}

	public void setUSE_ADDRESS_POINT_INTERPOLATION(Boolean uSE_ADDRESS_POINT_INTERPOLATION) {
		USE_ADDRESS_POINT_INTERPOLATION = uSE_ADDRESS_POINT_INTERPOLATION;
	}

	public Boolean getUSE_CENTERLINE_OFFSET() {
		return USE_CENTERLINE_OFFSET;
	}

	public void setUSE_CENTERLINE_OFFSET(Boolean uSE_CENTERLINE_OFFSET) {
		USE_CENTERLINE_OFFSET = uSE_CENTERLINE_OFFSET;
	}

	public Integer getCENTERLINE_OFFSET() {
		return CENTERLINE_OFFSET;
	}

	public void setCENTERLINE_OFFSET(Integer cENTERLINE_OFFSET) {
		CENTERLINE_OFFSET = cENTERLINE_OFFSET;
	}

	public DistanceUnits getCENTERLINE_OFFSET_UNIT() {
		return CENTERLINE_OFFSET_UNIT;
	}

	public void setCENTERLINE_OFFSET_UNIT(DistanceUnits cENTERLINE_OFFSET_UNIT) {
		CENTERLINE_OFFSET_UNIT = cENTERLINE_OFFSET_UNIT;
	}

}