package com.ajaa.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

import com.ajaa.helper.Cache;

public class CachingAspect {
	private Cache cache;

	public CachingAspect(Cache cache) {
		this.cache = cache;
	}
	
	public Object caching(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("in cachingaspect()");
		//get method name
		String method  = pjp.getSignature().getName();
		//get args
		Object[] args = pjp.getArgs();
		//get cache key 
		String key = method+"(";
		for(int i=0;i<args.length;i++) {
			if(i==0) {
				key += args[i];
				continue;
			}
			key += ","+args[i];
		}
		key += ")";

		//check in cache
		if(cache.containsKey(key)) {
			return cache.get(key);
		}
		
		//not found then forward to target
		int ret =(int) pjp.proceed();
		
		cache.put(key, ret);
		
		return ret;
	}

}
