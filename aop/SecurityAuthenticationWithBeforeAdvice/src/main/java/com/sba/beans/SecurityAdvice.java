package com.sba.beans;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

import com.sba.helper.SecurityManager;

public class SecurityAdvice implements MethodBeforeAdvice {
	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		SecurityManager secManager = SecurityManager.getInstance();
		if(secManager.authenticate()==false) {
			throw new IllegalArgumentException("Invalid user or password");
		}	
		
	}
}
