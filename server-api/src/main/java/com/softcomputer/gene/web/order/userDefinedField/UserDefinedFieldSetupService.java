package com.softcomputer.gene.web.order.userDefinedField;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/user-defined-field-setup", produces = MediaType.APPLICATION_JSON_VALUE)
public interface UserDefinedFieldSetupService {
    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    List<UserDefinedFieldSetup> readUserDefinedFieldSetupByTest(@RequestParam(value = "testCodeVersions") List<String> testCodeVersions,
                                                                @RequestParam(value = "promptTypes") List<String> promptTypes);
}
