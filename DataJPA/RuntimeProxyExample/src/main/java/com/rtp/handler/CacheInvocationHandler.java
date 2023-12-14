package com.rtp.handler;

import com.rtp.helper.Cache;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class CacheInvocationHandler implements InvocationHandler {
    private Object target;
    public CacheInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Cache cache = null;
        String key = null;
        Object returnVal = null;

        key = method.getName()+"(";
        for(Object arg : args){
            key += arg+",";
        }
        key = key.substring(0,key.length()-2)+")";


        cache = Cache.getInstance();
        if(cache.containsKey(key)){
            returnVal = cache.get(key);
        }
        else {
            returnVal = method.invoke(target,args);
            cache.put(key,returnVal);
        }
        return returnVal;
    }
}
