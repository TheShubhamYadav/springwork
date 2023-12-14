package com.boot;

import com.boot.beans.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ImportBootApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(ImportBootApplication.class,args);
        Employee employee = applicationContext.getBean("employee", Employee.class);
        System.out.println(employee);
    }
}
