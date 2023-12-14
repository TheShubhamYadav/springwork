package com.ta.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ta.beans.Thrower;

public class TATest {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/ta/common/application-context.xml");
		Thrower thrower = ac.getBean("thrower",Thrower.class);
		int result = thrower.willThrow(0);
		System.out.println(result);
	}

}
