package com.ajba.aspect;

import org.aspectj.lang.JoinPoint;

import com.ajba.helper.SecurityManager;

public class SecurityAspect {
	private SecurityManager securityManager;
	
	
	public void setSecurityManager(SecurityManager securityManager) {
		this.securityManager = securityManager;
	}

	public void doAudit(JoinPoint jp) {
		String method = jp.getSignature().getName();
		Object[] args = jp.getArgs();
		
		System.out.println("Mr. sriman called "+method+"("+args[0]+")");
	}
	
	public void authenticate(JoinPoint jp) throws Throwable {
		if(securityManager.authenticate() ==false) {
			throw new IllegalAccessException("Invalid credential");
		}	
	}
}
