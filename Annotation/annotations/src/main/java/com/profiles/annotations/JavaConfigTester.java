package com.profiles.annotations;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:com/profiles/annotations/testprops.properties")
@Profile("test")
public class JavaConfigTester {

}
