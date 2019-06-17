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
package com.softcomputer.gene.web.order.visit;

import org.joda.time.DateTime;

public class VisitBriefInfo {
    public String billingNumber;
    public DateTime admissionDateTime;
    public String visitClinic;
    public String attendingDoctor;
    public String patientType;
    public String comment;
    public DateTime dischargeDateTime;
}
