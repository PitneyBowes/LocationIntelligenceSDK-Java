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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;



public class FieldsMatching {

    protected boolean matchOnAddressNumber;
    protected boolean matchOnPostCode1;
    protected boolean matchOnPostCode2;
    protected boolean matchOnAreaName1;
    protected boolean matchOnAreaName2;
    protected boolean matchOnAreaName3;
    protected boolean matchOnAreaName4;
    protected boolean matchOnAllStreetFields;
    protected boolean matchOnStreetName;
    protected boolean matchOnStreetType;
    protected boolean matchOnStreetDirectional;
    protected boolean matchOnPlaceName;
    protected boolean matchOnInputFields;

    /**
     * Gets the value of the matchOnAddressNumber property.
     * 
     */
    public boolean isMatchOnAddressNumber() {
        return matchOnAddressNumber;
    }

    /**
     * Sets the value of the matchOnAddressNumber property.
     * 
     */
    public void setMatchOnAddressNumber(boolean value) {
        this.matchOnAddressNumber = value;
    }

    /**
     * Gets the value of the matchOnPostCode1 property.
     * 
     */
    public boolean isMatchOnPostCode1() {
        return matchOnPostCode1;
    }

    /**
     * Sets the value of the matchOnPostCode1 property.
     * 
     */
    public void setMatchOnPostCode1(boolean value) {
        this.matchOnPostCode1 = value;
    }

    /**
     * Gets the value of the matchOnPostCode2 property.
     * 
     */
    public boolean isMatchOnPostCode2() {
        return matchOnPostCode2;
    }

    /**
     * Sets the value of the matchOnPostCode2 property.
     * 
     */
    public void setMatchOnPostCode2(boolean value) {
        this.matchOnPostCode2 = value;
    }

    /**
     * Gets the value of the matchOnAreaName1 property.
     * 
     */
    public boolean isMatchOnAreaName1() {
        return matchOnAreaName1;
    }

    /**
     * Sets the value of the matchOnAreaName1 property.
     * 
     */
    public void setMatchOnAreaName1(boolean value) {
        this.matchOnAreaName1 = value;
    }

    /**
     * Gets the value of the matchOnAreaName2 property.
     * 
     */
    public boolean isMatchOnAreaName2() {
        return matchOnAreaName2;
    }

    /**
     * Sets the value of the matchOnAreaName2 property.
     * 
     */
    public void setMatchOnAreaName2(boolean value) {
        this.matchOnAreaName2 = value;
    }

    /**
     * Gets the value of the matchOnAreaName3 property.
     * 
     */
    public boolean isMatchOnAreaName3() {
        return matchOnAreaName3;
    }

    /**
     * Sets the value of the matchOnAreaName3 property.
     * 
     */
    public void setMatchOnAreaName3(boolean value) {
        this.matchOnAreaName3 = value;
    }

    /**
     * Gets the value of the matchOnAreaName4 property.
     * 
     */
    public boolean isMatchOnAreaName4() {
        return matchOnAreaName4;
    }

    /**
     * Sets the value of the matchOnAreaName4 property.
     * 
     */
    public void setMatchOnAreaName4(boolean value) {
        this.matchOnAreaName4 = value;
    }

    /**
     * Gets the value of the matchOnAllStreetFields property.
     * 
     */
    public boolean isMatchOnAllStreetFields() {
        return matchOnAllStreetFields;
    }

    /**
     * Sets the value of the matchOnAllStreetFields property.
     * 
     */
    public void setMatchOnAllStreetFields(boolean value) {
        this.matchOnAllStreetFields = value;
    }

    /**
     * Gets the value of the matchOnStreetName property.
     * 
     */
    public boolean isMatchOnStreetName() {
        return matchOnStreetName;
    }

    /**
     * Sets the value of the matchOnStreetName property.
     * 
     */
    public void setMatchOnStreetName(boolean value) {
        this.matchOnStreetName = value;
    }

    /**
     * Gets the value of the matchOnStreetType property.
     * 
     */
    public boolean isMatchOnStreetType() {
        return matchOnStreetType;
    }

    /**
     * Sets the value of the matchOnStreetType property.
     * 
     */
    public void setMatchOnStreetType(boolean value) {
        this.matchOnStreetType = value;
    }

    /**
     * Gets the value of the matchOnStreetDirectional property.
     * 
     */
    public boolean isMatchOnStreetDirectional() {
        return matchOnStreetDirectional;
    }

    /**
     * Sets the value of the matchOnStreetDirectional property.
     * 
     */
    public void setMatchOnStreetDirectional(boolean value) {
        this.matchOnStreetDirectional = value;
    }

    /**
     * Gets the value of the matchOnPlaceName property.
     * 
     */
    public boolean isMatchOnPlaceName() {
        return matchOnPlaceName;
    }

    /**
     * Sets the value of the matchOnPlaceName property.
     * 
     */
    public void setMatchOnPlaceName(boolean value) {
        this.matchOnPlaceName = value;
    }

    /**
     * Gets the value of the matchOnInputFields property.
     * 
     */
    public boolean isMatchOnInputFields() {
        return matchOnInputFields;
    }

    /**
     * Sets the value of the matchOnInputFields property.
     * 
     */
    public void setMatchOnInputFields(boolean value) {
        this.matchOnInputFields = value;
    }

}
