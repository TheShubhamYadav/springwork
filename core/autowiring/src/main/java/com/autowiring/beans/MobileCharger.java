package com.autowiring.beans;

public class MobileCharger {
	PowerAdaptor adaptor;

	public MobileCharger(PowerAdaptor adaptor) {
		this.adaptor = adaptor;
		System.out.println("Constructor injection-------");
	}
	
	public void charge() {
		adaptor.ConvertPower();
		System.out.println("Charging the mobile.");
	}

}
