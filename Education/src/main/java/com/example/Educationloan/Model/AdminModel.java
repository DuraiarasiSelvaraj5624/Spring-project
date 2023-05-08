package com.example.Educationloan.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class AdminModel {
	
	@Id
	private int AdminId;
	private String Password;
	private String MobileNumber;
	private String userRole;
	public int getAdminId() {
		return AdminId;
	}
	public void setAdminId(int adminId) {
		AdminId = adminId;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getMobileNumber() {
		return MobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		MobileNumber = mobileNumber;
	}
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	

}
