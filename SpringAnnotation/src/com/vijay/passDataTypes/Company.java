package com.vijay.passDataTypes;

import java.math.BigDecimal;

public class Company {
	
	private String companyName;
	private long companyID;
	private BigDecimal revenue;
	//private String ceo;
	//private long headCount;
	private Address address;
	 
	public Address getAddress() {
		return address;
	}
	/*@Override
	public String toString() {
		return "Company [companyName=" + companyName + ", companyID=" + companyID + ", revenue=" + revenue + ", ceo="
				+ ceo + ", headCount=" + headCount + ", address=" + address + "]";
	}*/
	
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getCompanyName() {
		return companyName;
	}
	@Override
	public String toString() {
		return "Company [companyName=" + companyName + ", companyID=" + companyID + ", revenue=" + revenue
				+ ", address=" + address + "]";
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
	/*public String getCeo() {
		return ceo;
	}
	public void setCeo(String ceo) {
		this.ceo = ceo;
	}
	public long getHeadCount() {
		return headCount;
	}
	public void setHeadCount(long headCount) {
		this.headCount = headCount;
	}
	*/
	

}
