package com.softcomputer.gene.web.order.userDefinedField;

public enum UserDefinedFieldLevel {
    TEST("T"),
    ORDER("O");

    private final String value;

    UserDefinedFieldLevel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UserDefinedFieldLevel fromValue(String v) {
        for (UserDefinedFieldLevel c: UserDefinedFieldLevel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
