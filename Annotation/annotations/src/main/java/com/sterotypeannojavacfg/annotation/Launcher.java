package com.sterotypeannojavacfg.annotation;
//no src code
public class Launcher {
	private Rocket rocket;
	
	

	public void setRocket(Rocket rocket) {
		System.out.println("Launcher.setRocket()");
		this.rocket = rocket;
	}



	@Override
	public String toString() {
		System.out.println("Launcher.toString()");
		return "Launcher [rocket=" + rocket + "]";
	}
	
	
	
	
}
