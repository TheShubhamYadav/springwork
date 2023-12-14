package com.coreboot.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class CreditReport {
	@Value("${cibilScore}")
	private int cibilScore;
	@Value("${description}")
	private String description;
	@Autowired
	private LoanApplication loanApplication;
}
