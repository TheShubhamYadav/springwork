package com.stereotype.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SterotypeTest {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com/stereotype/annotation");
		Computer computer = applicationContext.getBean("computer",Computer.class);
		Computer computer2 = applicationContext.getBean("computer",Computer.class);
		System.out.println(computer==computer2);
	}

}
