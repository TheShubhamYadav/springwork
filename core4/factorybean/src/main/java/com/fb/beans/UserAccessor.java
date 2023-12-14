package com.fb.beans;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

public class UserAccessor implements BeanFactoryAware {
	private BeanFactory beanFactory;
	
	public void getAllEmp() {
		try(Connection con = beanFactory.getBean("connection",Connection.class);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from emp")){
			
			while(rs.next()) {
				System.out.println(rs.getString(1)+"<=>"+rs.getString(2)+"<=>"+rs.getString(3));
			}
			
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		this.beanFactory = beanFactory;
	}

}
