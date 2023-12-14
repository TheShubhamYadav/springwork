package com.jva.test;

import com.jva.bean.LoanApplicationForm;
import com.jva.groups.DemographicGroup;
import com.jva.groups.LoanInfoGroup;
import com.jva.validator.Severity;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;

import java.util.Set;

public class LoanApplicationValidatorTest {

    public static void main(String[] args) {
        LoanApplicationForm form = LoanApplicationForm.of().Name("shubham").age(320).gender("male").tenure(10).
                                        mobile("9876544314").loanType("cari").loanAmount(10000D).build();
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        Validator validator = validatorFactory.getValidator();
        Set<ConstraintViolation<LoanApplicationForm>> violations = validator.validate(form, DemographicGroup.class);

        violations.stream().filter(violation->{
            return violation.getConstraintDescriptor().getPayload().contains(Severity.WARN.class);
        }).forEach(violation->{
            System.out.println(violation.getMessage());
        });
    }
}
