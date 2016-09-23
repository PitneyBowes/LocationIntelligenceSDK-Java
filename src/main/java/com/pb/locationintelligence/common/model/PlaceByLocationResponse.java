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

import java.util.List;

public class PlaceByLocationResponse {

	/**
	 * 	Actual level information. For e.g. if level is country then name field will contain the name of the country.
	 */
    private List<NeighbourhoodName> name;

    /**
     * Level for which information is returned. 
     * If no levelHint is passed then the most granular geography available is returned and level will be equal to default.
     */
    private String level;

    /**
     * Level name in English, for e.g. country, state, city etc.
     */
    private String levelName;


    public PlaceByLocationResponse() {

    }

    public List<NeighbourhoodName> getName() {
        return name;
    }

    public void setName(List<NeighbourhoodName> name) {
        this.name = name;
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
