package com.jva.bean;

import com.jva.annotation.PhoneNumber;
import com.jva.validator.Severity;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Builder;
import lombok.Data;
import org.hibernate.validator.constraints.Range;

@Data
@Builder(builderMethodName = "of")
public class Employee {
    @NotBlank(message = "first name is empty",payload = {Severity.CRITICAL.class})
    private String firstName;
    @NotBlank(message = "last name is empty")
    private String lastName;
    @Range(min = 18,max = 60,message = "age should be b/w 18 to 60")
    private int age;
    @Pattern(regexp = "male|female",message = "enter male or female")
    private String gender;
    //@Pattern(regexp = "(0|91-)?-?[6-9][0-9]{9}",message = "mobile no is invalid")
    @PhoneNumber(message = "phoneNumber should be of 10 to 12 digits.")
    private String mobile;
    @Email(message = "enter valid email address")
    private String email;
}
