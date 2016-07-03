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

public class Operation 
{
    private String name;
    private List<InputParameter> requiredInputs;
    private List<InputParameter> optionalInputs;
    private List<OutputParameter> outputs;
    private List<SupportLevel> supportLevels;
    
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public List<InputParameter> getRequiredInputs() 
	{
		return requiredInputs;
	}
	
	public void setRequiredInputs(List<InputParameter> requiredInputs) 
	{
		this.requiredInputs = requiredInputs;
	}
	
	public List<InputParameter> getOptionalInputs() 
	{
		return optionalInputs;
	}
	
	public void setOptionalInputs(List<InputParameter> optionalInputs) 
	{
		this.optionalInputs = optionalInputs;
	}
	
	public List<OutputParameter> getOutputs() 
	{
		return outputs;
	}
	
	public void setOutputs(List<OutputParameter> outputs) 
	{
		this.outputs = outputs;
	}
	
	public List<SupportLevel> getSupportLevels() 
	{
		return supportLevels;
	}
	
	public void setSupportLevels(List<SupportLevel> supportLevels) 
	{
		this.supportLevels = supportLevels;
	}
}
