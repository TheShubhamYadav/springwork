package com.ccg.beans;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Data
@ConfigurationProperties(prefix = "account")
public class Account {
    private long acNo;
    private String acHName;
    private String ifsc;
    private String city;
}
