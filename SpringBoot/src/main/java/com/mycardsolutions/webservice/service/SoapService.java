package com.mycardsolutions.webservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SoapService {

	@Autowired
	public SoapRepository soapRepository;
	
	public void saveCustomer(String customerNo) {
		soapRepository.createOrUpdateCustomer(customerNo.trim());
	}
	
	public void createCard(String customerNo) {
		soapRepository.createOrUpdateCard(customerNo.trim());
	}
	
	public void saveDebitBankAcc(String cardNo) {
		soapRepository.saveDebitBankAccount(cardNo);
	}
	
	public void getDebitBankAcc(String cardNo) {
		soapRepository.getDebitBankAcc(cardNo);
	}
	
	public void deleteDebitBankAcc(String cardNo) {
		soapRepository.deleteDbtBnkAcc(cardNo);
	}
}
