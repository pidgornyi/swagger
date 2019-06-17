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

import org.joda.time.DateTime;
import com.softcomputer.gene.web.order.Dictionary;

class PatientAlert {
    public String auxId;
    public Dictionary alert;
    public DateTime dateTime;
    public String enteredBy;
    public boolean active;
    public String text;
}
