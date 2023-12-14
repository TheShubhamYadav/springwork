package com.bootct.beans;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
@Data
public class Account {

    @Value("${accountNo}")
    private String accountNo;
    @Value("${accountHolderName}")
    private String accountHolderName;


}
