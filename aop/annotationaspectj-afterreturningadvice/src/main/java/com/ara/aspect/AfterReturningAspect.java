package com.ara.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
@Component
@Aspect
public class AfterReturningAspect {
	@AfterReturning(value =  "execution (* com.ara.beans.*.*(..))" , returning = "retVal")
	public void validateKey(JoinPoint jp,Object retVal) throws Exception {
		if((int)retVal==0) {
			throw new Exception("Weak key");
		}
		System.out.println("Strong key");
	}
}
