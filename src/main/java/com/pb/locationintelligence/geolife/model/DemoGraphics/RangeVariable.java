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
package com.pb.locationintelligence.geolife.model.DemoGraphics;

import java.util.ArrayList;
import java.util.List;

public class RangeVariable {
	
	protected List<Field> field = new ArrayList<Field>();
    
	/**
	 * Count of number of fields in a range.
	 */
	protected String count;
    
	/**
	 * Specifies the range as 'Ascending' or 'Descending'.
	 */
	protected String order;

	/**
	 * Ranged values specific to Theme.
	 */
	protected String name;
	
	/**
	 * Description of ranged values specific to specified theme.
	 */
	protected String description;
	
	public List<Field> getField() {
		return field;
	}

	public void setField(List<Field> field) {
		this.field = field;
	}

	public String getCount() {
		return count;
	}

	public void setCount(String count) {
		this.count = count;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	String getDescription() {
		return description;
	}

	void setDescription(String description) {
		this.description = description;
	}
	
	
}
