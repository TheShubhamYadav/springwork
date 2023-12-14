package com.extcon;

import com.extcon.beans.Project;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BootECApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(BootECApplication.class,args);
        Project project = applicationContext.getBean("project", Project.class);
        System.out.println(project);
    }
}
