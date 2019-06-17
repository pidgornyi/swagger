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
public class ResultDeltaSetup 
{
   private Integer deltaTime;
   private String deltaUnit;
   private List<DeltaRule> deltaRules;

   public Integer getDeltaTime()
   {
      return deltaTime;
   }

   public void setDeltaTime(Integer deltaTime)
   {
      this.deltaTime = deltaTime;
   }

   public String getDeltaUnit()
   {
      return deltaUnit;
   }

   public void setDeltaUnit(String deltaUnit)
   {
      this.deltaUnit = deltaUnit;
   }

   public List<DeltaRule> getDeltaRules()
   {
      return deltaRules;
   }

   public void setDeltaRules(List<DeltaRule> deltaRules)
   {
      this.deltaRules = deltaRules;
   }
}
