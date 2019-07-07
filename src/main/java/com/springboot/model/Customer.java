package com.springboot.model;

import java.util.Date;

public class Customer
{
	private Integer id;
	private String name;
	private String email;
	private String commodity;
	private Integer weight;
	private String weight_desc;
	private Integer rupees;
	private Date purchase_date;

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public String getEmail() 
	{
		return email;
	}

	public void setEmail(String email) 
	{
		this.email = email;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCommodity() {
		return commodity;
	}

	public void setCommodity(String commodity) {
		this.commodity = commodity;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public String getWeight_desc() {
		return weight_desc;
	}

	public void setWeight_desc(String weight_desc) {
		this.weight_desc = weight_desc;
	}

	public Integer getRupees() {
		return rupees;
	}

	public void setRupees(Integer rupees) {
		this.rupees = rupees;
	}

	public Date getPurchase_date() {
		return purchase_date;
	}

	public void setPurchase_date(Date purchase_date) {
		this.purchase_date = purchase_date;
	}
	

}
