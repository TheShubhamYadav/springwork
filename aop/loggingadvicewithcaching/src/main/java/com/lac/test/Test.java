package com.lac.test;

import org.springframework.aop.framework.ProxyFactory;

import com.lac.beans.CachingAdvice;
import com.lac.beans.Calculator;
import com.lac.beans.LoggingAdvice;

public class Test {
	public static void main(String[] args) {
		ProxyFactory proxyFactory = new ProxyFactory();
		proxyFactory.setTarget(new Calculator());
		proxyFactory.addAdvice(new CachingAdvice());
		proxyFactory.addAdvice(new LoggingAdvice());
		//in above code, sequence is really important, here caching advice should be add first before LoggingAdvice
		Calculator cal = (Calculator)proxyFactory.getProxy();
		int result = cal.add(100, 11);
		System.out.println("sum is : "+result+"\n------------------");
		int result1 = cal.add(100, 11);
		System.out.println("sum is : "+result1+"\n------------------");
		int result2 = cal.add(10,20);
		System.out.println("sum is : "+result2);
	}
}
