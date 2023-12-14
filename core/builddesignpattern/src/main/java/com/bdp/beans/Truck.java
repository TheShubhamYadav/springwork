package com.bdp.beans;

public abstract class Truck {
	int truckNo;
	String model;
	String manufacturer;
	double price;
	int capacity;
	
	public abstract void drive();

	public int getTruckNo() {
		return truckNo;
	}

	public void setTruckNo(int truckNo) {
		this.truckNo = truckNo;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	
}
