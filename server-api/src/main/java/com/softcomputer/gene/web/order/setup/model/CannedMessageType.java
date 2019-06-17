package com.softcomputer.gene.web.order.setup.model;

public enum CannedMessageType {

    VisitComment("Visit Comment"),
    PatientComment("Patient Comment"),
    InsuranceComment("Insurance Comment"),
    OrderComment("Order Comment"),
    ClinicalInfo("Clinical Info"),
    TubeComment("Tube Comment");


    private final String value;

    CannedMessageType(String v) {this.value = v;}

    public String value() {
        return this.value;
    }

    public static CannedMessageType fromValue(String v) {
        for (CannedMessageType c: CannedMessageType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
