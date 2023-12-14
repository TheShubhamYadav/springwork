package com.jca.javaconfigapproach;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	
	@Bean
	public Satelite newSatelite() {
		Satelite satelite = new Satelite();
		return satelite;
	}
	
	@Bean
	public LaunchPad rocketLaunchPad() {
		LaunchPad launchPad = new LaunchPad();
		launchPad.setSatelite(newSatelite());
		return launchPad;
	}

}
