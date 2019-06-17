/*
 * This module is part of the SoftGene system
 * Copyright (c) SCC Soft Computer, Inc.  2019
 * All Rights Reserved
 *
 * This document contains unpublished, confidential and proprietary
 * information of SCC Soft Computer, Inc. No disclosure or use of
 * any portion of the contents of these materials may be made without the
 * express written consent of Soft Computer Consultants, Inc.
 *
 */
package com.softcomputer.gene.web.order.visit;

import com.softcomputer.gene.web.order.patient.Visit;

import java.util.List;

public class VisitsBatch {
    public List<Visit> visits;
    public Boolean hasMoreItems;

    public VisitsBatch(List<Visit> visits, boolean hasMoreItems){
        this.visits = visits;
        this.hasMoreItems = hasMoreItems;
    }
}
