package com.tso.beans;

public class AgeCalculator {
	private static AgeCalculator instance;
	
	private AgeCalculator() {
		// TODO Auto-generated constructor stub
	}
	
	public synchronized static AgeCalculator getInstance() {
		if(instance==null) {
			instance = new AgeCalculator();
		}
		return instance;
	}
	
	public int getAge(int dob) {
		return 2023-dob;
	}

}
