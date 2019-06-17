package com.softcomputer.gene.web.order.medicalNecessity;

import com.softcomputer.gene.web.order.insurance.Insurance;
import com.softcomputer.gene.web.order.setup.model.Diagnosis;

import java.util.List;

public class MedicalNecessity {
    public List<Insurance> insurances;
    public String usedPayor;
    public List<MedicalNecessityItem> medicalNecessityItems;
    public List<Diagnosis> orderLevelDiagnoses;
    public String patientType;
    public List<String> warnings;
}
