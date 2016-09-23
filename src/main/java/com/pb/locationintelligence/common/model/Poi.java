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

package com.pb.locationintelligence.common.model;

public class Poi {

	/**
	 * 	Language Code (valid for Street name & Location name).
	 */
    private String langISOCode;
    
    /**
     * Type of language. Possible values: primary/secondary/alternate.
     */
    private String langType;

    private String displayName;

    /**
     * 	Official Name
     */
    private String name;

    /**
     * Alias of Name
     */
    private String alias;
    
    /**
     * Brand Name
     */
    private String brandName;

    /**
     * 	Category code of the POI.
     */
     private Integer categoryCode;

     /**
      * Information about stores that are open 24 hours.
      */
    private String open24Hours;
    
    /**
     * contact details like phone, fax, email & url etc...
     */
    private ContactDetails contactDetails;

    /**
     * Distance object that holds details of distance.
     */
    private Distance distance;

    /**
     * value lof latutude.
     */
    private String latitude;

    /**
     * value of longitude.
     */
    private String longitude;

    /**
     * Customer Specific custom value 1 and will be available in customer data only. Applicable to custom-specified datasets only.
     */
    private String customField1;
    

    /**
     * Customer Specific custom value 2 and will be available in customer data only. Applicable to custom-specified datasets only.
     */
    private String customField2;

    /**
     * Customer Specific custom value 3 and will be available in customer data only. Applicable to custom-specified datasets only.
     */
    private String customField3;

    /**
     * Customer Specific custom value 4 and will be available in customer data only. Applicable to custom-specified datasets only.
     */
    private String customField4;

    /**
     * Customer Specific custom value 5 and will be available in customer data only. Applicable to custom-specified datasets only.
     */
    private String customField5;

    /**
     * Customer Specific custom value 6 and will be available in customer data only. Applicable to custom-specified datasets only.
     */
    private String customField6;

    /**
     * Customer Specific custom value 7 and will be available in customer data only. Applicable to custom-specified datasets only.
     */
    private String customField7;

    /**
     * Customer Specific custom value 8 and will be available in customer data only. Applicable to custom-specified datasets only.
     */
    private String customField8;

    /**
     * Customer Specific custom value 9 and will be available in customer data only. Applicable to custom-specified datasets only.
     */
    private String customField9;

    /**
     * Customer Specific custom value 10 and will be available in customer data only. Applicable to custom-specified datasets only.
     */
    private String customField10;

    public String getCustomField1() {
        return customField1;
    }

    public void setCustomField1(String customField1) {
        this.customField1 = customField1;
    }

    public String getCustomField2() {
        return customField2;
    }

    public void setCustomField2(String customField2) {
        this.customField2 = customField2;
    }

    public String getCustomField3() {
        return customField3;
    }

    public void setCustomField3(String customField3) {
        this.customField3 = customField3;
    }

    public String getCustomField4() {
        return customField4;
    }

    public void setCustomField4(String customField4) {
        this.customField4 = customField4;
    }

    public String getCustomField5() {
        return customField5;
    }

    public void setCustomField5(String customField5) {
        this.customField5 = customField5;
    }

    public String getCustomField6() {
        return customField6;
    }

    public void setCustomField6(String customField6) {
        this.customField6 = customField6;
    }

    public String getCustomField7() {
        return customField7;
    }

    public void setCustomField7(String customField7) {
        this.customField7 = customField7;
    }

    public String getCustomField8() {
        return customField8;
    }

    public void setCustomField8(String customField8) {
        this.customField8 = customField8;
    }

    public String getCustomField9() {
        return customField9;
    }

    public void setCustomField9(String customField9) {
        this.customField9 = customField9;
    }

    public String getCustomField10() {
        return customField10;
    }

    public void setCustomField10(String customField10) {
        this.customField10 = customField10;
    }

    public String getLangISOCode() {
        return langISOCode;
    }

    public String getOpen24Hours() {
        return open24Hours;
    }

    public void setOpen24Hours(String open24Hours) {
        this.open24Hours = open24Hours;
    }

    public void setLangISOCode(String langISOCode) {
        this.langISOCode = langISOCode;
    }

    public String getLangType() {
        return langType;
    }

    public void setLangType(String langType) {
        this.langType = langType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

	public Integer getCategoryCode() {
		return categoryCode;
	}

	public void setCategoryCode(Integer categoryCode) {
		this.categoryCode = categoryCode;
	}

    public ContactDetails getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(ContactDetails contactDetails) {
        this.contactDetails = contactDetails;
    }

    public Distance getDistance() {
        return distance;
    }

    public void setDistance(Distance distance) {
        this.distance = distance;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }
}
