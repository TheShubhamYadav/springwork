package com.coreboot;

import com.coreboot.beans.CreditReport;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CoreBootApplication {
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(CoreBootApplication.class);
        CreditReport report = applicationContext.getBean("creditReport", CreditReport.class);
        System.out.println(report);
    }
}
