package com.xmlandstereo.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/xmlandstereo/annotation/sbcf.xml");
		Project project = applicationContext.getBean("project",Project.class);
		project.assign();
	}

}
