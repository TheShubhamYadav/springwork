package com.sjv.form;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@NoArgsConstructor
public class LoanApplicationForm {

    @NotBlank
    private String firstName;
    @NotBlank
    private String  lastName;
    @Past
    @DateTimeFormat(pattern = "dd/MM/YYYY")
    private Date dob;
    @NotBlank
    private String gender;
    @com.sjv.formatter.annotation.PhoneNumber
    private PhoneNumber mobile;
    @NotBlank
    private String  email;
    @NotBlank
    private String loanType;
    @Min(value = 100000)
    private long loanAmount;
    @Range(min = 12,max = 360)
    private int tenure;
}
