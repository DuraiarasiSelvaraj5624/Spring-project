package com.example.retdetails.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.retdetails.Model.LoginModel;
import com.example.retdetails.repository.LoginRepo;
@Service
public class LoginService {
	@Autowired
	
	private LoginRepo repol;
	
	public String checkLogin (String lname , String lpwd) {
		LoginModel user = repol.findBylname(lname);
		if(user == null) {
			return "no user found";
		}
		else {
			if(user.getLpwd().equals(lpwd)) {
				return "Login Succesfull";
			}
			else {
				return "Login Failed";
			}
		}
	}
	public LoginModel addUser(LoginModel mod) {
		return repol.save(mod);
	}
	public List<LoginModel> getUser(){
		return repol.findAll();
	}
	
	public String delete(int lid)
	{
		repol.deleteById(lid);
		return "deleted";
	}
	
	
	
		 
	

}
