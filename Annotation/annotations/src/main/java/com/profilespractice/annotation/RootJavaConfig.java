package com.profilespractice.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({DevJavaConfig.class,TestJavaConfig.class})
@ComponentScan(basePackages = {"com.profilespractice.annotation"})
public class RootJavaConfig {
	
	@Bean
	public Branch branch(@Value("${branchName}") String branchName,@Value("${ifsc}")  String ifsc,@Value("${address}")  String address,@Value("${contact}")  long contact) {
		Branch branch = new Branch();
		branch.setBranchName(branchName);
		branch.setIfsc(ifsc);
		branch.setAddress(address);
		branch.setContact(contact);
		return branch;
	}

}
