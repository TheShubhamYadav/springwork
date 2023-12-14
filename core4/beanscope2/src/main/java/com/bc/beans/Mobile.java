package com.bc.beans;

public class Mobile {
	String brandName;
	String modelName;
	double price;
	SimCard sim;
	
	public Mobile(String brandName, String modelName) {
		super();
		this.brandName = brandName;
		this.modelName = modelName;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setSim(SimCard sim) {
		this.sim = sim;
	}
	@Override
	public String toString() {
		return "Mobile [brandName=" + brandName + ", modelName=" + modelName + ", price=" + price + ", sim=" + sim
				+ "]";
	}
	
	
	
}
