package com.si.beans;

public class Heater {
	private Remote remote;
	public void onHT(){
		System.out.print("Heater : ");
		remote.powerOn();
	}
	public void setRemote(Remote remote) {
		this.remote = remote;
	}
	

}
