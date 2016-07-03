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
package com.pb.locationintelligence.geocode.custompreferences;

import java.util.List;

import com.pb.locationintelligence.geocode.Countries;
import com.pb.locationintelligence.geocode.model.DistanceUnits;

public interface ICustomPreference {

	public Countries getCountry();

	public void setCountry(Countries country);

	public Boolean getReturnAllCandidateInfo();

	public void setReturnAllCandidateInfo(Boolean returnAllCandidateInfo);

	public String getClientCoordSysName();

	public void setClientCoordSysName(String clientCoordSysName);

	public String getClientLocale();

	public void setClientLocale(String clientLocale);

	public String getCornerOffset();

	public void setCornerOffset(String cornerOffset);

	public String getCornerOffsetUnits();

	public void setCornerOffsetUnits(String cornerOffsetUnits);

	public Double getDistance();

	public void setDistance(Double distance);

	public DistanceUnits getDistanceUnits();

	public void setDistanceUnits(DistanceUnits distanceUnits);

	public Boolean getFallbackToGeographic();

	public void setFallbackToGeographic(Boolean fallbackToGeographic);

	public Boolean getFallbackToPostal();

	public void setFallbackToPostal(Boolean fallbackToPostal);

	public String getMatchMode();

	public void setMatchMode(String matchMode);

	public String getStreetOffset();

	public void setStreetOffset(String streetOffset);

	public String getStreetOffsetUnits();

	public void setStreetOffsetUnits(String streetOffsetUnits);

	public Integer getMaxReturnedCandidates();

	public void setMaxReturnedCandidates(Integer maxReturnedCandidates);

	public Boolean getmatchOnAddressNumber();

	public void setmatchOnAddressNumber(Boolean matchOnAddressNumber);

	public Boolean getmatchOnAllStreetFields();

	public void setmatchOnAllStreetFields(Boolean matchOnAllStreetFields);

	public Boolean getmatchOnAreaName1();

	public void setmatchOnAreaName1(Boolean matchOnAreaName1);

	public Boolean getmatchOnAreaName2();

	public void setmatchOnAreaName2(Boolean matchOnAreaName2);

	public Boolean getmatchOnAreaName3();

	public void setmatchOnAreaName3(Boolean matchOnAreaName3);

	public Boolean getmatchOnAreaName4();

	public void setmatchOnAreaName4(Boolean matchOnAreaName4);

	public Boolean getmatchOnInputFields();

	public void setmatchOnInputFields(Boolean matchOnInputFields);

	public Boolean getmatchOnPlaceName();

	public void setmatchOnPlaceName(Boolean matchOnPlaceName);

	public Boolean getmatchOnPostCode1();

	public void setmatchOnPostCode1(Boolean matchOnPostCode1);

	public Boolean getmatchOnPostCode2();

	public void setmatchOnPostCode2(Boolean matchOnPostCode2);

	public Boolean getmatchOnStreetDirectional();

	public void setmatchOnStreetDirectional(Boolean matchOnStreetDirectional);

	public Boolean getmatchOnStreetName();

	public void setmatchOnStreetName(Boolean matchOnStreetName);

	public Boolean getmatchOnStreetType();

	public void setmatchOnStreetType(Boolean matchOnStreetType);

	public Boolean getReturnAllCustomFields();

	public void setReturnAllCustomFields(Boolean returnAllCustomFields);

	public Boolean getReturnMatchDescriptor();

	public void setReturnMatchDescriptor(Boolean returnMatchDescriptor);

	public Boolean getReturnStreetAddressFields();

	public void setReturnStreetAddressFields(Boolean returnStreetAddressFields);

	public Boolean getReturnUnitInformation();

	public void setReturnUnitInformation(Boolean returnUnitInformation);

	public List<String> getReturnedCustomFieldKeys();

	public void setReturnedCustomFieldKeys(List<String> returnedCustomFieldKeys);
}