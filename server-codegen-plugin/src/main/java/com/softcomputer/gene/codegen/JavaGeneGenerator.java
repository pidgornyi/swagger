package com.softcomputer.gene.codegen;

import io.swagger.codegen.*;
import io.swagger.codegen.languages.AbstractJavaCodegen;
import io.swagger.models.Tag;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.util.*;

public class JavaGeneGenerator extends AbstractJavaCodegen implements CodegenConfig {
  public static final Logger LOGGER = LoggerFactory.getLogger(JavaGeneGenerator.class);
  public static final String BASE_PACKAGE = "basePackage";
  public static final String FACTORY_PACKAGE = "factoryPackage";
  public static final String SINGLE_CONTENT_TYPES = "singleContentTypes";
  public static final String CODEGEN_ACCESSORS = "x-codegen-accessors";
  public static final String CODEGEN_OPTION_INFO = "x-optionInfo";
  public static final String CODEGEN_CACHE_CONTROL = "x-cache-control";
  public static final String CODEGEN_BEAN_NAME = "x-codegen-bean-name";
  public static final String CODEGEN_ENUM_NAMES = "x-enumNames";
  public static final String CODEGEN_ENUM_DESCRIPTIONS = "x-enumDescription";

  private String basePackage = "com.softcomputer.gene.web.api";
  private String factoryPackage = "com.softcomputer.gene.web";
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

    additionalProperties.put(BASE_PACKAGE, basePackage);
    additionalProperties.put(FACTORY_PACKAGE, factoryPackage);

    setDateLibrary("joda");

    reservedWords.remove("case"); // Case model is the key entity in the api

    cliOptions.add(new CliOption(FACTORY_PACKAGE, "configuration factory package for generated Spring factory "));
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

    if (additionalProperties.containsKey(BASE_PACKAGE)) {
      this.setBasePackage((String) additionalProperties.get(BASE_PACKAGE));
    }

    if (additionalProperties.containsKey(FACTORY_PACKAGE)) {
      this.setFactoryPackage((String) additionalProperties.get(FACTORY_PACKAGE));
    }

    if (this.additionalProperties.containsKey(SINGLE_CONTENT_TYPES)) {
      this.setSingleContentTypes(Boolean.valueOf(additionalProperties.get(SINGLE_CONTENT_TYPES).toString()));
    } else {
      this.additionalProperties.put(SINGLE_CONTENT_TYPES, this.singleContentTypes);
    }

    importMapping.put("CacheControl", "com.softcomputer.wbc.util.http.CacheControl");
    importMapping.put("OptionInfo", "com.softcomputer.wbc.security.options.OptionInfo");
    importMapping.put("OptionType", "com.softcomputer.wbc.security.options.OptionType");
    importMapping.put("ValueType", "com.softcomputer.wbc.security.options.ValueType");

