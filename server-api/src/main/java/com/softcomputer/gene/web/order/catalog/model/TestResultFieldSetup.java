/*
 * This module is part of the SoftGenePortal system.
 * Copyright (c) Soft Computer Consultants, Inc.
 * All Rights Reserved
 * This document contains unpublished, confidential and proprietary
 * information of Soft Computer Consultants, Inc. No disclosure or use of
 * any portion of the contents of these materials may be made without the
 * express written consent of Soft Computer Consultants, Inc.
 */
package com.softcomputer.gene.web.order.catalog.model;

import java.util.List;

public class TestResultFieldSetup
{
   private String name;
   private String code;
   private String type;
   private String unit;
   private String defaultValue;
   private String loincCode;
   private List<ResultRangeSetup> resultRanges;
   private List<ResultDeltaSetup> deltaSetups;
   private ResultDeltaSetup deltaSetup;
   
   public String getName()
   {
      return name;
   }
   
   public void setName(String name)
   {
      this.name = name;
   }

   public String getCode()
   {
      return code;
   }

   public void setCode(String code)
   {
      this.code = code;
   }

   public String getType()
   {
      return type;
   }

   public void setType(String type)
   {
      this.type = type;
   }
   
   public String getUnit()
   {
      return unit;
   }
   
   public void setUnit(String unit)
   {
      this.unit = unit;
   }
   
   public String getDefaultValue()
   {
      return defaultValue;
   }
   
   public void setDefaultValue(String defaultValue)
   {
      this.defaultValue = defaultValue;
   }
   
   public String getLoincCode()
   {
      return loincCode;
   }
   
   public void setLoincCode(String loincCode)
   {
      this.loincCode = loincCode;
   }

   public List<ResultRangeSetup> getResultRanges()
   {
      return resultRanges;
   }

   public void setResultRanges(List<ResultRangeSetup> resultRanges)
   {
      this.resultRanges = resultRanges;
   }

   public List<ResultDeltaSetup> getDeltaSetups()
   {
      return deltaSetups;
   }

   public void setDeltaSetups(List<ResultDeltaSetup> deltaSetups)
   {
      this.deltaSetups = deltaSetups;
   }

   public ResultDeltaSetup getDeltaSetup()
   {
      return deltaSetup;
   }

   public void setDeltaSetup(ResultDeltaSetup deltaSetup)
   {
      this.deltaSetup = deltaSetup;
   }
}
