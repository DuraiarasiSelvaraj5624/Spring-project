package com.example.clownstars.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.clownstars.model.login;

@Repository
public interface loginrepo extends JpaRepository<login , String> {

	login findByusername(String username);
	      
}

