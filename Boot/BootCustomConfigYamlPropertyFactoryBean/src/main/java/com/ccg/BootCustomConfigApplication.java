package com.ccg;

import com.ccg.beans.Account;
import com.ccg.factories.YamlPropertySourceFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource( name = "app-config", value = "classpath:app-config.yml",factory = YamlPropertySourceFactory.class)
public class BootCustomConfigApplication {
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(BootCustomConfigApplication.class,args);
        Account account = applicationContext.getBean(Account.class);
        System.out.println(account);
//
    }
}
 