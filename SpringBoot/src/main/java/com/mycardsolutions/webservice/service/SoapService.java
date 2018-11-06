package com.mycardsolutions.webservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SoapService {

	@Autowired
	public SoapRepository soapRepository;
	
	public void saveCustomer(String customerNo) {
		soapRepository.createOrUpdateCustomer(customerNo);
	}
}
