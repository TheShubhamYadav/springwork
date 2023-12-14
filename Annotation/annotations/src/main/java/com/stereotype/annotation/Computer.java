package com.stereotype.annotation;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Lazy
//@Scope("prototype")
public class Computer {
	
	public Computer() {
		System.out.println("Computer.Computer()");
	}
	
	public void configuration() {
		System.out.println(" working fine.");
	}

}
