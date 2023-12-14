package com.sterotypeannojavacfg.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:com/sterotypeannojavacfg/annotation/jc.properties")
@ComponentScan(basePackages ="com/sterotypeannojavacfg/annotation" )
public class JavaConfigClass {
	
	private Rocket rocket;
	
	@Bean
	public Launcher launcher(Rocket rocket) {
		System.out.println("JavaConfigClass.launcher()");
		Launcher launcher = new Launcher();
		launcher.setRocket(rocket);
		return launcher;
	}
}
