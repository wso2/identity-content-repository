/*
 * Copyright (c) 2020, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  WSO2 Inc. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.identity.media.core.model;

import java.util.List;

/**
 * This class represents information associated with the requested media.
 */
public class MediaInformation {

    private List<String> links;
    private Object mediaMetadata;

    public List<String> getLinks() {

        return links;
    }

    public void setLinks(List<String> links) {

        this.links = links;
    }

    public Object getMediaMetadata() {

        return mediaMetadata;
    }

    public void setMediaMetadata(Object mediaMetadata) {

        this.mediaMetadata = mediaMetadata;
    }
}
