package com.example.car.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.car.Model.Car;
import com.example.car.Repository.CarRepo;
@RestController
@RequestMapping("/Car")
public class Controller {

	@Autowired
	CarRepo repo;
	@PostMapping("")
	public String saveDetails(@RequestBody Car q)
	{
		repo.save(q);
		return "Data is saved";
	}
	
	@GetMapping("/query")

	public List<Car> getAll()

	{
		return repo.get();
	}

	

	@GetMapping("/queryget/{sno}")
	public List<Car> getdetails(@PathVariable int sno)
	{
		return repo.getD(sno);
	}
	@PutMapping("/queryupdate/{pno}/{name}")

	public void updateDetails(@PathVariable int sno,@PathVariable String company)
	{
		 repo.update(sno,company); 
	}

	@DeleteMapping("/deletequery/{sno}/{company}")

	public String deleteDetails(@PathVariable int sno,@PathVariable String company)

	{
		repo.deleteById(sno,company);
		return "Deleted Successfully";
	}
	
	
	@GetMapping("/jpql/{firmno}")
	public List<Car> get(@PathVariable int qno)
	{
		return repo.getDetails(qno);
	}
	@GetMapping("/jpql/like")
	public List<Car> getHFirms()
	{
		return repo.getH();
	}
	@GetMapping("/jqpl/between/{sno}/{sid}")
	public List<Car> getR(@PathVariable int sno,@PathVariable int sid)
	{
		return repo.getRange(sno,sid);
	}
	
	
	
	
	
}
