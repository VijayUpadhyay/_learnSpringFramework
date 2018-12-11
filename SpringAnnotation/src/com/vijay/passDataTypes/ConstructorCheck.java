package com.vijay.passDataTypes;

public class ConstructorCheck {
	int a;
	String b;
	long c;
	Address address;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public String getB() {
		return b;
	}

	public void setB(String b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "ConstructorCheck [a=" + a + ", b=" + b + ", address=" + address + "]";
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public ConstructorCheck(int a, String b,long c,Address address) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.address = address;
	}
	
	public ConstructorCheck(int a,long c,Address address) {
		this.a = a;
		this.c = c;
		this.address = address;
	}
}
