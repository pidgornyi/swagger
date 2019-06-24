/*
 *   This module is part of the SoftGene system
 *    Copyright (c) SCC Soft Computer, Inc.  2019
 *    All Rights Reserved
 *
 * This document contains unpublished, confidential and proprietary
 * information of SCC Soft Computer, Inc. No disclosure or use of
 * any portion of the contents of these materials may be made without the
 * express written consent of Soft Computer Consultants, Inc.
 */
package com.softcomputer.gene.web.order.orders;

import com.softcomputer.gene.web.order.requisition.Case;
import com.softcomputer.gene.web.order.requisition.OperationResult;
import com.softcomputer.gene.web.order.requisition.ProcessResult;
import com.softcomputer.gene.web.order.requisition.testRedirection.Order;
import com.softcomputer.gene.web.order.requisition.testRedirection.TestRedirectionData;
import com.softcomputer.gene.web.order.visit.ResultOperation;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping(value = "/orders", produces = MediaType.APPLICATION_JSON_VALUE)
public interface OrderService {

    @RequestMapping(value = "", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
    OperationResult save(@RequestBody Case dtoOrder);

    @RequestMapping(value = "/preprocess", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    ProcessResult preprocessOrder(@RequestBody Case dtoRequisition);

    @RequestMapping(value = "/{number}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<ProcessResult> openOrder(@PathVariable("number") String number);

    @RequestMapping(value = "/{number}/details", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    OrderDetailedInfo getOrderDetailedInfo(@PathVariable("number") String number);

    @RequestMapping(value = "/{number}/move", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    ResultOperation orderMoveToVisit(@PathVariable("number") String number,
                                     @RequestParam(value = "billing") String billingNumber);

    @RequestMapping(value = "/redirect-tests", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    com.softcomputer.gene.web.order.requisition.testRedirection.Order redirectTests(@RequestBody com.softcomputer.gene.web.order.requisition.testRedirection.Order testRedirectionOrder);
}


