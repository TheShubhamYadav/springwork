package com.txm.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Component;

import com.txm.bo.CustomerBO;

@Component
public class CustomerDao {
	private final String INSERT_CUSTOMER="insert into customer(customer_name, age, gender, email) values(?,?,?,?)";
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public CustomerDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;  
	}
	
	public int saveCustomer(CustomerBO cbo) {
		int cxNo = 0;
		KeyHolder keyHolder = new GeneratedKeyHolder();
		
		jdbcTemplate.update(new PreparedStatementCreator() {
			
			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				PreparedStatement ps = con.prepareStatement(INSERT_CUSTOMER,new String[] {"customer_no"});
				ps.setString(1, cbo.getCustomer_name());
				ps.setInt(2, cbo.getAge());
				ps.setString(3, cbo.getGender());
				ps.setString(4, cbo.getEmail());
				return ps;
			}
		}, keyHolder);
		
		cxNo = keyHolder.getKey().intValue();
		return cxNo;
	}

}
