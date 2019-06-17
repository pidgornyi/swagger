package com.softcomputer.gene.web.order.userDefinedField;

import java.util.List;

public class UserDefinedFieldSetup {
    public Long recid;
    public String code;
    public String refCode;
    public String name;
    public UserDefinedFieldLevel level;
    public UserChoice userChoice;
    public UserDefinedFieldType fieldType;
    public UserDefinedFieldPromptType promptType;
    public List<String> choices;
    public Double reportableFrom;
    public Double reportableTo;
    public Integer decimalPlaces;
    public String defaultValue;
    public boolean dateTime;
}
