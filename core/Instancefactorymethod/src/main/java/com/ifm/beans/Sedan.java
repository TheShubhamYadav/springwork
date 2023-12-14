package com.ifm.beans;

public class Sedan extends Car {
	@Override
	public void drive(int tripNo) {
			System.out.println("Sedan [carNO=" + carNO + ", model=" + model + ", manufacturer=" + manufacturer + ", price=" + price
					+ ", airbags=" + airbags + "] ---> booked for tripno "+tripNo);
	}

}
