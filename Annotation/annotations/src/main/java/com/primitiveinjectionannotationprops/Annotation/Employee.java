package com.primitiveinjectionannotationprops.Annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

//source code (using Stereotype annotation + xml based configuration)
@Component
@PropertySource("classpath:com/primitiveinjectionannotationprops/Annotation/employeeinfo.properties")
public class Employee {
	@Value("${id}")
	private int empId;
	@Value("${name}")
	private String empName;
	@Value("${salary}")
	private double salary;
	@Value("${contact}")
	private String contact;
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", contact=" + contact
				+ "]";
	}
	
	
}
