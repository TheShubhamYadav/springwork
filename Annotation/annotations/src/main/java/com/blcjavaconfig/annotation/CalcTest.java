package com.blcjavaconfig.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CalcTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		((ConfigurableApplicationContext)context).registerShutdownHook();
		Calculator calculator = context.getBean("calculator",Calculator.class);
		System.out.println(calculator);
	}

}
