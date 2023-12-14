package com.txm.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.txm.controller.NewSubscriberController;

@Configuration
@Import(PersistenceConfig.class)
@ComponentScan(basePackages = {"com.txm.service","com.txm.controller"})
@EnableTransactionManagement
public class AppConfig {
	

}
