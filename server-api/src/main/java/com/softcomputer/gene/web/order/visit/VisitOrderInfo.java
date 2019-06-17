package com.softcomputer.gene.web.order.visit;

import com.softcomputer.gene.web.order.orders.Physician;
import org.joda.time.DateTime;

public class VisitOrderInfo {
    public String orderNumber;
    public String priority;
    public String billingNumber;
    public Physician orderingPhysician;
    public DateTime orderedDT;
    public String orderedTests;
}
