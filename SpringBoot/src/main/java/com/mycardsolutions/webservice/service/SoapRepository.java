package com.mycardsolutions.webservice.service;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mycardsolutions.webservice.soapdto.AdressInfo;
import com.mycardsolutions.webservice.soapdto.ArrayOfAdressInfo;
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
		custInfo.setCustomerNo(customerNo);
		custInfo.setName("Mahesh");
		custInfo.setSurname("Jadhav");
		custInfo.setBirthDate("20000101");
		custInfo.setPassportControlPeriod(7);
		custInfo.setCustomerType("N");
//		JAXBElement<Integer> element = new JAXBElement<Integer>(new QName(""), Integer.class, 444);
//		custInfo.setPhoneWorkExtension(element);
		custInfo.setMainBranchField(200);
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
}
