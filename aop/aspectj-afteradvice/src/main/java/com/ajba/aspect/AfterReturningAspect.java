package com.ajba.aspect;

import org.aspectj.lang.JoinPoint;

public class AfterReturningAspect {
	public void validateKey(JoinPoint jp, Object retVal) throws Exception {
		System.out.println("validating key");
		if((Integer)retVal==0) {
			throw new Exception("Weak key generated(discarded)");
		}
		System.out.println("Strong key");
	}
}
