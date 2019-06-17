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
public class ResultRangeCondition 
{
   private String category;
   private Integer position;
   private CodeName type;
   private String value;
   private Double valueFrom;
   private Double valueTo;

   public String getCategory()
   {
      return category;
   }

   public void setCategory(String category)
   {
      this.category = category;
   }

   public Integer getPosition()
   {
      return position;
   }

   public void setPosition(Integer position)
   {
      this.position = position;
   }

   public CodeName getType()
   {
      return type;
   }

   public void setType(CodeName type)
   {
      this.type = type;
   }

   public String getValue()
   {
      return value;
   }

   public void setValue(String value)
   {
      this.value = value;
   }

   public Double getValueFrom()
   {
      return valueFrom;
   }

   public void setValueFrom(Double valueFrom)
   {
      this.valueFrom = valueFrom;
   }

   public Double getValueTo()
   {
      return valueTo;
   }

   public void setValueTo(Double valueTo)
   {
      this.valueTo = valueTo;
   }
}
