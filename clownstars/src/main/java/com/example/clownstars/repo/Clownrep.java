package com.example.clownstars.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.clownstars.model.Clownmodel;

import jakarta.transaction.Transactional;

public interface Clownrep extends JpaRepository<Clownmodel, Integer> {
	
	
	//native
	
	@Query(value="select * from clowns ",nativeQuery=true)
	public List<Clownmodel> get();
	
	@Query(value="select * from clowns where id = ?1", nativeQuery = true)
	public List <Clownmodel> getD(@Param("id") int id);
	
	@Modifying
	@Transactional
	@Query(value="update clowns set id =:id where name =:name",nativeQuery=true)
	public void  update(@Param("id") int id,@Param("product") String product);
	

	@Modifying
	@Transactional
	@Query(value="delete from clowns where id=:id and name =:name",nativeQuery=true)
	Integer deleteById(@Param("id") int id,@Param("product") String product);
	
	@Modifying
	@Transactional
	@Query(value="delete from clowns where id=:id ",nativeQuery=true)
	Integer delete(@Param("id") int id);
	

	
	
	@Query(value="select c from clowns c where id =?1",nativeQuery = false)
	public List <Clownmodel> getDetails(@Param("id") int id);
	
	@Query(value="select f from clowns f where  name like '%i'",nativeQuery = false)
	public List <Clownmodel> getH();
	
	@Query(value="select f from clowns f where id between ?1 and ?2",nativeQuery=false)
	public List <Clownmodel> getRange(@Param("id") int id,@Param("id") int pid);
	

	
	@Query(value = "select f from clowns f where  name  in ('Mobile') ",nativeQuery=false)
	public List<Clownmodel> getD();




}
