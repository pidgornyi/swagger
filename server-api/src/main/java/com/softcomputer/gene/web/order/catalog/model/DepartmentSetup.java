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

/**
 *
 * @author illi
 */
public class DepartmentSetup 
{
   private String code;
   private String name;
   private String laboratoryName;

   public String getCode()
   {
      return code;
   }

   public void setCode(String code)
   {
      this.code = code;
   }

   public String getName()
   {
      return name;
   }

   public void setName(String name)
   {
      this.name = name;
   }

   public String getLaboratoryName()
   {
      return laboratoryName;
   }

   public void setLaboratoryName(String laboratoryName)
   {
      this.laboratoryName = laboratoryName;
   }
}
