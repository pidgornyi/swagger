package com.softcomputer.gene.web.order.requisition;

import com.softcomputer.gene.web.api.common.CodedEntity;
import com.softcomputer.gene.web.order.setup.model.Priority;
import org.joda.time.DateTime;

import java.util.List;

public class Specimen extends BaseEntity {
    public long caseIdentifier;
    public Long collectionPlace;
    public String type;
    public String typeName;
    public DateTime collectedDate;
    public String collectedBy;
    public DateTime receivedDate;
    public String receivedBy;
    public String status;
    public Priority priority;
    public List<Tube> tubeList;
    public String drawType;
    public String drawTypeName;
    public String labToCollect;
    public String bodySite;
    public String bodySiteName;
    public Boolean isToBeCollectedDate;
    public Boolean isCollected;
    public Boolean isGeneric;
    public Double collectedVolume;
    public String collectedUnit;
    public CodedEntity collectionLocation;
    public CodedEntity drawTypeData;
}
