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


public class GeoPos {

	protected String type;
	protected List<Double> coordinates;
	protected Crs crs;

	/**
	 * Gets the value of the type property.
	 *
	 * @return possible object is
	 * {@link String }
	 */
	public String getType() {
		return type;
	}

	/**
	 * Sets the value of the type property.
	 *
	 * @param value allowed object is
	 *              {@link String }
	 */
	public void setType(String value) {
		this.type = value;
	}

	/**
	 * Gets the value of the coordinates property.
	 * <p/>
	 * <p/>
	 * This accessor method returns a reference to the live list,
	 * not a snapshot. Therefore any modification you make to the
	 * returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the coordinates property.
	 * <p/>
	 * <p/>
	 * For example, to add a new item, do as follows:
	 * <pre>
	 *    getCoordinates().add(newItem);
	 * </pre>
	 * <p/>
	 * <p/>
	 * <p/>
	 * Objects of the following type(s) are allowed in the list
	 * {@link Double }
	 */
	public List<Double> getCoordinates() {
		if (coordinates == null) {
			coordinates = new ArrayList<Double>();
		}
		return this.coordinates;
	}

	/**
	 * Gets the value of the crs property.
	 *
	 * @return possible object is
	 * {@link Crs }
	 */
	public Crs getCrs() {
		return crs;
	}

	/**
	 * Sets the value of the crs property.
	 *
	 * @param value allowed object is
	 *              {@link Crs }
	 */
	public void setCrs(Crs value) {
		this.crs = value;
	}

}
