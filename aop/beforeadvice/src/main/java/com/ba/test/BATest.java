package com.ba.test;

import org.springframework.aop.framework.ProxyFactory;

import com.ba.beans.AuditAdvice;
import com.ba.beans.LoanManager;

public class BATest {
	public static void main(String[] args) {
		ProxyFactory pf = new ProxyFactory();
		pf.setTarget(new LoanManager());
		pf.addAdvice(new AuditAdvice());
		
		LoanManager proxy = (LoanManager)pf.getProxy();
		boolean status  = proxy.approveLoan(89942234);
		if(status)
			System.out.println("loan has been passed");
		else
			System.out.println("loan application is disapproved");
	}
}
