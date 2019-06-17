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
package com.softcomputer.gene.web.order.setup;

import java.util.List;

import com.softcomputer.gene.web.order.insurance.InsuranceCarrierInfo;
import com.softcomputer.gene.web.order.insurance.InsuranceGroup;
import com.softcomputer.gene.web.order.orderingKeypad.OrderingKeypad;
import com.softcomputer.gene.web.order.requisition.Quality;
import com.softcomputer.gene.web.order.resultKeypad.ResulKeypad;
import com.softcomputer.gene.web.order.setup.model.*;
import com.softcomputer.gene.web.order.setup.model.callrequest.Recipient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.softcomputer.wbc.util.http.CacheControl;

@RestController
@RequestMapping(value = "/setup", produces = MediaType.APPLICATION_JSON_VALUE)
@CacheControl(maxAge = 60*5, directives = { CacheControl.CacheDirectives.PRIVATE })
public interface SetupService {

    /**
     * @param value - free text criteria
     * @param itemsCount - limits number of search results
     * @return active clinics where any part of code or name corresponds to the given free text criteria
     */
    @RequestMapping(value = "/clinics", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    List<Clinic> getClinics(    @RequestParam(value = "value", required = false) String value,
                                @RequestParam(value = "code", required = false) String code,
                                @RequestParam(value = "itemsCount", defaultValue = "20") Short itemsCount);

    /**
     * @param clinicSearchCriteria - clinic code/name search criteria
     * @param itemsCount - limits number of search results
     * @return extramural or outreach clinics witch suit search criteria
     */
    @RequestMapping(value = "/patient-clients", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    List<Clinic> getPatientClients(@RequestParam(value = "value", required = false) String clinicSearchCriteria,
                                   @RequestParam(value = "itemsCount", defaultValue = "20") Short itemsCount);

    /**
     * @param clinicSearchCriteria - clinic code/name search criteria
     * @param attendingDoctorCode - attending doctor code to narrow clinic choice
     * @param patientClientCode - extramural or outreach clinic set on patient 
     * @param itemsCount - limits number of search results
     * @return clinics by att doc and code/name criteria, if doc is not set - returns all clinics by code/name
     */
    @RequestMapping(value = "/visit-clinics", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    List<Clinic> getClinicsAvailableForVisit(
                                   @RequestParam(value = "value", required = false) String clinicSearchCriteria,
                                   @RequestParam(value = "attDoc", required = false) String attendingDoctorCode,
                                   @RequestParam(value = "patientClient", required = false) String patientClientCode,
                                   @RequestParam(value = "itemsCount", defaultValue = "20") Short itemsCount);

    /**
     * @param value - free text criteria
     * @param itemsCount - limits number of search results
     * @param clinicCode - clinic code to filter attending doctors, full match
     * @param roleCode - doctor role code, full match
     * @return active physicians where any part of code or name corresponds to the given free text criteria
     */
    @RequestMapping(value = "/physicians", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    List<Physician> getPhysicians(      @RequestParam(value = "value", required = false) String value,
                                        @RequestParam(value = "code", required = false) String code,
                                        @RequestParam(value = "clinic", required = false) String clinicCode,
                                        @RequestParam(value =  "role", required = false) String roleCode,
                                        @RequestParam(value = "itemsCount", defaultValue = "20") Short itemsCount);

    /**
     * @param value  - free text criteria
     * @param itemsCount - limits number of search results
     * @return active diagnoses where any part of code or name corresponds to the given free text criteria
     */
    @RequestMapping(value = "/diagnoses", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    List<Diagnosis> getDiagnoses(       @RequestParam(value = "value", required = false) String value,
                                        @RequestParam(value = "itemsCount", defaultValue = "20") Short itemsCount);

    /**
     * @param code_or_name - free text criteria. It is a part of Insurance Carrier code or name.
     * @param itemsCount - limits number of search results
     * @return a list of InsuranceCarrierInfo objects that have only 'code' and 'name' fields.
     */
    @RequestMapping(value = "/insurancecarriers", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    List<InsuranceCarrierInfo> getInsurances(   @RequestParam(value = "code_or_name", required = false) String codeOrName,
                                                @RequestParam(value = "itemsCount", defaultValue = "20") Short itemsCount);

    /**
     * @param value     - free text criteria
     * @param testTypes - types of tests for filtering
     * @return active testDefinitions where any part of ID or name corresponds to the given free text criteria
     */
    @RequestMapping(value = "/testdefinitions", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    List<TestDefinition> getTestDefinitions(@RequestParam(value = "value", required = false) String value,
                                            @RequestParam(value = "testTypes", required = false) String[] testTypes);

    /**
     * @param value     - free text criteria
     * @param itemsCount - count of records to return
     * @return active indications
     */
    @RequestMapping(value = "/indications", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    List<IndicationSetup> getIndications(@RequestParam(value = "value", required = false) String value,
                                         @RequestParam(value = "primary", required = false) Boolean primary,
                                         @RequestParam(value = "itemsCount", defaultValue = "20") Short itemsCount);

    /**
     * @param value - free text criteria
     * @param itemsCount - limits number of search results
     * @return active priorities
     */
    @RequestMapping(value = "/priorities", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    List<Priority> getPriorities(   @RequestParam(value = "value", required = false) String value,
                                    @RequestParam(value = "itemsCount", defaultValue = "20") Short itemsCount);

    /**
     * @param value - free text criteria
     * @param itemsCount - limits number of search results
     * @return bodysites
     */
    @RequestMapping(value = "/body-sites", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    List<BodySite> getBodySites(@RequestParam(value = "value", required = false) String value,
                                @RequestParam(value = "itemsCount", defaultValue = "20") Short itemsCount);

    /**
     * @param value - specimen code or name
     * @param itemsCount - limits number of search results
     * @return  a list of specimens where any part of code or name corresponds to the given value
     */
    @RequestMapping(value = "/specimens", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    List<Specimen> getSpecimens(@RequestParam(value = "value", required = false) String value,
                                @RequestParam(value = "itemsCount", defaultValue = "20") Short itemsCount);

    /**
     * @param categories - choice codes, can be empty
     * @return  - returns correspond reasons for categories. If category is empty return all reasons
     */
    @RequestMapping(value = "/reasons", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    List<Reason> getReasons(@RequestParam(value = "categories", required = false) List<String> categories);

    /**
     * @param test-code-versions - test code versions
     * @return a list of test code versions with preferable, acceptable specimens and tubes.
     */
    @RequestMapping(value = "/test-sources", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    List<TestSources> getTestSources(@RequestParam(value = "test-code-versions") String[] values);

    /**
     * @param codeOrName - free text criteria. It is a part of Insurance Carrier code or name.
     * @param itemsCount - limits number of search results
     */
    @RequestMapping(value = "/micro-medias", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    List<MicroMedia> getGetMicroMedias(@RequestParam(value = "code_or_name", required = false) String codeOrName,
                                       @RequestParam(value = "itemsCount", defaultValue = "20") Short itemsCount);

    /**
     * @param codeOrName - free text criteria. It is a part of Drug code or name.
     * @param itemsCount - limits number of search results
     */
    @RequestMapping(value = "/drugs", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    List<Drug> getDrugs(@RequestParam(value = "code_or_name", required = false) String codeOrName,
                        @RequestParam(value = "itemsCount", defaultValue = "20") Short itemsCount);

    /**
     *
     * @param requestingDoctorKeypad Requisition requestng doctor keypad code
     * @param clinicKeypad Requisition clinic keypad code
     * @return List of tests ordering keypads
     */

    @RequestMapping(value = "/test-ordering-keypads", method = RequestMethod.GET)
    List<OrderingKeypad<TestDefinition>> getTestOrderingKeypad(
            @RequestParam(value = "dcKeypad", required = false) String requestingDoctorKeypad,
            @RequestParam(value = "clKeypad", required = false) String clinicKeypad);

    /**
     *
     * @param requestingDoctorKeypad Requisition requestng doctor keypad code
     * @param clinicKeypad Requisition clinic keypad code
     * @return List of specimens ordering keypads
     */

    @RequestMapping(value = "/specimen-ordering-keypads", method = RequestMethod.GET)
    List<OrderingKeypad<Specimen>> getSpecimenOrderingKeypad(
            @RequestParam(value = "dcKeypad", required = false) String requestingDoctorKeypad,
            @RequestParam(value = "clKeypad", required = false) String clinicKeypad);

    /**
     * @param value - free text criteria
     * @param itemsCount - limits number of search results
     * @return Recipients for call request
     */
    @RequestMapping(value = "/call-request-recipients", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    List<Recipient> getCallRequestRecipients(@RequestParam(value = "value", required = true) String value,
                                             @RequestParam(value = "itemsCount", defaultValue = "20") Short itemsCount);

    /**
     * @param value - free text criteria
     * @param type - Quality type
     * @return List of qualities
     */
    @RequestMapping(value = "/qualities", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    List<Quality> getQualities(@RequestParam(value = "value", required = true) String value,
                               @RequestParam(value = "type", required = true) QualityType type);

    /**
     * @param specType - specimen type, can be empty
     * @return - bodySite result ResulKeypad
     */
    @RequestMapping(value = "/bodysite-result-keypad", method = RequestMethod.GET)
    ResulKeypad getBodySiteKeypad(@RequestParam(value = "specType", required = true) String specType);

    /**
     * @return active insurance groups
     */
    @RequestMapping(value = "/insurance-groups", method = RequestMethod.GET)
    List<InsuranceGroup> getInsuranceGroups();
}
