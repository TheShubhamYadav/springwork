package com.pnc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.handler.SimpleUrlHandlerMapping;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.mvc.ParameterizableViewController;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import java.util.Properties;

@Configuration
public class WebMvcConfig {

    @Bean
    public HandlerMapping handlerMapping(){
        Properties mapping = new Properties();
        mapping.put("/home.htm","homeController");
        SimpleUrlHandlerMapping simpleUrlHandlerMapping = new SimpleUrlHandlerMapping();
        simpleUrlHandlerMapping.setMappings(mapping);
        return simpleUrlHandlerMapping;
    }

    @Bean
    public Controller homeController(){
        ParameterizableViewController parameterizableViewController = new ParameterizableViewController();
        parameterizableViewController.setViewName("home");
        return parameterizableViewController;
    }

    @Bean
    public ViewResolver viewResolvers(){
        InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
        internalResourceViewResolver.setPrefix("/WEB-INF/jsp/");
        internalResourceViewResolver.setSuffix(".jsp");
        return internalResourceViewResolver;
    }
}
