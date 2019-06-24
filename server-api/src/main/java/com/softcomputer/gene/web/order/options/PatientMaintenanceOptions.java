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

public class PatientMaintenanceOptions {
    @OptionInfo(code = "G_DOB_HOUR_MIN", valueType = ValueType.Boolean, optionType = OptionType.Option)
    public boolean G_DOB_HOUR_MIN;

    @OptionInfo(code = "G_OE_PAT_SEC_ID", valueType = ValueType.Boolean, optionType = OptionType.Option)
    public boolean G_OE_PAT_SEC_ID;

    @OptionInfo(code = "G_OE_PAT_CLIENT", valueType = ValueType.Boolean, optionType = OptionType.Option)
    public boolean G_OE_PAT_CLIENT;

    @OptionInfo(code = "G_OE_SRCH_PAT_EXT_ID", valueType = ValueType.Boolean, optionType = OptionType.Option)
    public boolean G_OE_SRCH_PAT_EXT_ID;

    @OptionInfo(code = "G_PRE_MRN", valueType = ValueType.String, optionType = OptionType.Option)
    public String G_PRE_MRN;

    @OptionInfo(code = "G_REQ_PAT_NAME", valueType = ValueType.String, optionType = OptionType.Option)
    public String G_REQ_PAT_NAME;

    @OptionInfo(code = "G_DOB_REQ", valueType = ValueType.String, optionType = OptionType.Option)
    public String G_DOB_REQ;

    @OptionInfo(code = "G_PRE_BILLING", valueType = ValueType.String, optionType = OptionType.Option)
    public String G_PRE_BILLING;

    @OptionInfo(code = "G_REQ_ADM_PHYS", valueType = ValueType.Boolean, optionType = OptionType.Option, isGlobal = true)
    public boolean G_REQ_ADM_PHYS;

    @OptionInfo(code = "G_AE_DEF_EMPTYDOC", valueType = ValueType.String, optionType = OptionType.Option, isGlobal = true)
    public String G_AE_DEF_EMPTYDOC;

    @OptionInfo(code = "G_ALLOW_EDIT_MED_SERVICE", valueType = ValueType.Boolean, optionType = OptionType.Option, isGlobal = true)
    public boolean G_ALLOW_EDIT_MED_SERVICE;

    @OptionInfo(code = "G_LOWERCASE_PAT", valueType = ValueType.Boolean, optionType = OptionType.Option)
    public boolean G_LOWERCASE_PAT;

    @OptionInfo(code = "G_REQ_ATT_PHYS", valueType = ValueType.Boolean, optionType = OptionType.Option, isGlobal = true)
    public boolean G_REQ_ATT_PHYS;

    @OptionInfo(code = "G_PARTIAL_SSN", valueType = ValueType.Boolean, optionType = OptionType.Option)
    public boolean G_PARTIAL_SSN;

    @OptionInfo(code = "HCNTitle", valueType = ValueType.Boolean, optionType = OptionType.Parameter)
    public boolean HCNTitle;

    @OptionInfo(code = "EthnicityAsEthnicGroup", valueType = ValueType.Boolean, optionType = OptionType.Parameter)
    public boolean EthnicityAsEthnicGroup;

    @OptionInfo(code = "EnterNewMRN", valueType = ValueType.Boolean, optionType = OptionType.Parameter)
    public boolean EnterNewMRN;

    @OptionInfo(code = "Multiethnicity", valueType = ValueType.Boolean, optionType = OptionType.Parameter)
    public boolean Multiethnicity;

    @OptionInfo(code = "EnterNewBillNum", valueType = ValueType.Boolean, optionType = OptionType.Parameter)
    public boolean EnterNewBillNum;

    @OptionInfo(code = "CanEditChartNumber", valueType = ValueType.Boolean, optionType = OptionType.Parameter)
    public boolean CanEditChartNumber;

    @OptionInfo(code = "CheckSumUsedInAcc", valueType = ValueType.Boolean, optionType = OptionType.Parameter, isGlobal = true)
    public boolean CheckSumUsedInAcc;

    @OptionInfo(code = "SSNMask", valueType = ValueType.String, optionType = OptionType.Parameter)
    public String SSNMask;

    @OptionInfo(code = "TimeFormatOnScreens", valueType = ValueType.String, optionType = OptionType.Parameter)
    public String TimeFormatOnScreens;

    @OptionInfo(code = "DateFormatOnScreens", valueType = ValueType.String, optionType = OptionType.Parameter)
    public String DateFormatOnScreens;

    @OptionInfo(code = "AgeInDaysNum", valueType = ValueType.Number, optionType = OptionType.Parameter)
    public Integer AgeInDaysNum;

    @OptionInfo(code = "AgeInMonthsNum", valueType = ValueType.Number, optionType = OptionType.Parameter)
    public Integer AgeInMonthsNum;

    @OptionInfo(code = "AgeInWeeksNum", valueType = ValueType.Number, optionType = OptionType.Parameter)
    public Integer AgeInWeeksNum;

    @OptionInfo(code = "PhoneMask", valueType = ValueType.String, optionType = OptionType.Parameter)
    public String PhoneMask;

    @OptionInfo(code = "StateMask", valueType = ValueType.String, optionType = OptionType.Parameter)
    public String StateMask;

    @OptionInfo(code = "ProvinceTitle", valueType = ValueType.Boolean, optionType = OptionType.Parameter)
    public boolean ProvinceTitle;

    @OptionInfo(code = "ProvinceMask", valueType = ValueType.String, optionType = OptionType.Parameter)
    public String ProvinceMask;

}
