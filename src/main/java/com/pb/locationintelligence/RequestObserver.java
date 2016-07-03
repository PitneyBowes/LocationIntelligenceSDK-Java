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

/**
 * This interface is used in asynchronous calls. It provides one method to handle success and another to handle failures.
 * The caller of the asynchronous APIs need to provide an implementation for this interface. For example see Geo911ByAddressMain_Async
 */
public interface RequestObserver<T> {

    /**
     * This method is called when the request is successful. The API response is returned when this method is called.
     * @param response The response of the API call.
     */
    void onSuccess(T response);

    /**
     * This method is called when the request fails. The error information is returned when this method is called.
     * @param e The error information.
     */
    void onFailure(SdkException e);
}
