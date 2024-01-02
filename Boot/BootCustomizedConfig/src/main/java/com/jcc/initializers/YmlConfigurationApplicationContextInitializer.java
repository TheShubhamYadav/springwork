package com.jcc.initializers;

import org.springframework.boot.env.YamlPropertySourceLoader;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.PropertySource;

import java.io.IOException;
import java.util.List;

public class YmlConfigurationApplicationContextInitializer implements ApplicationContextInitializer {
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        YamlPropertySourceLoader sourceLoader = new YamlPropertySourceLoader();
        try {
            List<PropertySource<?>> sources = sourceLoader.load("config",applicationContext.getResource("classpath:app" +
                    "-config.yml"));
            ConfigurableEnvironment environment = applicationContext.getEnvironment();
            sources.stream().forEach(propertySource ->{
                environment.getPropertySources().addLast(propertySource);
            });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
