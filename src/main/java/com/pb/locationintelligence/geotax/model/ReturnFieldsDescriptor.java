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

import java.util.ArrayList;
import java.util.List;


public class ReturnFieldsDescriptor {

    protected boolean returnAllCustomFields;
    protected boolean returnMatchDescriptor;
    protected boolean returnStreetAddressFields;
    protected boolean returnUnitInformation;
    protected List<String> returnedCustomFieldKeys;

    /**
     * Gets the value of the returnAllCustomFields property.
     */
    public boolean isReturnAllCustomFields() {
        return returnAllCustomFields;
    }

    /**
     * Sets the value of the returnAllCustomFields property.
     */
    public void setReturnAllCustomFields(boolean value) {
        this.returnAllCustomFields = value;
    }

    /**
     * Gets the value of the returnMatchDescriptor property.
     */
    public boolean isReturnMatchDescriptor() {
        return returnMatchDescriptor;
    }

    /**
     * Sets the value of the returnMatchDescriptor property.
     */
    public void setReturnMatchDescriptor(boolean value) {
        this.returnMatchDescriptor = value;
    }

    /**
     * Gets the value of the returnStreetAddressFields property.
     */
    public boolean isReturnStreetAddressFields() {
        return returnStreetAddressFields;
    }

    /**
     * Sets the value of the returnStreetAddressFields property.
     */
    public void setReturnStreetAddressFields(boolean value) {
        this.returnStreetAddressFields = value;
    }

    /**
     * Gets the value of the returnUnitInformation property.
     */
    public boolean isReturnUnitInformation() {
        return returnUnitInformation;
    }

    /**
     * Sets the value of the returnUnitInformation property.
     */
    public void setReturnUnitInformation(boolean value) {
        this.returnUnitInformation = value;
    }

    /**
     * Gets the value of the returnedCustomFieldKeys property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the returnedCustomFieldKeys property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReturnedCustomFieldKeys().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     */
    public List<String> getReturnedCustomFieldKeys() {
        if (returnedCustomFieldKeys == null) {
            returnedCustomFieldKeys = new ArrayList<String>();
        }
        return this.returnedCustomFieldKeys;
    }

}
