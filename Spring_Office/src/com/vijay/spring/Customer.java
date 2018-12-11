package com.vijay.spring;

public class Customer {
	
	private int custd,salary;
	private String empName,designation;
	public int getEmpId() {
		return custd;
	}
	public void setEmpId(int empId) {
		this.custd = empId;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

}
