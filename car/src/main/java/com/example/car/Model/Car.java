package com.example.car.Model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Car {
	@Id
	private int sno;
	private String company;
	private String headquaters;
	private String bestmodel;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn
	
	private List <Car> model;
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getHeadquaters() {
		return headquaters;
	}
	public void setHeadquaters(String headquaters) {
		this.headquaters = headquaters;
	}
	public String getBestmodel() {
		return bestmodel;
	}
	public void setBestmodel(String bestmodel) {
		this.bestmodel = bestmodel;
	}
	public List<Car> getModel() {
		return model;
	}
	public void setModel(List<Car> model) {
		this.model = model;
	}
	

}
