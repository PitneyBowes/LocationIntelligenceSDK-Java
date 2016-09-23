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

package com.pb.locationintelligence.geolife.model.Segmentation;

import java.util.ArrayList;
import java.util.List;

public class RangeVariable
{

    protected List<Field> field;
    protected String count;
	protected String order;
    protected String name;
	protected String description;

    public List<Field> getField() {
        if (field == null) {
            field = new ArrayList<Field>();
        }
        return this.field;
    }


    public static class Field {

        protected String value;
        protected String description;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the description property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescription() {
            return description;
        }

        /**
         * Sets the value of the description property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescription(String value) {
            this.description = value;
        }

    }


	String getCount() {
		return count;
	}


	void setCount(String count) {
		this.count = count;
	}


	String getOrder() {
		return order;
	}


	void setOrder(String order) {
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
