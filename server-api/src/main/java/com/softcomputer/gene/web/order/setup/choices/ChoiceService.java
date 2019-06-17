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
package com.softcomputer.gene.web.order.setup.choices;

import java.util.List;

import com.softcomputer.wbc.util.http.CacheControl;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/setup/choices", produces = MediaType.APPLICATION_JSON_VALUE)
@CacheControl(maxAge = 60*60*24, directives = { CacheControl.CacheDirectives.PRIVATE })
public interface ChoiceService {

    /*
     * @return required countries
     */
    @RequestMapping(value = "/countries", method = RequestMethod.GET)
    List<Choice> getCountries();

    /*
     * @return required languages
     */
    @RequestMapping(value = "/languages", method = RequestMethod.GET)
    List<Choice> getLanguages();

    /*
     * @return required relationships to insured
     */
    @RequestMapping(value = "/relation-to-insured", method = RequestMethod.GET)
    List<Choice> getRelationshipsToInsured();

    /*
     * @return required relationships to emergency
     */
    @RequestMapping(value = "/relation-to-emergency", method = RequestMethod.GET)
    List<Choice> getRelationshipsToEmergency();

    /*
     * @return required maritals
     */
    @RequestMapping(value = "/maritals", method = RequestMethod.GET)
    List<Choice> getMaritals();

    /*
     * @return required ethnicities
     */
    @RequestMapping(value = "/ethnicities", method = RequestMethod.GET)
    List<Choice> getEthnicities();

    /*
     * @return required sex
     */
    @RequestMapping(value = "/sex", method = RequestMethod.GET)
    List<Choice> getSex();

    /*
     * @return required races
     */
    @RequestMapping(value = "/races", method = RequestMethod.GET)
    List<Choice> getRaces();

    /*
     * @return required species
     */
    @RequestMapping(value = "/species", method = RequestMethod.GET)
    List<Choice> getSpecies();

    /*
     * @return required religions
     */
    @RequestMapping(value = "/religions", method = RequestMethod.GET)
    List<Choice> getReligions();

    /*
     * @return required patient types
     */
    @RequestMapping(value = "/patient-types", method = RequestMethod.GET)
    List<Choice> getPatientTypes();

    /*
     * @return required admission types
     */
    @RequestMapping(value = "/admission-types", method = RequestMethod.GET)
    List<Choice> getAdmissionTypes();

    /*
     * @return required draw types
     */
    @RequestMapping(value = {"/draw-types"}, method = {RequestMethod.GET})
    List<Choice> getDrawTypes();

    /*
     * @return required proffesional suffixes
     */
    @RequestMapping(value = "/proffesional-suffixes", method = RequestMethod.GET)
    List<Choice> getProffesionalSuffixes();

    /*
     * @return required counties
     */
    @RequestMapping(value = "/counties", method = RequestMethod.GET)
    List<Choice> getCounties();

    /*
     * @return active employment types
     */
    @RequestMapping(value = "/employments", method = RequestMethod.GET)
    List<Choice> getEmployments();

    /*
     * @return active family plan types
     */
    @RequestMapping(value = "/family-plans", method = RequestMethod.GET)
    List<Choice> getFamilyPlans();

    /*
     * @return active payment types
     */
    @RequestMapping(value = "/payments", method = RequestMethod.GET)
    List<Choice> getPayments();
}
