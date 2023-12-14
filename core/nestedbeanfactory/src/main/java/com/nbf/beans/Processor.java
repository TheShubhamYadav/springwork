package com.nbf.beans;

public class Processor {
	String brand;
	int core;
	public Processor(String brand, int core) {
		this.brand = brand;
		this.core = core;
	}
//	
	@Override
	public String toString() {
		return "Processor [brand=" + brand + ", core=" + core + "]";
	}
	
	

}
