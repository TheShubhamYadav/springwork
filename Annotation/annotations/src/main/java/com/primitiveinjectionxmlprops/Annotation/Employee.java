package com.primitiveinjectionxmlprops.Annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//source code (using Stereotype annotation + xml based configuration)
@Component
public class Employee {
	@Value("#{empData.id}")
	private int empId;
	@Value("#{empData.name}")
	private String empName;
	@Value("#{empData.salary}")
	private double salary;
	@Value("#{empData.contact}")
	private String contact;
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", contact=" + contact
				+ "]";
	}
	
	
}
