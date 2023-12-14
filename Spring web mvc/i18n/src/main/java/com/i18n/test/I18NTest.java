package com.i18n.test;

import com.i18n.config.JavaConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Locale;

public class I18NTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaConfig.class);
        String message = applicationContext.getMessage("home.header",null, Locale.FRANCE);
        System.out.println(message);
        String error = applicationContext.getMessage("field.empty",new Object[]{"Address"}, Locale.FRANCE);
        System.out.println(error);
    }
}
