package com.example.demo.GadgetController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.GadgetModel.Gadgetdetails;
import com.example.demo.GadgetSevice.GadgetService;
@RestController
public class GadgetController {
	@Autowired
	public GadgetService serv;
	@PostMapping("/gdetails")
	public Gadgetdetails addDetails(@RequestBody Gadgetdetails Gc)
	{
		return serv.saveInfo(Gc);
	}

}
