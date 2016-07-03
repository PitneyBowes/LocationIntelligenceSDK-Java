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

import java.util.ArrayList;
import java.util.List;

public class Dictionary {

	protected String vintage;
	protected String source;
	protected String description;
	protected List<CountrySupport> countrySupportInfos;

	/**
	 * Gets the value of the vintage property.
	 *
	 * @return possible object is {@link String }
	 */
	public String getVintage() {
		return vintage;
	}

	/**
	 * Sets the value of the vintage property.
	 *
	 * @param value
	 *            allowed object is {@link String }
	 */
	public void setVintage(String value) {
		this.vintage = value;
	}

	/**
	 * Gets the value of the source property.
	 *
	 * @return possible object is {@link String }
	 */
	public String getSource() {
		return source;
	}

	/**
	 * Sets the value of the source property.
	 *
	 * @param value
	 *            allowed object is {@link String }
	 */
	public void setSource(String value) {
		this.source = value;
	}

	/**
	 * Gets the value of the description property.
	 *
	 * @return possible object is {@link String }
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets the value of the description property.
	 *
	 * @param value
	 *            allowed object is {@link String }
	 */
	public void setDescription(String value) {
		this.description = value;
	}

	public List<CountrySupport> getCountrySupportInfos() {
		if (countrySupportInfos == null) {
			countrySupportInfos = new ArrayList<CountrySupport>();
		}
		return this.countrySupportInfos;
	}

}
