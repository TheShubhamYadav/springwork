package com.formhandling.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(builderMethodName = "of")
public class BankAccount {
    private String accountNo;
    private String accountHolderName;
    private String ifscCode;
    private String accountType;
}
