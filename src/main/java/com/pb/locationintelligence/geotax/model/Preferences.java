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
import java.util.Map;


public class Preferences {

    protected Boolean returnAllCandidateInfo;
    protected String fallbackToGeographic;
    protected String fallbackToPostal;
    protected String maxReturnedCandidates;
    protected Double distance;
    protected String streetOffset;
    protected String cornerOffset;
    protected String matchMode;
    protected String clientLocale;
    protected String clientCoordSysName;
    protected String distanceUnits;
    protected String streetOffsetUnits;
    protected String cornerOffsetUnits;
    protected FieldsMatching mustMatchFields;
    protected ReturnFieldsDescriptor returnFieldsDescriptor;
    protected String outputRecordType;
    protected Map customPreferences;
    protected List<String> preferredDictionaryOrders;
    /**
     * geoTax Preference Fields
     */

    protected String outputCasing;
    protected String latLongOffset;
    protected String squeeze;
    protected String returnLatLongFields;
    protected String useGeoTaxAuxiliaryFile;
    protected String latLongFormat;
    protected String defaultBufferWidth;
    protected String returnCensusFields;
    protected String taxRatetypeID;

    public String getOutputRecordType() {
        return outputRecordType;
    }

    public void setOutputRecordType(String outputRecordType) {
        this.outputRecordType = outputRecordType;
    }

    public String getOutputCasing() {
        return outputCasing;
    }

    public void setOutputCasing(String outputCasing) {
        this.outputCasing = outputCasing;
    }

    public String getDefaultBufferWidth() {
        return defaultBufferWidth;
    }

    public void setDefaultBufferWidth(String defaultBufferWidth) {
        this.defaultBufferWidth = defaultBufferWidth;
    }

    public String getReturnCensusFields() {
        return returnCensusFields;
    }

    public void setReturnCensusFields(String returnCensusFields) {
        this.returnCensusFields = returnCensusFields;
    }

    public String getReturnLatLongFields() {
        return returnLatLongFields;
    }

    public void setReturnLatLongFields(String returnLatLongFields) {
        this.returnLatLongFields = returnLatLongFields;
    }

    public String getTaxRatetypeID() {
        return taxRatetypeID;
    }

    public void setTaxRatetypeID(String taxRatetypeID) {
        this.taxRatetypeID = taxRatetypeID;
    }

    /**
     * Gets the value of the returnAllCandidateInfo property.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isReturnAllCandidateInfo() {
        return returnAllCandidateInfo;
    }

    /**
     * Sets the value of the returnAllCandidateInfo property.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setReturnAllCandidateInfo(Boolean value) {
        this.returnAllCandidateInfo = value;
    }

    /**
     * Gets the value of the fallbackToGeographic property.
     *
     * @return possible object is {@link Boolean }
     */
    public String isFallbackToGeographic() {
        return fallbackToGeographic;
    }

    /**
     * Gets the value of the fallbackToPostal property.
     *
     * @return possible object is {@link Boolean }
     */
    public String isFallbackToPostal() {
        return fallbackToPostal;
    }

    /**
     * Gets the value of the maxReturnedCandidates property.
     *
     * @return possible object is {@link Integer }
     */
    public String getMaxReturnedCandidates() {
        return maxReturnedCandidates;
    }

    /**
     * Sets the value of the maxReturnedCandidates property.
     *
     * @param value allowed object is {@link Integer }
     */
    public void setMaxReturnedCandidates(String value) {
        this.maxReturnedCandidates = value;
    }

    /**
     * Gets the value of the distance property.
     *
     * @return possible object is {@link Double }
     */
    public Double getDistance() {
        return distance;
    }

    /**
     * Sets the value of the distance property.
     *
     * @param value allowed object is {@link Double }
     */
    public void setDistance(Double value) {
        this.distance = value;
    }

    /**
     * Gets the value of the streetOffset property.
     *
     * @return possible object is {@link Double }
     */
    public String getStreetOffset() {
        return streetOffset;
    }

    /**
     * Sets the value of the streetOffset property.
     *
     * @param value allowed object is {@link Double }
     */
    public void setStreetOffset(String value) {
        this.streetOffset = value;
    }

    /**
     * Gets the value of the cornerOffset property.
     *
     * @return possible object is {@link Double }
     */
    public String getCornerOffset() {
        return cornerOffset;
    }

    /**
     * Sets the value of the cornerOffset property.
     *
     * @param value allowed object is {@link Double }
     */
    public void setCornerOffset(String value) {
        this.cornerOffset = value;
    }

    /**
     * Gets the value of the matchMode property.
     *
     * @return possible object is {@link String }
     */
    public String getMatchMode() {
        return matchMode;
    }

