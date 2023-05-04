package com.example.OnlineRelationalMapping.Model;

import java.util.List;

import jakarta.persistence.*;

@Entity
public class ModelClassq {
	 @Id
	private int pno;
	private String name;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn
	private List <ModelClassA> product;
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<ModelClassA> getProduct() {
		return product;
	}
	public void setProduct(List<ModelClassA> product) {
		this.product = product;
	} 
	

}
