package com.mycardsolutions.webservice.service;

import com.mycardsolutions.webservice.soapdto.AdressInfo;
import com.mycardsolutions.webservice.soapdto.ArrayOfAdressInfo;
import com.mycardsolutions.webservice.soapdto.CardRequest;
import com.mycardsolutions.webservice.soapdto.CreateCard;
import com.mycardsolutions.webservice.soapdto.CreateCustomer;
import com.mycardsolutions.webservice.soapdto.CustomerInfo;
import com.mycardsolutions.webservice.soapdto.DbtBankAccountInput;
import com.mycardsolutions.webservice.soapdto.SaveDebitBankAccount;

public class WebServiceFactory {

	public static CreateCustomer getCreateCustomerObject(String customerNo) {
		CreateCustomer newCustomer = new CreateCustomer();
		
		CustomerInfo custInfo = new CustomerInfo();
		custInfo.setBankingCustomerNo(customerNo);
		custInfo.setName("Mahesh");
		custInfo.setSurname("Jadhav");
		custInfo.setBirthDate("20000101");
		custInfo.setPassportControlPeriod(7);
		custInfo.setCustomerType("N");
		
//		
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
		return newCustomer;
	}
	
	public static CreateCard getCreateCardObject(String customerNo) {
		
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
		cardRequest.setNoCustomer(true);
		cardRequest.setInstantFlag(false);
		cardRequest.setIssuingFeeFlag(true);
		cardRequest.setAnnualFeeFlag(true);
		cardRequest.setCardLevel("M");
		cardRequest.setEmbossType("M");
		cardRequest.setEmbossName1("Username");
		
		card.setCardAllocationInfoDbt(cardRequest);
		
		return card;
		
	}
	
	public static SaveDebitBankAccount getSaveDebitBankAccObject(String cardNo) {
		
		SaveDebitBankAccount saveDebitBankAcc =  new SaveDebitBankAccount();
		
		DbtBankAccountInput dbtBankAccInput = new DbtBankAccountInput();
		
		dbtBankAccInput.setCardNo(cardNo);
		dbtBankAccInput.setBankAccountBranch("2020");
		dbtBankAccInput.setBankAccountNo("6203982");
		dbtBankAccInput.setBankAccountSuffix("1010");
		dbtBankAccInput.setBankAccountCurrCode("356");
		dbtBankAccInput.setIsMainBankAccount("1");
		
		saveDebitBankAcc.setInput(dbtBankAccInput);
		
		return saveDebitBankAcc;
		
		
	}
	
}
