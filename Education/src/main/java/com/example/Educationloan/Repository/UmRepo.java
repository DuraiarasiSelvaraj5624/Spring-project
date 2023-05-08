package com.example.Educationloan.Repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.Educationloan.Model.UserModel;


public interface UmRepo extends JpaRepository<UserModel, Integer> {


}
