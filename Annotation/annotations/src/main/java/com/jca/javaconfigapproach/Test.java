package com.jca.javaconfigapproach;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaConfig.class);
		LaunchPad launchpad = applicationContext.getBean("rocketLaunchPad",LaunchPad.class);
		launchpad.launch();
	}
}
