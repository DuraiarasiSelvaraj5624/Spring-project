package com.example.clownstars.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.clownstars.model.Clownmodel;

public interface Clownrep extends JpaRepository<Clownmodel, Integer> {

}
