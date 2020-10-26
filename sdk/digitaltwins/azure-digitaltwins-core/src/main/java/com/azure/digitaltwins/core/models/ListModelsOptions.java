// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.digitaltwins.core.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.Context;
import com.azure.digitaltwins.core.implementation.models.DigitalTwinModelsListOptions;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

// This class manually copies the generated class of the same name, but also adds properties for includeModelDefinition
// and dependenciesFor since the swagger does not group those in with these options for us.

/**
 * The optional parameters for
 * {@link com.azure.digitaltwins.core.DigitalTwinsClient#listModels(ListModelsOptions, Context)} and
 * {@link com.azure.digitaltwins.core.DigitalTwinsAsyncClient#listModels(ListModelsOptions)}
 */
@Fluent
public final class ListModelsOptions {
    /*
     * Identifies the request in a distributed tracing system.
     */
    @JsonProperty(value = "traceparent")
    private String traceparent;

    /*
     * Provides vendor-specific trace identification information and is a
     * companion to traceparent.
     */
    @JsonProperty(value = "tracestate")
    private String tracestate;

    /**
     * Get the traceparent property: Identifies the request in a distributed tracing system.
     *
     * @return the traceparent value.
     */
    public String getTraceParent() {
        return this.traceparent;
    }

    /**
     * Set the traceparent property: Identifies the request in a distributed tracing system.
     *
     * @param traceparent the traceparent value to set.
     * @return the ListModelsOptions object itself.
     */
    public ListModelsOptions setTraceParent(String traceparent) {
        this.traceparent = traceparent;
        return this;
    }

    /**
     * Get the tracestate property: Provides vendor-specific trace identification information and is a companion to
     * traceparent.
     *
     * @return the tracestate value.
     */
    public String getTraceState() {
        return this.tracestate;
    }

    /**
     * Set the tracestate property: Provides vendor-specific trace identification information and is a companion to
     * traceparent.
     *
     * @param tracestate the tracestate value to set.
     * @return the ListModelsOptions object itself.
     */
    public ListModelsOptions setTraceState(String tracestate) {
        this.tracestate = tracestate;
        return this;
    }

    /*
     * Whether to include the model definition in the result. If false, only the model metadata will be returned.
     * Disabled by default.
     */
    private Boolean includeModelDefinition = false;

    /**
     * Gets whether to include the model definition in the result. If false, only the model metadata will be returned.
     * @return the includeModelDefinition value.
     */
    public Boolean getIncludeModelDefinition() { return this.includeModelDefinition; }

    /**
     * Sets whether to include the model definition in the result. If false, only the model metadata will be returned.
     * @param includeModelDefinition the includeModelDefinition value to set.
     * @return the ListModelOptions object itself.
     */
    public ListModelsOptions setIncludeModelDefinition(Boolean includeModelDefinition) {
        this.includeModelDefinition = includeModelDefinition;
        return this;
    }

    /*
     * The model Ids to have dependencies retrieved.
     */
    private List<String> dependenciesFor;

    /**
     * Gets the model Ids that will have their dependencies retrieved.
     * @return the dependenciesFor value.
     */
    public List<String> getDependenciesFor() { return this.dependenciesFor; }

    /**
     * Sets the model Ids that will have their dependencies retrieved.
     * @param dependenciesFor the dependenciesFor value to set.
     * @return the ListModelOptions object itself.
     */
    public ListModelsOptions setDependenciesFor(List<String> dependenciesFor) {
        this.dependenciesFor = dependenciesFor;
        return this;
    }
}
