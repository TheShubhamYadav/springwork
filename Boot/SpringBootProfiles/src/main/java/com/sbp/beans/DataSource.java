package com.sbp.beans;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class DataSource {
    @Value("${database}")
    private String database;
    @Value("${db.driver}")
    private String driver;
    @Value("${db.url}")
    private String url;
    @Value("${db.userName}")
    private String userName;
    @Value("${db.password}")
    private String password;
}
