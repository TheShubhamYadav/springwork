package com.primitiveinjectionxmlprops.Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PiXmlPropsTest {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/primitiveinjectionxmlprops/Annotation/pixmlprops-beans.xml");
		Employee emp1 = applicationContext.getBean("employee",Employee.class);
		System.out.println(emp1);
	}
}
