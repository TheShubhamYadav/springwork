package com.ta.beans;

public class Thrower {
	
	public int throwing(int i) {
		if(i<0) {
			throw new IllegalArgumentException("invalid input");
		}
		return i;
	}

}
