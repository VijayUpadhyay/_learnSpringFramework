package com.vijay.setListMapUsingAnnotation;

import java.math.BigDecimal;
import java.util.List;

public class Employee {

	
	private String name;
	private long id;
	private BigDecimal salary;
	private List<Address> address;
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + ", companyName=" 
				+ ", address=" + address + "]";
	}

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public BigDecimal getSalary() {
		return salary;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
}
