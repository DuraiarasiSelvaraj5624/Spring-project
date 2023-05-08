package com.example.Educationloan.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.Educationloan.Model.LoanApplicationModel;
import com.example.Educationloan.Model.UserModel;
import com.example.Educationloan.Repository.LaRepo;
import com.example.Educationloan.Repository.UmRepo;


@org.springframework.stereotype.Service
public class ServiceEdu {
	
	//User
	@Autowired
	private UmRepo repo;
	public List<UserModel> getUserModel()
	{
		return repo.findAll();
	}
	public Optional<UserModel> getUserModel(int id)
	{
		return repo.findById(id);
	}
	public UserModel addUserModel(UserModel  rt)
	{
		return repo.save(rt);
	}
	public UserModel editUserModel(UserModel rc,int id) 
	{
		UserModel ret = repo.findById(id).orElse(null);
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
		public String deleteUserModel(int id)
		{
		  repo.deleteById(id);
		  return id+"Deleted";
		}
		
		//LoanApplication


		private LaRepo repola;
		
		public List<LoanApplicationModel> getLoanApplicationModel()
		{
			return repola.findAll();
		}
		public Optional<LoanApplicationModel> getLoanApplicationModel(int loanId)
		{
			return repola.findById(loanId);
		}
		public LoanApplicationModel addLoanApplicationModel(LoanApplicationModel  rt)
		{
			return repola.save(rt);
		}
		public LoanApplicationModel editLoanApplicationModel(LoanApplicationModel rc,int loanId) 
		{
			LoanApplicationModel ret = repola.findById(loanId).orElse(null);
			if(ret!= null)
			{
				ret.setLoanId(rc.getLoanId());
				return repola.saveAndFlush(ret);
			}
			else 
			{
				return null;
			}
		}
			public String deleteLoanApplicationModel(int loanId)
			{
			  repo.deleteById(loanId);
			  return loanId+"Deleted";
			}
		
		
	
	

}
