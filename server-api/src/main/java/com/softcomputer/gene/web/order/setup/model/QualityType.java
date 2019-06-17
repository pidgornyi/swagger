package com.softcomputer.gene.web.order.setup.model;

public enum QualityType {
    TubeQuality("T"),
    SpecimenQuality("N"),
    RequisitionQuality("Q"),
    MediaQuality("M");


    private final String value;

    QualityType(String v) {this.value = v;}

    public String value() {
        return this.value;
    }

    public static QualityType fromValue(String v) {
        for (QualityType c: QualityType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
