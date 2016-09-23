/*****************************************************************************
 * Copyright  ©  2014, Pitney Bowes Software Inc.
 * All  rights reserved.
 * Confidential Property of Pitney Bowes Software Inc.
 */

package com.pb.locationintelligence.geotax.model;

public class NeighbourhoodName {

    private String langType;

    private String langISOCode;

    private String value;

    public String getLangType() {
        return langType;
    }

    public void setLangType(String langType) {
        this.langType = langType;
    }

    public String getLangISOCode() {
        return langISOCode;
    }

    public void setLangISOCode(String langISOCode) {
        this.langISOCode = langISOCode;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setAll(String langType, String langISOCode, String value) {
        this.langType = langType;
        this.langISOCode = langISOCode;
        this.value = value;
    }
}
