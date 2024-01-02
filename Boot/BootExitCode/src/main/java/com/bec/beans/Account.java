package com.bec.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

import java.security.SecureRandom;

@Component
public class Account {

    public int getBalance(String accountNo){
        //logic to get balance
        return new SecureRandom().nextInt(1000,1000000);
    }

    @PostConstruct
    public void init(){
        System.out.println("init");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("destroy");
    }
}
