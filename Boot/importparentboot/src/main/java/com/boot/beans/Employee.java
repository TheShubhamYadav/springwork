package com.boot.beans;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Employee {
    @Value("${empId}")
    private int empId;
    @Value("${empName}")
    private String empName;
}
