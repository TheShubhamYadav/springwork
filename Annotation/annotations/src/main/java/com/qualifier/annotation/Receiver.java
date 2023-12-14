package com.qualifier.annotation;

public class Receiver {
	private float frequency;

	public void setFrequency(float frequency) {
		this.frequency = frequency;
	}

	public void receive() {
		System.out.println("signal is receiving at frequency "+frequency);
	}

}
