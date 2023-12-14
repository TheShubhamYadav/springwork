package com.blcjavaconfig.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:com/blcjavaconfig/annotation/calcdata.properties")
public class JavaConfig {
	
	@Bean
	public Calculator calculator(@Value("${a}") int a,@Value("${b}") int b) {
		Calculator calculator = new Calculator(a);
		calculator.setB(b);
		return calculator;
	}
		
}
