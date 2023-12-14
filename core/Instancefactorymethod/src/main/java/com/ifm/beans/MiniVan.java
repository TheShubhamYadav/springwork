package com.ifm.beans;

public class MiniVan extends Car {
	@Override
	public void drive(int tripNo) {
			System.out.println("Mini Van [carNO=" + carNO + ", model=" + model + ", manufacturer=" + manufacturer + ", price=" + price
					+ ", airbags=" + airbags + "] ---> booked for tripno "+tripNo);
	}

}
