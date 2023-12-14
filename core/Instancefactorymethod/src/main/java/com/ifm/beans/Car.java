package com.ifm.beans;

public abstract class Car {
	protected int carNO;
	protected String model;
	protected String manufacturer;
	protected double price;
	protected boolean airbags;
	
	public abstract void drive(int tripNo);

	public void setCarNO(int carNO) {
		this.carNO = carNO;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setAirbags(boolean airbags) {
		this.airbags = airbags;
	}

}
