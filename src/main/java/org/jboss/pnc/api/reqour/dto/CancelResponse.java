/**
 * Copyright 2024 Red Hat, Inc.
 * SPDX-License-Identifier: Apache-2.0
 */
package org.jboss.pnc.api.reqour.dto;

import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

import javax.validation.constraints.NotNull;

/**
 * Response DTO of the cancel operation
 */
@Builder
@Value
@Jacksonized
public class CancelResponse {

    /**
     * Callback containing information about Reqour's async task.
     */
    @NotNull
    ReqourCallback callback;
}