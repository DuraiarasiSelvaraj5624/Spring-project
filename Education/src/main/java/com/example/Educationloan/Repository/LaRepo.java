package com.example.Educationloan.Repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.Educationloan.Model.LoanApplicationModel;


public interface LaRepo extends JpaRepository<LoanApplicationModel, Integer> {

}
