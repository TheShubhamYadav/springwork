package com.sterotypeannojavacfg.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaConfigClass.class);
		System.out.println("========================");
		Launcher launcher = applicationContext.getBean("launcher",Launcher.class);
		System.out.println(launcher);
	}

}
