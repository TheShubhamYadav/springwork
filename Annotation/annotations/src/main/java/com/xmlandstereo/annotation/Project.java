package com.xmlandstereo.annotation;

//no source code
public class Project {
	private Student student;
	
	public void setStudent(Student student) {
		this.student = student;
	}


	public void assign() {
		System.out.println("project is assigned to "+student);
	}
}
