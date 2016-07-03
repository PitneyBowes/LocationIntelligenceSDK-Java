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

import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;
import com.pb.locationintelligence.RequestObserver;
import com.pb.locationintelligence.common.model.ErrorInfo;
import com.pb.locationintelligence.common.model.SdkInternalError;
import com.pb.locationintelligence.exception.SdkException;
import com.pb.locationintelligence.geocode.Countries;
import com.pb.locationintelligence.oauth.OAuthFactory;

/**
 * This is a utility class with common methods.
 */
public class Utility {

    private static final Logger _LOG = LoggerFactory.getLogger(Utility.class);

    public static void appendIfNotNull(StringBuilder urlToAppendTo, Map<String, Object> queryParametersMap) {
        if (urlToAppendTo == null || queryParametersMap == null || queryParametersMap.size() < 1) return;

        boolean firstParam = true;

        for (String key : queryParametersMap.keySet()) {
            Object value = queryParametersMap.get(key);

            if (value != null) {
                String separator;
                if (firstParam) {
                    separator = "?";
                } else {
                    separator = "&";
                }
                String encodedParam = getEncodedParam(value.toString());
                if (encodedParam != null) {
                    urlToAppendTo.append(separator).append(key).append("=").append(encodedParam);
                    firstParam = false;
                }
            }
        }

    }

    public static String decoratedURL(String url,String bundleName,String suffix ){
      return url.replace("{bundleName}",bundleName).concat(suffix);

    }



    public static String getEncodedParam(String param) {
        String encodedParam = null;
        try {
            encodedParam = URLEncoder.encode(param, "UTF-8");
        } catch (Exception e) {
            _LOG.error("Unsupported Encoding Exception " + e.getMessage());
        }
        return encodedParam;
    }


