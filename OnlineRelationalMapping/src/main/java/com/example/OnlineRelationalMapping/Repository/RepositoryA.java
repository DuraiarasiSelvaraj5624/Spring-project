package com.example.OnlineRelationalMapping.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.OnlineRelationalMapping.Model.ModelClassq;

public interface RepositoryA extends JpaRepository<ModelClassq, Integer> {
	

}
