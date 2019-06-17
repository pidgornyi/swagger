package com.softcomputer.gene.web.order.options.security;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping(value = "/options/security", produces = MediaType.APPLICATION_JSON_VALUE)
public interface SecurityOptionsService {
    @RequestMapping(value = "/order-entry", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    Set<String> getOrderEntryOptions();

    @RequestMapping(value = "/patient-maintenance", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    Set<String> getPatientMaintenanceOptions();
}
