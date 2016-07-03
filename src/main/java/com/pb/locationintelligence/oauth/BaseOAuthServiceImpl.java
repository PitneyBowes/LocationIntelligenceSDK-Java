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
package com.pb.locationintelligence.oauth;

import java.io.StringReader;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.internal.util.Base64;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.pb.locationintelligence.utils.Constants;
import com.pb.locationintelligence.utils.UrlMaker;

/**
 * Implementation of BaseOAuthService interface. Get the access token for authentication
 * 
 */
public class BaseOAuthServiceImpl extends OAuthService implements BaseOAuthService {
	private static final Logger _LOG = LoggerFactory.getLogger(BaseOAuthServiceImpl.class);
    
	private String consumerKey;
    private String consumerSecretKey;
    private boolean tokenRegeneration = true;
    private String oAuthUrl = "oauth/token";
    
    public BaseOAuthServiceImpl(String consumerKey, String consumerSecretKey) {
		this.consumerKey = consumerKey;
		this.consumerSecretKey = consumerSecretKey;
	}
    
    public BaseOAuthServiceImpl(String token) {
    	this.tokenRegeneration = false;
    	setAuthToken(token);
	} 

    @Override
    public String getAuthenticationToken() {
    	String authToken=getToken();
    	_LOG.trace("It seems token is not generated yet, Going for OAuth mechanism");
        // Token is not generated yet
        if (authToken == null && tokenRegeneration) {
        	try{
        		UrlMaker maker = UrlMaker.getInstance();
                String url = maker.getAbsoluteUrl(oAuthUrl);
        		
                String authHeader = Constants.BASIC + Base64.encodeAsString(consumerKey + Constants.COLON + consumerSecretKey);

        		Client client = ClientBuilder.newClient();
        		WebTarget target = client.target(url);

        		Builder builder = target.request().header(Constants.AUTH_HEADER, authHeader);
        		Form form = new Form();
        		form.param(Constants.GRANT_TYPE, Constants.CLIENT_CREDENTIALS);
        		Response response = builder.post(Entity.entity(form, MediaType.APPLICATION_FORM_URLENCODED));
        		String jsonResponse = response.readEntity(String.class);
        		JsonReader jsonReader = Json.createReader(new StringReader(jsonResponse));
        		JsonObject jsonObject = jsonReader.readObject();
        		jsonReader.close();
        		authToken = Constants.BEARER + jsonObject.getString(Constants.ACCESS_TOKEN);
        	}catch(Exception e){
        		_LOG.error("Unexpeted Exception while generating token, so Invalidating the Authentiation Token");
        		invalidateAuthenticationToken();
        		return null;
        	}
        }
        else{
        	if(tokenRegeneration){
        		throw new IllegalStateException(Constants.ERROR_MSG_TOKEN_INVALID);
        	}
        	authToken = ((authToken.contains(Constants.BEARER)) ? "" : Constants.BEARER) + authToken;
        }
        return authToken;
    }
    
    @Override
    public void invalidateAuthenticationToken() {
        if (getToken() != null) {
            setAuthToken(null);
        }
    }

}
