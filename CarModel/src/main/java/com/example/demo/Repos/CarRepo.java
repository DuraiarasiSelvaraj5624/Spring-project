package com.example.demo.Repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.carmodel;

public interface CarRepo extends JpaRepository<carmodel, Integer> {

}
