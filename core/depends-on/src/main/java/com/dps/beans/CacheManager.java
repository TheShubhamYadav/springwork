package com.dps.beans;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CacheManager {
	Cache cache;
	List<IAccessor> accessors;
	public CacheManager(Cache cache, List<IAccessor> accessors) {
		
		this.cache = cache;
		this.accessors = accessors;
		initialize();
	}
	
	public void initialize(){
		Map<String, Object> dataMap = new ConcurrentHashMap<String, Object>();
		for(IAccessor accessor : accessors) {
			dataMap.put(accessor.getKey(), accessor.getData());
		}
		this.cache.load(dataMap);
		System.out.println("CacheManager.CacheManager()");
	}
	

}
