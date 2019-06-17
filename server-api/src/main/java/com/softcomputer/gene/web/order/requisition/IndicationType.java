package com.softcomputer.gene.web.order.requisition;

public enum IndicationType {
    PRIMARY("P"),
    ADDITIONAL("A");

    private final String value;

    private IndicationType(final String value){
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

    public static IndicationType getByValue(String x)  {
        for (IndicationType currentType : IndicationType.values()) {
            if (x.equals(currentType.getValue())) {
                return currentType;
            }
        }
        return null;
    }
}
