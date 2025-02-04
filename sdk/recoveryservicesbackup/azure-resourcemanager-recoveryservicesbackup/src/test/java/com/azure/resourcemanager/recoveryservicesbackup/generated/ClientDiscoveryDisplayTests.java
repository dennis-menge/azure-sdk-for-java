// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.ClientDiscoveryDisplay;
import org.junit.jupiter.api.Assertions;

public final class ClientDiscoveryDisplayTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ClientDiscoveryDisplay model =
            BinaryData
                .fromString(
                    "{\"provider\":\"y\",\"resource\":\"hr\",\"operation\":\"dfvzwdzuhty\",\"description\":\"isdkfthwxmnteiw\"}")
                .toObject(ClientDiscoveryDisplay.class);
        Assertions.assertEquals("y", model.provider());
        Assertions.assertEquals("hr", model.resource());
        Assertions.assertEquals("dfvzwdzuhty", model.operation());
        Assertions.assertEquals("isdkfthwxmnteiw", model.description());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ClientDiscoveryDisplay model =
            new ClientDiscoveryDisplay()
                .withProvider("y")
                .withResource("hr")
                .withOperation("dfvzwdzuhty")
                .withDescription("isdkfthwxmnteiw");
        model = BinaryData.fromObject(model).toObject(ClientDiscoveryDisplay.class);
        Assertions.assertEquals("y", model.provider());
        Assertions.assertEquals("hr", model.resource());
        Assertions.assertEquals("dfvzwdzuhty", model.operation());
        Assertions.assertEquals("isdkfthwxmnteiw", model.description());
    }
}
