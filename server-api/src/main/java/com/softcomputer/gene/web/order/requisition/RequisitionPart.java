package com.softcomputer.gene.web.order.requisition;

import org.joda.time.DateTime;

import java.util.List;

public class RequisitionPart {
    public Long requisitionId;
    public Long requisitionGroupId;
    public String requisitionNumber;
    public String orderingClinicCode;
    public String orderingClinicName;
    public String orderingPhysicianCode;
    public String orderingPhysicianName;
    public String billing;
    public List<RequisitionTestBriefInfo> orderedTests;
    public List<RequisitionSpecBriefInfo> orderedSpecimens;
    public DateTime toBeCollectedDateTime;
    public boolean pinned;
    public String orderingLocation;
    public String patientType;
}
