package com.softcomputer.gene.web.order.requisition;

import org.joda.time.DateTime;

import java.util.List;

public class Media extends BaseEntity {
    public long caseIdentifier;
    public List<Long> attachedTestsIds;
    public String tubeType;
    public String tubeName;
    public MicType micType;
    public String micCode;
    public DateTime addedDT;
    public String addedTechID;
    public DateTime platedDT;
    public String platedTechID;
    public DateTime generatedDT;
    public String generatedBy;
    public String mediaTubeNumber;
    public long parentMedia;
    public String bodySite;
    public String statusDisp;
    public String status;
    public DateTime mediaStatusDT;
    public String mediaStatusTechID;
    public String barcode;
    public MediaGenerationType generationType;
    public String workupCode;
    public String isolateNumber;
    public String organismCode;
    public String workupStatus;
    public DateTime workupStatusDT;
    public String workupStatusTechID;
    public String microResultEntry;
}
