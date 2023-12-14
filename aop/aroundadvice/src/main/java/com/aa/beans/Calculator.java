package com.aa.beans;

public class Calculator {
	public int add(int a,int b) {
		System.out.println("Calculator.add()");
		int sum = 0;
		sum = a+b;
		return sum;
	}
	
	public int subtract(int a,int b) {
		System.out.println("Calculator.subtract()");
		int sub = 0;
		if(a>b)
			sub = a-b;
		sub = b-a;
		return sub;
	}
}
