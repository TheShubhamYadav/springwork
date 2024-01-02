package com.ccg.initializers;

import org.springframework.boot.env.YamlPropertySourceLoader;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.PropertySource;

import java.io.IOException;
import java.util.List;

public class YmlConfigApplicationContextInitializer implements ApplicationContextInitializer {
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        YamlPropertySourceLoader propertySourceLoader = new YamlPropertySourceLoader();
        try {
            List<PropertySource<?>> propertySources = propertySourceLoader.load("app-config",
                    applicationContext.getResource("classpath:app-config.yml"));
            ConfigurableEnvironment environment = applicationContext.getEnvironment();
            propertySources.stream().forEach(propertySource->{
                environment.getPropertySources().addLast(propertySource);
            });

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}