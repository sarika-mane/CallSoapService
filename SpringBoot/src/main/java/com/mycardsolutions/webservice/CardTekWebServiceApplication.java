package com.mycardsolutions.webservice;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.mycardsolutions.webservice"})
public class CardTekWebServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CardTekWebServiceApplication.class, args);
	}
}
