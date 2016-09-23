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

package com.pb.locationintelligence.geolife.model.Segmentation;

public class Segmentation {

    protected Boundaries boundaries;
    protected Themes themes;

    /**
     * Gets the value of the boundaries property.
     * 
     * @return
     *     possible object is
     *     {@link Boundaries }
     *     
     */
    public Boundaries getBoundaries() {
        return boundaries;
    }

    /**
     * Sets the value of the boundaries property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boundaries }
     *     
     */
    public void setBoundaries(Boundaries value) {
        this.boundaries = value;
    }

    /**
     * Gets the value of the themes property.
     * 
     * @return
     *     possible object is
     *     {@link Themes }
     *     
     */
    public Themes getThemes() {
        return themes;
    }

    /**
     * Sets the value of the themes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Themes }
     *     
     */
    public void setThemes(Themes value) {
        this.themes = value;
    }

}
