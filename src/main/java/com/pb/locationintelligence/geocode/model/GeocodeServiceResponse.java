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

public class GeocodeServiceResponse {

	/**
	 * the total number of possible candidates.
	 */
	protected int totalPossibleCandidates;
	
	/**
	 * the total number of matches.
	 */
	protected int totalMatches;
	
	/**
	 * lists one or more candidates that matched to your input address/addresses. 
	 * Matching and location information is returned for each match candidate.
	 */
	protected List<Candidate> candidates;

	public int getTotalPossibleCandidates() {
		return totalPossibleCandidates;
	}

	public void setTotalPossibleCandidates(int totalPossibleCandidates) {
		this.totalPossibleCandidates = totalPossibleCandidates;
	}

	public int getTotalMatches() {
		return totalMatches;
	}

	public void setTotalMatches(int totalMatches) {
		this.totalMatches = totalMatches;
	}

	public List<Candidate> getCandidates() {
		if (candidates == null) {
			candidates = new ArrayList<Candidate>();
		}
		return this.candidates;
	}

}