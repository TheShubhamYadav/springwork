package com.qualifier.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class QualifierTest {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/qualifier/annotation/qualifier-annotation.xml");
		Radio radio = applicationContext.getBean("radio",Radio.class);
		radio.listen();

	}

}
