/*****************************************************************************
 * Copyright  ©  2014, Pitney Bowes Software Inc.
 * All  rights reserved.
 * Confidential Property of Pitney Bowes Software Inc.
 */

package com.pb.locationintelligence.geotax.model;

import javax.xml.bind.annotation.XmlAttribute;
import java.util.List;


public class PlaceByLocationResponse {

    private List<NeighbourhoodName> neighbourhoodNameList;

    @XmlAttribute
    private String level;

    @XmlAttribute
    private String levelName;


    public PlaceByLocationResponse() {

    }

    public List<NeighbourhoodName> getNeighbourhoodNameList() {
        return neighbourhoodNameList;
    }

    public void setNeighbourhoodNameList(List<NeighbourhoodName> neighbourhoodNameList) {
        this.neighbourhoodNameList = neighbourhoodNameList;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }

}
