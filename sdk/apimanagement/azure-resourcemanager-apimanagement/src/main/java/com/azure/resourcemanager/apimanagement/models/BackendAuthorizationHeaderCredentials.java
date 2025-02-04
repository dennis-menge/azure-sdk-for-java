// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Authorization header information. */
@Fluent
public final class BackendAuthorizationHeaderCredentials {
    /*
     * Authentication Scheme name.
     */
    @JsonProperty(value = "scheme", required = true)
    private String scheme;

    /*
     * Authentication Parameter value.
     */
    @JsonProperty(value = "parameter", required = true)
    private String parameter;

    /**
     * Get the scheme property: Authentication Scheme name.
     *
     * @return the scheme value.
     */
    public String scheme() {
        return this.scheme;
    }

    /**
     * Set the scheme property: Authentication Scheme name.
     *
     * @param scheme the scheme value to set.
     * @return the BackendAuthorizationHeaderCredentials object itself.
     */
    public BackendAuthorizationHeaderCredentials withScheme(String scheme) {
        this.scheme = scheme;
        return this;
    }

    /**
     * Get the parameter property: Authentication Parameter value.
     *
     * @return the parameter value.
     */
    public String parameter() {
        return this.parameter;
    }

    /**
     * Set the parameter property: Authentication Parameter value.
     *
     * @param parameter the parameter value to set.
     * @return the BackendAuthorizationHeaderCredentials object itself.
     */
    public BackendAuthorizationHeaderCredentials withParameter(String parameter) {
        this.parameter = parameter;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (scheme() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property scheme in model BackendAuthorizationHeaderCredentials"));
        }
        if (parameter() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property parameter in model BackendAuthorizationHeaderCredentials"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(BackendAuthorizationHeaderCredentials.class);
}
