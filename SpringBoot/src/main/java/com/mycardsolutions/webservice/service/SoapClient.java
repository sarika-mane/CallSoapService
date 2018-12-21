package com.mycardsolutions.webservice.service;

import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import com.mycardsolutions.webservice.soapdto.RequestHeader;

@Component
public class SoapClient extends WebServiceGatewaySupport {
 
    public Object callWebService(String url, Object request){
        /*return getWebServiceTemplate().marshalSendAndReceive(url, request,
                new WebServiceMessageCallback() {
            public void doWithMessage(WebServiceMessage message) 
            {
                ((SoapMessage)message).setSoapAction("Smartsoft.Integration.Services/CreateCustomer");
            }
       });*/
    	RequestHeader requestHeader = new RequestHeader();
    	requestHeader.setUserCode("SA");
    	requestHeader.setMbrId((short) 1);
    	requestHeader.setLanguage("EN");
    	return getWebServiceTemplate().marshalSendAndReceive(url, request,
                new SecurityHeader(requestHeader));
       
    }
    
    public Object callCreateCardService(String url, Object request) {
    	
    	RequestHeader requestHeader = new RequestHeader();
    	requestHeader.setUserCode("SA");
    	requestHeader.setMbrId((short) 1);
    	requestHeader.setLanguage("EN");
    	return getWebServiceTemplate().marshalSendAndReceive(url, request,
                new SecurityHeader(requestHeader));
    }
    
    public Object callSaveDebitBankAccService(String url, Object request) {
    	RequestHeader requestHeader = new RequestHeader();
    	requestHeader.setUserCode("SA");
    	requestHeader.setMbrId((short) 1);
    	requestHeader.setLanguage("EN");
    	return getWebServiceTemplate().marshalSendAndReceive(url, request,
                new SecurityHeader(requestHeader));
    }

}
