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
package com.pb.locationintelligence.exception;

import com.pb.locationintelligence.common.model.ErrorInfo;
import com.pb.locationintelligence.common.model.SdkInternalError;

/**
 * This class represents the Error Response of the Java SDK. There can be two types of error, one propagating from Location Intelligence APIs
 * and other which is internal to SDK. Check errorResponseType to get the type of the error.
 *
 */
public class SdkException extends Exception{

    /**
     * The type of error. There can be two types of error, one propagating from Location Intelligence APIs
     * and other which is internal to SDK. <br/>
     * LI indicates errors from Location Intelligence APIs. <br/>
     * INTERNAL indicates errors internal to SDK.
     */
    public enum ErrorResponseType {
        LI, INTERNAL
    };
    
    private ErrorResponseType errorResponseType;
    private SdkInternalError sdkInternalError;
    private ErrorInfo liApiErrors;
    
    public SdkException(SdkInternalError internalErrorResponse) {
        this.sdkInternalError = internalErrorResponse;
        errorResponseType = ErrorResponseType.INTERNAL;
    }

    public SdkException(ErrorInfo errors) {
        this.liApiErrors = errors;
        errorResponseType = ErrorResponseType.LI;

    }

    /**
     * Get the Error Response Type i.e. LI or INTERNAL <br/>
     * LI indicates errors from Location Intelligence APIs. <br/>
     * INTERNAL indicates errors internal to SDK.
     * @return {@link ErrorResponseType}
     */
	public ErrorResponseType getErrorResponseType() {
		return errorResponseType;
	}

	/**
     * Set the Error Response Type
     */
	public void setErrorResponseType(ErrorResponseType errorResponseType) {
		this.errorResponseType = errorResponseType;
	}

	/**
     * This method returns the detailed error information when there is an internal error.
	 * @return {@link SdkInternalError}
	 */
	public SdkInternalError getSdkInternalError() {
		return sdkInternalError;
	}

	public void setSdkInternalError(SdkInternalError sdkInternalError) {
		this.sdkInternalError = sdkInternalError;
	}

	/**
	 * This method returns the detailed error information from Location Intelligence APIs. For example, if an API is called with invalid latitude, you can get the error information from here.
	 * @return {@link ErrorInfo}
	 */
	public ErrorInfo getLiApiErrors() {
		return liApiErrors;
	}

	public void setLiApiErrors(ErrorInfo liApiErrors) {
		this.liApiErrors = liApiErrors;
	}

}
