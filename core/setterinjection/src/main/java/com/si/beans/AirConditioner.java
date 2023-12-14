package com.si.beans;

public class AirConditioner {
	private Remote remote;
	public void onAC() {
		System.out.print("AC : ");
		remote.powerOn();
	}
	public void setRemote(Remote remote) {
		this.remote = remote;
	}	
}
