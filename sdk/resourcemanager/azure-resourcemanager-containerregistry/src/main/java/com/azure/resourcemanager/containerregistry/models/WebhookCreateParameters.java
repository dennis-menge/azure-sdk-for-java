// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.containerregistry.fluent.models.WebhookPropertiesCreateParameters;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** The parameters for creating a webhook. */
@Fluent
public final class WebhookCreateParameters {
    /*
     * The tags for the webhook.
     */
    @JsonProperty(value = "tags")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> tags;

    /*
     * The location of the webhook. This cannot be changed after the resource is created.
     */
    @JsonProperty(value = "location", required = true)
    private String location;

    /*
     * The properties that the webhook will be created with.
     */
    @JsonProperty(value = "properties")
    private WebhookPropertiesCreateParameters innerProperties;

    /** Creates an instance of WebhookCreateParameters class. */
    public WebhookCreateParameters() {
    }

    /**
     * Get the tags property: The tags for the webhook.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: The tags for the webhook.
     *
     * @param tags the tags value to set.
     * @return the WebhookCreateParameters object itself.
     */
    public WebhookCreateParameters withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the location property: The location of the webhook. This cannot be changed after the resource is created.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: The location of the webhook. This cannot be changed after the resource is created.
     *
     * @param location the location value to set.
     * @return the WebhookCreateParameters object itself.
     */
    public WebhookCreateParameters withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the innerProperties property: The properties that the webhook will be created with.
     *
     * @return the innerProperties value.
     */
    private WebhookPropertiesCreateParameters innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the serviceUri property: The service URI for the webhook to post notifications.
     *
     * @return the serviceUri value.
     */
    public String serviceUri() {
        return this.innerProperties() == null ? null : this.innerProperties().serviceUri();
    }

    /**
     * Set the serviceUri property: The service URI for the webhook to post notifications.
     *
     * @param serviceUri the serviceUri value to set.
     * @return the WebhookCreateParameters object itself.
     */
    public WebhookCreateParameters withServiceUri(String serviceUri) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WebhookPropertiesCreateParameters();
        }
        this.innerProperties().withServiceUri(serviceUri);
        return this;
    }

    /**
     * Get the customHeaders property: Custom headers that will be added to the webhook notifications.
     *
     * @return the customHeaders value.
     */
    public Map<String, String> customHeaders() {
        return this.innerProperties() == null ? null : this.innerProperties().customHeaders();
    }

    /**
     * Set the customHeaders property: Custom headers that will be added to the webhook notifications.
     *
     * @param customHeaders the customHeaders value to set.
     * @return the WebhookCreateParameters object itself.
     */
    public WebhookCreateParameters withCustomHeaders(Map<String, String> customHeaders) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WebhookPropertiesCreateParameters();
        }
        this.innerProperties().withCustomHeaders(customHeaders);
        return this;
    }

    /**
     * Get the status property: The status of the webhook at the time the operation was called.
     *
     * @return the status value.
     */
    public WebhookStatus status() {
        return this.innerProperties() == null ? null : this.innerProperties().status();
    }

    /**
     * Set the status property: The status of the webhook at the time the operation was called.
     *
     * @param status the status value to set.
     * @return the WebhookCreateParameters object itself.
     */
    public WebhookCreateParameters withStatus(WebhookStatus status) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WebhookPropertiesCreateParameters();
        }
        this.innerProperties().withStatus(status);
        return this;
    }

    /**
     * Get the scope property: The scope of repositories where the event can be triggered. For example, 'foo:*' means
     * events for all tags under repository 'foo'. 'foo:bar' means events for 'foo:bar' only. 'foo' is equivalent to
     * 'foo:latest'. Empty means all events.
     *
     * @return the scope value.
     */
    public String scope() {
        return this.innerProperties() == null ? null : this.innerProperties().scope();
    }

    /**
     * Set the scope property: The scope of repositories where the event can be triggered. For example, 'foo:*' means
     * events for all tags under repository 'foo'. 'foo:bar' means events for 'foo:bar' only. 'foo' is equivalent to
     * 'foo:latest'. Empty means all events.
     *
     * @param scope the scope value to set.
     * @return the WebhookCreateParameters object itself.
     */
    public WebhookCreateParameters withScope(String scope) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WebhookPropertiesCreateParameters();
        }
        this.innerProperties().withScope(scope);
        return this;
    }

    /**
     * Get the actions property: The list of actions that trigger the webhook to post notifications.
     *
     * @return the actions value.
     */
    public List<WebhookAction> actions() {
        return this.innerProperties() == null ? null : this.innerProperties().actions();
    }

    /**
     * Set the actions property: The list of actions that trigger the webhook to post notifications.
     *
     * @param actions the actions value to set.
     * @return the WebhookCreateParameters object itself.
     */
    public WebhookCreateParameters withActions(List<WebhookAction> actions) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WebhookPropertiesCreateParameters();
        }
        this.innerProperties().withActions(actions);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (location() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property location in model WebhookCreateParameters"));
        }
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(WebhookCreateParameters.class);
}
