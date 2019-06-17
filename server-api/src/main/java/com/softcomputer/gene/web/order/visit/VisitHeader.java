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

import org.joda.time.DateTime;

public class VisitHeader {
    public String billingNumber;
    public DateTime admissionDateTime;
    public String clinicName;
    public String doctorFirstName;
    public String doctorLastName;
    public String patientType;
}
