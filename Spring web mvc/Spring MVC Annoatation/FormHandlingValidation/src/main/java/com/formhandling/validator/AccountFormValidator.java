package com.formhandling.validator;

import com.formhandling.form.NewAccountForm;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class AccountFormValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return clazz.isAssignableFrom(NewAccountForm.class);
    }

    @Override
    public void validate(Object target, Errors errors) {
        NewAccountForm accountForm = (NewAccountForm) target;
        if(accountForm.getFullName()==null || accountForm.getFullName().trim().length()==0){
            errors.rejectValue("fullName","fullName.blank");
        }//

        if(!errors.hasFieldErrors("age")){
            if(accountForm.getAge()<0 || accountForm.getAge()>100){
                errors.rejectValue("age","age.blank");
            }
        }//

        if(accountForm.getIdNo()==null || accountForm.getIdNo().trim().length()==0){
            errors.rejectValue("idNo","idNo.blank");
        }//
    }
}
