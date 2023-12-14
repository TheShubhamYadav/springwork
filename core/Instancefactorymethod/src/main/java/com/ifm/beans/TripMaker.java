package com.ifm.beans;

import java.security.SecureRandom;

public class TripMaker {
	private Car car;
	public int registerTrip(int tripNo) {
		car.drive(tripNo);
		return new SecureRandom().nextInt();
	}
	public void setCar(Car car) {
		this.car = car;
	}
	

}
