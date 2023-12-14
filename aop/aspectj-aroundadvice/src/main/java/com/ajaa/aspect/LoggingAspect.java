package com.ajaa.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

public class LoggingAspect {
	public Object log(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("in loggingaspect()");
		String methodName = pjp.getSignature().getName();
		Object[] args = pjp.getArgs();
		System.out.print("Entered into "+methodName+"(");
		for(int i=0;i<args.length;i++) {
			if(i==0) {
				System.out.print(args[i]);
				continue;
			}
			System.out.print(","+args[i]);
		}
		System.out.println(")");
		int retVal = (int)pjp.proceed();
		System.out.println("exit from "+methodName+"()");
		return retVal;
	}
}
