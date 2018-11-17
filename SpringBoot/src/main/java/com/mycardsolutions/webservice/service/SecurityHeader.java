package com.mycardsolutions.webservice.service;

import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.transform.TransformerException;

import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.client.core.WebServiceMessageCallback;
import org.springframework.ws.soap.SoapHeader;
import org.springframework.ws.soap.SoapMessage;

import com.mycardsolutions.webservice.soapdto.SWSessionInfo;

public class SecurityHeader implements WebServiceMessageCallback {

	private SWSessionInfo authentication;

    public SecurityHeader(SWSessionInfo authentication) {
        this.authentication = authentication;
    }

    @Override
    public void doWithMessage(WebServiceMessage message) throws IOException, TransformerException {
    	((SoapMessage)message).setSoapAction("Smartsoft.Integration.Services/CreateCustomer");
    	
    	SoapHeader soapHeader = ((SoapMessage)message).getSoapHeader();

        try {
            JAXBContext context = JAXBContext.newInstance(SWSessionInfo.class);

            Marshaller marshaller = context.createMarshaller();
            marshaller.marshal(authentication, soapHeader.getResult());

        } catch (JAXBException e) {
        	e.printStackTrace();
            throw new IOException("error while marshalling authentication.");
            
        }
    }
}
