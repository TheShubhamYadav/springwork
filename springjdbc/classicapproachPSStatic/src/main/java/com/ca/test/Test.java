package com.ca.test;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ca.dao.StudentBO;
import com.ca.dao.StudentDAO;

public class Test {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/ca/common/application-context.xml");
		StudentDAO studentDAO = applicationContext.getBean("studentDao", StudentDAO.class);
		List<StudentBO> students =  studentDAO.getAllStudents();
		for (StudentBO studentBO : students) {
			System.out.println(studentBO);
		}
	}

}
