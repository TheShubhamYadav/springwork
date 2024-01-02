package com.ccg;

import com.ccg.beans.Account;
import com.ccg.initializers.YmlConfigApplicationContextInitializer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
//@PropertySource("classpath:app-config.properties")
public class BootCustomizedConfigApplication {
    public static void main(String[] args) {
//        ApplicationContext applicationContext = SpringApplication.run(BootCustomizedConfigApplication.class,args);
//        Account account = applicationContext.getBean(Account.class);
//        System.out.println(account);
        SpringApplicationBuilder builder = new SpringApplicationBuilder(BootCustomizedConfigApplication.class);
        builder.initializers(new YmlConfigApplicationContextInitializer());
        SpringApplication application = builder.build();

        ApplicationContext applicationContext = application.run(args);
        Account account = applicationContext.getBean(Account.class);
        System.out.println(account);
    }
}
