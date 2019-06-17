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

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/options", produces = MediaType.APPLICATION_JSON_VALUE)
public interface OptionsService {

    @RequestMapping(value = "/order-entry", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    RequisitionOptions getRequisitionOptions();

    @RequestMapping(value = "/patient-maintenance", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    PatientMaintenanceOptions getPatientMaintenanceOptions();
}
