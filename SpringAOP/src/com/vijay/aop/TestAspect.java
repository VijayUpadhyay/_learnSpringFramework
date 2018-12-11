package com.vijay.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class TestAspect {
	
	@Before("execution(* com.vijay.aop.Test2.display(..))")
	public void testBefore(JoinPoint joinPoint){
		System.out.println("Inside aspect testBefore");
	}
	
	@After("execution(* com.vijay.aop.Test2.display(..))")
	public void testAfter(JoinPoint joinPoint){
		System.out.println("Inside aspect testAfter");
	}
	
	@AfterThrowing(
			pointcut = "execution(* com.vijay.aop.Test2.checkError(..))" ,
			throwing="error")
	public void afterThrowing(JoinPoint joinPoint,Throwable error){
		System.out.println("Inside aspect afterThrowing");
	}
	
	@AfterReturning(
			pointcut="execution(* com.vijay.aop.Test2.afterReturning())",
			returning="result")
	public void afterReturning(JoinPoint joinPoint,Object result){
		System.out.println("Inside aspects afterReturning");
	}

	@Around("execution(* com.vijay.aop.Test2.around())")
	public void arount(ProceedingJoinPoint joinPoint) throws Throwable{
		System.out.println("First part of around");
		joinPoint.proceed();
		System.out.println("Last part of around");
	}
}
