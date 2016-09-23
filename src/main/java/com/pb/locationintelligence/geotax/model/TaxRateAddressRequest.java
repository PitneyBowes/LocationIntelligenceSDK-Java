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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;






public class TaxRateAddressRequest {

    protected Preferences preferences;
    @XmlElement(required = true)
    protected List<TaxRateAddress> taxRateAddresses;

    /**
     * Gets the value of the geoTaxPreferences property.
     *
     * @return
     *     possible object is
     *     {@link Preferences }
     *
     */
    public Preferences getPreferences() {
        return preferences;
    }

    /**
     * Sets the value of the geoTaxPreferences property.
     *
     * @param value
     *     allowed object is
     *     {@link Preferences }
     *
     */
    public void setPreferences(Preferences value) {
        this.preferences = value;
    }

    /**
     * Gets the value of the addresses property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addresses property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddresses().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * 
     *
     *
     */
    public List<TaxRateAddress> getTaxRateAddresses() {
        if (taxRateAddresses == null) {
            taxRateAddresses = new ArrayList<TaxRateAddress>();
        }
        return this.taxRateAddresses;
    }

    public void setTaxRateAddresses(List<TaxRateAddress> taxRateAddresses) {
        this.taxRateAddresses = taxRateAddresses;
    }

}
