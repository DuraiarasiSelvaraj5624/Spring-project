package com.example.car.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class types {
	
	@Id
	private int sno;
	private String model1;
	private String model2;
	private String model3;
	private String model4;
	private String model5;
	private String model6;
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getModel1() {
		return model1;
	}
	public void setModel1(String model1) {
		this.model1 = model1;
	}
	public String getModel2() {
		return model2;
	}
	public void setModel2(String model2) {
		this.model2 = model2;
	}
	public String getModel3() {
		return model3;
	}
	public void setModel3(String model3) {
		this.model3 = model3;
	}
	public String getModel4() {
		return model4;
	}
	public void setModel4(String model4) {
		this.model4 = model4;
	}
	public String getModel5() {
		return model5;
	}
	public void setModel5(String model5) {
		this.model5 = model5;
	}
	public String getModel6() {
		return model6;
	}
	public void setModel6(String model6) {
		this.model6 = model6;
	}

}
