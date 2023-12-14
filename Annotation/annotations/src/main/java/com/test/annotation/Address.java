package com.test.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:com/test/annotation/data.properties")
public class Address {
	
	@Value("${cityName}")
	String cityName;
	@Value("${zip}")
	String zip;
	@Override
	public String toString() {
		return "Address [cityName=" + cityName + ", zip=" + zip + "]";
	}
	
	

}
