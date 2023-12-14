package com.tso.beans;

public class WebUser implements Runnable {
	String name;
	int dob;
	public WebUser(String name,int dob) {
		this.name=name;
		this.dob=dob;
	}

	@Override
	public void run() {
		AgeCalculator calculator = AgeCalculator.getInstance();
		int age = calculator.getAge(dob);
		System.out.println(name+" : "+age);
	}
	
	

}
