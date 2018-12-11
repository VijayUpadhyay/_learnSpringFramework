package com.vijay.mkyong.springTest;

public class SemiCircle implements Area {
	
	private int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	@Override
	public float draw(float radius) {
		System.out.println("Inside Semicircle class");
		return (float) (0.5*3.142*radius*radius);
	}	
	
	public void display(){
		System.out.println("Area of Circle is: "+draw(radius));

	}

	

}
