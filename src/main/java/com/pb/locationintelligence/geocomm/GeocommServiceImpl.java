/*
* Copyright 2016 Pitney Bowes Inc.
*
* Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS,
*  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
*  See the License for the specific language governing permissions and limitations under the License.
*
*/

package com.pb.locationintelligence.geocomm;


import com.pb.locationintelligence.RequestObserver;
import com.pb.locationintelligence.exception.SdkException;
import com.pb.locationintelligence.geocomm.model.RateCenterResponse;
import com.pb.locationintelligence.utils.UrlMaker;
import com.pb.locationintelligence.utils.Utility;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author MU001UP
 * This service provides rate center information w.r.t requested Address or Latitude-Longitude.
 */
public class GeocommServiceImpl implements GeocommService {
    private String geocommUrl = "/geocomm/v1/ratecenter/";
    private UrlMaker urlMaker;

    @Override
    public void getRateCenterByAddress(String address, RequestObserver<RateCenterResponse> requestObserver) throws SdkException {
        processGeocommByAddressRequestAsync(address, null, false, null, requestObserver);
    }

    @Override
    public void getRateCenterByAddress(String address, boolean areaCodeInfo, RequestObserver<RateCenterResponse> requestObserver) throws SdkException {
        processGeocommByAddressRequestAsync(address, null, false, null, requestObserver);
    }

    @Override
    public void getRateCenterByAddress(String address, boolean areaCodeInfo, String level, RequestObserver<RateCenterResponse> requestObserver) throws SdkException {
        processGeocommByAddressRequestAsync(address, null, areaCodeInfo, null, requestObserver);
    }

    @Override
    public void getRateCenterByAddress(String address, String country, RequestObserver<RateCenterResponse> requestObserver) throws SdkException {
        processGeocommByAddressRequestAsync(address, country, false, null, requestObserver);
    }

    @Override
    public void getRateCenterByAddress(String address, String country, boolean areaCodeInfo, RequestObserver<RateCenterResponse> requestObserver) throws SdkException {
        processGeocommByAddressRequestAsync(address, country, areaCodeInfo, null, requestObserver);
    }

    @Override
    public void getRateCenterByAddress(String address, String country, boolean areaCodeInfo, String level, RequestObserver<RateCenterResponse> requestObserver) throws SdkException {
        processGeocommByAddressRequestAsync(address, country, areaCodeInfo, level, requestObserver);
    }

    @Override
    public void getRateCenterByLocation(Double longitude, Double latitude, RequestObserver<RateCenterResponse> requestObserver) throws SdkException {
        processGeocommByLocationRequestAsync(longitude, latitude, false, null, requestObserver);
    }

    @Override
    public void getRateCenterByLocation(Double longitude, Double latitude, boolean areaCodeInfo, RequestObserver<RateCenterResponse> requestObserver) throws SdkException {
        processGeocommByLocationRequestAsync(longitude, latitude, areaCodeInfo, null, requestObserver);

    }

    @Override
    public void getRateCenterByLocation(Double longitude, Double latitude, boolean areaCodeInfo, String level, RequestObserver<RateCenterResponse> requestObserver) throws SdkException {
        processGeocommByLocationRequestAsync(longitude, latitude, areaCodeInfo, level, requestObserver);

    }

    @Override
    public RateCenterResponse getRateCenterByAddress(String address) throws SdkException {
        return processGeocommByAddressRequest(address, null, false, null);
    }

    @Override
    public RateCenterResponse getRateCenterByAddress(String address, boolean areaCodeInfo) throws SdkException {
        return processGeocommByAddressRequest(address, null, areaCodeInfo, null);
    }

    @Override
    public RateCenterResponse getRateCenterByAddress(String address, boolean areaCodeInfo, String level) throws SdkException {
        return processGeocommByAddressRequest(address, null, areaCodeInfo, level);
    }

    @Override
    public RateCenterResponse getRateCenterByAddress(String address, String country) throws SdkException {
        return processGeocommByAddressRequest(address, country, false, null);
    }

