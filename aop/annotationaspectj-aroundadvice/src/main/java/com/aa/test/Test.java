package com.aa.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.aa.beans.Calculator;
import com.aa.config.AAConfig;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(AAConfig.class);
		Calculator cal = ac.getBean("calculator",Calculator.class);
		
		int sum = cal.add(10, 20);
		System.out.println("sum = "+sum+"\n");
		
		int sum2 = cal.add(100, 20);
		System.out.println("sum = "+sum2+"\n");
		
		int sum3 = cal.add(10, 20);
		System.out.println("sum = "+sum3+"\n");
	}
}
