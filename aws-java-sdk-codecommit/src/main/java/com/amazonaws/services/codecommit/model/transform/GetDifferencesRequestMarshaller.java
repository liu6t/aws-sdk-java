/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.codecommit.model.transform;

import java.io.ByteArrayInputStream;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.codecommit.model.*;
import com.amazonaws.transform.Marshaller;

import com.amazonaws.protocol.json.*;

/**
 * GetDifferencesRequest Marshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDifferencesRequestMarshaller implements Marshaller<Request<GetDifferencesRequest>, GetDifferencesRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public GetDifferencesRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<GetDifferencesRequest> marshall(GetDifferencesRequest getDifferencesRequest) {

        if (getDifferencesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<GetDifferencesRequest> request = new DefaultRequest<GetDifferencesRequest>(getDifferencesRequest, "AWSCodeCommit");
        request.addHeader("X-Amz-Target", "CodeCommit_20150413.GetDifferences");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (getDifferencesRequest.getRepositoryName() != null) {
                jsonGenerator.writeFieldName("repositoryName").writeValue(getDifferencesRequest.getRepositoryName());
            }
            if (getDifferencesRequest.getBeforeCommitSpecifier() != null) {
                jsonGenerator.writeFieldName("beforeCommitSpecifier").writeValue(getDifferencesRequest.getBeforeCommitSpecifier());
            }
            if (getDifferencesRequest.getAfterCommitSpecifier() != null) {
                jsonGenerator.writeFieldName("afterCommitSpecifier").writeValue(getDifferencesRequest.getAfterCommitSpecifier());
            }
            if (getDifferencesRequest.getBeforePath() != null) {
                jsonGenerator.writeFieldName("beforePath").writeValue(getDifferencesRequest.getBeforePath());
            }
            if (getDifferencesRequest.getAfterPath() != null) {
                jsonGenerator.writeFieldName("afterPath").writeValue(getDifferencesRequest.getAfterPath());
            }
            if (getDifferencesRequest.getMaxResults() != null) {
                jsonGenerator.writeFieldName("MaxResults").writeValue(getDifferencesRequest.getMaxResults());
            }
            if (getDifferencesRequest.getNextToken() != null) {
                jsonGenerator.writeFieldName("NextToken").writeValue(getDifferencesRequest.getNextToken());
            }

            jsonGenerator.writeEndObject();

            byte[] content = jsonGenerator.getBytes();
            request.setContent(new ByteArrayInputStream(content));
            request.addHeader("Content-Length", Integer.toString(content.length));
            request.addHeader("Content-Type", protocolFactory.getContentType());
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }

}
