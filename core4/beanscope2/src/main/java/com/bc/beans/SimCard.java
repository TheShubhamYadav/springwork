package com.bc.beans;

public class SimCard {
	String networkProvider;
	String generation;
	boolean postpaid;
	public SimCard(String networkProvider, String generation, boolean postpaid) {
		this.networkProvider = networkProvider;
		this.generation = generation;
		this.postpaid = postpaid;
	}
	@Override
	public String toString() {
		return "SimCard [networkProvider=" + networkProvider + ", generation=" + generation + ", postpaid=" + postpaid
				+ "]";
	}
}
