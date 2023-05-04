package com.example.OnlineRelationalMapping.Model;

import jakarta.persistence.*;
import jakarta.persistence.Id;

@Entity
public class ModelClassA {
	@Id
	private int pno;
	private String weight;
	private String size;
	private String brand;
	private String packageweight;
	private String no_of_peices;
	private String pname;
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getPackageweight() {
		return packageweight;
	}
	public void setPackageweight(String packageweight) {
		this.packageweight = packageweight;
	}
	public String getNo_of_peices() {
		return no_of_peices;
	}
	public void setNo_of_peices(String no_of_peices) {
		this.no_of_peices = no_of_peices;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	
	
	

}
