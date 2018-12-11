/**
 * 
 */
package com.vijay.mkyong.springTest;

/**
 * @author 978804
 *
 */
public class Circle implements Area{
	
	private int radius;
	

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public float draw(float radius) {
		 float result = (float) (3.142*radius*radius);
		 System.out.println("Inside Circle, the area is: "+result);
		return result;
	}
	
}
