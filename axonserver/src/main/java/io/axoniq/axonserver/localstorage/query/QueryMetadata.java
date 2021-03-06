/*
 * Copyright (c) 2017-2019 AxonIQ B.V. and/or licensed to AxonIQ B.V.
 * under one or more contributor license agreements.
 *
 *  Licensed under the AxonIQ Open Source License Agreement v1.0;
 *  you may not use this file except in compliance with the license.
 *
 */

package io.axoniq.axonserver.localstorage.query;

import java.util.List;

/**
 * @author Marc Gathier
 */
public class QueryMetadata {
    private List<String> identifyingColumns;
    private List<String> sortColumns;

    public List<String> getIdentifyingColumns() {
        return identifyingColumns;
    }

    public void setIdentifyingColumns(List<String> identifyingColumns) {
        this.identifyingColumns = identifyingColumns;
    }

    public List<String> getSortColumns() {
        return sortColumns;
    }

    public void setSortColumns(List<String> sortColumns) {
        this.sortColumns = sortColumns;
    }
}
