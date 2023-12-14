package com.aa.test;

import org.springframework.aop.framework.ProxyFactory;

import com.aa.beans.LoggingAdvice;
import com.aa.beans.Calculator;

public class AATest {
	public static void main(String[] args) {
		//create proxyfactory obj & handover target class & advice class(which having aspect logic) to it to create proxy obj
		ProxyFactory proxyFactory = new ProxyFactory();
		proxyFactory.setTarget(new Calculator());
		proxyFactory.addAdvice(new LoggingAdvice());
		
		//get proxy object
		Calculator proxy = (Calculator) proxyFactory.getProxy();
		//Calculator proxy = new Calculator();//if dont want to apply secondary logic 
		
		int sum = proxy.add(55,88);
		System.out.println("sum is = "+sum);
		
		System.out.println("------------------------------------------");
		int subtract = proxy.subtract(877,915);
		System.out.println("result is = "+subtract);
	}
}
