package com.javacfgstereotypeanno.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaConfig.class);
//		ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com/javacfgstereotypeanno/annotation");
		System.out.println("-----above line executed while eager loading-----");
		Robot robot = applicationContext.getBean("robot",Robot.class);
		System.out.println(robot);
		
	}

}
