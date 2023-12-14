package com.lac.beans;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import com.lac.helper.Cache;

public class CachingAdvice implements MethodInterceptor{
	
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		Cache cache = null;
		String MethodName = null;
		Object[] args = null;
		String key = null;
		int returnValue = 0;
		
		cache = Cache.getInstance();
		MethodName = invocation.getMethod().getName();
		args = invocation.getArguments();
		key = MethodName+"(";
		for(int i=0;i<args.length;i++) {
			if(i==0) {
				key += args[i];
				continue;
			}
				key+= ","+args[i];
		}
		key += ")";
		
		if(cache.containsKey(key)) {
			returnValue =  (int) cache.get(key);
			return returnValue;
		}
		returnValue = (int) invocation.proceed();
		cache.put(key, returnValue);
		return returnValue;
	}
	

}
