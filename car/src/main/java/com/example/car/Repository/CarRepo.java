package com.example.car.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.car.Model.Car;

import jakarta.transaction.Transactional;

public interface CarRepo extends JpaRepository<Car, Integer> {
	
	@Query(value="select * from Car",nativeQuery = true)
	public List<Car> get();
	
	
	@Query(value="select * from Car  where sno = ?1", nativeQuery = true)
	public List<Car> getD(@Param("sno") int sno);


	@Modifying
	@Transactional
	@Query(value="update Car set sno =:sno where company =:company",nativeQuery=true)
	public void  update(@Param("sno") int sno,@Param("company") String company);

	
	@Modifying
	@Transactional
	@Query(value="delete from Car where sno=:sno and company =:company",nativeQuery=true)

	Integer deleteById(@Param("sno") int sno,@Param("company") String company);
	
	
	//j
	
	@Query(value="select c from Car c where sno =?1",nativeQuery = false)
	public List<Car> getDetails(@Param("sno") int sno);
	
	@Query(value="select f from Car f where  company like '%i'",nativeQuery = false)
	public List<Car> getH();
	
	
	
	@Query(value ="select f from Car f where  sno between ?1 and ?2",nativeQuery=false)
	public List<Car> getRange(@Param("sno") int sno,@Param("sno") int sid);
	
	


}
