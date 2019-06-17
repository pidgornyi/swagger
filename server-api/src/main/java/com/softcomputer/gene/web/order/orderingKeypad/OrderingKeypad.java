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
package com.softcomputer.gene.web.order.orderingKeypad;

import java.util.List;

/**
 *
 * @author ibul
 */
public class OrderingKeypad<TSetup>
{
    public String name;
    public TSetup setup;
    public long position;
    public String hotkey;
    public boolean orderable;
    public List<OrderingKeypad> items;
}
