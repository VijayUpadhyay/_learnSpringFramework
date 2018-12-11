package com.vijay.required;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;

public class Company {
	
	private String companyName;
	private long companyID;
	private BigDecimal revenue;
	//private List<Address> address;
	@Autowired
	private Address address;
	
	 
	public String getCompanyName() {
		return companyName;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Company [companyName=" + companyName + ", companyID=" + companyID + ", revenue=" + revenue
				+ ", address=" + address + "]";
	}
	/*public List<Address> getAddress() {
		return address;
	}
	public void setAddress(List<Address> address) {
		this.address = address;
	}*/
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
