package com.ta.aspect;

import org.aspectj.lang.JoinPoint;

public class GlobalExceptionLoggingAspect {
	
	public void logException(JoinPoint jp, IllegalArgumentException e) {
		String method = jp.getSignature().getName();
		System.out.println(method+"("+jp.getArgs()[0]+") has reported an exception saying : "+e.getMessage());
	}

}
