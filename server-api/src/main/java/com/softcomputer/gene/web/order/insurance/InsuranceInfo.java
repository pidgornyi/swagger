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
package com.softcomputer.gene.web.order.insurance;

import org.joda.time.DateTime;

public class InsuranceInfo {
    public InsuranceCarrierInfo carrier;
    public String accountNumber;
    public String groupId;
    public Long position;
    public String comment;
    public PolicyHolderInfo policyHolder;
    public Boolean active;
    public Boolean deleted;
    public Boolean auxCarrierUsed;
    public Integer auxId;
    public String prefix;
    public String memberId;
    public DateTime effectiveDate;
    public DateTime expiryDate;
}
