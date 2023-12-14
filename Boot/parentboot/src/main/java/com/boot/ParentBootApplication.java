package com.boot;

import com.boot.beans.Vhicle;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ParentBootApplication {
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(ParentBootApplication.class);
        Vhicle vhicle = applicationContext.getBean("vhicle", Vhicle.class);
        vhicle.drive();
    }
}
