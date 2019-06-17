package com.softcomputer.gene.web.order.requisition;

public class ProblemInfo {
    public String system;

    /* SoftGene order number. It can be empty when order
     * 						wasn't created. */
    public String orderNumber;

    /* Problem description. (Required) */
    public String problem;

    /* Is problem critical. Critical problems interrupt
     * 						request processing.
     * 						(Required) */
    public boolean critical;

    /* Problem id(Needed only for portal) */
    public String problemId;
}
