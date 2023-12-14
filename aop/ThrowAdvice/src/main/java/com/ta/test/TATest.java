package com.ta.test;

import org.springframework.aop.framework.ProxyFactory;

import com.ta.beans.GlobalExceptionLoggingAdvice;
import com.ta.beans.Thrower;

public class TATest {
	public static void main(String[] args) {
		ProxyFactory proxyFactory = new ProxyFactory();
		proxyFactory.setTarget(new Thrower());
		proxyFactory.addAdvice(new GlobalExceptionLoggingAdvice());
		
		Thrower thrower = (Thrower)proxyFactory.getProxy();
		int result = thrower.throwing(-10);
		System.out.println("got result : "+result);
	}

}
