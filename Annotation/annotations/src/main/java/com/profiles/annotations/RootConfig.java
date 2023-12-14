package com.profiles.annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@Import({JavaConfigDev.class,JavaConfigTester.class})
@ComponentScan(basePackages = {"com.profiles.annotations"})
public class RootConfig {
	
	@Bean
	public Bike bike(@Value("${model}") String model,FuelTank fuelTank) {
		Bike bike = new Bike();
		bike.setModel(model);
		bike.setFuelTank(fuelTank);
		return bike;
	}

}
