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
package com.softcomputer.gene.web.order.patient;

import com.softcomputer.gene.web.order.Dictionary;

public class ContactInfo {
    public String lastName;
    public String firstName;
    public String middleName;
    public Dictionary relationship;
    public String title;
    public String suffix;
    public String profSuffix;
    public Dictionary language;
    public AddressInfo address;
    public String alternativeContact;
}
