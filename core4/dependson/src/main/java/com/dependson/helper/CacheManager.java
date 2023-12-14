package com.dependson.helper;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.dependson.accessor.IAccessor;

public class CacheManager {
	public Cache cache;
	List<IAccessor> accessors;
	public CacheManager(Cache cache, List<IAccessor> accessors) {
		this.cache = cache;
		this.accessors = accessors;
		initialize();
	}
	
	public void initialize() {
		Map<String, Object> dataMap = new ConcurrentHashMap<>();
		//normal for loop to iterate
/*		for(IAccessor accessor : accessors) {
//			dataMap.put(accessor.getKey(), accessor.getData());
//		}*/
		//foreach loop to iterate
		accessors.forEach(accessor -> {
			try {
				dataMap.put(accessor.getKey(), accessor.getData());
			}
			catch (IOException e) {
				throw new RuntimeException(e+": failed to load data into cache");
			}
		});
		this.cache.load(dataMap);
	}
	
	
	

}