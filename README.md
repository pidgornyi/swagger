![Swagger image](https://habrastorage.org/webt/rx/oo/dk/rxoodkkmw-pkzgffxidjs-f55ag.png)
# Swagger Codegen for GENE

## Overview
Swagger Codegen doesn't have the generator that suits Gene project right out of the box. We have got existing code base, so we need to generate the sources in the same way to correspond existing dependencies and introduce minimal changes )) 
This task brings us out of the scope of a configuration of existing code generation libraries and templates customization.
This project builds a library for [Swagger Codegen](https://github.com/swagger-api/swagger-codegen).

## What's Swagger?
The goal of Swagger™ is to define a standard, language-agnostic interface to REST APIs which allows both humans and computers to discover and understand the capabilities of the service without access to source code, documentation, or through network traffic inspection. When properly defined via Swagger, a consumer can understand and interact with the remote service with a minimal amount of implementation logic. Similar to what interfaces have done for lower-level programming, Swagger removes the guesswork in calling the service.


Check out [OpenAPI-Spec](https://github.com/OAI/OpenAPI-Specification) for additional information about the Swagger project, including additional libraries with support for other languages and more. 
  
## What has been done?
* Redundant additional files, import statements, annotations, logger, docs, supporting files have been removed. Only what is really used in the existing code has been left.
* Models, Interfaces, Controllers have been renamed and organized properly to replace existing sources.
* SpringFactory generation has been added. Vendor extension `x-codegen-bean-name` has been introduced to specify bean name in generated factory.
* Existing code base is not always consistent. Some of the models have accessors but most models don't. OpenAPI vendor extension `x-codegen-accessors` has been introduced in order to mark those that need accessors to be generated.
* Some models to have project-specific  `com.softcomputer.wbc.security.options.OptionInfo` annotation. Use  vendor extension `x-optionInfo`. See the example below
```
      SSNMask:
        type: string
        x-optionInfo:
          valueType: string
          optionType: parameter
      
```
* Some interfaces have cache project-specific control annotation - `com.softcomputer.wbc.util.http.CacheControl`. Vendor extension `x-cache-control` has been added to generate code properly.
```
tags:
    description: Setup  service
    x-cache-control: 300
```
* Enum names are not generated by default. It's an internal representation of value in some language, so for the time being it's not covered by open API spec. In order to generate the sources with enum name and even description the proper vendor extensions have been introduced
```
  TestStatus:
    type: string
    enum:
      - N
      - I
    x-enumNames:
      - NEW
      - IN_PROCESS
    x-enumDescription:
      - New
      - In Process
```
* Base implementation of Spring-MVC codegen tool generate all returns in `responseEntity<T>` wrapper. Most of the OE code doesn't use it. It can be adjusted  with `x-codegen-response-entity`
```
  /orders/{number}:
    get:
      summary: open order
      operationId: openOrder
      parameters:
        - name: number
          in: path
          type: string
          required: true
      responses:
        '200':
          description: successful operation
          schema:
            $ref: '#/definitions/ProcessResult'
          x-codegen-response-entity: true
```
  
## Introduction notices
### Existing code inconsistency
**Example:** All interfaces have names with "Service" suffix. BUT couple files don't follow this rule - "MrnValidator", "BillingValidator". 

**Example2:** Base java enum implementation has methods `toString()` and `fromValue()`. A few enums have different names for the same methods - `value()`, `getValue()`, `getByValue()`. Another ones introduce some specific functionality like `in()` method.

**Example3:** Models may have properties starting from the uppercase character.

I see no reason for codegeneration logic adjustments in these cases, so they should be renamed upon introduction.

### Schema Object namespaces
Namespaces are not supported. There were some efforts on this, but for the time being it's too raw to be introduced. For more details you can see [GitHub ticket](https://github.com/OAI/OpenAPI-Specification/issues/578)
All models are placed together. The same applies to services.  
Name conflicts should be resolved mannually  
**Example:**

| Schema with namespace | Result |
| --- | --- |
| orders.Clinic | OrderClinic |
| setup.model.Clinic | SetupClinic |
| setup.model.TestDefinition | SetupTestDefinition |
| catalog.model.TestDefinition | CatalogTestDefinition |

### Generics
There is no way to define a generic type in OpenAPI.  
The simplest workaround is using allOf and $ref at the same time. Generated code requires mannual adjustment of all dependants.
**Example:**
```
  OrderingKeypadTestDefinition:
    title: Ordering keypad Test definition model
    allOf:
      - $ref: '#/definitions/OrderingKeypad'
      - type: "object"
        properties:
          setup:
            $ref: '#/definitions/SetupTestDefinition'
          items:
            type: array
            items:
              $ref: '#/definitions/SetupTestDefinition'
```

| Code with generics | Result |
| --- | --- |
| OrderingKeypad\<TestDefinition\> | OrderingKeypadTestDefinition |
| OrderingKeypad\<Specimen\> | OrderingKeypadSpecimen |

### Types
OpenAPI defines the following **basic types**:
* string (this includes dates and files)
* number
* integer
* boolean
* array
* object
An optional format keyword serves as a hint for the codegen tool to use a specific type:

| Type | Format | Description |
| --- | --- | --- |
| number | float | Floating-point numbers |
| number | double | Floating-point numbers with double precision |
| string | date | joda.LocalDate |
| string | date-time | joda.DateTime |
| array |  | List\<T\> |
| object + additionalProperties |  | Map<string, T>

Language specific types should be replaced, or codegen tool should be adjusted
* Short => Integer
* Collection => List
* Array => List

*Note: Map<notStringType, ..> for the time being is not supported*

### Others
* Some models have constructor. It's not generated, so dependents should be adjusted.  
```
VisitsBatch(List<Visit> visits, boolean hasMoreItems) {}
```
* Some models have specific property initialization. It's not generated
```
public Diagnosis[] testLevelDiagnoses = new Diagnosis[4];
public List<PanelItem> KbPanels = Collections.emptyList();
```
* Exisiting api can have additional not generated files.  
Example: `MicroSourceGroupRuleSetter.java`, `SpecimenCollectionScheduleOptionsSetter.java`, `RecipientAssembler.java`


## Useful Links  
[Swagger.IO](https://swagger.io/)  
[Open API Map](http://openapi-map.apihandyman.io/?version=2.0)  
[Open API Spec](https://github.com/OAI/OpenAPI-Specification/blob/master/versions/2.0.md)  
[David Norman - How To Make Swagger Codegen Work For Your Team](https://medium.com/capital-one-tech/how-to-make-swagger-codegen-work-for-your-team-32194f7d97e4)

