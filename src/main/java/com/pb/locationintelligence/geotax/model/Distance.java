/*****************************************************************************
 *       Copyright  ©  2014, Pitney Bowes Software Inc.
 *       All  rights reserved.
 *       Confidential Property of Pitney Bowes Software Inc.
 */

package com.pb.locationintelligence.geotax.model;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Distance {

    private String unit;

    private String value;

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }


    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
        truncateValue();
    }

    public void truncateValue() {
        if (this.value != null) {
            Double truncatedValue = Double.parseDouble(this.value);
            //set distance value upto 3 decimal places
            DecimalFormat df = new DecimalFormat("0.000");
            df.setRoundingMode(RoundingMode.HALF_DOWN);
            this.value = df.format(truncatedValue.doubleValue());
        }
    }

}