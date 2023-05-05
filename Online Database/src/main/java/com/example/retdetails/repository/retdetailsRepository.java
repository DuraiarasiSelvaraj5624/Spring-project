package com.example.retdetails.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.retdetails.Model.RetdetailClass;

import jakarta.transaction.Transactional;



public interface retdetailsRepository extends JpaRepository<RetdetailClass, Integer> {
	
	//native
	
			@Query(value="select * from details ",nativeQuery=true)
			public List<RetdetailClass> get();
			
			@Query(value="select * from details where id = ?1", nativeQuery = true)
			public List <RetdetailClass> getD(@Param("id") int id);
			
			@Modifying
			@Transactional
			@Query(value="update details set id =:id where product =:product",nativeQuery=true)
			public void  update(@Param("id") int id,@Param("product") String product);
			
		
			@Modifying
			@Transactional
			@Query(value="delete from details where id=:id and product =:product",nativeQuery=true)
			Integer deleteById(@Param("id") int id,@Param("product") String product);
			
			@Modifying
			@Transactional
			@Query(value="delete from details where id=:id ",nativeQuery=true)
			Integer delete(@Param("id") int id);
			
		
			//jpql
			
			@Query(value="select c from RetdetailClass c where id =?1",nativeQuery = false)
			public List <RetdetailClass> getDetails(@Param("id") int id);
			
			@Query(value="select f from RetdetailClass f where  product like '%i'",nativeQuery = false)
			public List <RetdetailClass> getH();
			
			@Query(value="select f from RetdetailClass f where id between ?1 and ?2",nativeQuery=false)
			public List <RetdetailClass> getRange(@Param("id") int id,@Param("id") int pid);
			
	
			
			@Query(value = "select f from RetdetailClass f where  product  in ('Mobile') ",nativeQuery=false)
			public List<RetdetailClass> getD();

	
	
	
	
}