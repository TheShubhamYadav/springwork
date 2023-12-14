package com.ab.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.ab.helper.SecurityManager;

@Configuration
@ComponentScan(basePackages = {"com.ab.beans","com.ab.aspect"})
@EnableAspectJAutoProxy
public class BAConfig  {
	
	@Bean
	public SecurityManager securityManager() {
		return SecurityManager.getInstance();
	}
}
