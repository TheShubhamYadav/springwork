package com.javacfgstereotypeanno.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:com/javacfgstereotypeanno/annotation/sensordetails.properties")
@ComponentScan(basePackages = {"com.javacfgstereotypeanno.annotation"})
public class JavaConfig {
	
	@Bean
	public Sensor sensor(@Value("${sensorType}") String sensorType) {
		System.out.println("JavaConfig.sensor()");
		Sensor sensor = new Sensor();
		sensor.setSensorType(sensorType);
		return sensor;
	}
}
