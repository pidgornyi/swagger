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
import com.softcomputer.gene.web.order.setup.model.*;
import com.softcomputer.gene.web.order.Note;
import com.softcomputer.gene.web.order.insurance.InsuranceInfo;
import org.joda.time.DateTime;

import com.softcomputer.gene.web.order.Dictionary;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;

public class PatientInfo {

    public String id;
    public String lastName;
    public String firstName;
    public String middleName;
    public DateTime dob;
    public DateTime dod;
    public Dictionary maritalStatus;
    public String title;
    public Dictionary ethnicity;
    public String mrn;
    public Dictionary sex;
    public String chartNumber;
    public String suffix;
    public String professionalSuffix;
    public Dictionary language;
    public Dictionary species;
    public Dictionary religion;
    public Dictionary race;
    public Dictionary eso;
    public String ssn;
    public String pensionNumber;
    public String dvaNumber;
    public String comment;
    public List<Note> notes;
    public String room;
    public String bed;
    public DateTime updateDateTime;
    public AddressInfo address;
    public Boolean isPrivate;
    public String clientId;
    public String locationGroupName;
    public ContactInfo emergencyContact;
    public PatientDetailsInfo patientDetails;
    public List<InsuranceInfo> insurances;
    public AssigningInfo mrnAssigningAuthority;
    public AssigningInfo mrnAssigningFacility;
    public AssigningInfo ssnAssigningAuthority;
    public AssigningInfo pensionAssigningAuthority;
    public AssigningInfo dvaAssigningAuthority;
    public List<PatientAlert> alerts;
    public List<Visit> visits; 
    public String patientClient;
    public Boolean isCalculatedDOB;
    public String hcnProvince;
    public String hcnVersion;
    public String externalId;
    public LocalDate registrationDate;
    public Boolean patientUnknownIdentity;
}
