package com.seh;

import com.seh.listener.BootApplicationListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringEventApplication {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplicationBuilder(SpringEventApplication.class)
                                            .listeners(new BootApplicationListener()).build();
        ApplicationContext applicationContext = springApplication.run(args);
    }
}
