package com.sjv.validator;

import com.sjv.form.LoanApplicationForm;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class LoanApplicationValidator implements Validator {

    private final String EMAIL="abc@gmail.com";
    private final String MOBILE="9988776655";

    @Override
    public boolean supports(Class<?> clazz) {
        return clazz.isAssignableFrom(LoanApplicationForm.class);
    }

    @Override
    public void validate(Object target, Errors errors) {
        LoanApplicationForm loanApplicationForm = (LoanApplicationForm) target;

        if(!errors.hasFieldErrors("mobile")) {
            if (loanApplicationForm.getMobile()!=null) {
                if (loanApplicationForm.getMobile().toString().equals(MOBILE)) {
                    errors.rejectValue("mobile", "mobileNo.alreadyexist");
                }
            }
            else{
                errors.rejectValue("mobile","mobile.invalid");
            }
        }

        if(!errors.hasFieldErrors("email")) {
            if (loanApplicationForm.getEmail().equals(EMAIL)) {
                errors.rejectValue("email", "email.alreadyexist");
            }
        }
    }
}
