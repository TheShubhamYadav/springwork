package com.ara.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"com.ara.aspect","com.ara.beans"})
@EnableAspectJAutoProxy
public class ARConfig {
	
	

}
