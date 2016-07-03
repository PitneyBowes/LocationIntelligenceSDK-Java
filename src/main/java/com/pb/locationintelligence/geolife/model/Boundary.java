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
package com.pb.locationintelligence.geolife.model;

public class Boundary {
	
	private String boundaryId;
	
	private String boundaryType;
	
	private String url;
	
	protected String boundaryRef;

	String getUrl() {
		return url;
	}

	void setUrl(String url) {
		this.url = url;
	}

	String getBoundaryRef() {
		return boundaryRef;
	}

	void setBoundaryRef(String boundaryRef) {
		this.boundaryRef = boundaryRef;
	}

	public String getBoundaryId() {
		return boundaryId;
	}

	public void setBoundaryId(String boundaryId) {
		this.boundaryId = boundaryId;
	}

	public String getBoundaryType() {
		return boundaryType;
	}

	public void setBoundaryType(String boundaryType) {
		this.boundaryType = boundaryType;
	}



}
