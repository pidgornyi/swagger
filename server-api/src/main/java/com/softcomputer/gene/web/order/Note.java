/*
 *   This module is part of the SoftGene system
 *    Copyright (c) SCC Soft Computer, Inc.  2016
 *    All Rights Reserved
 * 
 * This document contains unpublished, confidential and proprietary
 * information of SCC Soft Computer, Inc. No disclosure or use of
 * any portion of the contents of these materials may be made without the
 * express written consent of Soft Computer Consultants, Inc.
 */
package com.softcomputer.gene.web.order;

import org.joda.time.DateTime;

/**
 * Usually used as (sorted) array.
 * @author mzav
 */
public class Note
{
    /**
     * Note's ID
     */
    public Long recid;

    /**
     * Note's text
     */
    public String text;
    
    /**
     * Date when entered
     */
    public DateTime at;
    
    /**
     * Note's author.
     */
    public String by;

    /**
     * Is note active
     */
    public boolean active;

    /**
     * Type of note owner
     */
    public String ownerType;

    /**
     * Requested from value
     */
    public String requestedFrom;

    // TODO change type to OperationType
    /**
     * Operation
     */
    public String operation;
}
