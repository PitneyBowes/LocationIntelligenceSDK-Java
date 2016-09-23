/*****************************************************************************
 *       Copyright  ©  2014, Pitney Bowes Software Inc.
 *       All  rights reserved.
 *       Confidential Property of Pitney Bowes Software Inc.
 */

package com.pb.locationintelligence.geotax.model;




public class Match {

	 private String confidence;
	 private String percentGeocode;
	 private String precisionLevel;
	 private String locationCode;
	 private String matchCode;

	
	  public String getPrecisionLevel() {
		return precisionLevel;
	}

	public void setPrecisionLevel(String precisionLevel) {
		this.precisionLevel = precisionLevel;
	}

	public String getConfidence() { return confidence; }
	 
	  public void setConfidence(String confidence) { this.confidence =
	  confidence; }
	  
	  public String getPercentGeocode() { return percentGeocode; }
	  
	  public void setPercentGeocode(String percentGeocode) {
	  this.percentGeocode = percentGeocode; }
	 

	public String getLocationCode() {
		return locationCode;
	}

	public void setLocationCode(String locationCode) {
		this.locationCode = locationCode;
	}

	public String getMatchCode() {
		return matchCode;
	}

	public void setMatchCode(String matchCode) {
		this.matchCode = matchCode;
	}
}
