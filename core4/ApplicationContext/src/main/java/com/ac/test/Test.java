package com.ac.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ac.beans.Login;

public class Test {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/ac/common/application-context.xml");
		Login login = applicationContext.getBean("login",Login.class);
		login.doLogin("shubham", "1234");
	}
}
