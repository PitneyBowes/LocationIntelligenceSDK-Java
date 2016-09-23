/*****************************************************************************
 * Copyright  ©  2014, Pitney Bowes Software Inc.
 * All  rights reserved.
 * Confidential Property of Pitney Bowes Software Inc.
 */

package com.pb.locationintelligence.geotax.model;


import com.pb.locationintelligence.common.model.Poi;

public class Location {

    private String dataset;
    private Match match;
    private Address address;
    private Poi poi;
    private Distance distance;
    private String unitTemp;
    private String valueTemp;


    private String country;


    private String vendorCode;


    private PlaceByLocationResponse placeByLocationResponse;

    private Geometry geometry;

    public Match getMatch() {
        return match;
    }

    public void setMatch(Match match) {
        this.match = match;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Distance getDistance() {
        return distance;
    }

    public void setDistance(Distance distance) {
        this.distance = distance;
    }

    public PlaceByLocationResponse getPlaceByLocationResponse() {
        return placeByLocationResponse;
    }

    public void setPlaceByLocationResponse(PlaceByLocationResponse placeByLocationResponse) {
        this.placeByLocationResponse = placeByLocationResponse;
    }

    public Poi getPoi() {
        return poi;
    }

    public void setPoi(Poi poi) {
        this.poi = poi;
    }

    public Geometry getGeometry() {
        return geometry;
    }

    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }

    public String getDataset() {
        return dataset;
    }

    public void setDataset(String dataset) {
        this.dataset = dataset;
    }

    public String getUnitTemp() {
        return unitTemp;
    }

    public void setUnitTemp(String unitTemp) {
        this.unitTemp = unitTemp;
    }

    public String getValueTemp() {
        return valueTemp;
    }

    public void setValueTemp(String valueTemp) {
        this.valueTemp = valueTemp;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getVendorCode() {
        return vendorCode;
    }

    public void setVendorCode(String vendorCode) {
        this.vendorCode = vendorCode;
    }


}
