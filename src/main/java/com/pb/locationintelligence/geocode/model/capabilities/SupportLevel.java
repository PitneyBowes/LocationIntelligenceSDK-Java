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

public class SupportLevel 
{
	private int supportedDataLevel;
    private List<String> countries;
    private List<InputParameter> updatedRequiredInputs;
    private List<InputParameter> updatedOptionalInputs;
    private List<OutputParameter> updatedOptionalOutputs;
    
	public int getSupportedDataLevel() 
	{
		return supportedDataLevel;
	}
	
	public void setSupportedDataLevel(int supportedDataLevel) 
	{
		this.supportedDataLevel = supportedDataLevel;
	}
	
	public List<String> getCountries() 
	{
		return countries;
	}
	
	public void setCountries(List<String> countries) 
	{
		this.countries = countries;
	}
	
	public List<InputParameter> getUpdatedRequiredInputs() 
	{
		return updatedRequiredInputs;
	}
	
	public void setUpdatedRequiredInputs(List<InputParameter> updatedRequiredInputs) 
	{
		this.updatedRequiredInputs = updatedRequiredInputs;
	}
	
	public List<InputParameter> getUpdatedOptionalInputs() 
	{
		return updatedOptionalInputs;
	}
	
	public void setUpdatedOptionalInputs(List<InputParameter> updatedOptionalInputs) 
	{
		this.updatedOptionalInputs = updatedOptionalInputs;
	}
	
	public List<OutputParameter> getUpdatedOptionalOutputs() 
	{
		return updatedOptionalOutputs;
	}
	
	public void setUpdatedOptionalOutputs(List<OutputParameter> updatedOptionalOutputs) 
	{
		this.updatedOptionalOutputs = updatedOptionalOutputs;
	}
    
}
