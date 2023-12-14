package com.primitiveinjectionjavaconfigapi.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigTest {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaConfigUsingENV.class);
		Passport passport = applicationContext.getBean("newPassport",Passport.class);
		System.out.println(passport);
		
		System.out.println("----------------------------");
		
		ApplicationContext applicationContext2 = new AnnotationConfigApplicationContext(JavaConfigWithoutENV.class);
		Passport passport2 = applicationContext2.getBean("pp",Passport.class);
		System.out.println(passport2+"2nd passport");
	}

}
