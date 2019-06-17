package com.softcomputer.gene.codegen;

import io.swagger.codegen.*;
import io.swagger.codegen.languages.AbstractJavaCodegen;

public class JavaGeneGenerator extends AbstractJavaCodegen implements CodegenConfig {
  private String configPackage = "com.om.softcomputer.gene.web.api.configuration";
  private String basePackage = "com.softcomputer.gene.web.api";
  private String artifactName = "REST API";
  private String buildFinalName = "web-rest-api";
  private String wbcVersion = null;
  private String wgcmVersion = null;
  private String productVersion = null;


  public String getName() {
    return "java-gene";
  }

  public String getHelp() {
    return "Generates Server stubs for GENE WEB API";
  }

  public CodegenType getTag() {
    return CodegenType.SERVER;
  }

  public JavaGeneGenerator() {
    this.outputFolder = "generated-code/server-stubs";
    this.templateDir = "templates";

    this.apiPackage = "com.softcomputer.gene.web.api";
    this.modelPackage = "com.softcomputer.gene.web.api.model";
    this.invokerPackage = "com.softcomputer.gene.web.api";
    this.groupId = "com.softcomputer.gene.web";
    this.artifactId = "api";
    this.artifactDescription = "Contracts for WEB rest services";

    this.additionalProperties.put("configPackage", this.configPackage);
    this.additionalProperties.put("basePackage", this.basePackage);
//    this.additionalProperties.put("jackson", "true");

    this.cliOptions.add(new CliOption("artifactName", "Artifact name in generated pom.xml"));
    this.cliOptions.add(new CliOption("wbcVersion", "WBC version in generated pom.xml"));
    this.cliOptions.add(new CliOption("wgcmVersion", "WGCM version in generated pom.xml"));
    this.cliOptions.add(new CliOption("productVersion", "product version in generated pom.xml"));
    this.cliOptions.add(new CliOption("buildFinalName", "project.build.finalName in generated pom.xml"));
  }

  public void processOpts() {
    super.processOpts();

    this.additionalProperties.put(CodegenConstants.GENERATE_API_TESTS, false);
    this.additionalProperties.put(CodegenConstants.GENERATE_MODEL_TESTS, false);
    this.additionalProperties.put(CodegenConstants.GENERATE_API_DOCS, false);
    this.additionalProperties.put(CodegenConstants.GENERATE_MODEL_DOCS, false);
    this.additionalProperties.put(CodegenConstants.EXCLUDE_TESTS, true);

    this.modelDocTemplateFiles.clear();
    this.apiDocTemplateFiles.clear();
    this.apiTestTemplateFiles.clear();

    SupportingFile pom = new SupportingFile("pom.mustache", "", "pom.xml");
    this.supportingFiles.add(pom);

    if (this.additionalProperties.containsKey("artifactName")) {
      this.setArtifactName((String)this.additionalProperties.get("artifactName"));
    } else {
      this.additionalProperties.put("artifactName", this.artifactName);
    }

    if (this.additionalProperties.containsKey("wbcVersion")) {
      this.setWbcVersion((String)this.additionalProperties.get("wbcVersion"));
    } else {
      this.additionalProperties.put("wbcVersion", this.wbcVersion);
    }

    if (this.additionalProperties.containsKey("wgcmVersion")) {
      this.setWgcmVersion((String)this.additionalProperties.get("wgcmVersion"));
    } else {
      this.additionalProperties.put("wgcmVersion", this.wgcmVersion);
    }

    if (this.additionalProperties.containsKey("productVersion")) {
      this.setProductVersion((String)this.additionalProperties.get("productVersion"));
    } else {
      this.additionalProperties.put("productVersion", this.productVersion);
    }

    if (this.additionalProperties.containsKey("buildFinalName")) {
      this.setBuildFinalName((String)this.additionalProperties.get("buildFinalName"));
    } else {
      this.additionalProperties.put("buildFinalName", this.buildFinalName);
    }
  }

  public void postProcessModelProperty(CodegenModel model, CodegenProperty property) {
    model.imports.remove("ApiModel");
    model.imports.remove("ApiModelProperty");
  }

  public void setArtifactName(String artifactName) {
    this.artifactName = artifactName;
  }

  public void setWbcVersion(String wbcVersion) {
    this.wbcVersion = wbcVersion;
  }

  public void setWgcmVersion(String wgcmVersion) {
    this.wgcmVersion = wgcmVersion;
  }

  public void setProductVersion(String productVersion) {
    this.productVersion = productVersion;
  }

  public void setBuildFinalName(String buildFinalName) {
    this.buildFinalName = buildFinalName;
  }

  public String toApiName(String name) {
    if (name.length() == 0) {
      return "DefaultService";
    } else {
      name = this.sanitizeName(name);
      return camelize(name) + "Service";
    }
  }
}