package com.vijay.required;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	private int streetNo;
	private String locality;
	
	@Override
	public String toString() {
		return "Address [streetNo=" + streetNo + ", locality=" + locality + "]";
	}
	public int getStreetNo() {
		return streetNo;
	}
	@Required
	public void setStreetNo(int streetNo) {
		this.streetNo = streetNo;
	}
	public String getLocality() {
		return locality;
	}
	@Value(value="TCS")
	public void setLocality(String locality) {
		this.locality = locality;
	}
}
