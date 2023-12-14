package com.primary.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Adaptor {
	private Port port;

	@Autowired
	public void setPort(Port port) {
		this.port = port;
	}

	@Override
	public String toString() {
		return "Adaptor [port=" + port + "]";
	}
	
	
}
