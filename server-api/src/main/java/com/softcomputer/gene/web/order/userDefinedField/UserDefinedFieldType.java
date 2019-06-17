package com.softcomputer.gene.web.order.userDefinedField;

public enum UserDefinedFieldType {
    NUMERIC("N"),
    CHECK_BOX("B"),
    CHOICE_FIELD("L"),
    USER_DEFINED_CHOICE("A"),
    DATE("D"),
    SHORT_TEXT("S"),
    MULTILINE_TEXT("Z"),
    INSTOTUTIONS("IN"),
    BROWSER("R"),
    MULTI_SELECTION_BROWSER("RM"),
    TQC("TQ"),
    CALCULATED_FIELD("C"),
    RTF("T");

    private final String value;

    UserDefinedFieldType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UserDefinedFieldType fromValue(String v) {
        for (UserDefinedFieldType c: UserDefinedFieldType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

    public boolean in(UserDefinedFieldType... userDefinedFieldTypes) {
        boolean result = false;
        if (userDefinedFieldTypes != null) {
            for (UserDefinedFieldType type: userDefinedFieldTypes) {
                result = type.equals(this);
                if (result) {
                    break;
                }
            }
        }
        return result;
    }
}
