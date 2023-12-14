package com.ara.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ara.beans.KeyGenerator;
import com.ara.config.ARConfig;

public class ARTest {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ARConfig.class);
		KeyGenerator kg = applicationContext.getBean("keyGenerator",KeyGenerator.class);
		kg.generate(7);
	}

}
