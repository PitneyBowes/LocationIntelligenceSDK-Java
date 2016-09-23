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

import com.pb.locationintelligence.common.model.Geometry;

/**
 * Created by AM005SI on 8/10/2016.
 */

public class LatLongFields {

    protected String matchCode;
    protected String matchLevel;
    protected String streetMatchCode;
    protected String streetMatchLevel;

    protected Geometry geometry;

    public String getMatchCode() {
        return matchCode;
    }

    public void setMatchCode(String matchCode) {
        this.matchCode = matchCode;
    }

    public String getMatchLevel() {
        return matchLevel;
    }

    public void setMatchLevel(String matchLevel) {
        this.matchLevel = matchLevel;
    }

    public String getStreetMatchCode() {
        return streetMatchCode;
    }

    public void setStreetMatchCode(String streetMatchCode) {
        this.streetMatchCode = streetMatchCode;
    }

    public String getStreetMatchLevel() {
        return streetMatchLevel;
    }

    public void setStreetMatchLevel(String streetMatchLevel) {
        this.streetMatchLevel = streetMatchLevel;
    }

    public Geometry getGeometry() {
        return geometry;
    }

    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }


}
