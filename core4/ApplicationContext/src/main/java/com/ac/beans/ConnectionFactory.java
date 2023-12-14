package com.ac.beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	private static String driver;
	private static String url;
	private static String dbuser;
	private static String dbpw;
	public ConnectionFactory(String driver, String url, String dbuser, String dbpw) {
		this.driver = driver;
		this.url = url;
		this.dbuser = dbuser;
		this.dbpw = dbpw;
	}
	
	public static Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName(driver);
			connection = DriverManager.getConnection(url, dbuser, dbpw);
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}
}
