package com.softcomputer.gene.codegen;

import io.swagger.codegen.*;
import io.swagger.codegen.languages.AbstractJavaCodegen;
import io.swagger.codegen.languages.SpringCodegen;
import io.swagger.models.Operation;
import io.swagger.models.Path;
import io.swagger.models.Swagger;
import io.swagger.models.Tag;
import io.swagger.models.parameters.BodyParameter;
import io.swagger.models.parameters.FormParameter;
import io.swagger.models.parameters.Parameter;

import java.util.List;
import java.util.Map;

public class JavaGeneGenerator extends AbstractJavaCodegen implements CodegenConfig {
//  public static final String CONFIG_PACKAGE = "configPackage";
  public static final String BASE_PACKAGE = "basePackage";
  public static final String SINGLE_CONTENT_TYPES = "singleContentTypes";
  public static final String ARTIFACT_NAME = "artifactName";
  public static final String WBC_VERSION = "wbcVersion";
  public static final String WGCM_VERSION = "wgcmVersion";
  public static final String PRODUCT_VERSION = "productVersion";
  public static final String BUILD_FINAL_NAME = "buildFinalName";

//  private String configPackage = "com.softcomputer.gene.web.api.configuration";
  private String basePackage = "com.softcomputer.gene.web.api";
  private String artifactName = "REST API";
  private String buildFinalName = "web-rest-api";
  private String wbcVersion = null;
  private String wgcmVersion = null;
  private String productVersion = null;
  private boolean singleContentTypes = true;


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

//    additionalProperties.put(CONFIG_PACKAGE, configPackage);
    additionalProperties.put(BASE_PACKAGE, basePackage);
//    this.additionalProperties.put("jackson", "true");

//    cliOptions.add(new CliOption(CONFIG_PACKAGE, "configuration package for generated code"));
    cliOptions.add(new CliOption(BASE_PACKAGE, "base package (invokerPackage) for generated code"));
    cliOptions.add(new CliOption(ARTIFACT_NAME, "Artifact name in generated pom.xml"));
    cliOptions.add(new CliOption(WBC_VERSION, "WBC version in generated pom.xml"));
    cliOptions.add(new CliOption(WGCM_VERSION, "WGCM version in generated pom.xml"));
    cliOptions.add(new CliOption(PRODUCT_VERSION, "product version in generated pom.xml"));
    cliOptions.add(new CliOption(BUILD_FINAL_NAME, "project.build.finalName in generated pom.xml"));
    cliOptions.add(CliOption.newBoolean(SINGLE_CONTENT_TYPES, "Whether to select only one produces/consumes content-type by operation."));
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

//    if (additionalProperties.containsKey(CONFIG_PACKAGE)) {
//      this.setConfigPackage((String) additionalProperties.get(CONFIG_PACKAGE));
//    }

    if (additionalProperties.containsKey(BASE_PACKAGE)) {
      this.setBasePackage((String) additionalProperties.get(BASE_PACKAGE));
    }

    if (this.additionalProperties.containsKey(ARTIFACT_NAME)) {
      this.setArtifactName((String)this.additionalProperties.get(ARTIFACT_NAME));
    } else {
      this.additionalProperties.put(ARTIFACT_NAME, this.artifactName);
    }

    if (this.additionalProperties.containsKey(WBC_VERSION)) {
      this.setWbcVersion((String)this.additionalProperties.get(WBC_VERSION));
    } else {
      this.additionalProperties.put(WBC_VERSION, this.wbcVersion);
    }

    if (this.additionalProperties.containsKey(WGCM_VERSION)) {
      this.setWgcmVersion((String)this.additionalProperties.get(WGCM_VERSION));
    } else {
      this.additionalProperties.put(WGCM_VERSION, this.wgcmVersion);
    }

    if (this.additionalProperties.containsKey(PRODUCT_VERSION)) {
      this.setProductVersion((String)this.additionalProperties.get(PRODUCT_VERSION));
    } else {
      this.additionalProperties.put(PRODUCT_VERSION, this.productVersion);
    }

    if (this.additionalProperties.containsKey(BUILD_FINAL_NAME)) {
      this.setBuildFinalName((String)this.additionalProperties.get(BUILD_FINAL_NAME));
    } else {
      this.additionalProperties.put(BUILD_FINAL_NAME, this.buildFinalName);
    }