    public static <T> void processAPIRequestAsync(final String url, final Class<T> responseClass, final RequestObserver<T> requestObserver) {

        final ExecutorService executorService = Executors.newFixedThreadPool(1);
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                try {
                    T response = processAPIRequest(url, responseClass);
                    requestObserver.onSuccess(response);
                } catch (SdkException e) {
                    requestObserver.onFailure(e);
                }finally{
					executorService.shutdown();					
				}
            }
        });
    }

    public static <T> T processAPIRequest(String url, Class<T> responseClass) throws SdkException {
        SdkException exception;
        try {
            String accessToken = OAuthFactory.getOAuthService().getAuthenticationToken();
            Client client = ClientBuilder.newClient();
            WebTarget target = client.target(url);
            Response apiResponse = target.request(MediaType.APPLICATION_JSON).header(Constants.AUTH_HEADER, accessToken).buildGet().invoke();
            Gson gson = new Gson();
            String jsonResponse = apiResponse.readEntity(String.class);
            if (apiResponse.getStatus() == Response.Status.OK.getStatusCode()) {
                _LOG.info("Got a valid response from API", jsonResponse);
                return gson.fromJson(jsonResponse, responseClass);
            } else {
                _LOG.info("Got an error response from API");
                ErrorInfo apiError;

                if (apiResponse.getStatus() != Response.Status.BAD_REQUEST.getStatusCode()) {
                    apiError = new ErrorInfo();
                } else // Only in this case we can expect ErrorInfo
                {
                    apiError = gson.fromJson(jsonResponse, ErrorInfo.class);
                }

                apiError.setHttpStatusCode(apiResponse.getStatus());
                apiError.setReason(apiResponse.getStatusInfo().getReasonPhrase());
                apiError.setJsonResponse(jsonResponse);

                exception = new SdkException(apiError);
                _LOG.error("Error: " + getObjectAsJson(exception.getLiApiErrors()));
            }
        } catch (Exception e) {
            _LOG.error("Unexpected Error: " + e);
            exception = new SdkException(new SdkInternalError(Constants.ERROR_MSG_API_PROCESSING, e));
        }

        throw exception;
    }

    public static void printObjectAsJson(Object object) {
        Gson gson = new Gson();
        System.out.println(gson.toJson(object));
    }

    public static String getObjectAsJson(Object object) {
        Gson gson = new Gson();
        return gson.toJson(object);
    }

    private final static Map<String, String> countryMap = new HashMap<String, String>();
    static
    {
    	countryMap.put(Countries.AMERICAN_SAMOA.value(), "USA");
    	countryMap.put(Countries.ANDORRA.value(), "AND");
    	countryMap.put(Countries.ANGOLA.value(), "AGO");
    	countryMap.put(Countries.ARGENTINA.value(), "ARG");
    	countryMap.put(Countries.ARUBA.value(), "ABW");
    	countryMap.put(Countries.AUSTRALIA.value(), "AUS");
    	countryMap.put(Countries.AUSTRIA.value(), "AUT");
    	countryMap.put(Countries.BAHAMAS.value(), "BHS");
    	countryMap.put(Countries.BAHRAIN.value(), "BHR");
    	countryMap.put(Countries.BARBADOS.value(), "BRB");
    	countryMap.put(Countries.BELGIUM.value(), "BEL");
    	countryMap.put(Countries.BELIZE.value(), "BLZ");
    	countryMap.put(Countries.BENIN.value(), "BEN");
    	countryMap.put(Countries.BERMUDA.value(), "BMU");
    	countryMap.put(Countries.BOLIVIA.value(), "BOL");
    	countryMap.put(Countries.BOTSWANA.value(), "BWA");
    	countryMap.put(Countries.BRAZIL.value(), "BRA");
    	countryMap.put(Countries.BURKINA_FASO.value(), "BFA");
    	countryMap.put(Countries.BURUNDI.value(), "BDI");
    	countryMap.put(Countries.CAMEROON.value(), "CMR");
    	countryMap.put(Countries.CANADA.value(), "CAN");
    	countryMap.put(Countries.CHILE.value(), "CHL");
    	countryMap.put(Countries.CHINA.value(), "CHN");
    	countryMap.put(Countries.CONGO.value(), "COG");
    	countryMap.put(Countries.DEMOCRATIC_REPUBLIC_OF_CONGO.value(), "COD");
    	countryMap.put(Countries.COSTA_RICA.value(), "CRI");
    	countryMap.put(Countries.CROATIA.value(), "HRV");
    	countryMap.put(Countries.CUBA.value(), "CUB");
    	countryMap.put(Countries.CZECH_REPUBLIC.value(), "CZE");
    	countryMap.put(Countries.DENMARK.value(), "DNK");
    	countryMap.put(Countries.DOMINICAN_REPUBLIC.value(), "DOM");
    	countryMap.put(Countries.ECUADOR.value(), "ECU");
    	countryMap.put(Countries.EGYPT.value(), "EGY");
    	countryMap.put(Countries.EL_SALVADOR.value(), "SLV");
    	countryMap.put(Countries.ESTONIA.value(), "EST");
    	countryMap.put(Countries.FINLAND.value(), "FIN");
    	countryMap.put(Countries.FRANCE.value(), "FRA");
    	countryMap.put(Countries.FRENCH_GUYANA.value(), "GUF");
    	countryMap.put(Countries.GABON.value(), "GAB");
    	countryMap.put(Countries.GERMANY.value(), "DEU");
    	countryMap.put(Countries.GHANA.value(), "GHA");
    	countryMap.put(Countries.GREAT_BRITAIN.value(), "GBR");
    	countryMap.put(Countries.GREECE.value(), "GRC");
    	countryMap.put(Countries.GUADELOUPE.value(), "GLP");
    	countryMap.put(Countries.GUAM.value(), "USA");
    	countryMap.put(Countries.GUATEMALA.value(), "GTM");
    	countryMap.put(Countries.GUYANA.value(), "GUY");
    	countryMap.put(Countries.HONDURAS.value(), "HND");
    	countryMap.put(Countries.HONG_KONG.value(), "HKG");
    	countryMap.put(Countries.HUNGARY.value(), "HUN");
    	countryMap.put(Countries.ICELAND.value(), "ISL");
    	countryMap.put(Countries.INDIA.value(), "IND");
    	countryMap.put(Countries.INDONESIA.value(), "IDN");
    	countryMap.put(Countries.IRELAND.value(), "IRL");
    	countryMap.put(Countries.ITALY.value(), "ITA");
    	countryMap.put(Countries.JAMAICA.value(), "JAM");
    	countryMap.put(Countries.JAPAN.value(), "JPN");
    	countryMap.put(Countries.KENYA.value(), "KEN");
    	countryMap.put(Countries.KUWAIT.value(), "KWT");
    	countryMap.put(Countries.LATVIA.value(), "LVA");
    	countryMap.put(Countries.LEBANON.value(), "LBN");
    	countryMap.put(Countries.LESOTHO.value(), "LSO");
    	countryMap.put(Countries.LIECHTENSTEIN.value(), "LIE");
    	countryMap.put(Countries.LITHUANIA.value(), "LTU");
    	countryMap.put(Countries.LUXEMBOURG.value(), "LUX");
    	countryMap.put(Countries.MACAO.value(), "MAC");
    	countryMap.put(Countries.MALAWI.value(), "MWI");
    	countryMap.put(Countries.MALAYSIA.value(), "MYS");
    	countryMap.put(Countries.MALI.value(), "MLI");
    	countryMap.put(Countries.MARTINIQUE.value(), "MTQ");
    	countryMap.put(Countries.MAURITANIA.value(), "MRT");
    	countryMap.put(Countries.MAURITIUS.value(), "MUS");
    	countryMap.put(Countries.MAYOTTE.value(), "MYT");
    	countryMap.put(Countries.MEXICO.value(), "MEX");
    	countryMap.put(Countries.MONACO.value(), "MCO");
    	countryMap.put(Countries.MOROCCO.value(), "MAR");
    	countryMap.put(Countries.MOZAMBIQUE.value(), "MOZ");
    	countryMap.put(Countries.NAMIBIA.value(), "NAM");
    	countryMap.put(Countries.NETHERLANDS.value(), "NLD");
    	countryMap.put(Countries.NEW_ZEALAND.value(), "NZL");
    	countryMap.put(Countries.NICARAGUA.value(), "NIC");
    	countryMap.put(Countries.NIGER.value(), "NER");
    	countryMap.put(Countries.NIGERIA.value(), "NGA");
    	countryMap.put(Countries.NORTH_MARIANA_ISLANDS.value(), "USA");
    	countryMap.put(Countries.NORWAY.value(), "NOR");
    	countryMap.put(Countries.OMAN.value(), "OMN");
    	countryMap.put(Countries.PALAU.value(), "USA");
    	countryMap.put(Countries.PANAMA.value(), "PAN");
    	countryMap.put(Countries.PARAGUAY.value(), "PRY");
    	countryMap.put(Countries.PERU.value(), "PER");
    	countryMap.put(Countries.PHILIPPINES.value(), "PHL");
    	countryMap.put(Countries.POLAND.value(), "POL");
    	countryMap.put(Countries.PORTUGAL.value(), "PRT");
    	countryMap.put(Countries.PUERTO_RICO.value(), "USA");
    	countryMap.put(Countries.QATAR.value(), "QAT");
    	countryMap.put(Countries.REUNION.value(), "REU");
    	countryMap.put(Countries.ROMANIA.value(), "ROU");
    	countryMap.put(Countries.RUSSIAN_FEDERATION.value(), "RUS");
    	countryMap.put(Countries.RWANDA.value(), "RWA");
    	countryMap.put(Countries.SAINT_KITTS_AND_NEVIS.value(), "KNA");
    	countryMap.put(Countries.SAUDI_ARABIA.value(), "SAU");
    	countryMap.put(Countries.SENEGAL.value(), "SEN");
    	countryMap.put(Countries.SINGAPORE.value(), "SGP");
    	countryMap.put(Countries.SLOVAKIA.value(), "SVK");
    	countryMap.put(Countries.SLOVENIA.value(), "SVN");
    	countryMap.put(Countries.SOUTH_AFRICA.value(), "ZAF");
    	countryMap.put(Countries.SPAIN.value(), "ESP");
    	countryMap.put(Countries.SURINAME.value(), "SUR");
    	countryMap.put(Countries.SWAZILAND.value(), "SWZ");
    	countryMap.put(Countries.SWEDEN.value(), "SWE");
    	countryMap.put(Countries.SWITZERLAND.value(), "CHE");
    	countryMap.put(Countries.TAIWAN.value(), "TWN");
    	countryMap.put(Countries.UNITED_REPUBLIC_OF_TANZANIA.value(), "TZA");
    	countryMap.put(Countries.THAILAND.value(), "THA");
    	countryMap.put(Countries.TOGO.value(), "TGO");
    	countryMap.put(Countries.TRINIDAD_AND_TOBAGO.value(), "TTO");
    	countryMap.put(Countries.TUNISIA.value(), "TUN");
    	countryMap.put(Countries.TURKEY.value(), "TUR");
    	countryMap.put(Countries.UGANDA.value(), "UGA");
    	countryMap.put(Countries.UKRAINE.value(), "UKR");
    	countryMap.put(Countries.UNITED_ARAB_EMIRATES.value(), "ARE");
    	countryMap.put(Countries.UNITED_KINGDOM.value(), "GBR");
    	countryMap.put(Countries.UNITED_STATES.value(), "USA");
    	countryMap.put(Countries.URUGUAY.value(), "URY");
    	countryMap.put(Countries.VENEZUELA.value(), "VEN");
    	countryMap.put(Countries.VIRGIN_ISLANDS.value(), "USA");
    	countryMap.put(Countries.WORLD_GEOCODER.value(), "XWG");
    	countryMap.put(Countries.ZAMBIA.value(), "ZMB");
    	countryMap.put(Countries.ZIMBABWE.value(), "ZWE");

    	
    }
    public static String getCountryCode(String countryName)
    {
    	return countryMap.get(countryName);
    }
    
    public static <T> T processPOSTRequest(Entity paramEntity, String url, Class<T> responseClass) throws SdkException {
        SdkException exception;
       
        try {
            String accessToken = OAuthFactory.getOAuthService().getAuthenticationToken();
            Client client = ClientBuilder.newClient();
            WebTarget target = client.target(url);
            Response apiResponse = target.request(MediaType.APPLICATION_JSON).header(Constants.AUTH_HEADER, accessToken).buildPost(paramEntity).invoke();
            
            Gson gson = new Gson();
            String jsonResponse = apiResponse.readEntity(String.class);
            if (apiResponse.getStatus() == Response.Status.OK.getStatusCode()) {
                _LOG.info("Got a valid response from API", jsonResponse);
                return gson.fromJson(jsonResponse, responseClass);
            } else {
                _LOG.info("Got an error response from API");
                ErrorInfo apiError;

                if (apiResponse.getStatus() != Response.Status.BAD_REQUEST.getStatusCode()) {
                    apiError = new ErrorInfo();
                } else // Only in this case we can expect ErrorInfo
                {
                    apiError = gson.fromJson(jsonResponse, ErrorInfo.class);
                }

                apiError.setHttpStatusCode(apiResponse.getStatus());
                apiError.setReason(apiResponse.getStatusInfo().getReasonPhrase());
                apiError.setJsonResponse(jsonResponse);

                exception = new SdkException(apiError);
                _LOG.error("Error: " + getObjectAsJson(exception.getLiApiErrors()));
            }
        } catch (Exception e) {
            _LOG.error("Unexpected Error: " + e);
            exception = new SdkException(new SdkInternalError(Constants.ERROR_MSG_API_PROCESSING, e));
        }

        throw exception;
    }
    
}