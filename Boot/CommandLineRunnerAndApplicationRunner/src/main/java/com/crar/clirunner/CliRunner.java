package com.crar.clirunner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

//@Component
public class CliRunner implements CommandLineRunner {//we can write it in BootApplication class also

    @Override
    public void run(String... args) throws Exception {
        System.out.println("cli runner");
        Arrays.stream(args).forEach(arg->{
            System.out.println(arg);
        });
    }
}
