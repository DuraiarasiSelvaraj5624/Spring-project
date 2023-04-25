package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class JsonIgnoreApplication {

	public static void main(String[] args) throws JsonProcessingException{
		SpringApplication.run(JsonIgnoreApplication.class, args);
	  
		Person person = new Person(1,"Arasi",19);
		ObjectMapper mapper=new ObjectMapper();
		String json=mapper.writeValueAsString(person);
		System.out.println(json);
	}

}
