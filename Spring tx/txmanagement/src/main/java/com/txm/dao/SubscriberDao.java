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

import com.txm.bo.SubscriberBO;

@Component
public class SubscriberDao {
	private final String INSERT_SUBSCRIBER = "insert into subscriber(subscription_type, plan_name, validity, bill_amt, customer_no) values(?,?,?,?,?)";
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public SubscriberDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public int saveSubscriber(SubscriberBO sbo) {
		int subscriberNo = 0;
		KeyHolder keyHolder = new GeneratedKeyHolder();
		
		jdbcTemplate.update(new PreparedStatementCreator() {
			
			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				PreparedStatement ps = con.prepareStatement(INSERT_SUBSCRIBER, new String[] {"subscriber_no"});
				ps.setString(1, sbo.getSubscription_type());
				ps.setString(2, sbo.getPlan_name());
				ps.setInt(3, sbo.getValidity());
				ps.setDouble(4, sbo.getBill_amt());
				ps.setInt(5, sbo.getCustomer_no());
				return ps;
			}
		}, keyHolder);
		subscriberNo = keyHolder.getKey().intValue();
		return subscriberNo;
	}

}
