package com.mycardsolutions.webservice.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mycardsolutions.webservice.soapdto.CreateCardResponse;
import com.mycardsolutions.webservice.soapdto.CreateCustomerResponse;
import com.mycardsolutions.webservice.soapdto.DeleteDebitBankAccountResponse;
import com.mycardsolutions.webservice.soapdto.GetDebitBankAccountResponse;
import com.mycardsolutions.webservice.soapdto.SaveDebitBankAccountResponse;

@Repository
public class SoapRepository {

	private static final Logger logger = LoggerFactory.getLogger(SoapRepository.class);
	
	@Autowired
	public SoapClient soapClient;
	
	private static final String URL = "http://115.249.0.228:8090/Integration.asmx?wsdl";
	
	public void createOrUpdateCustomer(String customerNo) {
		logger.info("Input Params: " + customerNo);
		logger.info("Calling third party SOAP request here...");
		
		
		CreateCustomerResponse response = (CreateCustomerResponse)soapClient.callWebService(URL, WebServiceFactory.getCreateCustomerObject(customerNo));
		logger.info("Response Code: " + response.getCreateCustomerResult().getReturnCode());
		logger.info("Response Desc: " + response.getCreateCustomerResult().getReturnDescription());
	}
	
	public void createOrUpdateCard(String customerNo) {
		logger.info("Input Params: " + customerNo);
		logger.info("Calling third party SOAP request here...");
		
		CreateCardResponse response = (CreateCardResponse) soapClient.callCreateCardService(URL, WebServiceFactory.getCreateCardObject(customerNo));
		logger.info("Response Card No: " + response.getCreateCardResult().getCardNo());
		logger.info("Response Card Desc: " + response.getCreateCardResult().getReturnDescription() );
	}
	
	public void saveDebitBankAccount(String cardNo) {
		
		logger.info("Input Params: " + cardNo);
		logger.info("Calling third party SOAP request here...");
		
		SaveDebitBankAccountResponse response = (SaveDebitBankAccountResponse) soapClient.callCreateCardService(URL, WebServiceFactory.getSaveDebitBankAccObject(cardNo));
		logger.info("Response Retrun Code: " + response.getSaveDebitBankAccountResult().getReturnCode());
		logger.info("Response Return Desc: " + response.getSaveDebitBankAccountResult().getReturnDescription() );
		
	}
	
	public void getDebitBankAcc(String cardNo) {
		
		logger.info("Input Params: " + cardNo);
		logger.info("Calling third party SOAP request here...");
		
		 GetDebitBankAccountResponse response =  (GetDebitBankAccountResponse) soapClient.callCreateCardService(URL, WebServiceFactory.getDebitBankAccObject(cardNo));
		logger.info("Response Card No: " + response.getGetDebitBankAccountResult().getCardNo());
		logger.info("Response Bank Branch: " + response.getGetDebitBankAccountResult().getBankAccountBranch() );
		logger.info("Response Bank Acc No: " + response.getGetDebitBankAccountResult().getBankAccountNo() );
		logger.info("Response Current Code: " + response.getGetDebitBankAccountResult().getBankAccountCurrCode() );
		
	}
	
	public void deleteDbtBnkAcc(String cardNo) {
		logger.info("Input Params: " + cardNo);
		logger.info("Calling third party SOAP request here...");
		
		 DeleteDebitBankAccountResponse response =   (DeleteDebitBankAccountResponse) soapClient.callCreateCardService(URL, WebServiceFactory.deleteDbtAccObject(cardNo));
		logger.info("Response Return Code: " + response.getDeleteDebitBankAccountResult().getReturnCode());
		logger.info("Response Error Detail: " + response.getDeleteDebitBankAccountResult().getErrorDetail());
		logger.info("Response Retrun Description: " + response.getDeleteDebitBankAccountResult().getReturnDescription());
		
		
	}
	
}
