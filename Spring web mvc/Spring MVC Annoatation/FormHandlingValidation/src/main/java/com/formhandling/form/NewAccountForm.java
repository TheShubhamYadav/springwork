package com.formhandling.form;

import lombok.Data;

@Data
public class NewAccountForm {
    private String fullName;
    private int age;
    private String gender;
    private String idType;
    private String idNo;
    private String accountType;
}
