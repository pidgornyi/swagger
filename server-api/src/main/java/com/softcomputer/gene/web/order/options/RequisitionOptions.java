/*
 * This module is part of the SoftGene system
 * Copyright (c) SCC Soft Computer, Inc.  2018
 * All Rights Reserved
 *
 * This document contains unpublished, confidential and proprietary
 * information of SCC Soft Computer, Inc. No disclosure or use of
 * any portion of the contents of these materials may be made without the
 * express written consent of Soft Computer Consultants, Inc.
 *
 */
package com.softcomputer.gene.web.order.options;

import com.softcomputer.wbc.security.options.OptionInfo;
import com.softcomputer.wbc.security.options.OptionType;
import com.softcomputer.wbc.security.options.ValueType;

import java.util.List;

public class RequisitionOptions {
    @OptionInfo(code = "G_REQ_REQ_DR", valueType = ValueType.Boolean, optionType = OptionType.Option)
    public boolean G_REQ_REQ_DR;

    @OptionInfo(code = "G_DEF_REQ_DR", valueType = ValueType.Boolean, optionType = OptionType.Option)
    public boolean G_DEF_REQ_DR;

    @OptionInfo(code = "G_NOT_UPD_ORD_DOC", valueType = ValueType.Boolean, optionType = OptionType.Option)
    public boolean G_NOT_UPD_ORD_DOC;

    @OptionInfo(code = "G_TEST_ORDDR_UPD", valueType = ValueType.Boolean, optionType = OptionType.Option)
    public boolean G_TEST_ORDDR_UPD;

    @OptionInfo(code = "G_DEF_COLBY", valueType = ValueType.Boolean, optionType = OptionType.Option)
    public boolean G_DEF_COLBY;

    @OptionInfo(code = "G_DEF_RECBY", valueType = ValueType.Boolean, optionType = OptionType.Option)
    public boolean G_DEF_RECBY;

    @OptionInfo(code = "G_VALID_COLBY", valueType = ValueType.Boolean, optionType = OptionType.Option)
    public boolean G_VALID_COLBY;

    @OptionInfo(code = "G_DEF_COLDT", valueType = ValueType.String, optionType = OptionType.Option)
    public String G_DEF_COLDT;

    @OptionInfo(code = "G_DEF_RECDT", valueType = ValueType.String, optionType = OptionType.Option)
    public String G_DEF_RECDT;

    @OptionInfo(code = "DateFormatOnScreens", valueType = ValueType.String, optionType = OptionType.Parameter)
    public String DateFormatOnScreens;

    @OptionInfo(code = "TimeFormatOnScreens", valueType = ValueType.String, optionType = OptionType.Parameter)
    public String TimeFormatOnScreens;

    @OptionInfo(code = "G_DEF_COL_EXPECT", valueType = ValueType.Custom, optionType = OptionType.Custom, CustomSetter = SpecimenCollectionScheduleOptionsSetter.class)
    public List<SpecimenCollectionScheduleOption> G_DEF_COL_EXPECT;

    @OptionInfo(code = "G_AUTO_SPEC_LAB", valueType = ValueType.Boolean, optionType = OptionType.Option)
    public boolean G_AUTO_SPEC_LAB;

    @OptionInfo(code = "G_AUTO_MLABEL_SHOW_DLG_OE", valueType = ValueType.Boolean, optionType = OptionType.Option)
    public boolean G_AUTO_MLABEL_SHOW_DLG_OE;

    @OptionInfo(code = "G_DONT_CANCEL_RFLX", valueType = ValueType.Boolean, optionType = OptionType.Option)
    public boolean G_DONT_CANCEL_RFLX;

    // Employees Setup - B (default), Phlebotomists setup - P, Security Users Setup - S
    @OptionInfo(code = "G_VAL_PLATE_BY", valueType = ValueType.String, optionType = OptionType.Option)
    public String G_VAL_PLATE_BY;

    @OptionInfo(code = "G_DEF_PLATETECH", valueType = ValueType.Boolean, optionType = OptionType.Option)
    public boolean G_DEF_PLATETECH;

    @OptionInfo(code = "G_DEF_PLATEDATE", valueType = ValueType.Boolean, optionType = OptionType.Option)
    public boolean G_DEF_PLATEDATE;

    @OptionInfo(code = "G_DEF_PLATETIME", valueType = ValueType.Boolean, optionType = OptionType.Option)
    public boolean G_DEF_PLATETIME;

    @OptionInfo(code = "G_AE_FILTER_NON_ACCEPTABLE", valueType = ValueType.Boolean, optionType = OptionType.Option)
    public boolean G_AE_FILTER_NON_ACCEPTABLE;

    @OptionInfo(code = "G_AE_SOURCE_MIC", valueType = ValueType.Custom, optionType = OptionType.Custom, CustomSetter = MicroSourceGroupRuleSetter.class)
    public String G_AE_SOURCE_MIC;
    
    @OptionInfo(code = "UsedWordInsteadOfDuplicate", valueType = ValueType.String, optionType = OptionType.Parameter)
    public String UsedWordInsteadOfDuplicate;

    @OptionInfo(code = "CheckMedicalNecessity", valueType = ValueType.Boolean, optionType = OptionType.Parameter)
    public boolean CheckMedicalNecessity;
}
