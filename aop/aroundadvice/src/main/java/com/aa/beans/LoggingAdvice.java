package com.aa.beans;

import org.aopalliance.intercept.MethodInvocation;
import org.springframework.cglib.proxy.MethodInterceptor;

public class LoggingAdvice implements org.aopalliance.intercept.MethodInterceptor {
	
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		String methodName = null;
		Object[] args = null;
		
		methodName = invocation.getMethod().getName();
		args = invocation.getArguments(); 
		System.out.print("Entered in : "+methodName+"(");
		for(int i=0;i<args.length;i++) {
			if(i==0)
				System.out.print(args[i]);
			else
				System.out.print(","+args[i]);
		}
		System.out.println(")");
		
		Object retval = invocation.proceed();
		
		System.out.println("Result returned : "+retval+"(Exit from "+methodName+")");
		return retval;
	}

}
