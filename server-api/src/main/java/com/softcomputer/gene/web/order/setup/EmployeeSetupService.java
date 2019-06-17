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

import com.softcomputer.gene.web.order.setup.model.Employee;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/setup/employees", produces = MediaType.APPLICATION_JSON_VALUE)
public interface EmployeeSetupService {

     /**
     * @param value - employee code, firstName or lastName
     * @param itemsCount - limits number of search results
     * @return - a list of collecting employees
     */
    @RequestMapping(value = "/collectors", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    List<Employee> getCollectingEmployees(@RequestParam(value = "value", required = false) String value,
                                          @RequestParam(value = "itemsCount", defaultValue = "20") Short itemsCount);

     /**
     * @param value - employee code, firstName or lastName
     * @param itemsCount - limits number of search results
     * @return - a list of receiving employees
     */
    @RequestMapping(value = "/receivers", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    List<Employee> getReceivingEmployees(@RequestParam(value = "value", required = false) String value,
                                         @RequestParam(value = "itemsCount", defaultValue = "20") Short itemsCount);

     /**
     * @param value - employee code, firstName or lastName
     * @param itemsCount - limits number of search results
     * @return - a list of plating employees
     */
    @RequestMapping(value = "/for-media-plating", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    List<Employee> getPlatingEmployees(@RequestParam(value = "value", required = false) String value,
                                       @RequestParam(value = "itemsCount", defaultValue = "20") Short itemsCount);

     /**
     * @param value - employee code, firstName or lastName
     * @param itemsCount - limits number of search results
     * @return - a list of residents
     */
    @RequestMapping(value = "/residents", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    List<Employee> getResidents(@RequestParam(value = "value", required = false) String value,
                                @RequestParam(value = "itemsCount", defaultValue = "20") Short itemsCount);

     /**
     * @param value - employee code, firstName or lastName
     * @param itemsCount - limits number of search results
     * @return - a list of pathologists
     */
    @RequestMapping(value = "/pathologists", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    List<Employee> getPathologists(@RequestParam(value = "value", required = false) String value,
                                   @RequestParam(value = "itemsCount", defaultValue = "20") Short itemsCount);
}
