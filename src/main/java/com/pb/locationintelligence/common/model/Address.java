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


package com.pb.locationintelligence.common.model;

public class Address {

    private String displayName;

    private String streetSide;
    private String formattedAddress;
    private String mainAddressLine;

	private String businessName;
	
    private String addressLastLine;
    private String placeName;
    private String areaName1;
    private String areaName2;
    private String areaName3;
    private String areaName4;
    private String postCode;
    private String postCodeExt;
	private String addressLine1;

	private String addressLine2;

	private String addressLine3;
	
	private String city;
	
	private String stateProvince;
	
	private String county;
	
	private String postalCode;
	
	private String country;
	
    private String addressNumber;
    private String streetName;
    private String unitType;
    private String unitValue;
    private String latitude;
	
	private String longitude;

    private String status;
    /**
     * 
     * @return The formattedAddress
     */
    public String getFormattedAddress() {
        return formattedAddress;
    }
    
    private String urbanizationName;

	public String getAddressLine1() {
		return addressLine1;
	}

    /**
     * 
     * @param formattedAddress
     *            The formattedAddress
     */
    public void setFormattedAddress(String formattedAddress) {
        this.formattedAddress = formattedAddress;
    }

    /**
     * 
     * @return The mainAddressLine
     */
    public String getMainAddressLine() {
        return mainAddressLine;
    }

    /**
     * 
     * @param mainAddressLine
     *            The mainAddressLine
     */
    public void setMainAddressLine(String mainAddressLine) {
        this.mainAddressLine = mainAddressLine;
    }

    /**
     * 
     * @return The addressLastLine
     */
    public String getAddressLastLine() {
        return addressLastLine;
    }

    /**
     * 
     * @param addressLastLine
     *            The addressLastLine
     */
    public void setAddressLastLine(String addressLastLine) {
        this.addressLastLine = addressLastLine;
    }

    /**
     * 
     * @return The placeName
     */
    public String getPlaceName() {
        return placeName;
    }

    /**
     * 
     * @param placeName
     *            The placeName
     */
    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    /**
     * 
     * @return The areaName1
     */
    public String getAreaName1() {
        return areaName1;
    }

    /**
     * 
     * @param areaName1
     *            The areaName1
     */
    public void setAreaName1(String areaName1) {
        this.areaName1 = areaName1;
    }

    /**
     * 
     * @return The areaName2
     */
    public String getAreaName2() {
        return areaName2;
    }

    /**
     * 
     * @param areaName2
     *            The areaName2
     */
    public void setAreaName2(String areaName2) {
        this.areaName2 = areaName2;
    }

    /**
     * 
     * @return The areaName3
     */
    public String getAreaName3() {
        return areaName3;
    }

    /**
     * 
     * @param areaName3
     *            The areaName3
     */
    public void setAreaName3(String areaName3) {
        this.areaName3 = areaName3;
    }

    /**
     * 
     * @return The areaName4
     */
    public String getAreaName4() {
        return areaName4;
    }

    /**
     * 
     * @param areaName4
     *            The areaName4
     */
    public void setAreaName4(String areaName4) {
        this.areaName4 = areaName4;
    }

    /**
     * 
     * @return The postCode
     */
    public String getPostCode() {
        return postCode;
    }

    /**
     * 
     * @param postCode
     *            The postCode
     */
    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    /**
     * 
     * @return The postCodeExt
     */
    public String getPostCodeExt() {
        return postCodeExt;
    }

    /**
     * 
     * @param postCodeExt
     *            The postCodeExt
     */
    public void setPostCodeExt(String postCodeExt) {
        this.postCodeExt = postCodeExt;
    }


    /**
     * 
     * @return
     *     The addressNumber
     */
    public String getAddressNumber() {
        return addressNumber;
    }

    /**
     * 
     * @param addressNumber
     *            The addressNumber
     */
    public void setAddressNumber(String addressNumber) {
        this.addressNumber = addressNumber;
    }

    /**
     * 
     * @return The streetName
     */
    public String getStreetName() {
        return streetName;
    }

    /**
     * 
     * @param streetName
     *            The streetName
     */
    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    /**
     * 
     * @return The unitType
     */
    public String getUnitType() {
        return unitType;
    }

    /**
     * 
     * @param unitType
     *            The unitType
     */
    public void setUnitType(String unitType) {
        this.unitType = unitType;
    }

    /**
     * 
     * @return The unitValue
     */
    public String getUnitValue() {
        return unitValue;
    }

    /**
     * 
     * @param unitValue
     *            The unitValue
     */
    public void setUnitValue(String unitValue) {
        this.unitValue = unitValue;
    }

    public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getAddressLine3() {
		return addressLine3;
	}

	public void setAddressLine3(String addressLine3) {
		this.addressLine3 = addressLine3;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getBusinessName() {
		return businessName;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	public String getStateProvince() {
		return stateProvince;
	}

	public void setStateProvince(String stateProvince) {
		this.stateProvince = stateProvince;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getStreetSide() {
        return streetSide;
    }

    public void setStreetSide(String streetSide) {
        this.streetSide = streetSide;
    }

    public String getUrbanizationName() {
		return urbanizationName;
	}

	public void setUrbanizationName(String urbanizationName) {
		this.urbanizationName = urbanizationName;
	}
}
