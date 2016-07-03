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

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Class with information regarding location Intelligence Base URL and helps in URL encoding and URL creation
 *
 */
public class UrlMaker {
	private static final Logger _LOG = LoggerFactory.getLogger(UrlMaker.class);
	
    private static UrlMaker _UrlMakerReference = null;
    private UrlStrategy strategy=null;
    
    private UrlMaker(UrlStrategy strategy) {
    	
    	this.strategy = strategy;
    }
    
    public void setUrlStrategy(UrlStrategy strategy){
    	if(strategy == null){
    		throw new IllegalArgumentException("Cannot set Null strategy");
    	}
    	this.strategy = strategy;
    }

    public static UrlMaker getInstance() {

        if (_UrlMakerReference == null)
            _UrlMakerReference = new UrlMaker(new UrlStrategy());
        return _UrlMakerReference;
    }

    public String getAbsoluteUrl(String relativeUrl) {
        return strategy.getAbsoluteUrl(relativeUrl);
    }
    
    public String getEncodedURL(String param){
    	 String url = null;
			try {
				url =  URLEncoder.encode(param, "UTF-8");
			} catch (UnsupportedEncodingException e) {
				_LOG.error("Unsupported Encoding Exception " + e.getMessage());
			}
			return url;
    }
    
    public static class UrlStrategy{

    	public static final String BASE_URL = Constants.API_BASE_URL;
    	public static final String RELATIVE_PATH = Constants.API_RELATIVE_PATH;

		 public String getAbsoluteUrl(String relativeUrl) {
			 if(relativeUrl.contains("oauth")){
				 return BASE_URL + relativeUrl;
			 }
			 return BASE_URL + RELATIVE_PATH + relativeUrl;
		 }
		
    }

}
