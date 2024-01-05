package com.crar.applicationrunner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

//@Component
public class AppRunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("app runner");
        Set<String> optionNames = args.getOptionNames();
        optionNames.stream().forEach(optionName->{
            System.out.println(optionName+" = "+args.getOptionValues(optionName).get(0));
        });
    }
}
