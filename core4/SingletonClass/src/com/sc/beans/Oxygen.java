package com.sc.beans;

public class Oxygen {

	private static Oxygen oxy;

	private Oxygen() {
		// TODO Auto-generated constructor stub
	}

	public static Oxygen getInstance() {
		if (oxy == null) {
			oxy = new Oxygen();
		}
		return oxy;
	}

}
