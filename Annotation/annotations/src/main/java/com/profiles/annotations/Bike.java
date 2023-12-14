package com.profiles.annotations;

//no-src
public class Bike {

	private String model;
	private FuelTank fuelTank;
	
	
	public void setModel(String model) {
		this.model = model;
	}


	public void setFuelTank(FuelTank fuelTank) {
		this.fuelTank = fuelTank;
	}


	@Override
	public String toString() {
		return "Bike [model=" + model + ", fuelTank=" + fuelTank + "]";
	}
	
	
	
	
}
