package com.lookup.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("com.lookup.annotation");
		Container container = context.getBean("container",Container.class);
		container.receive("check balance");
	}

}
