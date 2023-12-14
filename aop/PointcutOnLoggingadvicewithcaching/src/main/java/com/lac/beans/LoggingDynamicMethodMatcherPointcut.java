package com.lac.beans;

import java.lang.reflect.Method;

import org.springframework.aop.support.DynamicMethodMatcherPointcut;

public class LoggingDynamicMethodMatcherPointcut extends DynamicMethodMatcherPointcut {
	
	@Override
	public boolean matches(Method method, Class<?> targetClass, Object... args) {
		
		if(targetClass.isAssignableFrom(Calculator.class)) {
			if(method.getName().equals("add") || method.getName().equals("multiply")) {
				for(int i=0;i<args.length;i++) {
					if((int)args[i]>100)
						return true;
				}//for
				
			}//if-2
		}//if-1
		return false;
	}//method

}//class
