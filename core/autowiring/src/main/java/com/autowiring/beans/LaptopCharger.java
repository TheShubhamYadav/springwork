package com.autowiring.beans;

public class LaptopCharger {
	PowerAdaptor adaptor;
	public void charge(String laptop) {
		adaptor.ConvertPower();
		System.out.println("Charging the "+laptop+" laptop.");
	}
	public void setAdaptor(PowerAdaptor adaptor) {
		this.adaptor = adaptor;
		System.out.println("Setter injection-------");
		
	}
}
