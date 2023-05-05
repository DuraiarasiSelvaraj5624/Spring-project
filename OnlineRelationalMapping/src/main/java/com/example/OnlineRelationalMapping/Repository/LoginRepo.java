package com.example.OnlineRelationalMapping.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.OnlineRelationalMapping.Model.LoginModel;

public interface LoginRepo extends JpaRepository<LoginModel, Integer> {

}
