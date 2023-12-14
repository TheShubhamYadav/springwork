package com.blcjavaconfig.annotation;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

//no src code so use javaconfg approach

public class Calculator {
	
	int a;
	int b;
	int sum;
	
	public Calculator(int a) {
		this.a=a;
	}

	public void setB(int b) {
		this.b = b;
	}
	
	@PostConstruct
	public void init() {
		this.sum=this.a+this.b;
		System.out.println("Calculator.init()");
	}
	
	@PreDestroy
	public void destroy() {
		this.sum=0;
		System.out.println("Calculator.destroy()");
		System.out.println("Calculator [a=" + a + ", b=" + b + ", sum=" + sum + "]");
	}

	@Override
	public String toString() {
		return "Calculator [a=" + a + ", b=" + b + ", sum=" + sum + "]";
	}
	
	
	
	

}