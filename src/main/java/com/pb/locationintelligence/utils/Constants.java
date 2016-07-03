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
package com.pb.locationintelligence.utils;

/**
 * Constants Interface
 *
 */
public interface Constants {

	public static final String ACCESS_TOKEN = "access_token";

	public static final String BEARER = "Bearer ";

	public static final String BASIC = "Basic ";

	public static final String CLIENT_CREDENTIALS = "client_credentials";

	public static final String GRANT_TYPE = "grant_type";

	public static final String AUTH_HEADER = "Authorization";

	public static final String COLON = ":";
	
	public static final String ERROR_MSG_API_PROCESSING = "Unexpected Error while processing the API Request";
	
	public static final String ERROR_MSG_TOKEN_INVALID = "Token is expired or not set.";

    public static final String API_BASE_URL = "https://api.pitneybowes.com/";

    public static final String API_RELATIVE_PATH = "location-intelligence";
}
