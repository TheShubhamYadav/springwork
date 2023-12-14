package com.ifm.beans;

public class MediaConsumptionMonitorImpl extends Monitor {
	@Override
	public void switchOn() {
		System.out.println("Monitor [brand=" + brand + ", panelType=" + panelType + ", screenSize=" + screenSize + ", responseTime="
				+ responseTime + ", resolution=" + resolution + ", refreshRate=" + refreshRate + "]");
		
	}

}
