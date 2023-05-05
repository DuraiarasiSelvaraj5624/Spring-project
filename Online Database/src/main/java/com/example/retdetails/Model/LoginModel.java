package com.example.retdetails.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "loginx")

public class LoginModel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int lid;
	private String lname;
	private String llname;
	private String lpwd;
	private String dob;
	private String age;
	private String mail;
	private String city;
	private String state;
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getLfname() {
		return lname;
	}
	public void setLfname(String lfname) {
		this.lname = lfname;
	}
	public String getLlname() {
		return llname;
	}
	public void setLlname(String llname) {
		this.llname = llname;
	}
	public String getLpwd() {
		return lpwd;
	}
	public void setLpwd(String lpwd) {
		this.lpwd = lpwd;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	
	
	
	
	

}
