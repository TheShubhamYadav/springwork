package com.lac.test;

import org.springframework.aop.Advisor;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;

import com.lac.beans.CachingAdvice;
import com.lac.beans.CachingStaticMethodMatcherPointcut;
import com.lac.beans.Calculator;
import com.lac.beans.LoggingAdvice;
import com.lac.beans.LoggingDynamicMethodMatcherPointcut;
import com.lac.beans.LoggingStaticMethodMatcherPointcut;

public class Test {
	public static void main(String[] args) {
		ProxyFactory proxyFactory = new ProxyFactory();
		proxyFactory.setTarget(new Calculator());
		//proxyFactory.addAdvisor(new DefaultPointcutAdvisor(new LoggingStaticMethodMatcherPointcut(),new LoggingAdvice()));
		//proxyFactory.addAdvisor(new DefaultPointcutAdvisor(new CachingStaticMethodMatcherPointcut(),new CachingAdvice()));
		proxyFactory.addAdvisor(new DefaultPointcutAdvisor(new LoggingDynamicMethodMatcherPointcut(),new LoggingAdvice()));
		//in above code, sequence is really important, here caching advice should be add first before LoggingAdvice
		Calculator cal = (Calculator)proxyFactory.getProxy();
		
		//experimenting add method(only logging advice, no caching advice)-->LoggingStaticMethodMatcherPointcut
//		int result = cal.add(10, 11);
//		System.out.println("sum is : "+result+"\n------------------");
//		int result2 = cal.add(10, 11);
//		System.out.println("sum is : "+result2+"\n------------------\n------------------");
		
		//experimenting multiply(no logging advice, only caching advice)-->CachingStaticMethodMatcherPointcut
		int result1 = cal.multiply(10, 11);
		System.out.println("sum is : "+result1+"\n------------------");
		int result3 = cal.multiply(10, 11);
		System.out.println("sum is : "+result3+"\n------------------\n------------------");
		
		//experimenting add & multiply with dynamic pointcut(where param vaue should be greater than 100 to apply logging)
		//-->LoggingDynamicMethodMatcherPointcut
		
		System.out.println("both param less than 100 = "+cal.add(12,13)+"\n");
		System.out.println("1 param >100 & one is not = "+cal.add(121,13)+"\n");
		System.out.println("both >100 = "+cal.add(121,131));
		
		
	}
}
