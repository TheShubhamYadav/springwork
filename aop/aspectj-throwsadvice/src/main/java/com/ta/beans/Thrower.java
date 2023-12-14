package com.ta.beans;

public class Thrower {
	
	public int willThrow(int i) {
		System.out.println("in willThrow()");
		if(i<=0) {
			throw new IllegalArgumentException("invalid i");
		}
		return i;
	}
}
