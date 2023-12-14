package com.primary.annotation;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = {"com.primary.annotation"})
public class JavaconfigPort {
	
	@Bean
	
	public Port port1() {
		Port port = new Port();
		port.setPortName("c-type");
		port.setPortGen("2.0");
		return port;
	}
	
	@Bean
	@Primary
	public Port port2() {
		Port port = new Port();
		port.setPortName("b-type");
		port.setPortGen("1.0");
		return port;
	}
}
