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

public class NeighbourhoodName {

	/**
	 * Type of language. Possible values: primary/secondary/alternate.
	 */
    private String langType;

    /**
     * ISO code for the language in which name is represented.
     */
    private String  langISOCode;

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

    public void setAll(String langType,String  langISOCode, String value)
    {
        this.langType = langType;
        this.langISOCode = langISOCode;
        this.value = value;
    }
}
