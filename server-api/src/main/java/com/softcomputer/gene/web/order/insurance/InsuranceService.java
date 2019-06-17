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
package com.softcomputer.gene.web.order.insurance;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/insurance", produces = MediaType.APPLICATION_JSON_VALUE)
public interface InsuranceService {

    /**
     *
     * @param mrn - patient mrn
     * @param billin-number - visit billing number
     * @param items-count - limits number of search results
     * @return active insurances from Patient or Visit levels
     */
    @RequestMapping(value = "/patient-insurances", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    List<Insurance> getPatientInsurances(@RequestParam(value = "mrn") String mrn,
                                         @RequestParam(value = "billing-number", required = false) String billingNumber,
                                         @RequestParam(value = "items-count", required = false) Short itemsCount);
}
