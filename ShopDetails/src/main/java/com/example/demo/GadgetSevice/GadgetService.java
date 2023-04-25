package com.example.demo.GadgetSevice;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.GadgetModel.Gadgetdetails;
import com.example.demo.GadgetRepository.GadgetRepo;

public class GadgetService {
	@Autowired
	public GadgetRepo repo;
	public Gadgetdetails saveInfo(Gadgetdetails  gad)
	{
		return repo.save(gad);
	}
	

}
