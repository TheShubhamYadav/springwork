package com.ta.beans;

import java.lang.reflect.Method;

import org.springframework.aop.ThrowsAdvice;

public class GlobalExceptionLoggingAdvice implements ThrowsAdvice {
	public void afterThrowing(IllegalArgumentException e) {
		System.out.println("got Exception : "+e.getMessage());
	}
	public void afterThrowing(Method method,Object[] args,Object target,Exception e) {
		System.out.print("got Exception in "+method.getName()+"("+args[0]+") of class "+target.getClass().getName()+"\nException is : "+e.getMessage());
	}
	
	
	
		
}
