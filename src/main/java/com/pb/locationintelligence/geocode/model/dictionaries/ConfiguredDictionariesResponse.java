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
package com.pb.locationintelligence.geocode.model.dictionaries;

import com.pb.locationintelligence.geocode.model.dictionaries.Dictionary;

import java.util.ArrayList;
import java.util.List;



public class ConfiguredDictionariesResponse {

    protected List<Dictionary> dictionaries;

    /**
     * Gets the value of the dictionaries property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dictionaries property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDictionaries().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Dictionary }
     *
     *
     */
    public List<Dictionary> getDictionaries() {
        if (dictionaries == null) {
            dictionaries = new ArrayList<Dictionary>();
        }
        return this.dictionaries;
    }

}
