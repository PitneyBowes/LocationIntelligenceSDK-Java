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

package com.pb.locationintelligence.geoComm;

import com.pb.locationintelligence.exception.SdkException;
import com.pb.locationintelligence.geocomm.GeocommService;
import com.pb.locationintelligence.geocomm.GeocommServiceImpl;
import com.pb.locationintelligence.geocomm.model.RateCenterResponse;
import com.pb.locationintelligence.utils.Utility;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.junit.Assert.assertNull;
import static org.powermock.api.mockito.PowerMockito.*;

/**
 * Created by MU001UP on 9/6/2016.
 */

@RunWith(PowerMockRunner.class)
@PrepareForTest(Utility.class)
public class GeoCommTest {

    private GeocommService geocommService;

    @Before
    public void setUp() {
        geocommService = new GeocommServiceImpl();
    }


    @Test
    public void testGeocommServiceByAddress() throws SdkException {
        boolean areaCodeInfo = true;
        String country = "USA";
        String address = "4750 Walnut St, Boulder, CO";
        mockStatic(Utility.class);
        when(Utility.processAPIRequest(mock(String.class), RateCenterResponse.class)).thenReturn(new RateCenterResponse());
        RateCenterResponse response = geocommService.getRateCenterByAddress(address, country, areaCodeInfo, "");
        assertNull(response);
    }

    @Test
    public void testGeocommServiceByLocation() throws SdkException {
        Double latitude = 35.10;
        Double longitude = -87.40;
        boolean isAreaCodeInfoRequested = true;
        mockStatic(Utility.class);
        when(Utility.processAPIRequest(mock(String.class), RateCenterResponse.class)).thenReturn(new RateCenterResponse());
        RateCenterResponse response = geocommService.getRateCenterByLocation(longitude, latitude, isAreaCodeInfoRequested, "");
        assertNull(response);
    }

    @After
    public void tearDown() {
        geocommService = null;
    }


}
