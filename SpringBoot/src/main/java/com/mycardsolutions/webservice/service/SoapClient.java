package com.mycardsolutions.webservice.service;

import org.springframework.stereotype.Component;
import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.client.core.WebServiceMessageCallback;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.SoapMessage;

@Component
public class SoapClient extends WebServiceGatewaySupport {
 
    public Object callWebService(String url, Object request){
        return getWebServiceTemplate().marshalSendAndReceive(url, request,
                new WebServiceMessageCallback() {
            public void doWithMessage(WebServiceMessage message) 
            {
                ((SoapMessage)message).setSoapAction("Smartsoft.Integration.Services/CreateCustomer");
            }
       });
    }

}
