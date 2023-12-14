package com.lac.helper;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Cache  {
	private Map<String,Object> dataMap;
	private static Cache instance;
	
	private Cache() {
		dataMap = new ConcurrentHashMap<>();
	}
	
	public static synchronized Cache getInstance() {
		if(instance==null) {
			instance = new Cache();
			return instance;
		}
		return instance;
	}
	
	public Object get(String key) {
		return dataMap.get(key);
	}
	
	public void put(String key,Object value) {
		dataMap.put(key, value);
	}
	
	public boolean containsKey(String key) {
		return dataMap.containsKey(key);
	}
	
}
