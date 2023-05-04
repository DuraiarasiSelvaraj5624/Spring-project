package com.example.car.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.car.Model.Car;

public interface TypesRepo extends JpaRepository<Car, Integer> {

}
