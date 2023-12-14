package com.lmi.beans;

public class Worker {
	
	String data;

	public void setData(String data) {
		this.data = data;
	}
	
	public void processRequest() {
		System.out.println("processing request : "+data);
	}

}
