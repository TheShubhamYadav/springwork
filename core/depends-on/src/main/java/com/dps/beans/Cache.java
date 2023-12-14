package com.dps.beans;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Cache {
	private static Cache instance;
	private Map<String, Object> dataMap;
	private Cache() {
		System.out.println("Cache.Cache()");
		this.dataMap = new ConcurrentHashMap<String, Object>();
	}
	
	public void load(Map<String, Object> dataMap) {
		synchronized (this.dataMap) {
			System.out.println("Cache.load()");
			this.dataMap.putAll(dataMap);
		}
	}
	
	public static synchronized Cache getInstance() {
		System.out.println("Cache.getInstance()");
		if(instance==null) {
			instance = new Cache();
		}
		return instance;
	}
	
	public void put(String key,Object value) {
		System.out.println("Cache.put()");
		dataMap.put(key, value);
	}
	public Object get(String key) {
		System.out.println("Cache.get()");
		return dataMap.get(key);
	}
	public boolean containsKey(String key) {
		System.out.println("Cache.containsKey()");
		return dataMap.containsKey(key);
	}

}
