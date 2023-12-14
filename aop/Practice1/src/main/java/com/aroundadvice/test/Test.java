package com.aroundadvice.test;

import org.springframework.aop.framework.ProxyFactory;

import com.aroundadvice.beans.Banking;
import com.aroundadvice.beans.PracticeAroundAdvice;

public class Test {
	public static void main(String[] args) {
		ProxyFactory proxyFactory = new ProxyFactory();
		proxyFactory.setTarget(new Banking());
		proxyFactory.addAdvice(new PracticeAroundAdvice());
		
		Banking banking = (Banking)proxyFactory.getProxy();
		System.out.println(banking.getClass().getName());//to know proxy class name
		
		double balance = banking.getBalance(112345888);
		System.out.println("balance is = "+balance);
	}
}
