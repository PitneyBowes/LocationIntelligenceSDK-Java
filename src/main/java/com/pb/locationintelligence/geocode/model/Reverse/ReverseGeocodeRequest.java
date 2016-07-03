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
package com.pb.locationintelligence.geocode.model.Reverse;

import com.pb.locationintelligence.geocode.preferences.GeocodePreference;

import java.util.ArrayList;
import java.util.List;


public class ReverseGeocodeRequest {

    protected GeocodePreference preferences;
    protected List<Point> points;

    /**
     * Gets the value of the preferences property.
     *
     * @return possible object is
     * {@link GeocodePreference }
     */
    public GeocodePreference getPreferences() {
        return preferences;
    }

    /**
     * Sets the value of the preferences property.
     *
     * @param value allowed object is
     *              {@link GeocodePreference }
     */
    public void setPreferences(GeocodePreference value) {
        this.preferences = value;
    }

    /**
     * Gets the value of the points property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the points property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPoints().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link Point }
     */
    public List<Point> getPoints() {
        if (points == null) {
            points = new ArrayList<Point>();
        }
        return this.points;
    }

}
