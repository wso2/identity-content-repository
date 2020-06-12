/*
 * Copyright (c) 2019, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
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
package org.wso2.carbon.identity.media.jdbc;

import org.wso2.carbon.identity.media.DataContent;
import org.wso2.carbon.identity.media.StorageSystem;
import org.wso2.carbon.identity.media.exception.StorageSystemException;
import org.wso2.carbon.identity.media.model.MediaMetadata;

import java.io.InputStream;
import java.util.List;

/**
 * This class implements StorageSystem to store media in a database.
 */
public class DatabaseBasedStorageSystemImpl implements StorageSystem {

    @Override
    public String addFile(List<InputStream> inputStreams, MediaMetadata mediaMetadata, String uuid, String tenantDomain)
            throws StorageSystemException {

        throw new UnsupportedOperationException("Database based add file operation not supported.");
    }

    @Override
    public DataContent getFile(String id, String tenantDomain, String type) throws StorageSystemException {

        throw new UnsupportedOperationException("Database based get file operation not supported.");
    }

    @Override
    public boolean evaluateSecurity(String accessLevel, String id, String type, String tenantDomain,
                                    String[] oauth2AllowedScopes) throws StorageSystemException {

        throw new UnsupportedOperationException("Database based security evaluation not supported.");
    }

    @Override
    public void deleteFile(String id, String type, String tenantDomain) throws StorageSystemException {

        throw new UnsupportedOperationException("Database based delete file operation not supported.");
    }

    @Override
    public InputStream transform(String id, String type, String tenantDomain, InputStream inputStream)
            throws StorageSystemException {

        return inputStream;
    }
}
