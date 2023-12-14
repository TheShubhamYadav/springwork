package com.profilespractice.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProfileTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(RootJavaConfig.class);
		context.getEnvironment().setActiveProfiles("test");
		context.refresh();
		
		Bank bank = context.getBean("bank",Bank.class);
		System.out.println(bank);
	}

}
