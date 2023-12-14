package com.ifm.beans;

public class MonitorBuilder {
	
	private String brand;
	private String panelType;
	private String screenSize;
	private int responseTime;
	private String resolution;
	private int refreshRate;

	private MonitorBuilder(String brand, String panelType, String screenSize, int responseTime, String resolution,
			int refreshRate) {
		this.brand = brand;
		this.panelType = panelType;
		this.screenSize = screenSize;
		this.responseTime = responseTime;
		this.resolution = resolution;
		this.refreshRate = refreshRate;
	}


	public Monitor build(String monitorType) {
		Monitor monitor = null;
		if("gamingmonitor".equalsIgnoreCase(monitorType)) {
			monitor = new GamingMonitorImpl();
		}
		else if("mediamonitor".equalsIgnoreCase(monitorType)) {
			monitor = new MediaConsumptionMonitorImpl();
		}
		monitor.setBrand(brand);
		monitor.setPanelType(panelType);
		monitor.setRefreshRate(refreshRate);
		monitor.setResolution(resolution);
		monitor.setResponseTime(responseTime);
		monitor.setScreenSize(screenSize);
		return monitor;
	}
	
	
}
