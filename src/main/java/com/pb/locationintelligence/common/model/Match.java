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

package com.pb.locationintelligence.common.model;

public class Match {

    private String confidence;
    private String percentGeocode;
    private String precisionLevel;
    private String locationCode;
    private String matchCode;
   
    public String getConfidence() {
        return confidence;
    }

    public void setConfidence(String confidence) {
        this.confidence = confidence;
    }

    public String getPercentGeocode() {
        return percentGeocode;
    }

    public void setPercentGeocode(String percentGeocode) {
        this.percentGeocode = percentGeocode;
    }

    public String getLocationCode() {
        return locationCode;
    }

    public void setLocationCode(String locationCode) {
        this.locationCode = locationCode;
    }

    public String getMatchCode() {
        return matchCode;
    }

    public void setMatchCode(String matchCode) {
        this.matchCode = matchCode;
    }

	public String getPrecisionLevel() {
		return precisionLevel;
	}

	public void setPrecisionLevel(String precisionLevel) {
		this.precisionLevel = precisionLevel;
	}
}
