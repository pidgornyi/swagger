package com.softcomputer.gene.web.order.validator;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/validator/billing", produces = MediaType.APPLICATION_JSON_VALUE)
public interface BillingValidator {

    @RequestMapping(value = "/is-available", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    boolean isAvailableBilling(@RequestParam(value = "billing") String billing);
}

