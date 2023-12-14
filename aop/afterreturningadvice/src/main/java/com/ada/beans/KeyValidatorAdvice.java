package com.ada.beans;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class KeyValidatorAdvice implements AfterReturningAdvice {
	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		if((int)returnValue==0) {
			throw new Exception("Discarded(key is weak)");
		}
		
	}
}
