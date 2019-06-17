/*
 *   This module is part of the SoftGene system
 *    Copyright (c) SCC Soft Computer, Inc.  2017
 *    All Rights Reserved
 *
 * This document contains unpublished, confidential and proprietary
 * information of SCC Soft Computer, Inc. No disclosure or use of
 * any portion of the contents of these materials may be made without the
 * express written consent of Soft Computer Consultants, Inc.
 */
package com.softcomputer.gene.web.order;

import com.softcomputer.gene.web.order.catalog.TestCatalogSetupService;
import com.softcomputer.gene.web.order.insurance.InsuranceService;
import com.softcomputer.gene.web.order.options.*;
import com.softcomputer.gene.web.order.options.security.SecurityOptionsService;
import com.softcomputer.gene.web.order.orders.OrderService;
import com.softcomputer.gene.web.order.patient.*;
import com.softcomputer.gene.web.order.requisition.*;
import com.softcomputer.gene.web.order.search.SearchService;
import com.softcomputer.gene.web.order.setup.SetupService;
import com.softcomputer.gene.web.order.setup.choices.ChoiceService;
import com.softcomputer.gene.web.order.userDefinedField.*;
import com.softcomputer.gene.web.order.validator.BillingValidator;
import com.softcomputer.gene.web.order.validator.MrnValidator;
import com.softcomputer.gene.web.order.visit.VisitService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@EnableWebMvc
@Configuration
@Lazy
public interface RestSpringFactory {

    public static final String USER_DEFINED_FIELD_SETUP_SERVICE = "WOE.UserDefinedFieldSetupService";
    public static final String USER_DEFINED_FIELD_SERVICE = "WOE.UserDefinedFieldService";
    public static final String TEST_CATALOG_SETUP_SERVICE = "WOE.TestCatalogSetupService";


    @Bean
    public SearchService searchService();

    @Bean
    public PatientService patientService();

    @Bean
    public SetupService setupService();

    @Bean
    public RequisitionService requisitionService();

    @Bean
    public SecurityOptionsService securityOpstionsService();

    @Bean
    public VisitService visitService();

    @Bean
    public OptionsService optionsService();

    @Bean
    public OrderService orderService();

    @Bean
    public ChoiceService choiceService();

    @Bean(name = USER_DEFINED_FIELD_SETUP_SERVICE)
    public UserDefinedFieldSetupService userDefinedFieldSetupService();

    @Bean(name = USER_DEFINED_FIELD_SERVICE)
    public UserDefinedFieldService userDefinedFieldService();

    @Bean
    public InsuranceService insuranceServiceImpl();

    @Bean
    public MrnValidator mrnValidator();

    @Bean
    public BillingValidator billingValidator();
    
    @Bean(name = TEST_CATALOG_SETUP_SERVICE)
    public TestCatalogSetupService testCatalogSetupService();
}
