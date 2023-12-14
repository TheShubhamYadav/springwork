package com.ifm.beans;

public class CarBuilder {
	private int carNO;
	private String model;
	private String manufacturer;
	private double price;
	private boolean airbags;
	
	public CarBuilder(int carNO) {
		this.carNO = carNO;
	}

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
	
	
	public Car build(String carType) {
		Car car = null;
		if("Sedan".equals(carType)) {
			car = new Sedan();
		}
		else if("MiniVan".equals(carType)) {
			car = new MiniVan();
		}
		else if("Hatchback".equals(carType)) {
			car = new Hatchback();
		}
		car.setCarNO(carNO);
		car.setManufacturer(manufacturer);
		car.setModel(model);
		car.setPrice(price);
		car.setAirbags(airbags);
		return car;
	}

}
