package com.softcomputer.gene.web.order.userDefinedField;

public enum UserDefinedFieldOwnerType {
    PATIENT("P"),
    ORDER("O"),
    REQUISITION("R"),
    REQUISITION_PATIENT("RP"),
    SPECIMEN("S"),
    REQUISITION_SPECIMEN("RS"),
    VISIT("V"),
    REQUISITION_VISIT("RV"),
    TEST("T"),
    REQUISITION_TEST("RT");

    private final String value;

    UserDefinedFieldOwnerType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UserDefinedFieldOwnerType fromValue(String v) {
        for (UserDefinedFieldOwnerType c: UserDefinedFieldOwnerType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
