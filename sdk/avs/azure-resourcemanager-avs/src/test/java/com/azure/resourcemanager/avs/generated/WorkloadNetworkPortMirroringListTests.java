// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.avs.models.WorkloadNetworkPortMirroringList;

public final class WorkloadNetworkPortMirroringListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        WorkloadNetworkPortMirroringList model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"displayName\":\"hzxct\",\"direction\":\"BIDIRECTIONAL\",\"source\":\"kdmoi\",\"destination\":\"ostmgrcf\",\"status\":\"FAILURE\",\"provisioningState\":\"Deleting\",\"revision\":181548071743719809},\"id\":\"hhkxbp\",\"name\":\"jy\",\"type\":\"jhxxjyn\"}],\"nextLink\":\"divkrt\"}")
                .toObject(WorkloadNetworkPortMirroringList.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        WorkloadNetworkPortMirroringList model = new WorkloadNetworkPortMirroringList();
        model = BinaryData.fromObject(model).toObject(WorkloadNetworkPortMirroringList.class);
    }
}
