package com.example.retdetails.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.retdetails.Model.LoginModel;
import com.example.retdetails.service.LoginService;
@RestController
@RequestMapping("/run")

public class LoginController {
	@Autowired
	private LoginService service;
	
	@PostMapping("/login")
	public String login(@RequestBody Map<String ,String> loginData) {
		String lname = loginData.get("lname");
		String lpwd = loginData.get("lpwd");
		String result = service.checkLogin(lname, lpwd);
		return result;
	}
	@PostMapping("/adduser")
	public LoginModel AddUser(@RequestBody LoginModel log) {
		return service.addUser(log);
	}
	@GetMapping
	public List<LoginModel> listAll(){
		return service.getUser();
	}
	
	@DeleteMapping("/{lid}")
	public String deleteByID(@PathVariable int lid)
	{
		return service.delete(lid);
	}

}
