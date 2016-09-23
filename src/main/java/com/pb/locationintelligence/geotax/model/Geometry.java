/*****************************************************************************
 * Copyright  ©  2014, Pitney Bowes Software Inc.
 * All  rights reserved.
 * Confidential Property of Pitney Bowes Software Inc.
 */
package com.pb.locationintelligence.geotax.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Geometry {
    private static final Logger logger = LoggerFactory.getLogger(Geometry.class);
    private String type;
    private Double[] coordinates;

    private Point point;

    public Geometry() {

    }


    public Geometry(String type) {
        this.type = type;
    }

    public Geometry(String type, String longitude, String latitude) {
        this.type = type;
        try {
            this.coordinates = new Double[2];
            this.coordinates[0] = Double.valueOf(longitude);
            this.coordinates[1] = Double.valueOf(latitude);
        } catch (NumberFormatException nfe) {
            logger.error("Exception while reading Latitude-Longitude as Geometry Coordinates: " + nfe, nfe);
        }
    }

    public void setCoordinates(Double[] coordinates) {
        this.coordinates = coordinates;
    }

    public Geometry(String longitude, String latitude) {
        try {
            this.coordinates = new Double[2];
            this.coordinates[0] = Double.valueOf(longitude);
            this.coordinates[1] = Double.valueOf(latitude);

        } catch (NumberFormatException nfe) {
            logger.error("Exception while reading Latitude-Longitude as Geometry Coordinates: " + nfe, nfe);
        }
    }

    public void setType(String type) {
        this.type = type;
    }

    //Json Property
    public String getType() {
        if (getPoint().getLatitude() == null || getPoint().getLongitude() == null) {

            return null;
        }
        this.type = "Point";
        return type;
    }

    //Json Property
    public Double[] getCoordinates() {
        if (getPoint().getLatitude() == null || getPoint().getLongitude() == null) {
            return null;
        }
        try {
            this.coordinates = new Double[2];
            this.coordinates[0] = Double.valueOf(getPoint().getLongitude());
            this.coordinates[1] = Double.valueOf(getPoint().getLatitude());
        } catch (NumberFormatException nfe) {
            logger.error("Exception while reading Latitude-Longitude as Geometry Coordinates: " + nfe, nfe);
        }
        return coordinates;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }


}
