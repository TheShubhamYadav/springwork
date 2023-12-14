package com.pagination.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pagination.bo.StudentBO;
import com.pagination.config.JavaConfig;
import com.pagination.dao.StudentDAO;

public class Test {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaConfig.class);
		StudentDAO studentDAO = applicationContext.getBean("studentDAO",StudentDAO.class);
		
		//System.out.println(studentDAO.getAllStudent(2));
		
		//studentDAO.getStudentsByAgeAndGender(18, 30, "male").forEach(System.out::println);;
		
		StudentBO bo = new StudentBO();
		bo.setStudent_id(6);
		bo.setStudent_name("reysha");
		bo.setAge(26);
		bo.setGender("female");
		bo.setMobile("6196190000");
		bo.setEmail("rey@gamil.com");
		int record = studentDAO.saveStudent(bo);
		System.out.println("no of record inserted : "+record);
		
	}
}
