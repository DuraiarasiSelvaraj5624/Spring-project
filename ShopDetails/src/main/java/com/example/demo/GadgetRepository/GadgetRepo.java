package com.example.demo.GadgetRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.GadgetModel.Gadgetdetails;

public interface GadgetRepo extends JpaRepository<Gadgetdetails, Integer> {

}
