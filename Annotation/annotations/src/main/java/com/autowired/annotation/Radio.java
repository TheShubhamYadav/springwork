package com.autowired.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Radio {
	//@Autowired
	private Receiver receiver;
	//@Autowired
	private Equalizer equalizer;
	
//	@Autowired(required = false)
//	public Radio(Receiver receiver, Equalizer equalizer) {
//		System.out.println("Radio.Radio(1,2)");
//		this.receiver = receiver;
//		this.equalizer = equalizer;
//	}
//	
//	@Autowired(required = false)
//	public Radio(Receiver receiver) {
//		System.out.println("Radio.Radio(1)");
//		this.receiver = receiver;
//	}
	
	
	@Autowired
	public void setReceiver(Receiver receiver) {
		System.out.println("Radio.setReceiver()");
		this.receiver = receiver;
	}
	
	@Autowired
	public void setEqualizer(Equalizer equalizer) {
		System.out.println("Radio.setEqualizer()");
		this.equalizer = equalizer;
	}
	
	public void listen() {
		receiver.receive();
		equalizer.equalizeMode();
		System.out.println("listening...");
	}
}
