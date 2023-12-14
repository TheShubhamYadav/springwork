package com.ac.beans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Login {
	Connection con = null;
	public void doLogin(String username,String password) {
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = ConnectionFactory.getConnection();
			ps = con.prepareStatement("select username,password from logincreden where username=?");
			ps.setString(1, username);
			rs = ps.executeQuery();
			if(username.equals(rs.getString(1)) && password.equals(rs.getString(2))) {
				System.out.println("Login success");
			}
			else {
				System.out.println("invalid credentials,login failed");
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(rs!=null)
					rs.close();
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if(ps!=null)
					ps.close();
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if(con!=null)
					con.close();
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
