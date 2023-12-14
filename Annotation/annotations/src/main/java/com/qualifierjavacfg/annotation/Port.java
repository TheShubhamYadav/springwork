package com.qualifierjavacfg.annotation;


public class Port {
	String portName;
	String portGen;
	
	
	public void setPortName(String portName) {
		this.portName = portName;
	}


	public void setPortGen(String portGen) {
		this.portGen = portGen;
	}


	@Override
	public String toString() {
		return "Port [portName=" + portName + ", portGen=" + portGen + "]";
	}
	
}
