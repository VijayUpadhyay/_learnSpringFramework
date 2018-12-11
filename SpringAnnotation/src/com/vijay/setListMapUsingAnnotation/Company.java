package com.vijay.setListMapUsingAnnotation;

import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Company {
	
	private String companyName;
	private long companyID;
	private BigDecimal revenue;
	Set<Employee> employeeList;
	
	@Autowired(required=false)
	@Qualifier("address1")
	private List<Address> address;
	 
	/**
	 * @return the employeeList
	 */
	public Set<Employee> getEmployeeList() {
		return employeeList;
	}
	/**
	 * @param employeeList the employeeList to set
	 */
	public void setEmployeeList(Set<Employee> employeeList) {
		this.employeeList = employeeList;
	}
	public String getCompanyName() {
		return companyName;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Company [companyName=" + companyName + ", companyID=" + companyID + ", revenue=" + revenue
				+ ", employeeList=" + employeeList + ", address=" + address + "]";
	}
	/**
	 * @return the address
	 */
	public List<Address> getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(List<Address> address) {
		this.address = address;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public long getCompanyID() {
		return companyID;
	}
	public void setCompanyID(long companyID) {
		this.companyID = companyID;
	}
	public BigDecimal getRevenue() {
		return revenue;
	}
	public void setRevenue(BigDecimal revenue) {
		this.revenue = revenue;
	}

}
