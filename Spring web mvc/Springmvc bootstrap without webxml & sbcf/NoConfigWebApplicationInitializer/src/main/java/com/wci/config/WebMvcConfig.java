package com.wci.config;

import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.mvc.ParameterizableViewController;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

public class WebMvcConfig {

    @Bean(name = "/ourservices.htm")
    public Controller ourServiceController(){
        ParameterizableViewController parameterizableViewController = new ParameterizableViewController();
        parameterizableViewController.setViewName("our-services");
        return parameterizableViewController;
    }

    @Bean
    public ViewResolver viewResolver(){
        InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
        internalResourceViewResolver.setPrefix("/WEB-INF/views/");
        internalResourceViewResolver.setSuffix(".jsp");
        return internalResourceViewResolver;
    }
}
