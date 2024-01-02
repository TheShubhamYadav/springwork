package com.ecem;

import com.ecem.beans.Car;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BootExitCodeExceptionMapperApplication {

//    @Bean
//    public ExitCodeGenerator exitCodeGenerator(){
//        return ()-> 10 ;
//    }

    @Bean
    public ApplicationListener<ExitCodeEvent> exitCodeEventApplicationListener(){
        return (event)->{
            System.out.println(">>>>>>Exit Code : "+ event.getExitCode());
        };
    }

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(BootExitCodeExceptionMapperApplication.class,
                args);
        try {
            Car car = applicationContext.getBean(Car.class);
            car.drive();
        }
        finally {
            int exitCode = SpringApplication.exit(applicationContext);
            System.exit(exitCode);
        }
    }


}
