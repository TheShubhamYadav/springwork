package com.psi.beans;

public class FuelTank {
	String fuelType;
	int fuelCapacity;
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public int getFuelCapacity() {
		return fuelCapacity;
	}
	public void setFuelCapacity(int fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}
	//or the place of writing these two getter class we can use one toString class to print values
	@Override
	public String toString() {
		return "FuelTank [fuelType=" + fuelType + ", fuelCapacity=" + fuelCapacity + "]";
	}
	
	
}
