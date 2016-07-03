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

import java.util.Map;

import com.pb.locationintelligence.geocode.model.DistanceUnits;
import com.pb.locationintelligence.geocode.model.MatchMode;
import com.pb.locationintelligence.geocode.model.forward.MatchFieldPreferences;

public class GeocodePreference {

	private boolean returnAllCandidateInfo;
	private boolean fallbackToGeographic;
	private boolean fallbackToPostal;
	private String maxReturnedCandidates;
	private Double distance;
	private String streetOffset;
	private String cornerOffset;
	private MatchMode matchMode;
	private String clientLocale;
	private String clientCoordSysName;
	private DistanceUnits distanceUnits;
	private DistanceUnits streetOffsetUnits;
	private DistanceUnits cornerOffsetUnits;
	private MatchFieldPreferences mustMatchFields;
	private PreferredDictionaryOrder[] preferredDictionaryOrders;
	private Map customPreferences;

	public boolean isReturnAllCandidateInfo() {
		return returnAllCandidateInfo;
	}

	public void setReturnAllCandidateInfo(boolean returnAllCandidateInfo) {
		this.returnAllCandidateInfo = returnAllCandidateInfo;
	}

	public boolean isFallbackToGeographic() {
		return fallbackToGeographic;
	}

	public void setFallbackToGeographic(boolean fallbackToGeographic) {
		this.fallbackToGeographic = fallbackToGeographic;
	}

	public boolean isFallbackToPostal() {
		return fallbackToPostal;
	}

	public void setFallbackToPostal(boolean fallbackToPostal) {
		this.fallbackToPostal = fallbackToPostal;
	}

	public String getMaxReturnedCandidates() {
		return maxReturnedCandidates;
	}

	public void setMaxReturnedCandidates(String maxReturnedCandidates) {
		this.maxReturnedCandidates = maxReturnedCandidates;
	}

	public Double getDistance() {
		return distance;
	}

	public void setDistance(Double distance) {
		this.distance = distance;
	}

	public String getStreetOffset() {
		return streetOffset;
	}

	public void setStreetOffset(String streetOffset) {
		this.streetOffset = streetOffset;
	}

	public String getCornerOffset() {
		return cornerOffset;
	}

	public void setCornerOffset(String cornerOffset) {
		this.cornerOffset = cornerOffset;
	}

	public MatchMode getMatchMode() {
		return matchMode;
	}

	public void setMatchMode(MatchMode matchMode) {
		this.matchMode = matchMode;
	}

	public String getClientLocale() {
		return clientLocale;
	}

	public void setClientLocale(String clientLocale) {
		this.clientLocale = clientLocale;
	}

	public String getClientCoordSysName() {
		return clientCoordSysName;
	}

	public void setClientCoordSysName(String clientCoordSysName) {
		this.clientCoordSysName = clientCoordSysName;
	}

	public DistanceUnits getDistanceUnits() {
		return distanceUnits;
	}

	public void setDistanceUnits(DistanceUnits distanceUnits) {
		this.distanceUnits = distanceUnits;
	}

	public DistanceUnits getStreetOffsetUnits() {
		return streetOffsetUnits;
	}

	public void setStreetOffsetUnits(DistanceUnits streetOffsetUnits) {
		this.streetOffsetUnits = streetOffsetUnits;
	}

	public DistanceUnits getCornerOffsetUnits() {
		return cornerOffsetUnits;
	}

	public void setCornerOffsetUnits(DistanceUnits cornerOffsetUnits) {
		this.cornerOffsetUnits = cornerOffsetUnits;
	}

	public MatchFieldPreferences getMustMatchFields() {
		return mustMatchFields;
	}

	public void setMustMatchFields(MatchFieldPreferences mustMatchFields) {
		this.mustMatchFields = mustMatchFields;
	}

	public PreferredDictionaryOrder[] getPreferredDictionaryOrders() {
		return preferredDictionaryOrders;
	}

	public void setPreferredDictionaryOrders(PreferredDictionaryOrder[] preferredDictionaryOrders) {
		this.preferredDictionaryOrders = preferredDictionaryOrders;
	}

	public Map getCustomPreferences() {
		return customPreferences;
	}

	public void setCustomPreferences(Map customPreferences) {
		this.customPreferences = customPreferences;
	}

}