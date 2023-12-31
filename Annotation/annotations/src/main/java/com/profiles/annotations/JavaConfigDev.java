package com.profiles.annotations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:com/profiles/annotations/devprops.properties")
@Profile("dev")
public class JavaConfigDev {

}
