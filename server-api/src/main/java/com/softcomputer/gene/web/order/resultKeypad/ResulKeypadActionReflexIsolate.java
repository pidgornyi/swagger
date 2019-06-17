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

import java.util.Collections;
import java.util.List;

public class ResulKeypadActionReflexIsolate extends ResulKeypadAction {
    public String organism;
    public String comment;
    public String quantitation;
    public String workupCode;
    public String workupName;
    public String workupComment;
    public String cannedMsg;
    public String workupCannedMsg;
    public String quantCannedMsg;
    public List<PanelItem> KbPanels = Collections.emptyList();
    public List<PanelItem> BpPanels = Collections.emptyList();
    public List<PanelItem> MicPanels = Collections.emptyList();
    public List<PanelItem> IdPanels = Collections.emptyList();
}
