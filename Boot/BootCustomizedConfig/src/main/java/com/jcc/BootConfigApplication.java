package com.jcc;

import com.jcc.beans.Employee;
import com.jcc.initializers.YmlConfigurationApplicationContextInitializer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
//@PropertySource("classpath:app-config.yml")
public class BootConfigApplication {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new SpringApplicationBuilder(BootConfigApplication.class)
                        .initializers(new YmlConfigurationApplicationContextInitializer()).build().run(args);

        Employee employee = applicationContext.getBean(Employee.class);
        System.out.println(employee);
    }
}
