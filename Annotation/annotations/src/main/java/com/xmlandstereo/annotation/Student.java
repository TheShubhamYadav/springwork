package com.xmlandstereo.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

//source code
@Component
@PropertySource("classpath:com/xmlandstereo/annotation/studentdetails.properties")
public class Student {
	@Value("${name}")
	String name;
	@Value("${rollNo}")
	String rollNo;

	@Override
	public String toString() {
		return "\nStudent Name : "+name+"\nRoll No : "+rollNo;
	}
	
	
	
}
