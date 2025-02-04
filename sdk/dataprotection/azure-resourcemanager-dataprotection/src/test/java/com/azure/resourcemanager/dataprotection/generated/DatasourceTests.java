// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dataprotection.models.BaseResourceProperties;
import com.azure.resourcemanager.dataprotection.models.Datasource;
import org.junit.jupiter.api.Assertions;

public final class DatasourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Datasource model =
            BinaryData
                .fromString(
                    "{\"datasourceType\":\"hdwbavxbniwdjs\",\"objectType\":\"tsdbpgn\",\"resourceID\":\"ytxhp\",\"resourceLocation\":\"bzpfzab\",\"resourceName\":\"cuh\",\"resourceType\":\"tcty\",\"resourceUri\":\"klbb\",\"resourceProperties\":{\"objectType\":\"BaseResourceProperties\"}}")
                .toObject(Datasource.class);
        Assertions.assertEquals("hdwbavxbniwdjs", model.datasourceType());
        Assertions.assertEquals("tsdbpgn", model.objectType());
        Assertions.assertEquals("ytxhp", model.resourceId());
        Assertions.assertEquals("bzpfzab", model.resourceLocation());
        Assertions.assertEquals("cuh", model.resourceName());
        Assertions.assertEquals("tcty", model.resourceType());
        Assertions.assertEquals("klbb", model.resourceUri());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Datasource model =
            new Datasource()
                .withDatasourceType("hdwbavxbniwdjs")
                .withObjectType("tsdbpgn")
                .withResourceId("ytxhp")
                .withResourceLocation("bzpfzab")
                .withResourceName("cuh")
                .withResourceType("tcty")
                .withResourceUri("klbb")
                .withResourceProperties(new BaseResourceProperties());
        model = BinaryData.fromObject(model).toObject(Datasource.class);
        Assertions.assertEquals("hdwbavxbniwdjs", model.datasourceType());
        Assertions.assertEquals("tsdbpgn", model.objectType());
        Assertions.assertEquals("ytxhp", model.resourceId());
        Assertions.assertEquals("bzpfzab", model.resourceLocation());
        Assertions.assertEquals("cuh", model.resourceName());
        Assertions.assertEquals("tcty", model.resourceType());
        Assertions.assertEquals("klbb", model.resourceUri());
    }
}
