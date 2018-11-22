package com.mycardsolutions.webservice.service;

import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;
import javax.xml.transform.TransformerException;

import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.client.core.WebServiceMessageCallback;
import org.springframework.ws.soap.SoapHeader;
import org.springframework.ws.soap.SoapMessage;
import org.springframework.ws.soap.saaj.SaajSoapMessage;

import com.mycardsolutions.webservice.soapdto.RequestHeader;

public class SecurityHeader implements WebServiceMessageCallback {

	private RequestHeader requestHeader;

    public SecurityHeader(RequestHeader authentication) {
        this.requestHeader = authentication;
    }

    @Override
    public void doWithMessage(WebServiceMessage message) throws IOException, TransformerException {
    	((SoapMessage)message).setSoapAction("Smartsoft.Integration.Services/CreateCustomer");
    	
    	SoapHeader soapHeader = ((SoapMessage)message).getSoapHeader();

        try {
            JAXBContext context = JAXBContext.newInstance(RequestHeader.class);

            Marshaller marshaller = context.createMarshaller();
            marshaller.marshal(requestHeader, soapHeader.getResult());

        } catch (JAXBException e) {
        	e.printStackTrace();
            throw new IOException("error while marshalling authentication.");
            
        }
        
//        SaajSoapMessage saajSoapMessage = (SaajSoapMessage)message;
//		saajSoapMessage.setSoapAction("Smartsoft.Integration.Services/CreateCustomer");   		
//		
//		try {    		
//    		SOAPMessage soapMessage = saajSoapMessage.getSaajMessage();
//    		SOAPPart soapPart = soapMessage.getSOAPPart();
//    		SOAPEnvelope envelope = soapPart.getEnvelope();
//    		
//    		
//    		envelope.removeNamespaceDeclaration(envelope.getPrefix());
//    		envelope.addNamespaceDeclaration("soap", 
//    					"http://schemas.xmlsoap.org/soap/envelope/");
//    		envelope.addNamespaceDeclaration("xsi", 
//					"http://www.w3.org/2001/XMLSchema-instance");
//    		envelope.addNamespaceDeclaration("xsd", 
//					"http://www.w3.org/2001/XMLSchema");
//    			
//    		/*envelope.setPrefix("soap");   			
//       		envelope.setPrefix("xsi");
//       		envelope.setPrefix("xsd");*/
//    		
//    		/*AuthorizationHeader authHeader = 
//    			bugzyMessage.getAuthorizationHeader(bugzyMessage.getUserName(), 
//    					bugzyMessage.getPassword());    			
//    		
//    		header.addChildElement(authHeader.getSoapElement()); */
//       		JAXBContext context = JAXBContext.newInstance(RequestHeader.class);
//
//            Marshaller marshaller = context.createMarshaller();
//            SoapHeader soapHeader = ((SoapMessage)envelope).getSoapHeader();
//            marshaller.marshal(requestHeader, soapHeader.getResult());
//		}
//		catch(SOAPException | JAXBException e) {
//			e.printStackTrace();
//            throw new IOException("error while marshalling authentication.");
//		} 
        
    }
}
