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

import com.pb.locationintelligence.geocode.Countries;

public class PreferredDictionaryOrder {
	private Countries countries;
	private int[] preferenceOrder;

	public Countries[] getCountries() {
		return countries.values();
	}

	public int[] getPreferenceOrder() {
		return preferenceOrder;
	}

	public void setPreferenceOrder(int[] preferenceOrder) {
		this.preferenceOrder = preferenceOrder;
	}
	
	public static void main(String[] args) {
		System.out.println(new PreferredDictionaryOrder().getCountries());
	}

}