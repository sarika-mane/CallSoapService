package com.mycardsolutions.webservice.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mycardsolutions.webservice.soapdto.AdressInfo;
import com.mycardsolutions.webservice.soapdto.ArrayOfAdressInfo;
import com.mycardsolutions.webservice.soapdto.CardAllTransectionsResponse;
import com.mycardsolutions.webservice.soapdto.CardRequest;
import com.mycardsolutions.webservice.soapdto.CreateCard;
import com.mycardsolutions.webservice.soapdto.CreateCardResponse;
import com.mycardsolutions.webservice.soapdto.CreateCustomer;
import com.mycardsolutions.webservice.soapdto.CreateCustomerResponse;
import com.mycardsolutions.webservice.soapdto.CustomerInfo;

@Repository
public class SoapRepository {

	private static final Logger logger = LoggerFactory.getLogger(SoapRepository.class);
	
	@Autowired
	public SoapClient soapClient;
	
	private static final String URL = "http://115.249.0.228:8090/Integration.asmx?wsdl";
	
	public void createOrUpdateCustomer(String customerNo) {
		logger.info("Input Params: " + customerNo);
		logger.info("Calling third party SOAP request here...");
		CreateCustomer newCustomer = new CreateCustomer();
		
		CustomerInfo custInfo = new CustomerInfo();
		custInfo.setBankingCustomerNo(customerNo);
		custInfo.setName("Mahesh");
		custInfo.setSurname("Jadhav");
		custInfo.setBirthDate("20000101");
		custInfo.setPassportControlPeriod(7);
		custInfo.setCustomerType("N");
		
//		JAXBElement<Integer> element = new JAXBElement<Integer>(new QName("PhoneWorkExtension","ns2"), Integer.class, 444);
//		custInfo.setPhoneWorkExtension(444);
		custInfo.setMainBranchField(200);
		custInfo.setMobileNo("9898989898");
		custInfo.setCustomerGroup("C");
		newCustomer.setCustomer(custInfo);
		
		
		AdressInfo address = new AdressInfo();
		address.setAdressIdx((short)1);
		address.setAddress1("Mumbai");
		
		ArrayOfAdressInfo info = new ArrayOfAdressInfo();
		info.getAdressInfo().add(address);
		custInfo.setAdressList(info);
		
		
		CreateCustomerResponse response = (CreateCustomerResponse)soapClient.callWebService(URL, newCustomer);
		logger.info("Response Code: " + response.getCreateCustomerResult().getReturnCode());
		logger.info("Response Desc: " + response.getCreateCustomerResult().getReturnDescription());
	}
	
	public void createOrUpdateCard(String customerNo) {
		logger.info("Input Params: " + customerNo);
		logger.info("Calling third party SOAP request here...");
		
		CreateCard card= new CreateCard();
		
		CardRequest cardRequest=new CardRequest();
		
		cardRequest.setCustomerNo(customerNo);
		cardRequest.setCardBranch(200);
		cardRequest.setCardDeliveryBranch(200);
		cardRequest.setPinDeliveryBranch(200);
		cardRequest.setApplicationNo("4");
		cardRequest.setProductId("44");
		cardRequest.setCardPostIdx((short)1);
		cardRequest.setPinPostIdx((short)1);
		cardRequest.setFinancialType(44);
		cardRequest.setNoCustomer(false);
		cardRequest.setInstantFlag(false);
		cardRequest.setIssuingFeeFlag(true);
		cardRequest.setAnnualFeeFlag(true);
		cardRequest.setCardLevel("M");
		
		
		
		card.setCardAllocationInfoDbt(cardRequest);
		
		CreateCardResponse response = (CreateCardResponse) soapClient.callCreateCardService(URL, card);
		logger.info("Response Card No: " + response.getCreateCardResult().getCardNo());
		logger.info("Response Card Desc: " + response.getCreateCardResult().getReturnDescription() );
	}
}
