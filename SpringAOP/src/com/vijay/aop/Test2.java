package com.vijay.aop;

public class Test2 {
	
	public void display(int a){
		System.out.println("Inside simple test2 "+a);
	}

	public void display(int a,int b){
		System.out.println("Inside simple test2 , A: "+a+" B:"+b);
	}
	
	public void checkError(){
		//int n = 10/0;
		System.out.println("Close evey connection after exception occurence");
	}
	
	public void afterReturning(){
		System.out.println("Inside Test2 afterReturning");
	}
	
	public void around(){
		System.out.println("Inside Test2 around");
	}

}
