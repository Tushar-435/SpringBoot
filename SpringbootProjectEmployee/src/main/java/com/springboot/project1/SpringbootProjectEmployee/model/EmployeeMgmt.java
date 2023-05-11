package com.springboot.project1.SpringbootProjectEmployee.model;

import jakarta.persistence.*;

@Entity
@Table(name="Employee_Details")
public class EmployeeMgmt {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Emp_Id")
	private int id;
	@Column(name="Employee_Name")
	private String name;
	@Column(name="Designation")
	private String desig;
	@Column(name="Salary")
	private Long sal;
	@Column(name="Country")
	private String country;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	public Long getSal() {
		return sal;
	}
	public void setSal(Long sal) {
		this.sal = sal;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public EmployeeMgmt(String name, String desig, Long sal, String country) {
		super();
		this.name = name;
		this.desig = desig;
		this.sal = sal;
		this.country = country;
	}
	
	public EmployeeMgmt() {
		
	}
	
}
