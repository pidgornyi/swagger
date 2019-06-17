/*
 * This module is part of the ISD system
 * Copyright (c) SCC Soft Computer, Inc. 2019
 * All Rights Reserved
 *
 * This document contains unpublished, confidential and proprietary
 * information of SCC Soft Computer, Inc. No disclosure or use of
 * any portion of the contents of these materials may be made without the
 * express written consent of Soft Computer Consultants, Inc.
 */

package com.softcomputer.gene.web.order.resultKeypad;

import java.util.List;

public class ResulKeypadItem {
    public String keyCode;
    public String title;
    public String preview;
    public List<ResulKeypadAction> actions;
    public boolean addKeyText;
    public String separator;
    public String separatorManual;
}