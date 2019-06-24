package com.softcomputer.gene.web.order.medicalNecessity;

public enum MncStatus {
    FAILED("F"),
    FAILED_EXPERIMENTAL("FE"),
    FAILED_FREQUENT("FF"),
    FAILED_STATUTORY("FS"),
    PASSED("P"),
    PROBLEM("E"),
    NOT_REQUIRED("N");

    private final String value;

    MncStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MncStatus fromValue(String v) {
        for (MncStatus c : MncStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
