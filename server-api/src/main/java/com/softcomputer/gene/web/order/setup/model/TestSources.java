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

public class TestSources {

    public String testCodeVersion;
    public String testCode;
    public String testName;
    public String system;
    public List<Source> specimens;
    public List<Source> tubes;
    public Source preferableTube;
    public Source preferableAliquote;
    public boolean checkOnlyNonAccItems;
}
