package com.pagination.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
@Configuration
@PropertySource("classpath:db.properties")
@ComponentScan(basePackages = {"com.pagination.dao"})
public class JavaConfig {
	@Bean
	public DataSource dataSource(@Value("${db.driver}") String driverClass,
								@Value("${db.url}")String url,
								@Value("${db.user}")String user,
								@Value("${db.password}")String password) {
		DriverManagerDataSource dataSource = new DriverManagerDataSource(url,user,password);
		dataSource.setDriverClassName(driverClass);
		return dataSource;
	}
	@Bean
	public  JdbcTemplate jdbcTemplate(DataSource dataSource) {
		return new JdbcTemplate(dataSource);
	}

}
