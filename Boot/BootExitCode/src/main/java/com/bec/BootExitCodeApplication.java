package com.bec;

import com.bec.beans.Account;
import org.springframework.boot.ExitCodeEvent;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BootExitCodeApplication {

    @Bean
    public ExitCodeGenerator exitCodeGenerator(){
        return ()->{
            return 30;
        };
    }

    public static void main(String[] args){
        ApplicationContext applicationContext = SpringApplication.run(BootExitCodeApplication.class,args);
        try{
            Account account = applicationContext.getBean(Account.class);
            System.out.println(account.getBalance("1311414"));
        }
        finally {
            int exitCode = SpringApplication.exit(applicationContext);
            System.exit(exitCode);
        }
    }

    @Bean
    public ApplicationListener<ExitCodeEvent> exitCodeEventApplicationListener(){
        return (exitCodeEvent)->{
            System.out.println("Error Code : "+exitCodeEvent.getExitCode());
        };
    }
}
