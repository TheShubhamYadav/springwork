package com.si.beans;

public class Television {
	private Remote remote;
	public void onTV() {
		System.out.print("TV : ");
		remote.powerOn();
	}
	public void setRemote(Remote remote) {
		this.remote = remote;
	}
	

	

}
