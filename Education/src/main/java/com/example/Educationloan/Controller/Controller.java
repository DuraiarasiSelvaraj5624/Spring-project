package com.example.Educationloan.Controller;

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

import com.example.Educationloan.Model.LoanApplicationModel;
import com.example.Educationloan.Model.UserModel;
import com.example.Educationloan.Service.ServiceEdu;

@RestController
@RequestMapping("/edu")

public class Controller {
	
	@Autowired
	private ServiceEdu ser;
	
	@GetMapping("/get")
	public List<UserModel> read()
	{
		return ser.getUserModel();
	}
	@GetMapping("/user/{id}")
	public Optional<UserModel> readbyid1(@PathVariable int Id)
	{
		return ser.getUserModel(Id);
		
	}
	@PostMapping("/user")
	public UserModel create(@RequestBody UserModel Id) {
		return ser.addUserModel(Id);
	}
	@PutMapping("/{id}")
	public UserModel updateClass(@RequestBody UserModel det,@PathVariable int Id) {
		
		return ser.editUserModel(det, Id);
		
	}
	@DeleteMapping("/user/delete/{id}")
	public String delete(@PathVariable int Id)
	{
		return ser.deleteUserModel(Id);
	}
	
	//LoanApplication
	@GetMapping("/loan")
	public List<LoanApplicationModel> read1()
	{
		return ser.getLoanApplicationModel();
	}
	@GetMapping("/loan/get/{id}")
	public Optional<LoanApplicationModel> readbyid(@PathVariable int loanId)
	{
		return ser.getLoanApplicationModel(loanId);
		
	}
	@PostMapping("/loan/post")
	public LoanApplicationModel create(@RequestBody LoanApplicationModel Id) {
		return ser.addLoanApplicationModel(Id);
	}
	@PutMapping("/loan/put/{id}")
	public LoanApplicationModel updateClass(@RequestBody LoanApplicationModel det,@PathVariable int loanId) {
		
		return ser.editLoanApplicationModel(det, loanId);
		
	}
	@DeleteMapping("/loan/delete/{id}")
	public String delete1(@PathVariable int loanId)
	{
		return ser.deleteLoanApplicationModel(loanId);
	}

}
