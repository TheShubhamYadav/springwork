package com.dps.beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;


public class DepositInfoAccessorImpl implements IAccessor {
	String key;
	
	public DepositInfoAccessorImpl(String key) {
		System.out.println("DepositInfoAccessorImpl.DepositInfoAccessorImpl()");
		this.key = key;
	}
	
	@Override
	public String getKey() {
		System.out.println("DepositInfoAccessorImpl.getKey()");
		return key;
	}

	@Override
	public Object getData() {
		System.out.println("DepositInfoAccessorImpl.getData()");
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		Properties props = new Properties();
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shubham", "root", "7089");
			st = con.createStatement();
			rs = st.executeQuery("select deposit_type, interest_rate from depositinfo");
			while(rs.next()) {
				props.put(rs.getString("deposit_type"), rs.getDouble("interest_rate"));
			}
		}//try
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
		finally {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				st.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}//finally
		
		return props;
	}

}
