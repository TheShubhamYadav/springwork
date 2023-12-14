package com.ifm.beans;

public class Hatchback extends Car {
	@Override
	public void drive(int tripNo) {
			System.out.println("Hatchback [carNO=" + carNO + ", model=" + model + ", manufacturer=" + manufacturer + ", price=" + price
					+ ", airbags=" + airbags + "] ---> booked for tripno "+tripNo);
	}

}
