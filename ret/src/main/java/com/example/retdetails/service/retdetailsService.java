package com.example.retdetails.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
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
	

}