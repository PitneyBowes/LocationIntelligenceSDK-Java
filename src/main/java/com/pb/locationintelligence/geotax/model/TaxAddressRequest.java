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


import java.util.ArrayList;
import java.util.List;


public class TaxAddressRequest {

    protected Preferences preferences;
    protected List<TaxAddress> taxAddresses;


    /**
     * Gets the value of the geoTaxPreferences property.
     *
     * @return possible object is
     * {@link Preferences }
     */
    public Preferences getPreferences() {
        return this.preferences;
    }

    /**
     * Sets the value of the geoTaxPreferences property.
     *
     * @param value allowed object is
     *              {@link Preferences }
     */
    public void setPreferences(Preferences value) {
        this.preferences = value;
    }


    /**
     * Gets the value of the addresses property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addresses property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddresses().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link  }
     */
    public List<TaxAddress> getTaxAddresses() {
        if (taxAddresses == null) {
            taxAddresses = new ArrayList<TaxAddress>();
        }
        return this.taxAddresses;
    }

    public void setTaxAddresses(List<TaxAddress> taxAddresses) {
        this.taxAddresses = taxAddresses;
    }


}
