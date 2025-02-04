// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Information about the status of continuous backups. */
@Fluent
public final class ContinuousBackupInformation {
    /*
     * The latest restorable timestamp for a resource.
     */
    @JsonProperty(value = "latestRestorableTimestamp")
    private String latestRestorableTimestamp;

    /** Creates an instance of ContinuousBackupInformation class. */
    public ContinuousBackupInformation() {
    }

    /**
     * Get the latestRestorableTimestamp property: The latest restorable timestamp for a resource.
     *
     * @return the latestRestorableTimestamp value.
     */
    public String latestRestorableTimestamp() {
        return this.latestRestorableTimestamp;
    }

    /**
     * Set the latestRestorableTimestamp property: The latest restorable timestamp for a resource.
     *
     * @param latestRestorableTimestamp the latestRestorableTimestamp value to set.
     * @return the ContinuousBackupInformation object itself.
     */
    public ContinuousBackupInformation withLatestRestorableTimestamp(String latestRestorableTimestamp) {
        this.latestRestorableTimestamp = latestRestorableTimestamp;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
