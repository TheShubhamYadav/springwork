package com.jcc.beans;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Data
@ConfigurationProperties(prefix = "emp")
public class Employee {
    private int empNo;
    private String empName;
    private String deptName;
    private double salary;
}
