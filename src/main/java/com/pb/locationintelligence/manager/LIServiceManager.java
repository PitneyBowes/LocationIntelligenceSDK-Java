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
package com.pb.locationintelligence.manager;

import com.pb.locationintelligence.geo911.Geo911ServiceImpl;
import com.pb.locationintelligence.geocode.GeocodeService;
import com.pb.locationintelligence.geocode.GeocodeServiceImpl;
import com.pb.locationintelligence.geocomm.GeocommService;
import com.pb.locationintelligence.geocomm.GeocommServiceImpl;
import com.pb.locationintelligence.geoenhance.GeoEnhanceServiceImpl;
import com.pb.locationintelligence.geolife.GeoLifeService;
import com.pb.locationintelligence.geolife.GeoLifeServiceImpl;
import com.pb.locationintelligence.geosearch.GeoSearchServiceImpl;
import com.pb.locationintelligence.geotax.GeoTaxService;
import com.pb.locationintelligence.geotax.GeoTaxServiceImpl;
import com.pb.locationintelligence.oauth.BaseOAuthService;
import com.pb.locationintelligence.oauth.BaseOAuthServiceImpl;
import com.pb.locationintelligence.oauth.OAuthFactory;
import com.pb.locationintelligence.oauth.OAuthService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * LIServiceManager class is responsible for providing entry point all LI specific
 * interfaces.It provides singleton object for this class
 * 
 */
public class LIServiceManager {
	private static final Logger _LOG = LoggerFactory.getLogger(LIServiceManager.class);

	private static LIServiceManager _LIServiceManager = null;

	private LIServiceManager() {

	}
	
	/**
	 * @param baseOAuthService
	 * @return {@link LIServiceManager}
	 */
	public static final LIServiceManager getInstance(BaseOAuthService baseOAuthService) {
		if (_LIServiceManager == null) {
			 OAuthFactory.setInstance(baseOAuthService);
			_LIServiceManager = new LIServiceManager();
			_LOG.trace("LI Service instance has been created");
		}
		_LOG.trace("LI Service instance has been already created");
		return _LIServiceManager;
	}
	
	/**
	 * Method to initialize LI interfaces with user login credentials.
	 * @param consumerKey
	 * @param consumerSecretKey
	 * @return {@link LIServiceManager}
	 */
	public static final LIServiceManager getInstance(String consumerKey, String consumerSecretKey ) {
		if (_LIServiceManager == null) {
			 OAuthFactory.setInstance(new BaseOAuthServiceImpl(consumerKey, consumerSecretKey));
            _LIServiceManager = new LIServiceManager();
            _LOG.trace("LI Service instance has been created");
		}
		_LOG.trace("LI Service instance has been already created");
		return _LIServiceManager;

	}
	
	/**
	 * Method to initialize LI services with a user supplied token.
	 * @param token
	 * @return {@link LIServiceManager}
	 */
	public static final LIServiceManager getInstance(String token) {
		if (_LIServiceManager == null) {
			 OAuthFactory.setInstance(new BaseOAuthServiceImpl(token));
			_LIServiceManager = new LIServiceManager();
			_LOG.trace("LI Service instance has been created");
		}
		_LOG.trace("LI Service instance has been already created");
		return _LIServiceManager;

	}

	/**
	 * OAuth Service APIs Handler
	 * 
	 * @return an instance of BaseOAuthService
	 */
	public BaseOAuthService getBaseAuthService() {
		return new OAuthService();
	}

	/**
	 * GeoLife Service Handler
	 * 
	 * @return an instance of GeoLifeService
	 */
	public GeoLifeService getGeoLifeService() {
		return new GeoLifeServiceImpl();
	}
	
	/**
	 * Geotax Service Handler
	 * 
	 * @return an instance of GeoTaxService
	 */
	public GeoTaxService getGeoTaxService() {
		return new GeoTaxServiceImpl();
	}

    public GeoSearchServiceImpl getGeoSearchService() {
        return new GeoSearchServiceImpl();
    }

    public Geo911ServiceImpl getGeo911Service() {
        return new Geo911ServiceImpl();
    }

	public GeocodeService getGeocodeService(){
		return  new GeocodeServiceImpl();
	}

    public GeoEnhanceServiceImpl getGeoEnhanceService() {
        return new GeoEnhanceServiceImpl();
    }

	public GeocommService getGeoCommonService(){
		return  new GeocommServiceImpl();
	}
    

	/**
	 * To invalidate the LI static reference
	 */
	public void invalidateLIServiceManagerInstance() {
		if (_LIServiceManager != null) {
			_LIServiceManager = null;
			_LOG.trace("LI instance has been invalidated");
		}
	}

}
