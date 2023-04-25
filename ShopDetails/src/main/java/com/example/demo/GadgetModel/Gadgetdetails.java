package com.example.demo.GadgetModel;

import org.hibernate.annotations.GeneratorType;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="gadgets")
public class Gadgetdetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int sno;
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	private String name;
	private String model;
	@Override
	public String toString() {
		return "Gadgetdetails [sno=" + sno + ", name=" + name + ", model=" + model + "]";
	}

}
