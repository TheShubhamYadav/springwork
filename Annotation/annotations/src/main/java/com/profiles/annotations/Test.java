package com.profiles.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		/*approach 1 */
//		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
//		annotationConfigApplicationContext.register(RootConfig.class);
//		annotationConfigApplicationContext.getEnvironment().setActiveProfiles("test");
//		annotationConfigApplicationContext.refresh();
//		Bike bike = annotationConfigApplicationContext.getBean("bike",Bike.class);
//		System.out.println(bike);
		
		/*approach 2 */
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(RootConfig.class);
		Bike bike = annotationConfigApplicationContext.getBean("bike",Bike.class);
		System.out.println(bike);
	}
}
