package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class carmodel {
@Id
	
	private int cid;
	public int getCid() {                                      
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getModel() {
		return model;
	}
	public void setModel(int model) {
		this.model = model;
	}
	private String cname;
	private int model;


}