    if (this.additionalProperties.containsKey(SINGLE_CONTENT_TYPES)) {
      this.setSingleContentTypes(Boolean.valueOf(additionalProperties.get(SINGLE_CONTENT_TYPES).toString()));
    } else {
      this.additionalProperties.put(SINGLE_CONTENT_TYPES, this.singleContentTypes);
    }

    importMapping.put("CacheControl", "com.softcomputer.wbc.util.http.CacheControl");
  }

  public void postProcessModelProperty(CodegenModel model, CodegenProperty property) {
    model.imports.remove("ApiModel");
    model.imports.remove("ApiModelProperty");
  }

  public String toApiName(String name) {
    if (name.length() == 0) {
      return "DefaultService";
    } else {
      name = this.sanitizeName(name);
      return camelize(name) + "Service";
    }
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

  public void setSingleContentTypes(boolean singleContentTypes) {
    this.singleContentTypes = singleContentTypes;
  }

//  public void setConfigPackage(String configPackage) {
//    this.configPackage = configPackage;
//  }

  public void setBasePackage(String basePackage) {
    this.basePackage = basePackage;
  }

  @Override
  public Map<String, Object> postProcessOperations(Map<String, Object> objs) {
    Map<String, Object> operations = (Map<String, Object>) objs.get("operations");
    if (operations != null) {
      List<CodegenOperation> ops = (List<CodegenOperation>) operations.get("operation");
      for (final CodegenOperation operation : ops) {
        List<CodegenResponse> responses = operation.responses;
        if (responses != null) {
          for (final CodegenResponse resp : responses) {
            if ("0".equals(resp.code)) {
              resp.code = "200";
            }
            doDataTypeAssignment(resp.dataType, new DataTypeAssigner() {
              @Override
              public void setReturnType(final String returnType) {
                resp.dataType = returnType;
              }

              @Override
              public void setReturnContainer(final String returnContainer) {
                resp.containerType = returnContainer;
              }
            });
          }
        }

        doDataTypeAssignment(operation.returnType, new DataTypeAssigner() {

          @Override
          public void setReturnType(final String returnType) {
            operation.returnType = returnType;
          }

          @Override
          public void setReturnContainer(final String returnContainer) {
            operation.returnContainer = returnContainer;
          }
        });

        List<Tag> tags = operation.tags;
        if (tags != null) {
          for (final Tag tag : tags) {
            for (Map.Entry<String, Object> tagExtension: tag.getVendorExtensions().entrySet()) {
              if (tagExtension.getKey().equals("x-cache-control")) {
                operations.putIfAbsent("hasCacheControl", true);
                operations.putIfAbsent("cacheControl", tagExtension.getValue());
              }
            }
          }
        }
      }
    }

    return objs;
  }

  private interface DataTypeAssigner {
    void setReturnType(String returnType);
    void setReturnContainer(String returnContainer);
  }

  /**
   *
   * @param returnType The return type that needs to be converted
   * @param dataTypeAssigner An object that will assign the data to the respective fields in the model.
   */
  private void doDataTypeAssignment(String returnType, DataTypeAssigner dataTypeAssigner) {
    final String rt = returnType;
    if (rt == null) {
      dataTypeAssigner.setReturnType("Void");
    } else if (rt.startsWith("List")) {
      int end = rt.lastIndexOf(">");
      if (end > 0) {
        dataTypeAssigner.setReturnType(rt.substring("List<".length(), end).trim());
        dataTypeAssigner.setReturnContainer("List");
      }
    } else if (rt.startsWith("Map")) {
      int end = rt.lastIndexOf(">");
      if (end > 0) {
        dataTypeAssigner.setReturnType(rt.substring("Map<".length(), end).split(",")[1].trim());
        dataTypeAssigner.setReturnContainer("Map");
      }
    } else if (rt.startsWith("Set")) {
      int end = rt.lastIndexOf(">");
      if (end > 0) {
        dataTypeAssigner.setReturnType(rt.substring("Set<".length(), end).trim());
        dataTypeAssigner.setReturnContainer("Set");
      }
    }
  }

//  private void addCacheControl(Map<String, Object> operations, Object value) {
//    operations.putIfAbsent("hasCacheControl", true);
//    operations.putIfAbsent("cacheControl", value);
//
//    List<Map<String, String>> imports = (List<Map<String, String>> imports)operations.get("imports");
//    operations.put("hasImport", true);
//  }

}