package com.bdp.beans;

public class MiniTruck extends Truck {
	
	public void drive() {
		System.out.println("MiniTruck [truckNo=" + truckNo + ", model=" + model + ", manufacturer=" + manufacturer + ", price="
				+ price + ", capacity=" + capacity + "]");
	}	
}
