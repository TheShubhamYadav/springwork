package com.boot;

import com.boot.beans.Radio;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BootApplication {
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(BootApplication.class);
        Radio radio = applicationContext.getBean("radio", Radio.class);
        radio.play();
    }
}
