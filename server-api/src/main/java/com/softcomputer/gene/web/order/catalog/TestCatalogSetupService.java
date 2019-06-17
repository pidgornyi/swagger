/*
 * This module is part of the SoftGenePortal system.
 * Copyright (c) Soft Computer Consultants, Inc.
 * All Rights Reserved
 * This document contains unpublished, confidential and proprietary
 * information of Soft Computer Consultants, Inc. No disclosure or use of
 * any portion of the contents of these materials may be made without the
 * express written consent of Soft Computer Consultants, Inc.
 */
package com.softcomputer.gene.web.order.catalog;

import com.softcomputer.gene.web.order.catalog.model.CatalogTestSetup;
import com.softcomputer.gene.web.order.catalog.model.TestSearchResult;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/tsearch", produces = MediaType.APPLICATION_JSON_VALUE)
public interface TestCatalogSetupService
{
   @RequestMapping(value = "/single-test", method = RequestMethod.GET)
   CatalogTestSetup getTestSetupForCatalog(@RequestParam("code") String code);

   @RequestMapping(value = "/tests", method = RequestMethod.GET)
   TestSearchResult getTestSetups(@RequestParam("search") String searchString, 
           @RequestParam("type") Integer searchType);   
}
