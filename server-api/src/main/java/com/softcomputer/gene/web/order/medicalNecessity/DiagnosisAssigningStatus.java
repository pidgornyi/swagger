package com.softcomputer.gene.web.order.medicalNecessity;

public enum DiagnosisAssigningStatus {
    DIAGNOSIS_ASSIGNED_BY_USER("U"),
    DIAGNOSIS_ASSIGNED_BY_SOFT_COMPLIANCE("C");

    private final String value;

    DiagnosisAssigningStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DiagnosisAssigningStatus fromValue(String v) {
        for (DiagnosisAssigningStatus c : DiagnosisAssigningStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
