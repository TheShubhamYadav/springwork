package com.test.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StTest {
	
	public static void main(String[] args) {
		ApplicationContext context  = new AnnotationConfigApplicationContext("com/test/annotation");
		Address address = context.getBean("address",Address.class);
		System.out.println(address);
	}

}
