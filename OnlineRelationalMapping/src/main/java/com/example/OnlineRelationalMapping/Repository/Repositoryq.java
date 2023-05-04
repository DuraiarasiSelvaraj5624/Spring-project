package com.example.OnlineRelationalMapping.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.OnlineRelationalMapping.Model.ModelClassq;

import jakarta.transaction.Transactional;

public interface Repositoryq extends JpaRepository<ModelClassq, Integer> {
	
	
	@Query(value="select * from ModelClassq",nativeQuery = true)
	public List<ModelClassq> get();
	
	@Query(value="select * from ModelClassq where pno = ?1", nativeQuery = true)
	public List<ModelClassq> getD(@Param("pno") int pno);

	

	@Modifying

	@Transactional

	@Query(value="update ModelClassq set pno =:pno where name =:name",nativeQuery=true)

	public void  update(@Param("pno") int firmno,@Param("name") String name);

	



	@Modifying

	@Transactional

	@Query(value="delete from pno where pno=:pno and name =:name",nativeQuery=true)

	Integer deleteById(@Param("pno") int pno,@Param("name") String pname);
	
	

}
