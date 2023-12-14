package com.jva.test;

import com.jva.bean.Employee;
import jakarta.validation.*;

import java.util.Set;

public class BeanValidationTest {
    public static void main(String[] args) {

        Employee employee = Employee.of()
                                    .firstName("").lastName("yadav")
                                    .age(25).gender("male")
                                    .mobile("9869345547").email("ht@rediffmail.com")
                                    .build();

        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        Set<ConstraintViolation<Employee>> constraintViolations = validator.validate(employee);

        if(!constraintViolations.isEmpty()) {
            System.out.println("Errors are : ");
            //1 way to iterate
            //        for (ConstraintViolation<Employee> violation: constraintViolations) {
            //            System.out.println(violation.getMessage());
            //        }
            //2nd way to iterate
            constraintViolations.forEach(violation -> {
                System.out.println(violation.getMessage());
            });
        }


    }
}
