package com.primitiveinjectionjavaconfigapi.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:com/primitiveinjectionjavaconfigapi/annotation/passportValues2.properties")
public class JavaConfigWithoutENV {
	 //without Enviroment obj , plus experimenting @scope @bean(names..),@lazy here
	@Bean(name = "pp")
	public Passport newPassport(@Value("${passportNo}") int passportNo,
								@Value("${passportHolderName}") String passportHolderName,
								@Value("${age}") int age,
								@Value("${gender}") String gender) {
		
		Passport passport = new Passport();
		passport.setPassportNo(passportNo);
		passport.setPassportHolderName(passportHolderName);
		passport.setAge(age);
		passport.setGender(gender);
		return passport;
	}
	

}
