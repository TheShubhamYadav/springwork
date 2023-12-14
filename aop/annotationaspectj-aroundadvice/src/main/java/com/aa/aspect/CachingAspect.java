package com.aa.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.aa.helper.Cache;

@Component
@Aspect
@Order(1)
public class CachingAspect {
	@Autowired
	private Cache cache;
	
	@Around("execution(* com.aa.beans.*.*(..))")
	public Object caching(ProceedingJoinPoint pjp) throws Throwable {
		
		String method = pjp.getSignature().getName();
		Object[] args = pjp.getArgs();
		String key = method+"("+args[0]+","+args[1]+")";
		Object retVal = null;
		if(cache.containsKey(key)) {
			return cache.get(key);
		}
		retVal  = pjp.proceed();
		cache.put(key, retVal);
		return retVal;
	}

}
