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
package com.pb.locationintelligence.geocode.model;

import java.util.ArrayList;
import java.util.List;

import com.pb.locationintelligence.geocode.model.forward.Address;
import com.pb.locationintelligence.geocode.preferences.GeocodePreference;


public class GeocodeServiceRequest {
	
    protected String type;
    protected GeocodePreference preferences;
    protected List<Address> addresses;
        
    
    public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public GeocodePreference getPreferences() {
		return preferences;
	}



	public void setPreferences(GeocodePreference preferences) {
		this.preferences = preferences;
	}



	/** <p>
    * This accessor method returns a reference to the live list,
    * not a snapshot.
    * * This is why there is not a <CODE>set</CODE> method for the addresses property.
    * 
    * <p>
    * For example, to add a new item, do as follows:
    * <pre>
    *    getAddresses().add(newItem);
    * </pre>
    * 
    * 
    * <p>
    * Objects of the following type(s) are allowed in the list
    * {@link Address }
    * 
    * 
    */
   public List<Address> getAddresses() {
       if (addresses == null) {
           addresses = new ArrayList<Address>();
       }
       return this.addresses;
   }

}