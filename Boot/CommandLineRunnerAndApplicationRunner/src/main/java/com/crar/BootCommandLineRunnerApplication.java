package com.crar;

import com.crar.beans.Book;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Set;
import java.util.stream.Stream;

@SpringBootApplication
public class BootCommandLineRunnerApplication {

    /*
    CommandLineRunner & applicationrunner can be written here as beandef
    or
    separate class can be written , annotated with @Component
     */
//    @Bean
//    public CommandLineRunner commandLineRunner(){
//        return (args)->{
//            System.out.println("cli");
//            Stream.of(args).forEach((arg)->{
//                System.out.println(arg);
//            });
//        };
//    }

//    @Bean
//    public ApplicationRunner applicationRunner(){
//        return (args -> {
//            System.out.println("ar");
//            Set<String> optionNames = args.getOptionNames();
//            optionNames.stream().forEach((optionName)->{
//                System.out.println(optionName+" = "+args.getOptionValues(optionName).get(0));
//            });
//        });
//    }


    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(BootCommandLineRunnerApplication.class,args);
        try{
            Book book = applicationContext.getBean(Book.class);
            System.out.println(book);
        }
        finally {
            int exitCode = SpringApplication.exit(applicationContext);
            System.exit(exitCode);
        }
    }
}
