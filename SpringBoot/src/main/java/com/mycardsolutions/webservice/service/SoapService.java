package com.mycardsolutions.webservice.service;

import com.mycardsolutions.webservice.soapdto.GetCityList;
import com.mycardsolutions.webservice.soapdto.GetCityListResponse;
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

    public void getCardInfo(String cardNo) {
        soapRepository.getCardInfo(cardNo);
    }

    public void getCardAllBalanceAndLimit(String cardNo) {
        soapRepository.getCardAllLimitAndBalance(cardNo);
    }

    public void getCustomer(String customerNo) {
        soapRepository.getCustomer(customerNo);
        ;
    }

    public void getCustomerCardInfo(String cardNo) {
        soapRepository.getCustomerCardInfo(cardNo);
    }

    public void getCardStatus() {
        soapRepository.getCardStatus();
    }

    public void getProducts() {
        soapRepository.getProducts();
    }

    public void getTxnDef() {
        soapRepository.getTxnDef();
    }

    public void updateCustomer(String customerNo) {
        soapRepository.updateCustomer(customerNo);
    }

    public void getLogoCodes() {
        soapRepository.getLogoCodes();
    }

    public GetCityListResponse getCities(GetCityList getCityList) {
        GetCityListResponse cities = soapRepository.getCities(getCityList);
        return cities;
    }
}
