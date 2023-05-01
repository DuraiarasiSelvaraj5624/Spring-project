package com.example.retdetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.retdetails.Model.LoginModel;

public interface LoginRepo extends JpaRepository<LoginModel, Integer> {
	
   LoginModel findBylname(String lname);
}
