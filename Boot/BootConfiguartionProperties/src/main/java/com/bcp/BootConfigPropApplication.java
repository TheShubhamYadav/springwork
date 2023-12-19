package com.bcp;

import com.bcp.beans.Employee;
import com.bcp.beans.Project;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BootConfigPropApplication {
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(BootConfigPropApplication.class,args);
        Project project = applicationContext.getBean(Project.class);
        System.out.println(project);
        Employee employee = applicationContext.getBean(Employee.class);
        System.out.println(employee);
    }
}
