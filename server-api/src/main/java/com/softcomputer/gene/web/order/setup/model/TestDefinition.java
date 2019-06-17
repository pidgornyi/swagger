/*
 * This module is part of the SoftGene system
 * Copyright (c) SCC Soft Computer, Inc.  2018
 * All Rights Reserved
 *
 * This document contains unpublished, confidential and proprietary
 * information of SCC Soft Computer, Inc. No disclosure or use of
 * any portion of the contents of these materials may be made without the
 * express written consent of Soft Computer Consultants, Inc.
 *
 */
package com.softcomputer.gene.web.order.setup.model;

import java.util.List;
import com.softcomputer.gene.web.order.requisition.TestType;

public class TestDefinition {
    public Long id;
    public String code;
    public String name;
    public String codeWithVersion;
    public boolean group;
    public boolean individuallyOrdered;
    public String secondaryId;
    public String synonym;
    public List<TestDefinition> components;
    public String loinc;
    public TestType testType;
}
