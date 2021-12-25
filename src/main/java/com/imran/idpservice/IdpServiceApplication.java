package com.imran.idpservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.imran.*")
public class IdpServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(IdpServiceApplication.class, args);
	}

}
