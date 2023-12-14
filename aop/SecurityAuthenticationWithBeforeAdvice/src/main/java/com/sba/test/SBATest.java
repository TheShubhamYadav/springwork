package com.sba.test;

import org.springframework.aop.framework.ProxyFactory;

import com.sba.beans.AuditAdvice;
import com.sba.beans.LoanManager;
import com.sba.beans.SecurityAdvice;
import com.sba.helper.SecurityManager;

public class SBATest {
	public static void main(String[] args) {
		ProxyFactory pf = new ProxyFactory();
		pf.setTarget(new LoanManager());
		pf.addAdvice(new SecurityAdvice());
		pf.addAdvice(new AuditAdvice());
		
		LoanManager loanManager = (LoanManager)pf.getProxy();
		
		SecurityManager securityManager = SecurityManager.getInstance();
		securityManager.login("BOB", "PS5");
		boolean status = loanManager.approveLoan(56758);
		System.out.println("loan is approved: "+status);
		securityManager.logout();
	}
}
