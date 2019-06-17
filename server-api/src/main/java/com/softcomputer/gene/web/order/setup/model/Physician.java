/*
 *   This module is part of the SoftGene system
 *    Copyright (c) SCC Soft Computer, Inc.  2017
 *    All Rights Reserved
 *
 * This document contains unpublished, confidential and proprietary
 * information of SCC Soft Computer, Inc. No disclosure or use of
 * any portion of the contents of these materials may be made without the
 * express written consent of Soft Computer Consultants, Inc.
 */
package com.softcomputer.gene.web.order.setup.model;

import com.softcomputer.gene.web.order.Dictionary;

public class Physician {
    public String id;
    public Dictionary title;
    public String upin;
    public String npi;
    public String lastName;
    public String firstName;
    public String middleName;
    public boolean active;
    public String orderingKeypad;
}
