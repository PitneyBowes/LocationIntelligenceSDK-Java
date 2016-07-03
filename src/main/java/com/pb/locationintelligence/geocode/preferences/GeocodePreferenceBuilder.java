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
package com.pb.locationintelligence.geocode.preferences;

import java.util.List;

import com.pb.locationintelligence.geocode.custompreferences.ICustomPreference;

public class GeocodePreferenceBuilder {
	
	private List<ICustomPreference> customPreferences;
	private GeocodePreference geocodePreference;
	private GeocodeReturnFieldsDescriptor fieldsDescriptor;
	
	public List<ICustomPreference> getCustomPreferences() {
		return customPreferences;
	}
	
	public void setCustomPreferences(List<ICustomPreference> customPreferences) {
		this.customPreferences = customPreferences;
	}
	
	public GeocodePreference getGeocodePreference() {
		return geocodePreference;
	}
	
	public void setGeocodePreference(GeocodePreference geocodePreference) {
		this.geocodePreference = geocodePreference;
	}
	
	public GeocodeReturnFieldsDescriptor getFieldsDescriptor() {
		return fieldsDescriptor;
	}
	
	public void setFieldsDescriptor(GeocodeReturnFieldsDescriptor fieldsDescriptor) {
		this.fieldsDescriptor = fieldsDescriptor;
	}
	
}