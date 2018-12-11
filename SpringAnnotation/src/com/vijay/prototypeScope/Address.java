package com.vijay.prototypeScope;

public class Address {
	private int streetNo;
	private String locality;
	@Override
	public String toString() {
		return "Address [streetNo=" + streetNo + ", locality=" + locality + ", landmark=" + landmark + ", city=" + city
				+ ", state=" + state + ", postalCode=" + postalCode + "]";
	}
	private String landmark;
	private String city;
	private String state;
	private String postalCode;
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
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

}
