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

import java.util.Collection;
import java.util.List;

/**
 *
 * @author illi
 */
public class TestDefinition 
{
   private String code;
   private String secondaryCode; 
   private String thirdCode;
   private String name;
   private String technology;
   private String technologyCode;
   private CodeName technologyEntity;
   private String methodology;
   private Integer methodologySeq;
   private String instructions;
   private String comments;
   private Integer timeBetweenOrders;
   private List<String> synonyms;
   private Boolean orderableIndividually;
   private Boolean orderableAsStat;
   private Boolean orderableAsUrgent;
   private Boolean requiredICDAtOrdering;
   private SpecimenSetup preferableSpecimen;
   private TubeSetup preferableTube;
   private List<SpecimenSetup> acceptableSpecimens;
   private List<TubeSetup> acceptableTubes;
   private Double realVolume;
   private Double addupVolume;
   private Double specimenMinVolume;
   private String volumeUnit;
   private Collection<TestSetupIdentifier> components;
   private Collection<TestSetupIdentifier> partOfPanels;
   private Collection<TestSetupIdentifier> sameOeCategoryTests;
   private Collection<TestResultFieldSetup> resultFields;
   private String collectionInstruction;
   private String aliquoteInstruction;
   private String collectionLabelText;
   private String collectionType;
   private Boolean separateTube;
   private Boolean separateAliquotTube;
   private TubeSetup preferableAliquotTube;
   private Collection<TestSpecialCasesSetup> specialCases;
   private String stability;
   private String transport;
   private String storage;
   private String preservation;
   private String laboratory;
   private String department;
   private String frequency;
   private String message;
   private String minVolumeComments;
   private List<DepartmentSetup> departments;
   private String referenceLabFee;
   private String hospitalCharge;
   private String mnemonic;
   private List<String> workstations;

   public String getCode()
   {
      return code;
   }

   public void setCode(String code)
   {
      this.code = code;
   }

   public String getSecondaryCode()
   {
      return secondaryCode;
   }

   public void setSecondaryCode(String secondaryCode)
   {
      this.secondaryCode = secondaryCode;
   }
   
   public String getThirdCode()
   {
      return thirdCode;
   }

   public void setThirdCode(String thirdCode)
   {
      this.thirdCode = thirdCode;
   }

   public String getName()
   {
      return name;
   }

   public void setName(String name)
   {
      this.name = name;
   }

   public String getTechnology()
   {
      return technology;
   }

   public void setTechnology(String technology)
   {
      this.technology = technology;
   }

   public String getTechnologyCode()
   {
      return technologyCode;
   }

   public void setTechnologyCode(String technologyCode)
   {
      this.technologyCode = technologyCode;
   }

   public CodeName getTechnologyEntity()
   {
      return technologyEntity;
   }

   public void setTechnologyEntity(CodeName technologyEntity)
   {
      this.technologyEntity = technologyEntity;
   }
   
   public String getMethodology()
   {
      return methodology;
   }

   public void setMethodology(String methodology)
   {
      this.methodology = methodology;
   }

   public Integer getMethodologySeq()
   {
      return methodologySeq;
   }

   public void setMethodologySeq(Integer methodologySeq)
   {
      this.methodologySeq = methodologySeq;
   }
   
   public String getInstructions()
   {
      return instructions;
   }

   public void setInstructions(String instructions)
   {
      this.instructions = instructions;
   }

   public String getComments()
   {
      return comments;
   }

   public void setComments(String comments)
   {
      this.comments = comments;
   }

   public Integer getTimeBetweenOrders()
   {
      return timeBetweenOrders;
   }

   public void setTimeBetweenOrders(Integer timeBetweenOrders)
   {
      this.timeBetweenOrders = timeBetweenOrders;
   }

   public List<String> getSynonyms()
   {
      return synonyms;
   }

   public void setSynonyms(List<String> synonyms)
   {
      this.synonyms = synonyms;
   }

   public Boolean getOrderableIndividually()
   {
      return orderableIndividually;
   }

   public void setOrderableIndividually(Boolean orderableIndividually)
   {
      this.orderableIndividually = orderableIndividually;
   }

   public Boolean getOrderableAsStat()
   {
      return orderableAsStat;
   }

   public void setOrderableAsStat(Boolean orderableAsStat)
   {
      this.orderableAsStat = orderableAsStat;
   }

   public Boolean getOrderableAsUrgent()
   {
      return orderableAsUrgent;
   }

   public void setOrderableAsUrgent(Boolean orderableAsUrgent)
   {
      this.orderableAsUrgent = orderableAsUrgent;
   }

   public Boolean getRequiredICDAtOrdering()
   {
      return requiredICDAtOrdering;
   }

   public void setRequiredICDAtOrdering(Boolean requiredICDAtOrdering)
   {
      this.requiredICDAtOrdering = requiredICDAtOrdering;
   }

   public SpecimenSetup getPreferableSpecimen()
   {
      return preferableSpecimen;
   }

   public void setPreferableSpecimen(SpecimenSetup preferableSpecimen)
   {
      this.preferableSpecimen = preferableSpecimen;
   }

   public TubeSetup getPreferableTube()
   {
      return preferableTube;
   }

   public void setPreferableTube(TubeSetup preferableTube)
   {
      this.preferableTube = preferableTube;
   }

   public List<SpecimenSetup> getAcceptableSpecimens()
   {
      return acceptableSpecimens;
   }

   public void setAcceptableSpecimens(List<SpecimenSetup> acceptableSpecimens)
   {
      this.acceptableSpecimens = acceptableSpecimens;
   }

   public List<TubeSetup> getAcceptableTubes()
   {
      return acceptableTubes;
   }

