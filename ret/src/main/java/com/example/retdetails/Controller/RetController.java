package com.example.retdetails.Controller;

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

import com.example.retdetails.Model.RetdetailClass;
import com.example.retdetails.service.retdetailsService;

@RestController
@RequestMapping("/api")
public class RetController {
	@Autowired
   private retdetailsService service;
	@GetMapping
	public List<RetdetailClass> read()
	{
		return service.getRetdetailClasses();
	}
	@GetMapping("/{id}")
	public Optional<RetdetailClass> readbyid(@PathVariable int id)
	{
		return service.getRetdetailClass(id);
		
	}
	@PostMapping
	public RetdetailClass create(@RequestBody RetdetailClass id) {
		return service.addRetdetailClass(id);
	}
	@PutMapping("/{id}")
	public RetdetailClass updateClass(@RequestBody RetdetailClass det,@PathVariable int id) {
		
		return service.editRetdetailClass(det, id);
		
	}
	@DeleteMapping("/{id}")
	public String delete(@PathVariable int id)
	{
		return service.deleteRetdetailClass(id);
	}
	

}
