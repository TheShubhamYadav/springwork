package com.i18n.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
public class JavaConfig {

    @Bean(name = "messageSource")
    public MessageSource messageSource(){
        ResourceBundleMessageSource RBMessageSource = new ResourceBundleMessageSource();
        RBMessageSource.addBasenames("message","error");
        return RBMessageSource;
    }
}
