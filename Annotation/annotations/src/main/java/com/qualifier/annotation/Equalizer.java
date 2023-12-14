package com.qualifier.annotation;

public class Equalizer {
	private String mode;
	
	
	public void setMode(String mode) {
		this.mode = mode;
	}


	public void equalizeMode() {
		System.out.println(mode+" is set");
	}

}
