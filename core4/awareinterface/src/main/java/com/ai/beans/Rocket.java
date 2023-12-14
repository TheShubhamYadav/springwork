package com.ai.beans;

public class Rocket {
	String name;
	int loadCapacity;
	public void setName(String name) {
		this.name = name;
	}
	public void setLoadCapacity(int loadCapacity) {
		this.loadCapacity = loadCapacity;
	}
	public void propel() {
		System.out.println(name+" rocket is ready with "+loadCapacity+" load.");
	}
}
