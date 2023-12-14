package com.pcnamespace.beans;

import java.sql.Date;

public class Project {
	String projectName;
	Contract contract;
	String clientName;
	public Project(Contract contract) {
		this.contract = contract;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	@Override
	public String toString() {
		return "Project [projectName=" + projectName + ", contract=" + contract + ", clientName=" + clientName + "]";
	}	
}
