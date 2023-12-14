package com.ajba.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ajba.beans.KeyGenerator;


public class AJAATest {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/ajba/common/application-context.xml");
		KeyGenerator kg = ac.getBean("keyGenerator",KeyGenerator.class);
		kg.generator(5);
	}
}
