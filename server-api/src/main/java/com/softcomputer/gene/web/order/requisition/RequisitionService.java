/*
 * This module is part of the SoftGene system
 * Copyright (c) SCC Soft Computer, Inc.  2019
 * All Rights Reserved
 *
 * This document contains unpublished, confidential and proprietary
 * information of SCC Soft Computer, Inc. No disclosure or use of
 * any portion of the contents of these materials may be made without the
 * express written consent of Soft Computer Consultants, Inc.
 *
 */
package com.softcomputer.gene.web.order.requisition;

import com.softcomputer.gene.web.order.orders.OrderDetailedInfo;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@RestController
@RequestMapping(value = "/requisitions", produces = MediaType.APPLICATION_JSON_VALUE)
public interface RequisitionService {

    @RequestMapping(value = "/preprocess", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    ProcessResult preprocessRequisition(@RequestBody Case dtoRequisition);

    @RequestMapping(value = "/release", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
    OperationResult release(@RequestBody Case[] requisitionList);

    @RequestMapping(value = "", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
    ProcessResult save(@RequestBody Case dtoRequisition);

    @RequestMapping(value = "/merge", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    ProcessResult mergeRequisitions(@RequestBody RequisitionPart[] requisitionsParts);

    @RequestMapping(value = "/{number}/details", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    OrderDetailedInfo getRequisitionDetailedInfo(@PathVariable("number") String number);
}
