package com.softcomputer.gene.web.order.requisition;

public enum TestStatus {
    NEW("N", "New"),
    IN_PROCESS("I", "In Process"),
    IN_PROCESS_REV("Y", "In Process"),
    COMPLETED("C", "Completed"),
    RESULTED("E", "Resulted"),
    CANCELLED("R", "Canceled"),
    HOLD("H", "Hold"),
    SIGNOUT("F", "Report Signed out"),
    INCOMPLETED("I", "In Process"),
    SENDOUT("S", "Sent Out"),
    PENDING_FOR_SECOND_ANALYSIS("A", "Pending for Second Analysis"),
    PENDING_FOR_ANALYSISREVIEW("V", "Pending for Analysis Review"),
    PENDING_FOR_INTERPRETATION("J", "Pending for Interpretation"),
    PENDING_FOR_INTERPRETATIONREVIEW("K", "Pending for Interpretation Review"),
    PENDING_FOR_QA("Q", "Pending for QA"),
    PENDING_FOR_SIGNOUT("W", "Pending for Sign Out"),
    INTERPRETATION_IN_PROCESS("L", "Interpretation in Process"),
    PROCESS_AND_HOLD("M", "Process & Hold"),
    REPORT_DEACTIVATED("D", "Report Deactivated"),
    REPORT_RELEASEHOLD("Z", "Report Release Hold"),
    COLLECTED("O", "Collected"),
    IN_LAB("B", "In-Lab"),
    DUPLICATE("X", "Duplicate"),
    MIC_LAB_VERIFIED("P","Completed");

    /**
     * Internal storage of enum string value.
     */
    private final String value;
    private final String description;

    /**
     * Enum constructor for TestStatus.
     * @param value
     */
    private TestStatus(final String value, final String description){
        this.value = value;
        this.description = description;
    }

    /**
     * Current string value stored in the enum.
     * @return string value.
     */
    public String getValue() {
        return this.value;
    }

    public String getDescription()
    {
        return description;
    }

    public static  TestStatus getByValue(String x)  {
        for (TestStatus currentType : TestStatus.values()) {
            if (x.equals(currentType.getValue())) {
                return currentType;
            }
        }
        return null;
    }
}
