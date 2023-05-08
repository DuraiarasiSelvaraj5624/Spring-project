package com.example.Educationloan.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Educationloan.Model.LoginModel;

public interface LoginRepo extends JpaRepository<LoginModel, Integer> {

}
