package com.example.OnlineRelationalMapping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.Contact;

@SpringBootApplication

@OpenAPIDefinition( 
	 info =@Info( 
			  title = "Online Shopping", 
			   version = "1.1.2",
			    description = "Online Shopping",
			     contact = @Contact( 
			    		  name = "Duraiarasi",
			    		  email = "duraiarasi0@gmail.com"
			    		  )
			  )
	)
public class OnlineRelationalMappingApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineRelationalMappingApplication.class, args);
	}

}
