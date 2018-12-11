package com.vijay.mkyong.springTest;

public class Student {
	private String name;
	private Address add;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}

	public void displayInfo()
	{
		System.out.println("Hello " + name+"! --> Student Class");
		System.out.println(add);
	}

	@Override
	public String toString() {
		return "Student object"+name;
	}
}
