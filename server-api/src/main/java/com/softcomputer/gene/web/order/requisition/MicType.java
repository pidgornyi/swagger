package com.softcomputer.gene.web.order.requisition;

public enum MicType {
    MEDIA("M"),
    ISOLATE("I"),
    PANEL("P"),
    DRUG("D"),
    RAPID_TEST("R"),
    WORKUP("W");

    /**
     * Internal storage of enum string value.
     */
    private final String value;

    /**
     * Enum constructor for MicType.
     * @param value
     */
    private MicType(final String value){
        this.value = value;
    }

    /**
     * Current string value stored in the enum.
     * @return string value.
     */
    public String getValue() {
        return this.value;
    }

    public static MicType getByValue(String x)  {
        for (MicType currentType : MicType.values()) {
            if (x.equals(currentType.getValue())) {
                return currentType;
            }
        }
        return null;
    }
}
