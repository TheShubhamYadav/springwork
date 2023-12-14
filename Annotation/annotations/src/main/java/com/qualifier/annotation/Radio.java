package com.qualifier.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Radio {

	private Receiver receiver;
	private Equalizer equalizer;

	
	@Autowired
	@Qualifier("old receiver")
	public void setReceiver(Receiver receiver) {
		this.receiver = receiver;
	}
	
	@Autowired
	public void setEqualizer(Equalizer equalizer) {
		this.equalizer = equalizer;
	}
	
	public void listen() {
		receiver.receive();
		equalizer.equalizeMode();
		System.out.println("listening...");
	}
}
