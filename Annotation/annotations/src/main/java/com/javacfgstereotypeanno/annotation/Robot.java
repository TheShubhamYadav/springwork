package com.javacfgstereotypeanno.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//source-code
@Component
public class Robot {
	private Sensor sensor;
	
	@Autowired
	public void setSensor(Sensor sensor) {
		System.out.println("Robot.setSensor()");
		this.sensor = sensor;
	}

	@Override
	public String toString() {
		System.out.println("Robot.toString()");
		return "Robot is having " + sensor + ".";
	}
	
	

}
