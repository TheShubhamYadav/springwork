package com.lac.beans;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LoggingAdvice implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		String methodName = null;
		Object[] args = null;
		
		methodName = invocation.getMethod().getName();
		args = invocation.getArguments();
		System.out.print("entered into "+methodName+"(");
		for(int i=0;i<args.length;i++) {
			if(i==0)
				System.out.print(args[i]);
			else
				System.out.print(","+args[i]);
		}
		System.out.println(")");
		int retVal = (int)invocation.proceed();
		System.out.println("exit from "+methodName+" with return value "+retVal);
		return retVal;
	}
}
