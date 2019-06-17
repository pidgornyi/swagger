package com.softcomputer.gene.web.order.search;

import com.softcomputer.gene.web.order.search.singleSearch.PatientData;
import com.softcomputer.gene.web.order.search.singleSearch.SingleSearchResults;
import org.joda.time.LocalDate;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/search", produces = MediaType.APPLICATION_JSON_VALUE)
public interface SearchService {
    @RequestMapping(value = "/pm", method = RequestMethod.GET)
    SingleSearchResults searchPatientData(@RequestParam(value = "search-criteria", required = true) String searchCriteria);

    @RequestMapping(value = "/ord", method = RequestMethod.GET)
    SingleSearchResults searchPatientOrderData(@RequestParam(value = "search-criteria", required = true) String searchCriteria);

    @RequestMapping(value = "/advanced", method = RequestMethod.GET)
    List<PatientData> searchAdvancedPatientData(@RequestParam(value = "lastName", required = false) String lastName,
                                                @RequestParam(value = "firstName", required = false) String firstName,
                                                @RequestParam(value = "dob", required = false) LocalDate dob,
                                                @RequestParam(value = "mrn", required = false) String mrn,
                                                @RequestParam(value = "ssn", required = false) String ssn,
                                                @RequestParam(value = "chartNumber", required = false) String chartNumber,
                                                @RequestParam(value = "orderNumber", required = false) String orderNumber,
                                                @RequestParam(value = "billingNumber", required = false) String billingNumber,
                                                @RequestParam(value = "clientCode", required = false) String clientCode,
                                                @RequestParam(value = "externalPatId", required = false) String externalPatId);

}
