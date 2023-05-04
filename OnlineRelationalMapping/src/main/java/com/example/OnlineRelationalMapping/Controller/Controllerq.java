package com.example.OnlineRelationalMapping.Controller;



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

import com.example.OnlineRelationalMapping.Model.ModelClassq;
import com.example.OnlineRelationalMapping.Repository.Repositoryq;

@RestController
@RequestMapping("/question")
public class Controllerq {
	
	@Autowired
	Repositoryq repo;
	
	@PostMapping("")
	public String saveDetails(@RequestBody ModelClassq q)
	{
		repo.save(q);
		return "Data is saved";
	}
	
	@GetMapping("/query")

	public List<ModelClassq> getAll()

	{

		return repo.get();

	}

	

	@GetMapping("/queryget/{pno}")

	public List<ModelClassq> getdetails(@PathVariable int pno)

	{

		return repo.getD(pno);

	}

	

	@PutMapping("/queryupdate/{pno}/{name}")

	public void updateDetails(@PathVariable int pno,@PathVariable String name)

	{

		 repo.update(pno,name); 

	}

	

	@DeleteMapping("/deletequery/{pno}/{name}")

	public String deleteDetails(@PathVariable int pno,@PathVariable String name)

	{

		

		repo.deleteById(pno,name);

		return "Deleted Successfully";

	}
	
	
	
	
	
	 
	
	

}
