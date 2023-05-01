package com.example.retdetails.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.retdetails.Model.RetdetailClass;
import com.example.retdetails.repository.retdetailsRepository;
@Service
public class retdetailsService {
	@Autowired
	private retdetailsRepository repo;
	public List<RetdetailClass> getRetdetailClasses()
	{
		return repo.findAll();
	}
	public Optional<RetdetailClass> getRetdetailClass(int id)
	{
		return repo.findById(id);
	}
	public RetdetailClass addRetdetailClass(RetdetailClass  rt)
	{
		return repo.save(rt);
	}
	public RetdetailClass editRetdetailClass(RetdetailClass rc,int id) 
	{
		RetdetailClass ret = repo.findById(id).orElse(null);
		if(ret!= null)
		{
			ret.setId(rc.getId());
			return repo.saveAndFlush(ret);
		}
		else 
		{
			return null;
		}
	}
		public String deleteRetdetailClass(int id)
		{
		  repo.deleteById(id);
		  return id+"Deleted";
		}
		public List <RetdetailClass> sorting(String nameString)
		{
			return repo.findAll(Sort.by(nameString).descending());
		}
		public List<RetdetailClass> pagination(int num,int size)
		{
			Page<RetdetailClass> r = repo.findAll(PageRequest.of(num, size));
			return r.getContent();
		}
		
		public List<RetdetailClass> pagesorting(int num,int size,String nameString)
		{
			Page<RetdetailClass> r = repo.findAll(PageRequest.of(num, size,Sort.by(nameString).descending()));
			return r.getContent();
		}
		
		
	

}
