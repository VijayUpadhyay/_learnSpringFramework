package com.vijay.setListMapUsingAnnotation;

public class Address {
	private int streetNo;
	private String locality;
	@Override
	public String toString() {
		return "Address [streetNo=" + streetNo + ", locality=" + locality + ", landmark="+ "]";
	}
	public int getStreetNo() {
		return streetNo;
	}
	public void setStreetNo(int streetNo) {
		this.streetNo = streetNo;
	}
	public String getLocality() {
		return locality;
	}
	public void setLocality(String locality) {
		this.locality = locality;
	}
}
