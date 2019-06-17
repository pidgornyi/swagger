package com.softcomputer.gene.web.order.userDefinedField;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/user-defined-field", produces = MediaType.APPLICATION_JSON_VALUE)
public interface UserDefinedFieldService {
    @RequestMapping(value = "/test-level", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    List<UserDefinedField> readTestLevelUserDefinedField(@RequestParam(value = "testCodeVersions") List<String> testCodeVersions,
                                                         @RequestParam(value = "promptTypes") List<String> promptTypes,
                                                         @RequestParam(value = "ownerId", required = false) Long ownerId,
                                                         @RequestParam(value = "ownerType", required = false) UserDefinedFieldOwnerType ownerType);
}