package com.javacfgstereotypeanno.annotation;

//no-source code
public class Sensor {

	private String sensorType;

	public void setSensorType(String sensorType) {
		System.out.println("Sensor.setSensorType()");
		this.sensorType = sensorType;
	}

	@Override
	public String toString() {
		System.out.println("Sensor.toString()");
		return "Sensor [sensorType=" + sensorType + "]";
	}
	
}
