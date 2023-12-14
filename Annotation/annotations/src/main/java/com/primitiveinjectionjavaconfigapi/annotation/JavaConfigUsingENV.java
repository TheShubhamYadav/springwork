package com.primitiveinjectionjavaconfigapi.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:com/primitiveinjectionjavaconfigapi/annotation/passportValues.properties")
public class JavaConfigUsingENV {
	@Autowired
	private Environment env;//using Enviroment object
	
	@Bean
	public Passport newPassport() {
		Passport passport = new Passport();
		passport.setPassportNo(Integer.parseInt(env.getProperty("passportNo")));
		passport.setPassportHolderName(env.getRequiredProperty("passportHolderName"));
		passport.setAge(Integer.parseInt(env.getProperty("age")));
		passport.setGender(env.getProperty("gender"));
		System.out.println("JavaConfig.newPassport()");
		return passport;
	}

}
