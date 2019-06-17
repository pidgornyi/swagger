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

import java.util.List;

import com.softcomputer.gene.web.order.Dictionary;
import com.softcomputer.gene.web.order.Note;
import com.softcomputer.gene.web.order.insurance.InsuranceInfo;

public class PatientDetailedInfo extends PatientBriefInfo {
    public String phone;
    public Dictionary race;
    public Dictionary species;
    public ContactInfo emergencyContact;
    public InsuranceInfo primaryInsurance;
    public String dvaNumber;
    public String pensionNumber;
    public List<PatientAlert> alerts;
    
    public String comment;
    public List<Note> notes;
}
