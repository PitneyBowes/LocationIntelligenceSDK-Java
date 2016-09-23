/*******************************************************************************
 * Copyright 2016 Pitney Bowes Inc.
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and limitations under the License.
 *******************************************************************************/
package com.pb.locationintelligence.geotax.model;

import com.pb.locationintelligence.geocode.model.GeoPos;


public class Points {

    protected String country;
    protected GeoPos geometry;

    /**
     * Gets the value of the country property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the geometry property.
     *
     * @return
     *     possible object is
     *     {@link GeoPos }
     *
     */
    public GeoPos getGeometry() {
        return geometry;
    }

    /**
     * Sets the value of the geometry property.
     *
     * @param value
     *     allowed object is
     *     {@link GeoPos }
     *
     */
    public void setGeometry(GeoPos value) {
        this.geometry = value;
    }

}
