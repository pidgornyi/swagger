package com.softcomputer.gene.web.order.requisition;

public class BaseEntity {
    public long recid;
    public long requisitionId;
    public Operation previousOperation;
    public Operation operation;
    public String operationReason;
    public String operationComment;
    public boolean isOperationPerformed;
    public String itemStatus;
}
