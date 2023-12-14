package com.autowired.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowiredTest {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/autowired/annotation/autowire-annotation.xml");
		Radio radio = applicationContext.getBean("radio",Radio.class);
		radio.listen();
	}

}
