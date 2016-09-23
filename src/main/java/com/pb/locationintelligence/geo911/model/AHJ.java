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
package com.pb.locationintelligence.geo911.model;

import com.pb.locationintelligence.common.model.Address;

public class AHJ {
	private String ahjType;
	private String ahjId;	
	private String agency;
	private String phone;
	private String comments;
	private Coverage coverage;
	private ContactPerson contactPerson;
	private Address mailingAddress;
	
	public String getAhjType() {
		return ahjType;
	}
	public void setAhjType(String ahjType) {
		this.ahjType = ahjType;
	}
	public String getAhjId() {
		return ahjId;
	}
	public void setAhjId(String ahjId) {
		this.ahjId = ahjId;
	}
	public String getAgency() {
		return agency;
	}
	public void setAgency(String agency) {
		this.agency = agency;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public Coverage getCoverage() {
		return coverage;
	}
	public void setCoverage(Coverage coverage) {
		this.coverage = coverage;
	}
	public ContactPerson getContactPerson() {
		return contactPerson;
	}
	public void setContactPerson(ContactPerson contactPerson) {
		this.contactPerson = contactPerson;
	}
	public Address getMailingAddress() {
		return mailingAddress;
	}
	public void setMailingAddress(Address mailingAddress) {
		this.mailingAddress = mailingAddress;
	}

}
