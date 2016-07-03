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
package com.pb.locationintelligence;

import com.pb.locationintelligence.exception.SdkException;
import com.pb.locationintelligence.exception.SdkException.ErrorResponseType;
import com.pb.locationintelligence.geo911.Geo911Service;
import com.pb.locationintelligence.geo911.Geo911ServiceImpl;
import com.pb.locationintelligence.geo911.model.PsapResponse;
import com.pb.locationintelligence.manager.LIServiceManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.ws.rs.core.Response;

import static org.junit.Assert.assertTrue;

public class HttpErrorsTest {

    LIServiceManager mLI;
    Geo911Service geo911Service;

    @Before
    public void setUp() throws Exception {
        LIServiceManager.getInstance("JUNK", "JUNK");
        geo911Service = new Geo911ServiceImpl();
    }

    @Test
    public void testWithWrongKeyAndSecret() {
        try {
            PsapResponse response = geo911Service.getPSAPByAddress("4750 Walnut St, Boulder, CO");
            assertTrue(response != null);
        } catch (SdkException e) {
            assertTrue(ErrorResponseType.LI.equals(e.getErrorResponseType()));
            assertTrue(e.getLiApiErrors() != null);
            assertTrue(Response.Status.UNAUTHORIZED.getStatusCode() == e.getLiApiErrors().getHttpStatusCode());
            assertTrue(e.getLiApiErrors().getReason().length() > 0);
        }
    }

    @After
    public void tearDown() throws Exception {
        mLI = null;
        geo911Service = null;
    }
}
