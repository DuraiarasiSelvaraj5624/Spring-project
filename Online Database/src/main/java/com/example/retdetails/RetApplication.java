package com.example.retdetails;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(

		info =@Info(

				title = "Online Shopping",

				version = "1.1.2",

				description = "Online Shopping Project",

				contact = @Contact(

						name = "Duraiarasi",

						email = "duraiarasi0@gmail.com"

						)

				)

	)
public class RetApplication {

	public static void main(String[] args) {
		SpringApplication.run(RetApplication.class, args);
	}

}
