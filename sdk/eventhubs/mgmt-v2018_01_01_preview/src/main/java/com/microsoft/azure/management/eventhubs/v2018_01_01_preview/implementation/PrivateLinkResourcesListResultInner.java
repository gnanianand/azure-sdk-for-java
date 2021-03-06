/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventhubs.v2018_01_01_preview.implementation;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Result of the List private link resources operation.
 */
public class PrivateLinkResourcesListResultInner {
    /**
     * A collection of private link resources.
     */
    @JsonProperty(value = "value")
    private List<PrivateLinkResourceInner> value;

    /**
     * A link for the next page of private link resources.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get a collection of private link resources.
     *
     * @return the value value
     */
    public List<PrivateLinkResourceInner> value() {
        return this.value;
    }

    /**
     * Set a collection of private link resources.
     *
     * @param value the value value to set
     * @return the PrivateLinkResourcesListResultInner object itself.
     */
    public PrivateLinkResourcesListResultInner withValue(List<PrivateLinkResourceInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get a link for the next page of private link resources.
     *
     * @return the nextLink value
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set a link for the next page of private link resources.
     *
     * @param nextLink the nextLink value to set
     * @return the PrivateLinkResourcesListResultInner object itself.
     */
    public PrivateLinkResourcesListResultInner withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

}
