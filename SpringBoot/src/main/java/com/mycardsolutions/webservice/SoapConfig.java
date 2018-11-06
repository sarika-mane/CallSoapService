package com.mycardsolutions.webservice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import com.mycardsolutions.webservice.service.SoapClient;

@Configuration
public class SoapConfig {

	@Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.mycardsolutions.webservice.soapdto");
        return marshaller;
    }
 
    @Bean
    public SoapClient soapClient(Jaxb2Marshaller marshaller) {
    	SoapClient client = new SoapClient();
        client.setDefaultUri("http://115.249.0.228:8090/Integration.asmx?wsdl");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }
}
