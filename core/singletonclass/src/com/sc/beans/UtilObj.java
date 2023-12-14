package com.sc.beans;

public class UtilObj {
	private static UtilObj instance;
	private UtilObj() {
		// TODO Auto-generated constructor stub
	}
	public static synchronized UtilObj getInstance() {
		if(instance==null) {
			instance = new UtilObj();
		}
		return instance;
	}
	public void info() {
		System.out.println(instance.hashCode());
	}
	

}
