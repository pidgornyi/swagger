package com.softcomputer.gene.web.order.orders;

import org.joda.time.DateTime;

import java.util.List;

public class OrderBriefInfo {
    public String recid;
    public String orderNumber;
    public String requisitions;
    public String orderStatus;
    public Clinic orderingClinic;
    public Physician orderingPhysicians;
    public DateTime spesimenCollectedDateTime;
    public DateTime tubeReceivedDateTime;
    public List<Test> orderedTests;
    public List<Tube> orderedTubes;
    public Boolean uncollected;
}
