package com.ajaa.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ajaa.beans.Calculator;

public class AJAATest {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/ajaa/common/application-context.xml");
		Calculator calc = ac.getBean("calc", Calculator.class);
		int sum = calc.add(10, 20);
		System.out.println("sum is "+sum);
		int sum2 = calc.add(10, 20);
		System.out.println("sum is "+sum2);
	}
}