    /**
     * Sets the value of the matchMode property.
     *
     * @param value allowed object is {@link String }
     */
    public void setMatchMode(String value) {
        this.matchMode = value;
    }

    /**
     * Gets the value of the clientLocale property.
     *
     * @return possible object is {@link String }
     */
    public String getClientLocale() {
        return clientLocale;
    }

    /**
     * Sets the value of the clientLocale property.
     *
     * @param value allowed object is {@link String }
     */
    public void setClientLocale(String value) {
        this.clientLocale = value;
    }

    /**
     * Gets the value of the clientCoordSysName property.
     *
     * @return possible object is {@link String }
     */
    public String getClientCoordSysName() {
        return clientCoordSysName;
    }

    /**
     * Sets the value of the clientCoordSysName property.
     *
     * @param value allowed object is {@link String }
     */
    public void setClientCoordSysName(String value) {
        this.clientCoordSysName = value;
    }

    public String getDistanceUnits() {
        return distanceUnits;
    }

    public void setDistanceUnits(String value) {
        this.distanceUnits = value;
    }

    public String getStreetOffsetUnits() {
        return streetOffsetUnits;
    }

    public void setStreetOffsetUnits(String value) {
        this.streetOffsetUnits = value;
    }

    public String getCornerOffsetUnits() {
        return cornerOffsetUnits;
    }

    public void setCornerOffsetUnits(String value) {
        this.cornerOffsetUnits = value;
    }

    /**
     * Gets the value of the mustMatchFields property.
     *
     * @return possible object is {@link FieldsMatching }
     */
    public FieldsMatching getMustMatchFields() {
        return mustMatchFields;
    }

    /**
     * Sets the value of the mustMatchFields property.
     *
     * @param value allowed object is {@link FieldsMatching }
     */
    public void setMustMatchFields(FieldsMatching value) {
        this.mustMatchFields = value;
    }

    /**
     * Gets the value of the returnFieldsDescriptor property.
     *
     * @return possible object is {@link ReturnFieldsDescriptor }
     */
    public ReturnFieldsDescriptor getReturnFieldsDescriptor() {
        return returnFieldsDescriptor;
    }

    /**
     * Sets the value of the returnFieldsDescriptor property.
     *
     * @param value allowed object is {@link ReturnFieldsDescriptor }
     */
    public void setReturnFieldsDescriptor(ReturnFieldsDescriptor value) {
        this.returnFieldsDescriptor = value;
    }

    /**
     * Gets the value of the customPreferences property.
     *
     * @return possible object is {@link Map }
     */
    public Map getCustomPreferences() {
        return customPreferences;
    }

    /**
     * Sets the value of the customPreferences property.
     *
     * @param value allowed object is {@link Map }
     */
    public void setCustomPreferences(Map value) {
        this.customPreferences = value;
    }

    /**
     * Gets the value of the preferredDictionaryOrders property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the preferredDictionaryOrders property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <p/>
     * <pre>
     * getPreferredDictionaryOrders().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list {@link String }
     */
    public List<String> getPreferredDictionaryOrders() {
        if (preferredDictionaryOrders == null) {
            preferredDictionaryOrders = new ArrayList<String>();
        }
        return this.preferredDictionaryOrders;
    }

    public void setPreferredDictionaryOrders(List<String> preferredDictionaryOrders) {
        this.preferredDictionaryOrders = preferredDictionaryOrders;
    }

    public String getLatLongOffset() {
        return latLongOffset;
    }

    public void setLatLongOffset(String latLongOffset) {
        this.latLongOffset = latLongOffset;
    }

    public String getSqueeze() {
        return squeeze;
    }

    public void setSqueeze(String squeeze) {
        this.squeeze = squeeze;
    }

    public String getUseGeoTaxAuxiliaryFile() {
        return useGeoTaxAuxiliaryFile;
    }

    public void setUseGeoTaxAuxiliaryFile(String useGeoTaxAuxiliaryFile) {
        this.useGeoTaxAuxiliaryFile = useGeoTaxAuxiliaryFile;
    }

    public String getLatLongFormat() {
        return latLongFormat;
    }

    public void setLatLongFormat(String latLongFormat) {
        this.latLongFormat = latLongFormat;
    }

    public String getFallbackToGeographic() {
        return fallbackToGeographic;
    }

    /**
     * Sets the value of the fallbackToGeographic property.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setFallbackToGeographic(String value) {
        this.fallbackToGeographic = value;
    }

    public String getFallbackToPostal() {
        return fallbackToPostal;
    }

    /**
     * Sets the value of the fallbackToPostal property.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setFallbackToPostal(String value) {
        this.fallbackToPostal = value;
    }

}
