package com.vijay.passDataTypes;

import java.math.BigDecimal;

public class Employee {

	private String name;
	private long id;
	private BigDecimal salary;
	//private String companyName;
	private Address address;
	
	/*public Employee(Address address) {
		this.address = address;
	}*/
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + ""+ ", address=" + address + "]";
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	/*public Address getAddress() {
		return address;
	}
	@Autowired(required=false)
	public void setAddress(Address address) {
		this.address = address;
	}*/
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
	/*public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}*/

}
