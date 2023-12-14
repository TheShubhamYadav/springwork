package com.sterotypeannojavacfg.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

//source code
@Component
public class Rocket {
	@Value("${name}")
	String name;

	@Override
	public String toString() {
		System.out.println("Rocket.toString()");
		return "Rocket [name=" + name + "]";
	}

	
	
	

}
