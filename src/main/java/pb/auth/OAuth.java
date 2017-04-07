/**
 * Location Intelligence APIs
 * Incorporate our extensive geodata into everyday applications, business processes and workflows.
 *
 * OpenAPI spec version: 3.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package pb.auth;

import pb.Pair;
import pb.ApiException;
import  pb.TokenAuthenticator;

import java.util.Map;
import java.util.List;
import com.google.gson.Gson;
import com.squareup.okhttp.*;
import javax.xml.bind.DatatypeConverter;
import java.io.IOException;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-07T16:31:43.806+05:30")
public class OAuth implements Authentication {
private String accessToken;
private String apiKey;
private String secret;

public String getAccessToken() {
return accessToken;
}

public void setAccessToken(String accessToken) {
this.accessToken = accessToken;
}


public String getApiKey() {
return apiKey;
}

public void setApiKey(String apiKey) {
this.apiKey = apiKey;
}

public String getSecret() {
return secret;
}

public void setSecret(String secret) {
this.secret = secret;
}

@Override
public void applyToParams(List<Pair> queryParams, Map<String, String> headerParams) throws ApiException {
    if (accessToken != null) {
    headerParams.put("Authorization", "Bearer " + accessToken);
    }
    else if(apiKey!=null && secret!=null )
    {
    try {
    generateAndSetAccessToken(apiKey,secret);
    headerParams.put("Authorization", "Bearer " + accessToken);
    } catch (ApiException e) {
    throw e;
    }
    }
    }

    public void generateAndSetAccessToken(String apiKey,String secret) throws ApiException {
    RequestBody body= RequestBody.create(MediaType.parse("application/json"),"grant_type=client_credentials");
    Request authRequest=null;

    String authenticationHeader =DatatypeConverter.printBase64Binary((apiKey +":" + secret).getBytes());
    authRequest= new Request.Builder().url("https://api.pitneybowes.com/oauth/token").post(body).addHeader("Authorization", "Basic " + authenticationHeader).build();
    OkHttpClient client=  new OkHttpClient().setAuthenticator( new TokenAuthenticator());

    try {
    Response response = client.newCall(authRequest).execute();
    Gson gson = new Gson();
    OAuthServiceResponce fromJson = gson.fromJson(response.body().string(),OAuthServiceResponce.class );
    setApiKey(apiKey);
    setSecret(secret);
    setAccessToken(fromJson.access_token);
    }
    catch (IOException e)
    {
    throw new ApiException(e);
    }

    }


    class  OAuthServiceResponce
    {
    private String access_token;
    private String token_type;
    private String issuedAt;
    private String expiresIn;
    private String clientID;
    private String org;

    public String getAccess_token() {
    return access_token;
    }

    public void setAccess_token(String access_token) {
    this.access_token = access_token;
    }

    public String getToken_type() {
    return token_type;
    }

    public void setToken_type(String token_type) {
    this.token_type = token_type;
    }

    public String getIssuedAt() {
    return issuedAt;
    }

    public void setIssuedAt(String issuedAt) {
    this.issuedAt = issuedAt;
    }

    public String getExpiresIn() {
    return expiresIn;
    }

    public void setExpiresIn(String expiresIn) {
    this.expiresIn = expiresIn;
    }

    public String getClientID() {
    return clientID;
    }

    public void setClientID(String clientID) {
    this.clientID = clientID;
    }

    public String getOrg() {
    return org;
    }

    public void setOrg(String org) {
    this.org = org;
    }

    }

    }
