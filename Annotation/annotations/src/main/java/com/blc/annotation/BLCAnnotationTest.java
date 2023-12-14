package com.blc.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BLCAnnotationTest {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.blc.annotation");
		((ConfigurableApplicationContext)applicationContext).registerShutdownHook();
		Calc calc = applicationContext.getBean("calc",Calc.class);
		System.out.println(calc);
	}
}
