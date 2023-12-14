package com.bdp.beans;

public class TruckBuilder {
	int truckNo;
	String model;
	String manufacturer;
	double price;
	int capacity;

	public TruckBuilder(int truckNo) {
		this.truckNo = truckNo;
	}
	//setter & getter 
	public String model() {
		return this.model;
	}
	public TruckBuilder model(String model) {
		this.model = model;
		return this;
	}
	//setter & getter 
	public String manufacturer() {
		return this.manufacturer;
	}
	public TruckBuilder manufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
		return this;
	}
	//setter & getter 
	public double price() {
		return this.price;
	}
	public TruckBuilder price(double price) {
		this.price = price;
		return this;
	}
	//setter & getter 
	public int capacity() {
		return this.capacity;
	}
	public TruckBuilder capacity(int capacity) {
		this.capacity = capacity;
		return this;
	}

	public Truck build(String truckType) {
		Truck truck = null;
		if (truckType.equalsIgnoreCase("MiniTruck")) {
			truck = new MiniTruck();
		} 
		else if (truckType.equalsIgnoreCase("TipperTruck")) {
			truck = new TipperTruck();
		} 
		else if (truckType.equalsIgnoreCase("CementTruck")) {
			truck = new CementTruck();
		}
		truck.setCapacity(capacity);
		truck.setManufacturer(manufacturer);
		truck.setModel(model);
		truck.setPrice(price);
		truck.setTruckNo(truckNo);
		return truck;
	}

}
