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
package com.softcomputer.gene.web.order.patient;

import java.util.List;

import org.joda.time.LocalDate;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import com.softcomputer.gene.web.order.visit.VisitOrderInfo;
import com.softcomputer.gene.web.order.visit.VisitBriefInfo;
import com.softcomputer.gene.web.order.visit.VisitsBatch;
import com.softcomputer.gene.web.order.requisition.Case;
import com.softcomputer.gene.web.order.orders.ReleasedOrders;
import com.softcomputer.gene.web.order.requisition.PatientRequisitions;


@RestController
@RequestMapping(value = "/patients", produces = MediaType.APPLICATION_JSON_VALUE)
public interface PatientService {

    @RequestMapping(value = "", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
    ProcessPatientResult savePatient(@RequestBody PatientInfo patientsToSave);

    @RequestMapping(value = "/{mrn}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<PatientInfo> getPatientInfo(@PathVariable("mrn") String mrn);

    @RequestMapping(value = "/{mrn}/orders", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    ReleasedOrders getPatientOrders(@PathVariable("mrn") String mrn);

    @RequestMapping(value = "/{mrn}/orders/per-visit", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    List<VisitOrderInfo> getOrdersInfo(@PathVariable("mrn") String mrn);

    @RequestMapping(value = "/{mrn}/requisitions", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    PatientRequisitions getPatientRequisitions(@PathVariable(value = "mrn") String mrn);

    @RequestMapping(value = "/{mrn}/requisitions/initiate", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<Case> initiateRequisition(@PathVariable("mrn") String mrn);

    @RequestMapping(value = "/{mrn}/visits", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    List<VisitBriefInfo> getAllVisits(@PathVariable("mrn") String mrn);

    @RequestMapping(value = "/{mrn}/visits/available", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    List<VisitBriefInfo> getAvailableVisits(@PathVariable("mrn") String mrn);

    @RequestMapping(value = "/{mrn}/visits/{billing}/move", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    Boolean moveVisitToPatient(@PathVariable("mrn") String mrnFrom,
                               @PathVariable("billing") String billing,
                               @RequestParam(value = "mrn", required = true) String mrnTo);

    @RequestMapping(value = "/{mrn}/visits/range", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    VisitsBatch getVisitsRange(@PathVariable("mrn") String mrn,
                               @RequestParam(value = "from", required = false, defaultValue = "0") Integer from,
                               @RequestParam(value = "count", required = false, defaultValue = "10") Integer count);

    @RequestMapping(value = "/{mrn}/visits/count", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    Integer getVisitsCount(@PathVariable("mrn") String mrn);
}
