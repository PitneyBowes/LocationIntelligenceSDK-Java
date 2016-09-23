/*****************************************************************************
 * Copyright  ©  2014, Pitney Bowes Software Inc.
 * All  rights reserved.
 * Confidential Property of Pitney Bowes Software Inc.
 */

package com.pb.locationintelligence.geotax.model;


public class Address {

    private String displayName;
    private String streetSide;

    private String businessName;
    private String addressLine1;
    private String addressLine2;
    private String addressLine3;
    private String city;
    private String stateProvince;
    private String county;
    private String postalCode;
    private String latitude;
    private String longitude;
    private String status;
    private String urbanizationName;
    private String formattedAddress;
    private String mainAddressLine;
    private String addressLastLine;
    private String placeName;
    private String areaName1;
    private String areaName2;
    private String areaName3;
    private String areaName4;
    private String postCode;
    private String postCodeExt;
    private String country;
    private String addressNumber;
    private String streetName;
    private String unitType;
    private String unitValue;

    public static String displayNameFromAddress(Address address, String separator) {
        if (address == null) return null;

        StringBuilder displayName = new StringBuilder();


        return displayName.toString();
    }

    public static String setDisplayNameInUSAddressFormat(Address address) {
        if (address == null) return null;

        StringBuilder displayName = new StringBuilder();
        String commaAndSpaceSeparator = ", ";
        String spaceSeparator = " ";


        if (displayName != null) {
            address.setDisplayName(displayName.toString());
            return displayName.toString();
        } else {
            return null;
        }
    }

    public String getFormattedAddress() {
        return formattedAddress;
    }

    public void setFormattedAddress(String formattedAddress) {
        this.formattedAddress = formattedAddress;
    }

    public String getMainAddressLine() {
        return mainAddressLine;
    }

    public void setMainAddressLine(String mainAddressLine) {
        this.mainAddressLine = mainAddressLine;
    }

    public String getAddressLastLine() {
        return addressLastLine;
    }

    public void setAddressLastLine(String addressLastLine) {
        this.addressLastLine = addressLastLine;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public String getAreaName1() {
        return areaName1;
    }

    public void setAreaName1(String areaName1) {
        this.areaName1 = areaName1;
    }

    public String getAreaName2() {
        return areaName2;
    }

    public void setAreaName2(String areaName2) {
        this.areaName2 = areaName2;
    }

    public String getAreaName3() {
        return areaName3;
    }

    public void setAreaName3(String areaName3) {
        this.areaName3 = areaName3;
    }

    public String getAreaName4() {
        return areaName4;
    }

    public void setAreaName4(String areaName4) {
        this.areaName4 = areaName4;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getPostCodeExt() {
        return postCodeExt;
    }

    public void setPostCodeExt(String postCodeExt) {
        this.postCodeExt = postCodeExt;
    }

    public String getAddressNumber() {
        return addressNumber;
    }

    public void setAddressNumber(String addressNumber) {
        this.addressNumber = addressNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getUnitType() {
        return unitType;
    }

    public void setUnitType(String unitType) {
        this.unitType = unitType;
    }

    public String getUnitValue() {
        return unitValue;
    }

    public void setUnitValue(String unitValue) {
        this.unitValue = unitValue;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getAddressLine3() {
        return addressLine3;
    }

    public void setAddressLine3(String addressLine3) {
        this.addressLine3 = addressLine3;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getStateProvince() {
        return stateProvince;
    }

    public void setStateProvince(String stateProvince) {
        this.stateProvince = stateProvince;
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

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getStreetSide() {
        return streetSide;
    }

    public void setStreetSide(String streetSide) {
        this.streetSide = streetSide;
    }

    public String getUrbanizationName() {
        return urbanizationName;
    }

    public void setUrbanizationName(String urbanizationName) {
        this.urbanizationName = urbanizationName;
    }
}
