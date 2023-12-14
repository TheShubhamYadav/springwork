package com.dependson.helper;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Cache {
	private static Cache instaCache;
	private Map<String, Object> dataMap;
	private Cache(){
		dataMap = new ConcurrentHashMap<>();
	}
	
	public void load(Map<String, Object> dataMap) {
		synchronized (this.dataMap) {
			this.dataMap.putAll(dataMap);
		}
	}
	
	public static synchronized Cache getInstance() {
		if(instaCache==null) {
			instaCache = new Cache();
		}
		return instaCache;
	}
	
	public Object get(String key){
		return dataMap.get(key);
	}
	
	public void put(String key,Object value){
		dataMap.put(key, value);
	}
	
	public boolean containsKey(String key){
		return dataMap.containsKey(key);
	}
	
	
}
