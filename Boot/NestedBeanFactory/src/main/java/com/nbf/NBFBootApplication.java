package com.nbf;

import com.nbf.beans.Computer;
import com.nbf.beans.Processor;
import com.nbf.config.ProcessorConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class NBFBootApplication {

    @Bean
    public Computer computer(Processor processor,
                             @Value("${ramSize}") int ramSize,
                             @Value("${storageSize}") int storageSize,
                             @Value("${operatingSystem}") String operatingSystem){
        Computer computer = new Computer();
        computer.setStorageSize(storageSize);
        computer.setProcessor(processor);
        computer.setRamSize(ramSize);
        computer.setOperatingSystem(operatingSystem);
        return computer;

    }

    public static void main(String[] args) {
//        SpringApplicationBuilder builder = new SpringApplicationBuilder();
//
//        SpringApplication springApplication = builder.parent(ProcessorConfig.class)
//                                                    .child(NBFBootApplication.class).build();
//
//        ApplicationContext applicationContext = springApplication.run(args);

        //or in one line

        ApplicationContext applicationContext =
                new SpringApplicationBuilder().parent(ProcessorConfig.class).child(NBFBootApplication.class).build().run(args);

        Computer computer = applicationContext.getBean(Computer.class);
        System.out.println(computer);

        //checking , whether two ioc container is created or not
        Processor processor = applicationContext.getParent().getBean(Processor.class);
        System.out.println(processor + "/n" + computerC);

    }

}
