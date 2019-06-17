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

/**
 *
 * @author illi
 */
public class DeltaRule 
{
   private Integer ageInUnitsTo;
   private String ageUnitTo;
   private Integer ageInUnitsFrom;
   private String ageUnitFrom;
   private String direction;
   private CodeName currentReason;
   private CodeName previousReason;
   private CodeName cannedMessage;
   private Integer position;
   private String delta;
   private String currentValue;
   private String previousValue;
   private String abnFlag;

   public Integer getAgeInUnitsTo()
   {
      return ageInUnitsTo;
   }

   public void setAgeInUnitsTo(Integer ageInUnitsTo)
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

   public Integer getAgeInUnitsFrom()
   {
      return ageInUnitsFrom;
   }

   public void setAgeInUnitsFrom(Integer ageInUnitsFrom)
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

   public String getDirection()
   {
      return direction;
   }

   public void setDirection(String direction)
   {
      this.direction = direction;
   }

   public CodeName getCurrentReason()
   {
      return currentReason;
   }

   public void setCurrentReason(CodeName currentReason)
   {
      this.currentReason = currentReason;
   }

   public CodeName getPreviousReason()
   {
      return previousReason;
   }

   public void setPreviousReason(CodeName previousReason)
   {
      this.previousReason = previousReason;
   }

   public CodeName getCannedMessage()
   {
      return cannedMessage;
   }

   public void setCannedMessage(CodeName cannedMessage)
   {
      this.cannedMessage = cannedMessage;
   }

   public Integer getPosition()
   {
      return position;
   }

   public void setPosition(Integer position)
   {
      this.position = position;
   }

   public String getDelta()
   {
      return delta;
   }

   public void setDelta(String delta)
   {
      this.delta = delta;
   }

   public String getCurrentValue()
   {
      return currentValue;
   }

   public void setCurrentValue(String currentValue)
   {
      this.currentValue = currentValue;
   }

   public String getPreviousValue()
   {
      return previousValue;
   }

   public void setPreviousValue(String previousValue)
   {
      this.previousValue = previousValue;
   }

   public String getAbnFlag()
   {
      return abnFlag;
   }

   public void setAbnFlag(String abnFlag)
   {
      this.abnFlag = abnFlag;
   }
}
