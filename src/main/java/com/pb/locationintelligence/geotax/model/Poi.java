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

import com.pb.locationintelligence.common.model.ContactDetails;
import com.pb.locationintelligence.common.model.Distance;

public class Poi {


    private String langISOCode;


    private String langType;

    private String displayName;

    private String name;

    private String alias;

    private String brandName;


    private Integer categoryCode;

    private String open24Hours;

    private ContactDetails contactDetails;

    private Distance distance;

    private String latitude;

    private String longitude;

    private String customValue1;

    private String customValue2;

    private String customValue3;

    private String customValue4;

    private String customValue5;

    private String customValue6;

    private String customValue7;

    private String customValue8;

    private String customValue9;

    private String customValue10;

    public String getLangISOCode() {
        return langISOCode;
    }

    public void setLangISOCode(String langISOCode) {
        this.langISOCode = langISOCode;
    }

    public String getOpen24Hours() {
        return open24Hours;
    }

    public void setOpen24Hours(String open24Hours) {
        this.open24Hours = open24Hours;
    }

    public Integer getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(Integer categoryCode) {
        this.categoryCode = categoryCode;
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

    public String getCustomValue1() {
        return customValue1;
    }

    public void setCustomValue1(String customValue1) {
        this.customValue1 = customValue1;
    }

    public String getCustomValue2() {
        return customValue2;
    }

    public void setCustomValue2(String customValue2) {
        this.customValue2 = customValue2;
    }

    public String getCustomValue3() {
        return customValue3;
    }

    public void setCustomValue3(String customValue3) {
        this.customValue3 = customValue3;
    }

    public String getCustomValue4() {
        return customValue4;
    }

    public void setCustomValue4(String customValue4) {
        this.customValue4 = customValue4;
    }

    public String getCustomValue5() {
        return customValue5;
    }

    public void setCustomValue5(String customValue5) {
        this.customValue5 = customValue5;
    }

    public String getCustomValue6() {
        return customValue6;
    }

    public void setCustomValue6(String customValue6) {
        this.customValue6 = customValue6;
    }

    public String getCustomValue7() {
        return customValue7;
    }

    public void setCustomValue7(String customValue7) {
        this.customValue7 = customValue7;
    }

    public String getCustomValue8() {
        return customValue8;
    }

    public void setCustomValue8(String customValue8) {
        this.customValue8 = customValue8;
    }

    public String getCustomValue9() {
        return customValue9;
    }

    public void setCustomValue9(String customValue9) {
        this.customValue9 = customValue9;
    }

    public String getCustomValue10() {
        return customValue10;
    }

    public void setCustomValue10(String customValue10) {
        this.customValue10 = customValue10;
    }

}
