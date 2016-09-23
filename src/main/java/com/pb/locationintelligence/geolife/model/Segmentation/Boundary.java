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


public class Boundary {

    protected String boundaryId;
    protected String boundaryType;
    protected String url;
    protected String boundaryRef;

    /**
     * Gets the value of the boundaryId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoundaryId() {
        return boundaryId;
    }

    /**
     * Sets the value of the boundaryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoundaryId(String value) {
        this.boundaryId = value;
    }

    /**
     * Gets the value of the boundaryType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoundaryType() {
        return boundaryType;
    }

    /**
     * Sets the value of the boundaryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoundaryType(String value) {
        this.boundaryType = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

	String getBoundaryRef() {
		return boundaryRef;
	}

	void setBoundaryRef(String boundaryRef) {
		this.boundaryRef = boundaryRef;
	}

}
