package com.bootgradle;

import com.bootgradle.beans.Account;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BootGradleApplication {
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(BootGradleApplication.class,args);
        Account account = applicationContext.getBean("account", Account.class);
        System.out.println(account);
    }
}
