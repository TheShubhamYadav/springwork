package com.jva.validator;

import com.jva.annotation.PhoneNumber;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import javax.print.attribute.standard.Severity;
import java.lang.annotation.Annotation;
import java.util.regex.Pattern;

public class PhoneNumberConstraintValidator implements ConstraintValidator<PhoneNumber,String> {


    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if(value==null || value.trim().length()==0 || value.length()<10 || value.length()>12){
            return false;
        }
        Pattern pattern = Pattern.compile("");
        return value.chars().allMatch(ch->(Character.isDigit(ch)));
    }

    @Override
    public void initialize(PhoneNumber constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

}
