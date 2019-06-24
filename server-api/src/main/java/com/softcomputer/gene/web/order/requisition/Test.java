package com.softcomputer.gene.web.order.requisition;

import com.softcomputer.gene.web.order.setup.model.Diagnosis;
import com.softcomputer.gene.web.order.setup.model.Physician;
import com.softcomputer.gene.web.order.setup.model.Priority;

import java.util.Collection;
import java.util.List;

public class Test extends BaseEntity{
    public long caseIdentifier;
    public String testCode;
    public String testName;
    public String testCodeVersion;
    public TestType testType;
    public TestStatus testStatus;
    public Integer extensionNumber;
    public String performingDepartmentCode;
    public String performingWorkstationCode;
    public Long parentId;
    public List<Test> components;
    public String parentOrderNumber;
    public boolean isCancelled;
    public String cancellationReason;
    public String cancellationComment;
    public Priority testPriority;
    public Collection<Physician> reportToDoctors;
    public Collection<Physician> orderingDoctors;
    public Long position;
    public Long duplicationTest;
    public Long absorptionTest;
    public boolean parentSwapped;
    public Long reflexPanel;
    public Long requisitionReflexPanel;
    public String systemType;
    public String micReflexStatus;
    public String cancelBy;
    public List<Indication> testLevelIndications;
    public List<Media> mediaList;
    public List<Diagnosis> diagnoses;
    public Long redirectionTest;
}
