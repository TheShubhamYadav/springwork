package com.ab.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ab.beans.LoanManager;
import com.ab.config.BAConfig;
import com.ab.helper.SecurityManager;

public class Test {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BAConfig.class);
		LoanManager loanManager = applicationContext.getBean("loanManager",LoanManager.class);
		SecurityManager securityManager = applicationContext.getBean("securityManager",SecurityManager.class);
		securityManager.login("shubham", "1234");
		boolean status = loanManager.approveLoan("ss12123324");
		if(status)
			System.out.println("loan passed");
		System.out.println("loan rejected");
	}

}
