package com.coreboot.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class LoanApplication {
	@Value("${applicationNo}")
	private String applicationNo;
	@Value("${applicantName}")
	private String applicantName;
	@Value("${loanType}")
	private String loanType;
	@Value("${principleAmount}")
	private double principleAmount;
	@Value("${tenure}")
	private int tenure;
}
