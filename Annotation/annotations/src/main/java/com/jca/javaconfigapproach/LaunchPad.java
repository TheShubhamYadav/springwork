package com.jca.javaconfigapproach;

public class LaunchPad {
	private Satelite satelite;
	
	public void setSatelite(Satelite satelite) {
		this.satelite = satelite;
	}

	public void launch() {
		satelite.ready();
		System.out.println("launching : "+satelite.getClass().getClass());
	}

}
