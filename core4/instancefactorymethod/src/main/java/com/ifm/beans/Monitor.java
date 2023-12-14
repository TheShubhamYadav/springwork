package com.ifm.beans;

public abstract class Monitor {
	protected String brand;
	protected String panelType;
	protected String screenSize;
	protected int responseTime;
	protected String resolution;
	protected int refreshRate;
	
	abstract void switchOn();

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setPanelType(String panelType) {
		this.panelType = panelType;
	}

	public void setScreenSize(String screenSize) {
		this.screenSize = screenSize;
	}

	public void setResponseTime(int responseTime) {
		this.responseTime = responseTime;
	}

	public void setResolution(String resolution) {
		this.resolution = resolution;
	}

	public void setRefreshRate(int refreshRate) {
		this.refreshRate = refreshRate;
	}


	
	
	
}
