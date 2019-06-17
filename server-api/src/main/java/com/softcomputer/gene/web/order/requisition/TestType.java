package com.softcomputer.gene.web.order.requisition;

public enum TestType {
    ANALISIS("A"),
    ANALYTE("N"),
	STAIN("S"),
	PROBE("B"),
	CULTURE_REQUEST("C"),
	PANEL("P"),
	SEND_OUT("O"),
	GROUP("G"),
	PROCESSING_ONLY("R"),
	MARKER("M"),
	SUPERPANEL("U"),
	MARKERSET("K"),
	RESULT_ELEMENT("E"),
	DIFFERENTIAL("D"),
	ARRAY("Y"),
	CLINICAL("CLINICAL"),
	ICR("ICR"),
	MICROBIOLOGY("MICROBIOLOGY"),
	MIC_PANEL("MIC_PANEL");

    /**
     * Internal storage of enum string value.
     */
    private final String value;

    /**
     * Enum constructor for TestType.
     * @param value
     */
    private TestType(final String value){
        this.value = value;
    }

    /**
     * Current string value stored in the enum.
     * @return string value.
     */
    public String getValue() {
        return this.value;
    }

    public static TestType getByValue(String x)  {
        for (TestType currentType : TestType.values()) {
            if (x.equals(currentType.getValue())) {
                return currentType;
            }
        }
        return null;
    }
}
