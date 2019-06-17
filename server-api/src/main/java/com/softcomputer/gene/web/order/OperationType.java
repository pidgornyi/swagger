package com.softcomputer.gene.web.order;

public enum OperationType {
    NONE("NONE"),
    UPDATE("UPDATE"),
    ADD("ADD"),
    DELETE("DELETE");

    /**
     * Internal storage of enum string value.
     */
    private final String value;

    /**
     * Enum constructor for OperationType.
     * @param value
     */
    private OperationType(final String value){
        this.value = value;
    }

    /**
     * Current string value stored in the enum.
     * @return string value.
     */
    public String getValue() {
        return this.value;
    }

    public static OperationType getByValue(String x)  {
        for (OperationType currentType : OperationType.values()) {
            if (x.equals(currentType.getValue())) {
                return currentType;
            }
        }
        return null;
    }
}
