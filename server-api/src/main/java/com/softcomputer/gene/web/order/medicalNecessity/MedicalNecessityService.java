package com.softcomputer.gene.web.order.medicalNecessity;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/medical-necessity", produces = MediaType.APPLICATION_JSON_VALUE)
public interface MedicalNecessityService {
    @RequestMapping(value = "/calculate", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    MedicalNecessity calculateMedicalNecessity(@RequestBody MedicalNecessity medicalNecessity);

    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    MedicalNecessity readMedicalNecessity(@RequestParam("order-number") String orderNumber);
}