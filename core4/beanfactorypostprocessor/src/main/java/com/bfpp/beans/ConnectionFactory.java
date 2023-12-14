package com.bfpp.beans;

public class ConnectionFactory {
	
	private String driver;
	private String url;
	private String user;
	private String password;
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "ConnectionFactory [driver=" + driver + ", url=" + url + ", user=" + user + ", password=" + password
				+ "]";
	}
	
	

}
