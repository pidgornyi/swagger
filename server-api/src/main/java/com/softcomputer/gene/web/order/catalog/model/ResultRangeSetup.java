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
import java.util.Map;

/**
 *
 * @author illi
 */
public class ResultRangeSetup 
{
   private String code;
   private String gender;
   private Long ageInUnitsTo;
   private String ageUnitTo;
   private Long ageInUnitsFrom;
   private String ageUnitFrom;
   private String reportNormalRange;
   private List<ResultRangeCondition> conditions;
   private Map<RangeLinkType, List<String>> links;

   public String getCode()
   {
      return code;
   }

   public void setCode(String code)
   {
      this.code = code;
   }

   public String getGender()
   {
      return gender;
   }

   public void setGender(String gender)
   {
      this.gender = gender;
   }

   public Long getAgeInUnitsTo()
   {
      return ageInUnitsTo;
   }

   public void setAgeInUnitsTo(Long ageInUnitsTo)
   {
      this.ageInUnitsTo = ageInUnitsTo;
   }

   public String getAgeUnitTo()
   {
      return ageUnitTo;
   }

   public void setAgeUnitTo(String ageUnitTo)
   {
      this.ageUnitTo = ageUnitTo;
   }

   public Long getAgeInUnitsFrom()
   {
      return ageInUnitsFrom;
   }

   public void setAgeInUnitsFrom(Long ageInUnitsFrom)
   {
      this.ageInUnitsFrom = ageInUnitsFrom;
   }

   public String getAgeUnitFrom()
   {
      return ageUnitFrom;
   }

   public void setAgeUnitFrom(String ageUnitFrom)
   {
      this.ageUnitFrom = ageUnitFrom;
   }

   public String getReportNormalRange()
   {
      return reportNormalRange;
   }

   public void setReportNormalRange(String reportNormalRange)
   {
      this.reportNormalRange = reportNormalRange;
   }

   public List<ResultRangeCondition> getConditions()
   {
      return conditions;
   }

   public void setConditions(List<ResultRangeCondition> conditions)
   {
      this.conditions = conditions;
   }

   public Map<RangeLinkType, List<String>> getLinks()
   {
      return links;
   }

   public void setLinks(Map<RangeLinkType, List<String>> links)
   {
      this.links = links;
   }
}
