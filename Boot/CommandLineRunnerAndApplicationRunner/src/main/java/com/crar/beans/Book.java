package com.crar.beans;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Data
@ConfigurationProperties(prefix = "book")
public class Book {
    private int bookNo;
    private String bookName;
    private String authorName;
    private double price;
}
