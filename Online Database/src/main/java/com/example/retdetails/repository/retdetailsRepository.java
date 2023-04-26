package com.example.retdetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.retdetails.Model.RetdetailClass;
@Repository
public interface retdetailsRepository extends JpaRepository<RetdetailClass, Integer> {

}
