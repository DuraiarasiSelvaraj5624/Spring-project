package com.example.clownstars.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.clownstars.model.Clownmodel;
import com.example.clownstars.repo.Clownrep;

import com.example.clownstars.service.Clownservice;


@RestController
@RequestMapping("/clowns")
public class Clowncontroller {
	@Autowired
	private Clownservice service;
	
	@GetMapping
	public List<Clownmodel> read()
	{
		return service.getClowns();
	}
	@GetMapping("/{id}")
	public Optional<Clownmodel> readbyid(@PathVariable int id)
	{
		return service.getClownbyId(id);
	}
	@PostMapping
	public Clownmodel create(@RequestBody Clownmodel clown) {
		return service.addClown(clown);
	}
	@PutMapping("/{id}")
	public Clownmodel update(@RequestBody Clownmodel clown, @PathVariable int id) {
		return service.editClown(clown, id);
	}
	@DeleteMapping("/{id}")
	public String delete(@PathVariable int id) {
		return service.deleteClown(id);	
	}

    //sorting
    @GetMapping("/sortDonors/{field}")

	public List<Clownmodel>sortBooks(@PathVariable String field)
	{
		return service.sortDonors(field);
	}
	@GetMapping("/PagingDonors/{offset}/{pageSize}")
	public List<Clownmodel>pagingStudents(@PathVariable int offset,@PathVariable int pageSize)
	{
	return service.pagingClowns(offset,pageSize);
	}
	//sorting and paging
	@GetMapping("/pagingAndSortingDonors/{offset}/{pageSize}/{field}")
	 public List<Clownmodel> pagingAndSortingDonors(@PathVariable int offset,@PathVariable int pageSize,@PathVariable String field)
	 {
		return service.pagingAndSortingClowns(offset,pageSize,field);
	 }
	
	
	
	//@RestController
	//@RequestMapping("/question")
	//public class Controllerq {
		
		@Autowired
		Clownrep repo;
		
		
		@PostMapping("")
		public String saveDetails(@RequestBody Clownmodel q)
		{
			repo.save(q);
			return "Data is saved";
		}
	
	@GetMapping("/query")

	public List<Clownmodel> getAll()

	{

		return repo.get();

	}

	

	@GetMapping("/queryget/{pno}")

	public List<Clownmodel> getdetails(@PathVariable int pno)

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

		return "Deleted Successfully";}
	}

