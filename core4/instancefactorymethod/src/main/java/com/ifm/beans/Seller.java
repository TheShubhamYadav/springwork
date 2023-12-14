package com.ifm.beans;

public class Seller {
	
	private Monitor monitor;
	public void demo(){
		System.out.println("monitor specs : ");
		monitor.switchOn();
		
	}
	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}

}
