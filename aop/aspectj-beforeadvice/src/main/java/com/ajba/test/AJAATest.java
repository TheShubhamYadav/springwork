package com.ajba.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ajba.beans.LoanManager;
import com.ajba.helper.SecurityManager;

public class AJAATest {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/ajba/common/application-context.xml");
		LoanManager loanManager = ac.getBean("loanmanager", LoanManager.class);
		SecurityManager securityManager = ac.getBean("securitymanager",SecurityManager.class);
		securityManager.login("shubham", "1234");
		boolean result = loanManager.approveLoan("3553535gg");
		System.out.println("approved ? "+result);
	}
}
