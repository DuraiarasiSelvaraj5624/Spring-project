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
import com.example.retdetails.repository.retdetailsRepository;
import com.example.retdetails.service.retdetailsService;

import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.persistence.TableGenerator;

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
	@GetMapping("/sorting/{nameString}")
	public List <RetdetailClass> sortingDetails(@PathVariable String nameString)
	{
		return service.sorting(nameString);
	}
	@GetMapping("/pagination/{num}/{size}")
	public List<RetdetailClass> paginationDetails(@PathVariable int num,@PathVariable int size)
	{
		return service.pagination(num, size);
	}
	@GetMapping("/pagesorting/{num}/{size}/{nameString}")
	public List<RetdetailClass> pagesortingDetails(@PathVariable int num,@PathVariable int size,@PathVariable String nameString)
	{
		return service. pagesorting (num, size , nameString);
	}
	
	
	
	//Native
	
	@Autowired
	public retdetailsRepository repo;
	@Tag(name="Get Query" ,description=" getting all using native query")
	
	@GetMapping("/query")
	public List<RetdetailClass> getAll()
	{
		return repo.get();
	}
	
	@Tag(name="Get QuerybyId" ,description=" getting details by Id using native query")
	@GetMapping("/queryget/{id}")
	public List<RetdetailClass> getdetails(@PathVariable int id)
	{
		return repo.getD(id);
	}
	
	
	@Tag(name="Update QuerybyId" ,description=" updating id using native query")
	@PutMapping("/queryupdate/{id}/{nameString}")
	public void updateDetails(@PathVariable int id,@PathVariable String nameString)
	{
		 repo.update(id,nameString); 
	}
	
	
	@Tag(name="Delete QuerybyId and Name" ,description=" deleting details by Id and Name using native query")
	@DeleteMapping("/deletequery/{id}/{nameString}")
	public String deleteDetails(@PathVariable int id,@PathVariable String nameString)
	{
		
		repo.deleteById(id,nameString);
		return "Deleted Successfully";
	}
	
	@Tag(name="Delete QuerybyId" ,description=" deleting details by Id using native query")
	@DeleteMapping("/delete/{id}")
	public String deleteD(@PathVariable int id)
	{
		
		repo.delete(id);
		return "Deleted Successfully";
	}
	
	

	
	//jpql
	
	@Tag(name="Get JPQLQuerybyId" ,description=" getting details by Id using JPQL query")
	@GetMapping("/jpql/{id}")
	public List<RetdetailClass> get(@PathVariable int id)
	{
		return repo.getDetails(id);
	}
	
	
	
	
	@Tag(name="Get JPQLQuery using like" ,description=" getting details by like using JPQL query")
	@GetMapping("/jpql/like")
	public List<RetdetailClass> getHFirms()
	{
		return repo.getH();
	}
	
	
	
	@Tag(name="Get JPQLQuery Between" ,description=" getting details between ranges  using JPQL query")
	@GetMapping("/jqpl/between/{id}/{pid}")
	public List<RetdetailClass> getR(@PathVariable int id,@PathVariable int pid)
	{
		return repo.getRange(id,pid);
	} 	
	
	
	
	@GetMapping("/jqpl/in")
	public List<RetdetailClass> getDetails()
	{
		return repo.getD();
	}

}
