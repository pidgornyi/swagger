package com.softcomputer.gene.web.order.medicalNecessity;

public enum  AbnStatus {
    TO_PRINT("T"),
    NOT_REQUIRED("N"),
    PRINTED("P");

    private final String value;

    AbnStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AbnStatus fromValue(String v) {
        for (AbnStatus c : AbnStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
