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
package com.pb.locationintelligence.geocode.model.capabilities;

import java.util.List;

public class CustomObject 
{
	/**
	 * The name(s)s of the custom object fields that were user-specified in Preferences.
	 */
    private String name;
    
    /**
     * The description of the user-specified custom object fields.
     */
    private String description;
    
    /**
     * Where CustomObjectMember contains the following elements:
		name — (String) Indicates name of parameter.
		input — (InputParameter) Indicates the property is an input parameter.
		output —(OutputParameter) Indicates the property is an output parameter.
     */
    private List<CustomObjectMember> properties;
    
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public String getDescription() 
	{
		return description;
	}
	
	public void setDescription(String description) 
	{
		this.description = description;
	}
	
	public List<CustomObjectMember> getProperties() 
	{
		return properties;
	}
	
	public void setProperties(List<CustomObjectMember> properties) 
	{
		this.properties = properties;
	}
}
