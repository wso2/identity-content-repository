/*
* Copyright (c) 2020, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
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

package org.wso2.carbon.identity.media.endpoint;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.wso2.carbon.identity.media.endpoint.MultipleFilesUploadResponseLinks;
import javax.validation.constraints.*;

/**
 * Location of each file uploaded in a scenario where multiple representations of a single resource is uploaded.
 **/

import io.swagger.annotations.*;
import java.util.Objects;
import javax.validation.Valid;
import javax.xml.bind.annotation.*;
@ApiModel(description = "Location of each file uploaded in a scenario where multiple representations of a single resource is uploaded.")
public class MultipleFilesUploadResponse  {
  
    private List<MultipleFilesUploadResponseLinks> links = null;


    /**
    **/
    public MultipleFilesUploadResponse links(List<MultipleFilesUploadResponseLinks> links) {

        this.links = links;
        return this;
    }
    
    @ApiModelProperty(value = "")
    @JsonProperty("links")
    @Valid
    public List<MultipleFilesUploadResponseLinks> getLinks() {
        return links;
    }
    public void setLinks(List<MultipleFilesUploadResponseLinks> links) {
        this.links = links;
    }

    public MultipleFilesUploadResponse addLinksItem(MultipleFilesUploadResponseLinks linksItem) {
        if (this.links == null) {
            this.links = new ArrayList<>();
        }
        this.links.add(linksItem);
        return this;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {

        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MultipleFilesUploadResponse multipleFilesUploadResponse = (MultipleFilesUploadResponse) o;
        return Objects.equals(this.links, multipleFilesUploadResponse.links);
    }

    @Override
    public int hashCode() {
        return Objects.hash(links);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("class MultipleFilesUploadResponse {\n");
        
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
    * Convert the given object to string with each line indented by 4 spaces
    * (except the first line).
    */
    private String toIndentedString(java.lang.Object o) {

        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n");
    }
}

