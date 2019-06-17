/*
 * This module is part of the SoftLab experimental system
 * Copyright (c) Soft Computer Consultants, Inc.
 * All Rights Reserved
 * This document contains unpublished, confidential and proprietary
 * information of Soft Computer Consultants, Inc. No disclosure or use of
 * any portion of the contents of these materials may be made without the
 * express written consent of Soft Computer Consultants, Inc.
 */
package com.softcomputer.gene.web.order.catalog.model;

import java.util.List;

/**
 *
 * @author illi
 */
public class TestSearchResult 
{
   private List<TestSetupIdentifier> tests;
   private int totalCount;

   public List<TestSetupIdentifier> getTests()
   {
      return tests;
   }

   public void setTests(List<TestSetupIdentifier> tests)
   {
      this.tests = tests;
   }

   public int getTotalCount()
   {
      return totalCount;
   }

   public void setTotalCount(int totalCount)
   {
      this.totalCount = totalCount;
   }
}
