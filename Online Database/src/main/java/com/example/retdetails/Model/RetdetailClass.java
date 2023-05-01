package com.example.retdetails.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="details")
public class RetdetailClass {
	private int sno;
	@Id
	private int id;
	
	@Column(name = "Cust Name")
	private String nameString;
	private String product;
	private String productType;
	private String Reason;
	@Column(name = "Custlocation")
	private String location; 
	private String custEmail;
	private int CustPhnNo;
	private String used;
	
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getReason() {
		return Reason;
	}
	public void setReason(String reason) {
		Reason = reason;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getCustEmail() {
		return custEmail;
	}
	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}
	public int getCustPhnNo() {
		return CustPhnNo;
	}
	public void setCustPhnNo(int custPhnNo) {
		CustPhnNo = custPhnNo;
	}
	public String getUsed() {
		return used;
	}
	public void setUsed(String used) {
		this.used = used;
	}
	@Override
	public String toString() {
		return "RetdetailClass [sno=" + sno + ", nameString=" + nameString + ", id=" + id + ", product=" + product
				+ ", productType=" + productType + ", Reason=" + Reason + ", location=" + location + ", custEmail="
				+ custEmail + ", CustPhnNo=" + CustPhnNo + ", used=" + used + "]";
	}
	
	
	
	
	
	
	
	

}
