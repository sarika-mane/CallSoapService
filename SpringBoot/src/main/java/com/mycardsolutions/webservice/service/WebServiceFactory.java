package com.mycardsolutions.webservice.service;

import com.mycardsolutions.webservice.soapdto.AdressInfo;
import com.mycardsolutions.webservice.soapdto.ArrayOfAdressInfo;
import com.mycardsolutions.webservice.soapdto.CardDci;
import com.mycardsolutions.webservice.soapdto.CardRequest;
import com.mycardsolutions.webservice.soapdto.CreateCard;
import com.mycardsolutions.webservice.soapdto.CreateCustomer;
import com.mycardsolutions.webservice.soapdto.CustomerInfo;
import com.mycardsolutions.webservice.soapdto.DbtBankAccountInput;
import com.mycardsolutions.webservice.soapdto.DeleteDebitBankAccount;
import com.mycardsolutions.webservice.soapdto.GetCardAllLimitAndBalanceInfo;
import com.mycardsolutions.webservice.soapdto.GetCardStatus;
import com.mycardsolutions.webservice.soapdto.GetCustomer;
import com.mycardsolutions.webservice.soapdto.GetCustomerCardInfo;
import com.mycardsolutions.webservice.soapdto.GetDebitBankAccount;
import com.mycardsolutions.webservice.soapdto.GetLogoCodes;
import com.mycardsolutions.webservice.soapdto.GetProducts;
import com.mycardsolutions.webservice.soapdto.GetTxnDefProcess;
import com.mycardsolutions.webservice.soapdto.SWGetCardInfoResponse;
import com.mycardsolutions.webservice.soapdto.SaveDebitBankAccount;
import com.mycardsolutions.webservice.soapdto.UpdateCustomer;

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
	
	public static GetDebitBankAccount getDebitBankAccObject(String cardNo) {
		
		GetDebitBankAccount dbtBnkAcc= new GetDebitBankAccount();
		
		dbtBnkAcc.setCardNo("6074187397891725");
		dbtBnkAcc.setBankingCustomerNo("13828192");
		
		return dbtBnkAcc;
	}
	
	public static DeleteDebitBankAccount deleteDbtAccObject(String cardNo) {
		DeleteDebitBankAccount dltDbtAccObj = new DeleteDebitBankAccount();
		
		DbtBankAccountInput input = new DbtBankAccountInput();
		input.setBankAccountBranch("2020");
		input.setBankAccountCurrCode("356");
		input.setBankAccountNo("6203982");
		input.setBankAccountSuffix("1010");
		input.setIsMainBankAccount("1");
		input.setCardNo(cardNo);
		
		dltDbtAccObj.setInput(input);
		
		return dltDbtAccObj;
		
	}
	
	public static SWGetCardInfoResponse getCardInfoObject(String cardNo) {
		
		SWGetCardInfoResponse cardInfoResponse = new SWGetCardInfoResponse();
		cardInfoResponse.setCustomerNo("10206");
		cardInfoResponse.setCardNo("607418vdkttn2369");
//		cardInfoResponse.setBarcodeNo("");
		cardInfoResponse.setCardDci(CardDci.DEBIT);
//		cardInfoResponse.setCustomerGSMNo("");
//		cardInfoResponse.setCustomerName("");
//		cardInfoResponse.setCustomerMidleName("");
//		cardInfoResponse.setCustomerSurname("");
//		
		return cardInfoResponse;
		
		
	}
	
	public static GetCardAllLimitAndBalanceInfo getCardLimitAndBalanceObj(String cardNo) {
		
		GetCardAllLimitAndBalanceInfo cardLimitAndBalanceInfo= new GetCardAllLimitAndBalanceInfo();
		cardLimitAndBalanceInfo.setCardNo(cardNo);
		cardLimitAndBalanceInfo.setLimitType("S");
		
		return cardLimitAndBalanceInfo;
		
	}
	
	public static GetCustomer getCustomer(String customerNo) {
		GetCustomer customer= new GetCustomer();
		customer.setCustomerNo(customerNo);
		return customer;
	}
	
	public static GetCustomerCardInfo getCustomerCardInfo(String cardNo) {
		GetCustomerCardInfo object = new GetCustomerCardInfo();
		object.setCardNo(cardNo);
		object.setBankingCustomerno("9109090");
		return object;
	}
	
	public static GetCardStatus getCardStatus() {
		GetCardStatus status = new GetCardStatus();
		return status;
	}
	
	public static GetProducts getProducts() {
		GetProducts products=new GetProducts();
		return products;
	}
	
	public static GetTxnDefProcess getTxnDef() {
		GetTxnDefProcess process =  new GetTxnDefProcess();
		return process;
	}
	
	public static UpdateCustomer getUpdateCustomer(String customerNo) {
		UpdateCustomer updateCustomer = new UpdateCustomer();
		CustomerInfo customerInfo= new CustomerInfo();
		customerInfo.setName("A");
		customerInfo.setMidName("B");
		customerInfo.setSurname("C");
		customerInfo.setBirthDate("19910202");
		customerInfo.setCustomerType("N");
		customerInfo.setCustomerGroup("C");
		updateCustomer.setCustomer(customerInfo);
		return updateCustomer;
		
	}
	
	public static GetLogoCodes getLogoCodes() {
		return new GetLogoCodes();
	}
	
	
	
//	public static GetDebitBankAccount getDebitBankAccountObject(String ) {
//		
//	}
	
}
