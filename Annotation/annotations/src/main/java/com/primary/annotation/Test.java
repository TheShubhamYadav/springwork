package com.primary.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaconfigPort.class);
		Adaptor adaptor = context.getBean("adaptor",Adaptor.class);
		System.out.println(adaptor);
	}
}
