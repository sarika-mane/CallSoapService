package com.mycardsolutions.webservice.controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mycardsolutions.webservice.pojo.Customer;
import com.mycardsolutions.webservice.service.SoapService;

@RestController
@RequestMapping(path = "/")
public class SoapServiceController {

	private static Logger logger = LoggerFactory.getLogger(SoapServiceController.class);
	
	@Autowired
	public SoapService soapService;
	
	@RequestMapping(method = RequestMethod.GET)
	public String home() {
		return "Hello World";
	}
	
	@RequestMapping(path = "/CreateCustomer", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Map<String, Object>> saveCustomer(@RequestBody Customer customerNo) { //@RequestBody
		logger.debug("Input Parameters: " + customerNo);
		soapService.saveCustomer(customerNo.getCustomerNo());
		Map<String, Object> resultMap = new HashMap<>();
		resultMap.put("Result", "OK");
		return new ResponseEntity<Map<String, Object>>(resultMap, HttpStatus.OK);

	}
}
