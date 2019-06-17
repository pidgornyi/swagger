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
package com.softcomputer.gene.web.order.requisition;

import java.util.Collection;
import java.util.Set;
import java.util.List;

import com.softcomputer.gene.web.order.insurance.Insurance;
import com.softcomputer.gene.web.order.medicalNecessity.MedicalNecessityItem;
import com.softcomputer.gene.web.order.setup.model.*;
import com.softcomputer.gene.web.order.userDefinedField.UserDefinedField;
import com.softcomputer.gene.web.order.visit.VisitBriefInfo;
import com.softcomputer.gene.web.order.Note;

import com.softcomputer.gene.web.order.patient.PatientDetailedInfo;

public class Case {
    public Long caseIdentifier;
    public List<Long> mergedRequisitionsIds;
    public List<String> mergedRequisitionsNumbers;
    public Long orderId;
    public Long requisitionId;
    public String orderNumber;
    public String foreignAccNumber;
    public String requisitionNumber;
    public RequisitionModeEnum mode;
    public Set<String> parentOrderNumbers;
    public VisitBriefInfo visit;
    public Clinic orderingClinic;
    public Location orderingLocation;
    public Physician orderingPhysician;
    public Collection<Physician> reportToDoctors;
    public String auxNumber;
    public Priority priority;
    public PatientDetailedInfo patient;
    public SpecimenCollectionRequest specimenCollectionRequest;
    public boolean orderingLocationSelectedByDefault;
    public boolean reviewSummaryNeeded;
    public List<Test> testList;
    public List<Specimen> specimenList;
    public List<UserDefinedField> userDefinedFieldList;
    public List<Diagnosis> diagnoses;
    public String comment;
    public String clinicalHistory;
    public List<Note> internalNotes;
    public List<Insurance> insurances;
    public MicComment microCultureComment;
    public List<Antibiotic> micAntibioticList;
    public Employee pathologist;
    public Employee resident;
    public List<Indication> orderLevelIndications;
    public List<TestSpecimenAttach> testSpecimenAttachments;
    public List<MedicalNecessityItem> medicalNecessityItems;
}
