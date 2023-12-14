package com.bootct;

import com.bootct.beans.Account;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BootCustomizationApplication {

    public static void main(String[] args) {
        //programmatic customization
        SpringApplicationBuilder builder = new SpringApplicationBuilder(BootCustomizationApplication.class);
        builder.bannerMode(Banner.Mode.OFF);
        builder.lazyInitialization(true);

        ApplicationContext applicationContext = builder.build().run(args);
        Account account = applicationContext.getBean(Account.class);
        System.out.println(account);

    }
}
