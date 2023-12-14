package com.primitiveinjectionannotationprops.Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PiXmlPropsTest {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com/primitiveinjectionannotationprops/Annotation");
		Employee emp1 = applicationContext.getBean("employee",Employee.class);
		System.out.println(emp1);
	}
}
