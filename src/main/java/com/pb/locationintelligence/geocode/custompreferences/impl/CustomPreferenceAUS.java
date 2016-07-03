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

public class CustomPreferenceAUS extends CustomPreference {

	private static final String COUNTRY_ISO_CODE = "AUS";

	Boolean KEY_STREET_FRONTAGE;
	Boolean KEY_GNAF_ORIGINAL;
	Boolean KEY_POSTAL_CODE_OVERRIDE;
	Boolean KEY_RETURN_STREET_TYPE_ABBREVS;
	Boolean USE_ADDRESS_POINT_INTERPOLATION;
	Boolean USE_CENTERLINE_OFFSET;
	Integer CENTERLINE_OFFSET;
	DistanceUnits CENTERLINE_OFFSET_UNIT;

	public CustomPreferenceAUS() {
		this.countryISO = COUNTRY_ISO_CODE;
	}

	public Boolean getKEY_STREET_FRONTAGE() {
		return KEY_STREET_FRONTAGE;
	}

	public void setKEY_STREET_FRONTAGE(Boolean kEY_STREET_FRONTAGE) {
		KEY_STREET_FRONTAGE = kEY_STREET_FRONTAGE;
	}

	public Boolean getKEY_GNAF_ORIGINAL() {
		return KEY_GNAF_ORIGINAL;
	}

	public void setKEY_GNAF_ORIGINAL(Boolean kEY_GNAF_ORIGINAL) {
		KEY_GNAF_ORIGINAL = kEY_GNAF_ORIGINAL;
	}

	public Boolean getKEY_POSTAL_CODE_OVERRIDE() {
		return KEY_POSTAL_CODE_OVERRIDE;
	}

	public void setKEY_POSTAL_CODE_OVERRIDE(Boolean kEY_POSTAL_CODE_OVERRIDE) {
		KEY_POSTAL_CODE_OVERRIDE = kEY_POSTAL_CODE_OVERRIDE;
	}

	public Boolean getKEY_RETURN_STREET_TYPE_ABBREVS() {
		return KEY_RETURN_STREET_TYPE_ABBREVS;
	}

	public void setKEY_RETURN_STREET_TYPE_ABBREVS(Boolean kEY_RETURN_STREET_TYPE_ABBREVS) {
		KEY_RETURN_STREET_TYPE_ABBREVS = kEY_RETURN_STREET_TYPE_ABBREVS;
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