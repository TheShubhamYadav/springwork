package com.sba.beans;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

import com.sba.helper.SecurityManager;

public class AuditAdvice implements MethodBeforeAdvice {
	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		String methodName = method.getName();
		SecurityManager sm = SecurityManager.getInstance();
		System.out.print(methodName+"(");
		for(int i=0;i<args.length;i++) {
			if(i==0) {
				System.out.print(args[i]);
				continue;
			}
			System.out.print(","+args[i]);
		}
		System.out.println(") is called by "+sm.getLoggedInUser());
	}
}
