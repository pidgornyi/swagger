package com.softcomputer.gene.web.order.requisition;

import com.softcomputer.gene.web.order.userDefinedField.UserDefinedFieldOwnerType;

public enum Operation {

    NONE("None"),
    UPDATE("Update"),
    REJECT("Reject"),
    UN_REJECT("UnReject"),
    CANCEL("Cancel"),
    ADD("Add"),
    DELETE("Delete"),
    INTERNAL_DELETE("InternalDelete"),
    DISCARD("Discard"),
    REORDERED("Reordered");

    private final String value;

    Operation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Operation fromValue(String v) {
        for (Operation c : Operation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
