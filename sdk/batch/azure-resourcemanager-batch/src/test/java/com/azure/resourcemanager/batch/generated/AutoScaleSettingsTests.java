// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.batch.models.AutoScaleSettings;
import java.time.Duration;
import org.junit.jupiter.api.Assertions;

public final class AutoScaleSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AutoScaleSettings model =
            BinaryData
                .fromString("{\"formula\":\"jzbexilzznfq\",\"evaluationInterval\":\"PT73H38M19S\"}")
                .toObject(AutoScaleSettings.class);
        Assertions.assertEquals("jzbexilzznfq", model.formula());
        Assertions.assertEquals(Duration.parse("PT73H38M19S"), model.evaluationInterval());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AutoScaleSettings model =
            new AutoScaleSettings().withFormula("jzbexilzznfq").withEvaluationInterval(Duration.parse("PT73H38M19S"));
        model = BinaryData.fromObject(model).toObject(AutoScaleSettings.class);
        Assertions.assertEquals("jzbexilzznfq", model.formula());
        Assertions.assertEquals(Duration.parse("PT73H38M19S"), model.evaluationInterval());
    }
}