    apiTemplateFiles.put("apiController.mustache", "BaseImpl.java");
    supportingFiles.add(new SupportingFile("restSpringFactory.mustache",
        (sourceFolder + File.separator + factoryPackage).replace(".", java.io.File.separator), "RestSpringFactory.java"));
  }

  public void postProcessModelProperty(CodegenModel model, CodegenProperty property) {
    super.postProcessModelProperty(model, property);
    model.imports.remove("ApiModel");
    model.imports.remove("ApiModelProperty");

    if (model.vendorExtensions.containsKey(CODEGEN_ACCESSORS)) {
      property.vendorExtensions.putIfAbsent(CODEGEN_ACCESSORS, model.vendorExtensions.containsKey(CODEGEN_ACCESSORS));
    }
    if (property.vendorExtensions.containsKey(CODEGEN_OPTION_INFO)) {
      model.imports.add("OptionInfo");
      model.imports.add("OptionType");
      model.imports.add("ValueType");

      Map<String, Object> optionInfo = (Map<String, Object>) property.vendorExtensions.get(CODEGEN_OPTION_INFO);
      optionInfo.putIfAbsent("code", property.name);

      String optionType  = initialCaps((String)optionInfo.getOrDefault("optionType", "Option"));
      if ( Arrays.asList("Option", "Parameter", "Custom").contains(optionType) ) {
        optionInfo.put("optionTypeEnum", "OptionType." + optionType);
      } else {
        LOGGER.error("WRONG OptionInfo optionType: " + optionType);
      }

      String valueType  = initialCaps((String)optionInfo.getOrDefault("valueType", "Boolean"));
      if ( Arrays.asList("String", "Number", "Boolean", "Custom").contains(valueType) ) {
        optionInfo.put("valueTypeEnum", "ValueType." + valueType);
      } else {
        LOGGER.error("WRONG OptionInfo valueType: " + valueType);
      }
    }
  }

  public String toApiName(String name) {
    if (name.length() == 0) {
      return "DefaultService";
    } else {
      name = this.sanitizeName(name);
      return camelize(name) + "Service";
    }
  }

  public void setFactoryPackage(String factoryPackage) {
    this.factoryPackage = factoryPackage;
  }

  public void setSingleContentTypes(boolean singleContentTypes) {
    this.singleContentTypes = singleContentTypes;
  }

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

            Boolean responseEntityWrapper = (Boolean) resp.vendorExtensions.get("x-codegen-response-entity");
            if (Boolean.TRUE.equals(responseEntityWrapper)) {
              operation.vendorExtensions.put("responseEntity", true);
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
              if (tagExtension.getKey().equals(CODEGEN_CACHE_CONTROL)) {
                operations.putIfAbsent("hasCacheControl", true);
                operations.putIfAbsent("cacheControl", tagExtension.getValue());
              }
              if (tagExtension.getKey().equals(CODEGEN_BEAN_NAME)) {
                operations.putIfAbsent("springBeanName", tagExtension.getValue());
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

  // Override standard implementation to avoid to upper case formatting
  @Override
  public String toEnumVarName(String value, String datatype) {
    if (value.length() == 0) {
      return "EMPTY";
    }

    // for symbol, e.g. $, #
    if (getSymbolName(value) != null) {
      return getSymbolName(value);
    }

    // number
    if ("Integer".equals(datatype) || "Long".equals(datatype) ||
        "Float".equals(datatype) || "Double".equals(datatype)) {
      String varName = "NUMBER_" + value;
      varName = varName.replaceAll("-", "MINUS_");
      varName = varName.replaceAll("\\+", "PLUS_");
      varName = varName.replaceAll("\\.", "_DOT_");
      return varName;
    }

    // string
    String var = value.replaceAll("\\W+", "_");
    if (var.matches("\\d.*")) {
      return "_" + var;
    } else {
      return var;
    }
  }

  // Override standard implementation to add support x-enumNames vendor extension
  // It allows to have different name-value in Enums
  @Override
  public Map<String, Object> postProcessModelsEnum(Map<String, Object> objs) {
    objs = super.postProcessModelsEnum(objs);
    List<Object> models = (List<Object>) objs.get("models");
    for (Object _mo : models) {
      Map<String, Object> mo = (Map<String, Object>) _mo;
      CodegenModel cm = (CodegenModel) mo.get("model");

      if (Boolean.TRUE.equals(cm.isEnum) && cm.allowableValues != null) {
        Map<String, Object> allowableValues = cm.allowableValues;
        List<Map<String, String>> enumVars = (List<Map<String, String>>) allowableValues.get("enumVars");
        int index = 0;
        for (Map<String, String> enumVar : enumVars) {
          if(cm.vendorExtensions.containsKey(CODEGEN_ENUM_NAMES)) {
            Object enumName = ((List)cm.vendorExtensions.get(CODEGEN_ENUM_NAMES)).get(index);
            enumVar.put("x-enumName", (String)enumName);
          }
          if(cm.vendorExtensions.containsKey(CODEGEN_ENUM_DESCRIPTIONS)) {
            Object description = ((List)cm.vendorExtensions.get(CODEGEN_ENUM_DESCRIPTIONS)).get(index);
            enumVar.put(CODEGEN_ENUM_DESCRIPTIONS, toEnumValue(description.toString(), "string"));
            cm.vendorExtensions.put("hasDescription", true);
          }
          index++;
        }
      }
    }
    return objs;
  }

  @Override
  public Map<String, Object> postProcessSupportingFileData(Map<String, Object> objs) {
    Map<String, Object> apis = (Map<String, Object>) objs.get("apiInfo");
    List<Object> allOperations = (List<Object>) apis.get("apis");
    for (int i = 0; i < allOperations.size(); i++) {
      Map<String, Object> operation = (Map<String, Object>) allOperations.get(i);
      String className =  (String) operation.get("classname");
      operation.put("factoryMethodName", camelize(className, true));

      Map<String, Object> operationsMap = (Map<String, Object>) operation.get("operations");
      String springBeanName = (String) operationsMap.get("springBeanName");
      if (springBeanName != null) {
        operation.put("springBeanName", springBeanName);
      }
    }
    return objs;
  }
}