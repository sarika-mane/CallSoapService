package com.mycardsolutions.webservice.service;

import com.mycardsolutions.webservice.soapdto.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class SoapRepository {

    private static final Logger logger = LoggerFactory.getLogger(SoapRepository.class);

    @Autowired
    public SoapClient soapClient;

    private static final String URL = "http://115.249.0.228:8090/Integration.asmx?wsdl";

    public void createOrUpdateCustomer(String customerNo) {
        logger.info("Input Params: " + customerNo);
        logger.info("Calling third party SOAP request here...");


        CreateCustomerResponse response = (CreateCustomerResponse) soapClient.callWebService(URL, WebServiceFactory.getCreateCustomerObject(customerNo));
        logger.info("Response Code: " + response.getCreateCustomerResult().getReturnCode());
        logger.info("Response Desc: " + response.getCreateCustomerResult().getReturnDescription());
    }

    public void createOrUpdateCard(String customerNo) {
        logger.info("Input Params: " + customerNo);
        logger.info("Calling third party SOAP request here...");

        CreateCardResponse response = (CreateCardResponse) soapClient.callCreateCardService(URL, WebServiceFactory.getCreateCardObject(customerNo));
        logger.info("Response Card No: " + response.getCreateCardResult().getCardNo());
        logger.info("Response Card Desc: " + response.getCreateCardResult().getReturnDescription());
    }

    public void saveDebitBankAccount(String cardNo) {

        logger.info("Input Params: " + cardNo);
        logger.info("Calling third party SOAP request here...");

        SaveDebitBankAccountResponse response = (SaveDebitBankAccountResponse) soapClient.callCreateCardService(URL, WebServiceFactory.getSaveDebitBankAccObject(cardNo));
        logger.info("Response Retrun Code: " + response.getSaveDebitBankAccountResult().getReturnCode());
        logger.info("Response Return Desc: " + response.getSaveDebitBankAccountResult().getReturnDescription());

    }

    public void getDebitBankAcc(String cardNo) {

        logger.info("Input Params: " + cardNo);
        logger.info("Calling third party SOAP request here...");

        GetDebitBankAccountResponse response = (GetDebitBankAccountResponse) soapClient.callCreateCardService(URL, WebServiceFactory.getDebitBankAccObject(cardNo));
        logger.info("Response Card No: " + response.getGetDebitBankAccountResult().getCardNo());
        logger.info("Response Bank Branch: " + response.getGetDebitBankAccountResult().getBankAccountBranch());
        logger.info("Response Bank Acc No: " + response.getGetDebitBankAccountResult().getBankAccountNo());
        logger.info("Response Current Code: " + response.getGetDebitBankAccountResult().getBankAccountCurrCode());

    }

    public void deleteDbtBnkAcc(String cardNo) {
        logger.info("Input Params: " + cardNo);
        logger.info("Calling third party SOAP request here...");

        DeleteDebitBankAccountResponse response = (DeleteDebitBankAccountResponse) soapClient.callCreateCardService(URL, WebServiceFactory.deleteDbtAccObject(cardNo));
        logger.info("Response Return Code: " + response.getDeleteDebitBankAccountResult().getReturnCode());
        logger.info("Response Error Detail: " + response.getDeleteDebitBankAccountResult().getErrorDetail());
        logger.info("Response Retrun Description: " + response.getDeleteDebitBankAccountResult().getReturnDescription());


    }

    public void getCardInfo(String cardNo) {

        logger.info("Input Params: " + cardNo);
        logger.info("Calling third party SOAP request here...");

        SWGetCardInfoResponseResponse response = (SWGetCardInfoResponseResponse) soapClient.callCreateCardService(URL, WebServiceFactory.getCardInfoObject(cardNo));
        logger.info("Response Retrun Code: " + response.getSWGetCardInfoResponseResult().getReturnCode());
        logger.info("Response Return Card List: " + response.getSWGetCardInfoResponseResult().getCardInfoList().toString());

    }

    public void getCardAllLimitAndBalance(String cardNo) {

        logger.info("Input Params: " + cardNo);
        logger.info("Calling third party SOAP request here...");

        GetCardAllLimitAndBalanceInfoResponse response = (GetCardAllLimitAndBalanceInfoResponse) soapClient.callCreateCardService(URL, WebServiceFactory.getCardLimitAndBalanceObj(cardNo));
        logger.info("Response Retrun Result: " + response.getGetCardAllLimitAndBalanceInfoResult());
//		logger.info("Response Return Object: " + response.getGetCardAllLimitAndBalanceInfoResult().getLimitDetailList().toString());

    }

    public void getCustomer(String customerNo) {

        logger.info("Input Params: " + customerNo);
        logger.info("Calling third party SOAP request here...");

        GetCustomerResponse response = (GetCustomerResponse) soapClient.callCreateCardService(URL, WebServiceFactory.getCustomer(customerNo));
        logger.info("Response Retrun Result: " + response.getGetCustomerResult());
        logger.info("Response Customer No: " + response.getGetCustomerResult().getCustomer().getCustomerNo());

    }

    public void getCustomerCardInfo(String cardNo) {

        logger.info("Input Params: " + cardNo);
        logger.info("Calling third party SOAP request here...");

        GetCustomerCardInfoResponse response = (GetCustomerCardInfoResponse) soapClient.callCreateCardService(URL, WebServiceFactory.getCustomerCardInfo(cardNo));
        logger.info("Response Retrun Result: " + response.getGetCustomerCardInfoResult().getCustomerCardList().toString());
//		logger.info("Response Return Object: " + response.getGetCardAllLimitAndBalanceInfoResult().getLimitDetailList().toString());

    }

    public void getCardStatus() {

        //logger.info("Input Params: " + cardNo);
        logger.info("Calling third party SOAP request here...");

        GetCardStatusResponse response = (GetCardStatusResponse) soapClient.callCreateCardService(URL, WebServiceFactory.getCardStatus());
        logger.info("Response Retrun Result: " + response.getGetCardStatusResult().getCardStatusList().toString());
//		logger.info("Response Return Object: " + response.getGetCardAllLimitAndBalanceInfoResult().getLimitDetailList().toString());

    }

    public void getProducts() {

        //logger.info("Input Params: " + cardNo);
        logger.info("Calling third party SOAP request here...");

        GetProductsResponse response = (GetProductsResponse) soapClient.callCreateCardService(URL, WebServiceFactory.getProducts());
        logger.info("Response Retrun Result: " + response.getGetProductsResult().getProductList().toString());
//		logger.info("Response Return Object: " + response.getGetCardAllLimitAndBalanceInfoResult().getLimitDetailList().toString());

    }

    public void getTxnDef() {

        //logger.info("Input Params: " + cardNo);
        logger.info("Calling third party SOAP request here...");

        GetTxnDefProcessResponse response = (GetTxnDefProcessResponse) soapClient.callCreateCardService(URL, WebServiceFactory.getTxnDef());
        logger.info("Response Retrun Result: " + response.getGetTxnDefProcessResult());
        logger.info("Response Return List: " + response.getGetTxnDefProcessResult().getTxnDefList());

    }

    public void updateCustomer(String customerNo) {

        //logger.info("Input Params: " + cardNo);
        logger.info("Calling third party SOAP request here...");

        UpdateCustomerResponse response = (UpdateCustomerResponse) soapClient.callCreateCardService(URL, WebServiceFactory.getUpdateCustomer(customerNo));
        logger.info("Response Retrun Result: " + response.getUpdateCustomerResult().getResult());
//		logger.info("Response Return Object: " + response.getGetCardAllLimitAndBalanceInfoResult().getLimitDetailList().toString());

    }

    public void getLogoCodes() {

        //logger.info("Input Params: " + cardNo);
        logger.info("Calling third party SOAP request here...");

        GetLogoCodesResponse response = (GetLogoCodesResponse) soapClient.callCreateCardService(URL, WebServiceFactory.getLogoCodes());
        logger.info("Response Retrun Result: " + response.getGetLogoCodesResult());
//		logger.info("Response Return Object: " + response.getGetCardAllLimitAndBalanceInfoResult().getLimitDetailList().toString());

    }

    public GetCityListResponse getCities(GetCityList getCityList) {
        System.out.println("SoapRepository.getCities");
        GetCityListResponse cityListResponse = (GetCityListResponse) soapClient.callWebService(
                URL,
                getCityList);
        return cityListResponse;
    }

    public Object getCardStatControl(CardStatControlRsp cardStatControlRsp) {
        return soapClient.callWebService(URL, cardStatControlRsp);
    }

    public Object isCardVerified(CardVerificationResp cardVerificationResp) {
        return soapClient.callWebService(URL, cardVerificationResp);
    }

    public Object controlEOD() {
        return soapClient.callWebService(URL, new ControlEOD());
    }

    public Object tokenCardNumber(DeTokenCardNumber deTokenCardNumber) {
        return soapClient.callWebService(URL, deTokenCardNumber);
    }

    public Object cardRenewal(CardRenewalProcess cardRenewalProcess) {
        return soapClient.callWebService(URL, cardRenewalProcess);
    }

    public GetStateListResponse getStates(GetStateList getStateList) {
        return (GetStateListResponse) soapClient.callWebService(URL, getStateList);
    }

    public CreateCustomerResponse createCustomer(CreateCustomer createCustomer) {
        return (CreateCustomerResponse) soapClient.callWebService(URL, createCustomer);
    }
    
    public void updateCardStatus(String cardNo) {

        //logger.info("Input Params: " + cardNo);
        logger.info("Calling third party SOAP request here...");

        UpdateCardStatusResponse response = (UpdateCardStatusResponse) soapClient.callCreateCardService(URL, WebServiceFactory.updateCardStatus(cardNo));
        logger.info("Response Retrun Result: " + response.getUpdateCardStatusResult().getResult());
//		logger.info("Response Return Object: " + response.getGetCardAllLimitAndBalanceInfoResult().getLimitDetailList().toString());

    }
}
