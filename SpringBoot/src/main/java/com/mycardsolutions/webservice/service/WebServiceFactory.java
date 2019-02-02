package com.mycardsolutions.webservice.service;

import com.mycardsolutions.webservice.soapdto.*;

public class WebServiceFactory {

    public static CreateCustomer getCreateCustomerObject(String customerNo) {
        CreateCustomer newCustomer = new CreateCustomer();

        CustomerInfo custInfo = new CustomerInfo();
        custInfo.setBankingCustomerNo(customerNo);
        custInfo.setName("mahesh");
        custInfo.setSurname("ravi");
        custInfo.setBirthDate("20000101");
        custInfo.setPassportControlPeriod(7);
        custInfo.setCustomerType("N");

//		
        custInfo.setMainBranchField(200);
        custInfo.setMobileNo("9898789898");
        custInfo.setCustomerGroup("C");
        newCustomer.setCustomer(custInfo);


        AdressInfo address = new AdressInfo();
        address.setAdressIdx((short) 1);
        address.setAddress1("Mumbai");

        ArrayOfAdressInfo info = new ArrayOfAdressInfo();
        info.getAdressInfo().add(address);
        custInfo.setAdressList(info);
        return newCustomer;
    }

    public static CreateCard getCreateCardObject(String customerNo) {

        CreateCard card = new CreateCard();

        CardRequest cardRequest = new CardRequest();

        cardRequest.setCustomerNo(customerNo);
        cardRequest.setCardBranch(200);
        cardRequest.setCardDeliveryBranch(200);
        cardRequest.setPinDeliveryBranch(200);
        cardRequest.setApplicationNo("7");
        cardRequest.setProductId("44");
        cardRequest.setCardPostIdx((short) 1);
        cardRequest.setPinPostIdx((short) 1);
        cardRequest.setFinancialType(44);
        cardRequest.setNoCustomer(false);
        cardRequest.setInstantFlag(false);
        cardRequest.setIssuingFeeFlag(true);
        cardRequest.setAnnualFeeFlag(true);
        cardRequest.setCardLevel("M");
        cardRequest.setEmbossType("M");
        cardRequest.setEmbossName1("tester");
        cardRequest.setBankAccountBranch("2020");
        cardRequest.setBankAccountNo("602100000038111");
        cardRequest.setBankAccountSuffix("1010");
        cardRequest.setBankAccountCurrCode("356");
        cardRequest.setIsMainBankAccount("1");

        card.setCardAllocationInfoDbt(cardRequest);

        return card;

    }

    public static SaveDebitBankAccount getSaveDebitBankAccObject(String cardNo) {

        SaveDebitBankAccount saveDebitBankAcc = new SaveDebitBankAccount();

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

        GetDebitBankAccount dbtBnkAcc = new GetDebitBankAccount();

        dbtBnkAcc.setCardNo(cardNo);
        dbtBnkAcc.setBankingCustomerNo("74747474");

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

        GetCardAllLimitAndBalanceInfo cardLimitAndBalanceInfo = new GetCardAllLimitAndBalanceInfo();
        cardLimitAndBalanceInfo.setCardNo(cardNo);
        cardLimitAndBalanceInfo.setLimitType("T");

        return cardLimitAndBalanceInfo;

    }

    public static GetCustomer getCustomer(String customerNo) {
        GetCustomer customer = new GetCustomer();
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
        GetProducts products = new GetProducts();
        return products;
    }

    public static GetTxnDefProcess getTxnDef() {
        GetTxnDefProcess process = new GetTxnDefProcess();
        return process;
    }

    public static UpdateCustomer getUpdateCustomer(String customerNo) {
        UpdateCustomer updateCustomer = new UpdateCustomer();
        CustomerInfo customerInfo = new CustomerInfo();
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

    public static GetCityList GetCities(int stateCode, String countryCode) {
        GetCityList getCityList = new GetCityList();
        getCityList.setStateCode(String.valueOf(stateCode));
        getCityList.setCountryCode(countryCode);
        return getCityList;
    }
    
    public static UpdateCardStatus updateCardStatus(String cardNo) {
    	UpdateCardStatus status=new UpdateCardStatus();
    	status.setEmbossFlag(false);
    	status.setStatus("G");
    	status.setSubStatus("V");
    	status.setCardNo(cardNo);
    	status.setFinancialType((short)44);
    	status.setDeliveryBranch(200);
    	//status.set
    	return status;
    	
    }

}
