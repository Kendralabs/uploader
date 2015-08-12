/**
 * Copyright (c) 2015 Intel Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.trustedanalytics.uploader.client;

import org.trustedanalytics.uploader.rest.UploadCompleted;

import feign.Headers;
import feign.Param;
import feign.RequestLine;

public interface DataAcquisitionClient {

    @RequestLine("POST /rest/das/callbacks/uploader")
    @Headers({"Authorization: {token}", "Content-Type: application/json"})
    void uploadCompleted(UploadCompleted message, @Param("token") String token);

}