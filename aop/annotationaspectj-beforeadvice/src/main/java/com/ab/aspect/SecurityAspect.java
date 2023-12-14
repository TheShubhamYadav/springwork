package com.ab.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.ab.helper.SecurityManager;
@Component
@Aspect
public class SecurityAspect {
	@Autowired
	private SecurityManager securityManager;
	
	@Before("execution(* com.ab.beans.*.*(..))")
	public void log(JoinPoint jp) {
		System.out.println(jp.getSignature().getName()+"("+jp.getArgs()[0]+") is called by "+securityManager.loggedInUser());
	}
	
	
	@Before("execution(* com.ab.beans.*.*(..))")
	public void authenticate(JoinPoint jp) throws Throwable {
		if(securityManager.authenticate()==false) {
			throw new IllegalAccessException("Invalid credentials");
		}
	}

}
