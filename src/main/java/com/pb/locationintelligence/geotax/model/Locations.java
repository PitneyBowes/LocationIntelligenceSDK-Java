/*****************************************************************************
 * Copyright  ©  2014, Pitney Bowes Software Inc.
 * All  rights reserved.
 * Confidential Property of Pitney Bowes Software Inc.
 */

package com.pb.locationintelligence.geotax.model;

public class Locations {

    protected Geometry geometry;


    protected String purchaseAmount;


    public String getPurchaseAmount() {
        return purchaseAmount;
    }

    public void setPurchaseAmount(String purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
    }

    /**
     * Gets the value of the geometry property.
     *
     * @return possible object is
     * {@link Geometry }
     */
    public Geometry getGeometry() {
        return geometry;
    }

    /**
     * Sets the value of the geometry property.
     *
     * @param value allowed object is
     *              {@link Geometry }
     */
    public void setGeometry(Geometry value) {
        this.geometry = value;
    }

}
