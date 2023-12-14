package com.nbf.beans;

public class Computer {
	int price;
	Processor cpu;
	public void setPrice(int price) {
		this.price = price;
	}
	public void setCpu(Processor cpu) {
		this.cpu = cpu;
	}
	@Override
	public String toString() {
		return "Computer [price=" + price + ", cpu=" + cpu + "]";
	}
	

}
