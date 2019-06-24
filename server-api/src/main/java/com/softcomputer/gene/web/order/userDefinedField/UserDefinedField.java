package com.softcomputer.gene.web.order.userDefinedField;

import java.util.List;

public class UserDefinedField {
    public Long recid;
    public Long orderRecid;
    public String orderNumber;
    public Long patientRecid;
    public UserDefinedFieldSetup fieldSetup;
    public Long requisitionRecid;
    public Long visitRecid;
    public UserDefinedFieldOwnerType ownerType;
    public Long ownerRecid;
    public List<String> testCodeVersions;
    public List<UserDefinedFieldValue> fieldValues;
    public List<UserDefinedField> variations;
}
