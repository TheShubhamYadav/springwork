package com.ecem.runners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AppCommandLine implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("executing commandline runner for one time startup activity for the application");
        //throw new IllegalAccessException("initialization failed");
        throw new ArithmeticException("AT EXP");
    }
}
