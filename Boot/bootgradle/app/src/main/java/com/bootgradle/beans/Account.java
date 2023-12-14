package com.bootgradle.beans;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Account {
    @Value("${accountNo}")
    private long accountNo;
    @Value("${accountHolderName}")
    private String accountHolderName;
}