   public void setAcceptableTubes(List<TubeSetup> acceptableTubes)
   {
      this.acceptableTubes = acceptableTubes;
   }

   public Double getRealVolume()
   {
      return realVolume;
   }

   public void setRealVolume(Double realVolume)
   {
      this.realVolume = realVolume;
   }

   public Double getAddupVolume()
   {
      return addupVolume;
   }

   public void setAddupVolume(Double addupVolume)
   {
      this.addupVolume = addupVolume;
   }

   public Double getSpecimenMinVolume()
   {
      return specimenMinVolume;
   }

   public void setSpecimenMinVolume(Double specimenMinVolume)
   {
      this.specimenMinVolume = specimenMinVolume;
   }

   public String getVolumeUnit()
   {
      return volumeUnit;
   }

   public void setVolumeUnit(String volumeUnit)
   {
      this.volumeUnit = volumeUnit;
   }

   public Collection<TestSetupIdentifier> getComponents()
   {
      return components;
   }

   public void setComponents(Collection<TestSetupIdentifier> components)
   {
      this.components = components;
   }

   public Collection<TestSetupIdentifier> getPartOfPanels()
   {
      return partOfPanels;
   }

   public void setPartOfPanels(Collection<TestSetupIdentifier> partOfPanels)
   {
      this.partOfPanels = partOfPanels;
   }

   public Collection<TestSetupIdentifier> getSameOeCategoryTests()
   {
      return sameOeCategoryTests;
   }

   public void setSameOeCategoryTests(Collection<TestSetupIdentifier> sameOeCategoryTests)
   {
      this.sameOeCategoryTests = sameOeCategoryTests;
   }

   public Collection<TestResultFieldSetup> getResultFields()
   {
      return resultFields;
   }

   public void setResultFields(Collection<TestResultFieldSetup> resultFields)
   {
      this.resultFields = resultFields;
   }

   public String getCollectionInstruction()
   {
      return collectionInstruction;
   }

   public void setCollectionInstruction(String collectionInstruction)
   {
      this.collectionInstruction = collectionInstruction;
   }

   public String getAliquoteInstruction()
   {
      return aliquoteInstruction;
   }

   public void setAliquoteInstruction(String aliquoteInstruction)
   {
      this.aliquoteInstruction = aliquoteInstruction;
   }

   public String getCollectionLabelText()
   {
      return collectionLabelText;
   }

   public void setCollectionLabelText(String collectionLabelText)
   {
      this.collectionLabelText = collectionLabelText;
   }

   public String getCollectionType()
   {
      return collectionType;
   }

   public void setCollectionType(String collectionType)
   {
      this.collectionType = collectionType;
   }

   public Boolean getSeparateTube()
   {
      return separateTube;
   }

   public void setSeparateTube(Boolean separateTube)
   {
      this.separateTube = separateTube;
   }

   public Boolean getSeparateAliquotTube()
   {
      return separateAliquotTube;
   }

   public void setSeparateAliquotTube(Boolean separateAliquotTube)
   {
      this.separateAliquotTube = separateAliquotTube;
   }

   public TubeSetup getPreferableAliquotTube()
   {
      return preferableAliquotTube;
   }

   public void setPreferableAliquotTube(TubeSetup preferableAliquotTube)
   {
      this.preferableAliquotTube = preferableAliquotTube;
   }

   public Collection<TestSpecialCasesSetup> getSpecialCases()
   {
      return specialCases;
   }

   public void setSpecialCases(Collection<TestSpecialCasesSetup> specialCases)
   {
      this.specialCases = specialCases;
   }

   public String getStability()
   {
      return stability;
   }

   public void setStability(String stability)
   {
      this.stability = stability;
   }

   public String getTransport()
   {
      return transport;
   }

   public void setTransport(String transport)
   {
      this.transport = transport;
   }

   public String getStorage()
   {
      return storage;
   }

   public void setStorage(String storage)
   {
      this.storage = storage;
   }

   public String getPreservation()
   {
      return preservation;
   }

   public void setPreservation(String preservation)
   {
      this.preservation = preservation;
   }

   public String getLaboratory()
   {
      return laboratory;
   }

   public void setLaboratory(String laboratory)
   {
      this.laboratory = laboratory;
   }

   public String getDepartment()
   {
      return department;
   }

   public void setDepartment(String department)
   {
      this.department = department;
   }

   public String getFrequency()
   {
      return frequency;
   }

   public void setFrequency(String frequency)
   {
      this.frequency = frequency;
   }

   public String getMessage()
   {
      return message;
   }

   public void setMessage(String message)
   {
      this.message = message;
   }

   public String getMinVolumeComments()
   {
      return minVolumeComments;
   }

   public void setMinVolumeComments(String minVolumeComments)
   {
      this.minVolumeComments = minVolumeComments;
   }

   public List<DepartmentSetup> getDepartments()
   {
      return departments;
   }

   public void setDepartments(List<DepartmentSetup> departments)
   {
      this.departments = departments;
   }

   public String getReferenceLabFee()
   {
      return referenceLabFee;
   }

   public void setReferenceLabFee(String referenceLabFee)
   {
      this.referenceLabFee = referenceLabFee;
   }

   public String getHospitalCharge()
   {
      return hospitalCharge;
   }

   public void setHospitalCharge(String hospitalCharge)
   {
      this.hospitalCharge = hospitalCharge;
   }

   public String getMnemonic()
   {
      return mnemonic;
   }

   public void setMnemonic(String mnemonic)
   {
      this.mnemonic = mnemonic;
   }

   public List<String> getWorkstations()
   {
      return workstations;
   }

   public void setWorkstations(List<String> workstations)
   {
      this.workstations = workstations;
   }
}
