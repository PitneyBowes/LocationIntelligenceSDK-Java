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

public class Theme {
	
	/**
	 * 	Refers to the boundaryId for Theme that is specified in boundaryRef of boundary
	 */
	private Object boundaryRef;
	
    private List<IndividualValueVariable> individualValueVariable = new ArrayList<IndividualValueVariable>();
    
    private List<RangeVariable> rangeVariable = new ArrayList<RangeVariable>();

	

	public List<IndividualValueVariable> getIndividualValueVariable() {
		return individualValueVariable;
	}

	public void setIndividualValueVariable(
			List<IndividualValueVariable> individualValueVariable) {
		this.individualValueVariable = individualValueVariable;
	}

	public List<RangeVariable> getRangeVariable() {
		return rangeVariable;
	}

	public void setRangeVariable(List<RangeVariable> rangeVariable) {
		this.rangeVariable = rangeVariable;
	}

	public Object getBoundaryRef() {
		return boundaryRef;
	}

	public void setBoundaryRef(Object boundaryRef) {
		this.boundaryRef = boundaryRef;
	}
    
    

}
