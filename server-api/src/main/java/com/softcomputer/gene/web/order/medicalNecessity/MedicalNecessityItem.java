package com.softcomputer.gene.web.order.medicalNecessity;

import com.softcomputer.gene.web.order.setup.model.Diagnosis;

import java.math.BigDecimal;
import java.util.List;

public class MedicalNecessityItem {
    public Long recid;
    public String test;
    public List<String> childTests;
    public String billableTest;
    public String billableTestName;
    public int itemsCount;
    public String usedPayor;
    public MncStatus mncStatus;
    public AbnStatus abnStatus;
    public String performingDepartmentCode;
    public String performingLaboratory;
    public String performingLaboratoryName;
    public Diagnosis[] testLevelDiagnoses = new Diagnosis[4];
    public DiagnosisAssigningStatus diagnosisAssigningStatus;
    public List<Modifier> modifiers;
    public BigDecimal price;
    public String cptCode;
}