    @Override
    public RateCenterResponse getRateCenterByAddress(String address, String country, boolean areaCodeInfo) throws SdkException {
        return processGeocommByAddressRequest(address, country, areaCodeInfo, null);
    }

    @Override
    public RateCenterResponse getRateCenterByAddress(String address, String country, boolean areaCodeInfo, String level) throws SdkException {
        return processGeocommByAddressRequest(address, country, areaCodeInfo, level);
    }

    @Override
    public RateCenterResponse getRateCenterByLocation(Double longitude, Double latitude) throws SdkException {
        return processGeocommByLocationRequest(longitude, latitude, false, null);
    }

    @Override
    public RateCenterResponse getRateCenterByLocation(Double longitude, Double latitude, boolean areaCodeInfo) throws SdkException {
        return processGeocommByLocationRequest(longitude, latitude, areaCodeInfo, null);
    }

    @Override
    public RateCenterResponse getRateCenterByLocation(Double longitude, Double latitude, boolean areaCodeInfo, String level) throws SdkException {
        return processGeocommByLocationRequest(longitude, latitude, areaCodeInfo, level);
    }


    private RateCenterResponse processGeocommByAddressRequest(String address, String country, boolean isAreaCodeInfoRequested, String level) throws SdkException {
        urlMaker = UrlMaker.getInstance();
        String url = urlMaker.getAbsoluteUrl(geocommUrl) + "byaddress?address=" + urlMaker.getEncodedURL(getString(address));
        StringBuffer geocommURL = new StringBuffer(url);
        if (country != null) {
            geocommURL.append("&country=" + country);
        }
        if (isAreaCodeInfoRequested) {
            geocommURL.append("&areaCodeInfo=true");
            if (level != null) {
                geocommURL.append("&level=" + level);
            }
        }
        return Utility.processAPIRequest(geocommURL.toString(), RateCenterResponse.class);
    }


    private RateCenterResponse processGeocommByLocationRequest(final Double longitude, final Double latitude, final boolean isAreaCodeInfoRequested, final String level) throws SdkException {
        urlMaker = UrlMaker.getInstance();
        String url = urlMaker.getAbsoluteUrl(geocommUrl) + "bylocation?latitude=" + urlMaker.getEncodedURL(getString(latitude)) + "&longitude=" + urlMaker.getEncodedURL(getString(longitude));
        StringBuffer geocommURL = new StringBuffer(url);
        if (isAreaCodeInfoRequested) {
            geocommURL.append("&areaCodeInfo=true");
            if (level != null) {
                geocommURL.append("&level=" + level);
            }
        }
        return Utility.processAPIRequest(geocommURL.toString(), RateCenterResponse.class);
    }


    private void processGeocommByAddressRequestAsync(final String address, final String country, final boolean isAreaCodeInfoRequested, final String level, final RequestObserver<RateCenterResponse> requestObserver) throws SdkException {
        final ExecutorService executorService = Executors.newFixedThreadPool(1);
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                try {
                    RateCenterResponse response = processGeocommByAddressRequest(address, country, isAreaCodeInfoRequested, level);
                    requestObserver.onSuccess(response);

                } catch (SdkException e) {
                    requestObserver.onFailure(e);
                } finally {
                    executorService.shutdown();
                }
            }
        });
    }


    private void processGeocommByLocationRequestAsync(final Double longitude, final Double latitude, final boolean isAreaCodeInfoRequested, final String level, final RequestObserver<RateCenterResponse> requestObserver) throws SdkException {
        final ExecutorService executorService = Executors.newFixedThreadPool(1);
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                try {
                    RateCenterResponse response = processGeocommByLocationRequest(longitude, latitude, isAreaCodeInfoRequested, level);
                    requestObserver.onSuccess(response);
                } catch (SdkException e) {
                    requestObserver.onFailure(e);
                } finally {
                    executorService.shutdown();
                }
            }
        });
    }

    private String getString(Object value) {
        if (value == null) {
            return "";
        }
        return value.toString();
    }


}
