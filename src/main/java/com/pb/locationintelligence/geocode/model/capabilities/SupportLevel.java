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
	/**
	 * Lists the support levels for the operation. Includes the following elements:
		supportedDataLevel (Integer)
		Data Postal Centroid=1
		Postcode centroids are present in dictionaries (does not distinguish post code 2).
		Data Geographic Centroid=2
		Geographic centroids are present in dictionaries (does not distinguish the type of geographic centroid).
		Data Street Segment=4
		Street segment information present in dictionaries.
		Data Address Point=8
		Point level data present in dictionaries.
		
		                The data level will contain the sum of all available data keys.  For example,
		                
		                Value — Type of data                   
		                   15      —  all (postal + geographic + segment + point)                   
		                   14      —  all but postal
		                   13      —  all but geographic                   
		                   12      —  point + segment
		                   11      —  point + geographic + postal                   
		                   10      —  point + geographic                     
		                    9       —  point + postal                     
		                    8       —  point only                     
		                    7       —  all but point                     
		                    6       —  segment + geographic                     
		                    5       —  segment + postal                     
		                    4       —  segment only                     
		                    3       —  postal + geographic                     
		                    2       —  geographic only                     
		                    1       —  postal only             
		                
		
		countries — (String) Countries
		updatedRequiredInputs — (InputParameter) Country-specific required input fields
		updatedOptionalInputs — (InputParameter) Country-specific optional input fields
		updatedOptionalOutputs — (OutputParameter) Country-specific output fields
	 */
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
