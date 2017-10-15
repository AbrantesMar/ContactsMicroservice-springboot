package com.marcioabrantes.ContactsMicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.marcioabrantes.ContactsMicroservice"})
public class ContactsMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContactsMicroserviceApplication.class, args);
	}
}
