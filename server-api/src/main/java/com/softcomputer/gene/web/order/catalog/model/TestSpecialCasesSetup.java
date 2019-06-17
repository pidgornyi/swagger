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

public class TestSpecialCasesSetup
{
   private String patientType;
   private Long ageInUnitsTo;
   private String ageUnitTo;
   private Long ageInUnitsFrom;
   private String ageUnitFrom;
   private Boolean separateCollectionContainer;
   private Boolean separateAliquotContainer;
   private Double volumeNeeded;
   private Double addupVolume;
   private String volumeUnit;
   private TubeSetup preferableTube;
   private TubeSetup aliquotTube;
   private SpecimenSetup preferableSpecimen;

   public String getPatientType()
   {
      return patientType;
   }

   public void setPatientType(String patientType)
   {
      this.patientType = patientType;
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

   public Boolean getSeparateCollectionContainer()
   {
      return separateCollectionContainer;
   }

   public void setSeparateCollectionContainer(Boolean separateCollectionContainer)
   {
      this.separateCollectionContainer = separateCollectionContainer;
   }

   public Boolean getSeparateAliquotContainer()
   {
      return separateAliquotContainer;
   }

   public void setSeparateAliquotContainer(Boolean separateAliquotContainer)
   {
      this.separateAliquotContainer = separateAliquotContainer;
   }

   public Double getVolumeNeeded()
   {
      return volumeNeeded;
   }

   public void setVolumeNeeded(Double volumeNeeded)
   {
      this.volumeNeeded = volumeNeeded;
   }

   public Double getAddupVolume()
   {
      return addupVolume;
   }

   public void setAddupVolume(Double addupVolume)
   {
      this.addupVolume = addupVolume;
   }

   public String getVolumeUnit()
   {
      return volumeUnit;
   }

   public void setVolumeUnit(String volumeUnit)
   {
      this.volumeUnit = volumeUnit;
   }

   public TubeSetup getPreferableTube()
   {
      return preferableTube;
   }

   public void setPreferableTube(TubeSetup preferableTube)
   {
      this.preferableTube = preferableTube;
   }

   public TubeSetup getAliquotTube()
   {
      return aliquotTube;
   }

   public void setAliquotTube(TubeSetup aliquotTube)
   {
      this.aliquotTube = aliquotTube;
   }

   public SpecimenSetup getPreferableSpecimen()
   {
      return preferableSpecimen;
   }

   public void setPreferableSpecimen(SpecimenSetup preferableSpecimen)
   {
      this.preferableSpecimen = preferableSpecimen;
   }


}
