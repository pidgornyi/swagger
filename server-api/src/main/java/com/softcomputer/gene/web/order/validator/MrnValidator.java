package com.softcomputer.gene.web.order.validator;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/validator/mrn", produces = MediaType.APPLICATION_JSON_VALUE)
public interface MrnValidator{

    @RequestMapping(value = "/is-available", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    boolean isAvailableMRN(@RequestParam(value = "mrn") String mrn);
}
