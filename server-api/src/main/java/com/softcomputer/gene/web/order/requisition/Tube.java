package com.softcomputer.gene.web.order.requisition;

import org.joda.time.DateTime;

import java.util.List;

import com.softcomputer.gene.web.api.common.CodedEntity;

public class Tube extends BaseEntity {
    public long caseIdentifier;
    public long reqTubeId;
    public String tubeType;
    public String tubeName;
    public List<Tube> aliquotes;
    public Long destinationDepId;
    public String destinationDepCode;
    public String currentDepCode;
    public String requestingDepCode;
    public String allRequestingDepCodes;
    public String protocol;
    public String plannedBy;
    public String routingProtocol;
    public String firstAction;
    public List<Long> attachedTestsIds;
    public List<Quality> qualities;
    public String comment;
    public String instruction;
    public Double capacity;
    public String temperature;
    public String status;
    public DateTime receivedDate;
    public String receivedBy;
    public String alqParentId;
    public String alqIsPlanned;
    public String lastActionCode;
    public Boolean isRecollect;
    public String barcode;
    public Boolean isLabelPrinted;
    public String unit;
    public String externalNumber;
    public Double initialVolume;
    // Collection instructions from all tests current tube
    public  List<CodedEntity> collectionInstructions;
}




