package com.profiles.annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//src code
@Component
public class FuelTank {
	@Value("${fuelTank}")
	private String fuelType;
	@Value("${tankCapacity}")
	private String tankCapacity;
	
	@Override
	public String toString() {
		return "FuelTank [fuelType=" + fuelType + ", tankCapacity=" + tankCapacity + "]";
	}
	
	
	

}
