package com.fb.beans;

import java.sql.Connection;
import java.sql.DriverManager;

import org.springframework.beans.factory.FactoryBean;

public class ConnectionFactoryBean implements FactoryBean<Connection> {

	private String driver;
	private String url;
	private String user;
	private String pwd;
	
	public ConnectionFactoryBean(String driver, String url, String user, String pwd) {
		this.driver = driver;
		this.url = url;
		this.user = user;
		this.pwd = pwd;
	}
	
	@Override
	public Connection getObject() throws Exception {
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, user, pwd);
		return con;
	}
	
	@Override
	public Class<?> getObjectType() {
		return Connection.class;
	}
	
	@Override
	public boolean isSingleton() {
		return false;
	}
	
}
