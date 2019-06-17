package com.softcomputer.gene.web.order.orders;


import java.util.List;
import org.joda.time.LocalDate;

public class OrderDetailedInfo {

    public String orderNumber;
    public boolean standing;
    public String requisitionId;
    public LocalDate orderedDttm;
    public String priority;
    public String status;
    public String orderingPhysician;
    public String orderingLocation;
    public String enteredBy;
    public List<OrderedTestDetailedInfo> tests;
    public String priorityName;
    public String orderingPhysicianName;
    public String orderingLocationName;
    public String enteredByName;
    public String requisitionNumbers;
    public String auxNumber;
    public String clinicCode;
    public String clinicName;
    public String billingNumber;
}
