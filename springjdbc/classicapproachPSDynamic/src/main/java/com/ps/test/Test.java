package com.ps.test;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ps.dao.StudentBO;
import com.ps.dao.StudentPSDAO;

public class Test {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/ps/common/application-context.xml");
		StudentPSDAO dao = applicationContext.getBean("studentPsDao",StudentPSDAO.class);
		List<StudentBO> students = null;
		students = dao.getStudentByName("yuvraj");
		//way to iterate list obj
		//1)
		for (StudentBO studentBO : students) {
			System.out.println(studentBO);
		}
		
		//2)
		Iterator<StudentBO> iterator = students.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
