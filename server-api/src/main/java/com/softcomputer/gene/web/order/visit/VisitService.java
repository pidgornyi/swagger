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
package com.softcomputer.gene.web.order.visit;

import java.util.List;

import com.softcomputer.gene.web.order.patient.Visit;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping(value = "/visits", produces = MediaType.APPLICATION_JSON_VALUE)
public interface VisitService {

    @RequestMapping(value = "/{billing}/header", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    VisitHeader getSingleVisitHeader(@PathVariable("billing") String billingNumber);

    @RequestMapping(value = "/{billing}/merge", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    Boolean mergeVisits(@PathVariable("billing") String visitBillFrom,
                        @RequestParam(value = "billing", required = true) String visitBillTo);


}
