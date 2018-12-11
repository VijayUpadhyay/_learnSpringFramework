package com.vijay.mkyong.springTest;

public class FindArea implements Area{
	
	@Override
	public float draw(float radius) {
		return (float) (radius*radius);
	}

}
